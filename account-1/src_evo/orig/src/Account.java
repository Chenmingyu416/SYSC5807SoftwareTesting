package orig.src;//import java.lang.*;

public class Account {
    public double amount;
    String  name;

    //constructor
  public Account(String nm,double amnt ) {
        amount=amnt;
        name=nm;
  }
  //functions
  public synchronized  void depsite(double money){
      amount+=money;
      }

  public synchronized  void withdraw(double money){
      amount-=money;
      }

//  public synchronized  void transfer(Account ac, double mn){
//      amount-=mn;
//      //System.out.println("ac.amount is $"+ac.amount);
//      if (name.equals("D")) {
//	    System.out.println("unprotected");
//        ac.amount+=mn;//no aquire for the other lock!!
//                  //+= might cause problem --it is not atomic.
//      } else {
//	System.out.println("protected");
//	synchronized (ac) { ac.amount+=mn; }
//      }
//  }

    public synchronized void transfer(Account ac, double mn){
        amount-=mn;
        if (name.equals("D")) {
            System.out.println("unprotected");
            ac.amount+=mn;
        } else {
            System.out.println("protected");
            synchronized (ac) { ac.amount+=mn; }
        }
    }
 public synchronized void print(){
  }

      }//end of class Acount
