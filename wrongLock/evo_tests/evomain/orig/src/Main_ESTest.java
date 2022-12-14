/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 08 22:30:51 GMT 2022
 */

package orig.src;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import orig.src.Main;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Main main0 = new Main();
      Main.iNum2 = 0;
      Main.iNum2 = (-4004);
      main0.run();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Main main0 = new Main();
      Main.iNum1 = (-2353);
      main0.run();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Main main0 = new Main();
      Main.iNum2 = 0;
      Main.iNum2 = 2356;
      main0.run();
      main0.run();
      main0.run();
      main0.run();
      // Undeclared exception!
      main0.run();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Main.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("orig.src.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Main.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "7";
      stringArray0[1] = "7";
      Main.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }
}
