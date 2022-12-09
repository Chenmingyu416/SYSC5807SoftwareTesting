package com;
/**
 * @author Xuan
 * Created on Apr 27, 2005
 * 
 * Test Case 1 
   number of threads that have a lock on data             :  1
   number of threads that have a wrong lock on the class :  1
 */
public class Main {
    static int iNum1=1;
    static int iNum2=1;
	
    public void run() {
    	Data data=new Data();
    	WrongLock wl=new WrongLock(data);

    	for (int i=0;i<iNum1;i++)
    		new TClass1(wl).start();
    	for (int i=0;i<iNum2;i++)
    		new TClass2(wl).start();
    }

    public static void main(String[] args) {
	if (args.length < 2){
           System.out.println("ERROR: Expected 2 parameters");
	}else{
	   iNum1 = Integer.parseInt(args[0]);
	   iNum2 = Integer.parseInt(args[1]);
	   Main t = new Main();
	   t.run();
	}
    }
}

 class TClass1 extends Thread {
	WrongLock wl;
	public TClass1 (WrongLock wl) {
		this.wl=wl;
	}

	public void run() {
		wl.A();
	}
}

 class TClass2 extends Thread {
	WrongLock wl;
	public TClass2 (WrongLock wl) {
		this.wl=wl;
	}

	public void run() {
		wl.B();
	}
}

 class WrongLock {
	Data data;
	public WrongLock(Data data) {
		this.data =data;
	}

	public void A() {
		synchronized (data) {
			int x=data.value;
			data.value++;
			//assert (data.value==x+1);
			if (data.value != (x+1))
				throw new RuntimeException("bug found");
		}
	}

	public void B() {
		synchronized (this) {
			data.value++;
		}
	}
}


class Data {
	public int value = 0;

	public Data() {
	}
}