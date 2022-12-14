/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 08 21:44:17 GMT 2022
 */

package orig.src;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import orig.src.Account;
import orig.src.ManageAccount;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ManageAccount_ESTest extends ManageAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ManageAccount.num = (-3146);
      ManageAccount.printAllAccounts();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ManageAccount manageAccount0 = new ManageAccount("g&J@ygGoL0cy}k!0]", (-3396.0855200598));
      manageAccount0.i = (-901);
      // Undeclared exception!
      try { 
        manageAccount0.run();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("orig.src.ManageAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ManageAccount manageAccount0 = new ManageAccount("", 0.0);
      Account[] accountArray0 = new Account[5];
      accountArray0[0] = manageAccount0.account;
      accountArray0[1] = manageAccount0.account;
      ManageAccount.accounts = accountArray0;
      manageAccount0.run();
      assertEquals(0, manageAccount0.i);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ManageAccount manageAccount0 = new ManageAccount("", 0.0);
      Account[] accountArray0 = new Account[5];
      accountArray0[1] = manageAccount0.account;
      ManageAccount.accounts = accountArray0;
      // Undeclared exception!
      try { 
        manageAccount0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("orig.src.Account", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ManageAccount manageAccount0 = new ManageAccount("=Ln3@1TY l}S]YV5", 0.0);
      ManageAccount.num = 0;
      // Undeclared exception!
      try { 
        manageAccount0.run();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("orig.src.ManageAccount", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ManageAccount manageAccount0 = new ManageAccount("", 1184.29);
      ManageAccount.printAllAccounts();
  }
}
