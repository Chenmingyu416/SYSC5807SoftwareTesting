package orig.src;

/**
 * @author Xuan
 * Created on 2005-1-18
 * 
 * This class simulates the wrong lock bug
 * Method A requests a lock on data while method B request a lock
 * on the class.
 */
public class WrongLock {
    Data data;
    public WrongLock(Data data) {
	this.data =data;
    }
	
    public void A() {
	synchronized (data) {	
    	   int x=data.value;
		System.out.println("A datavalue="+data.value+" x+1="+(x+1));
		data.value++;
	   //assert (data.value==x+1);

	   if (data.value != (x+1))
		   System.out.println("A Error!! "+"datavalue="+data.value+" x+1="+(x+1));
		throw new RuntimeException("bug found");
	}		
    }
	
    public void B() {
	synchronized (this) {
        	data.value++;
		System.out.println("B datavalue="+data.value);
	}
    }
}
