/**
 * @author Xuan
 * Created on Apr 27, 2005
 */
package orig.src;
public class TClass1 extends Thread {
    WrongLock wl;
    public TClass1 (WrongLock wl) {
    	this.wl=wl;
    }
    
    public void run() {
    	wl.A();
    }
}
