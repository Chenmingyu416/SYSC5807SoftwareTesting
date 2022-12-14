/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 08 22:35:25 GMT 2022
 */

package orig.src;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import orig.src.Data;
import orig.src.WrongLock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WrongLock_ESTest extends WrongLock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WrongLock wrongLock0 = new WrongLock((Data) null);
      // Undeclared exception!
      try { 
        wrongLock0.B();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("orig.src.WrongLock", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WrongLock wrongLock0 = new WrongLock((Data) null);
      // Undeclared exception!
      try { 
        wrongLock0.A();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("orig.src.WrongLock", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Data data0 = new Data();
      WrongLock wrongLock0 = new WrongLock(data0);
      // Undeclared exception!
      try { 
        wrongLock0.A();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // bug found
         //
         verifyException("orig.src.WrongLock", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Data data0 = new Data();
      WrongLock wrongLock0 = new WrongLock(data0);
      wrongLock0.B();
      assertEquals(1, data0.value);
  }
}
