///*
// * This file was automatically generated by EvoSuite
// * Fri Dec 02 20:11:00 GMT 2022
// */
//
//package orig.src;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//import static org.evosuite.runtime.EvoAssertions.*;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
//import org.junit.runner.RunWith;
//import orig.src.ManageAccount;
//
//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
//public class ManageAccount_ESTest extends ManageAccount_ESTest_scaffolding {
//
//  @Test(timeout = 4000)
//  public void test0()  throws Throwable  {
//      ManageAccount.num = (-860);
//      ManageAccount.printAllAccounts();
//  }
//
//  @Test(timeout = 4000)
//  public void test1()  throws Throwable  {
//      ManageAccount manageAccount0 = new ManageAccount("n*uGiL':=?gZowewH'4", 0.0);
//      ManageAccount.num = 0;
//      ManageAccount.num = 1;
//      manageAccount0.run();
//      assertEquals(0, manageAccount0.i);
//  }
//
//  @Test(timeout = 4000)
//  public void test2()  throws Throwable  {
//      ManageAccount manageAccount0 = new ManageAccount("", (-1.0));
//      manageAccount0.i = (-306);
//      // Undeclared exception!
//      try {
//        manageAccount0.run();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -1
//         //
//         verifyException("orig.src.ManageAccount", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test3()  throws Throwable  {
//      ManageAccount manageAccount0 = new ManageAccount("~'` 2Ef6:n3 sk\"", 1925.16541634);
//      ManageAccount.num = 0;
//      // Undeclared exception!
//      try {
//        manageAccount0.run();
//        fail("Expecting exception: ArithmeticException");
//
//      } catch(ArithmeticException e) {
//         //
//         // / by zero
//         //
//         verifyException("orig.src.ManageAccount", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test4()  throws Throwable  {
//      ManageAccount.num = 2184;
//      // Undeclared exception!
//      try {
//        ManageAccount.printAllAccounts();
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 10
//         //
//         verifyException("orig.src.ManageAccount", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test5()  throws Throwable  {
//      ManageAccount.accNum = 4273;
//      ManageAccount manageAccount0 = null;
//      try {
//        manageAccount0 = new ManageAccount("", 0.0);
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // 4273
//         //
//         verifyException("orig.src.ManageAccount", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test6()  throws Throwable  {
//      ManageAccount.num = 0;
//      ManageAccount manageAccount0 = null;
//      try {
//        manageAccount0 = new ManageAccount("mNP", 0.0);
//        fail("Expecting exception: ArithmeticException");
//
//      } catch(ArithmeticException e) {
//         //
//         // / by zero
//         //
//         verifyException("orig.src.ManageAccount", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test7()  throws Throwable  {
//      ManageAccount manageAccount0 = new ManageAccount("n*uGiL':=?gZowewH'4", 0.0);
//      ManageAccount.printAllAccounts();
//  }
//
//  @Test(timeout = 4000)
//  public void test8()  throws Throwable  {
//      ManageAccount manageAccount0 = new ManageAccount("3?=[94>~9@(SJ'|r", 2819.10780653);
//      // Undeclared exception!
//      try {
//        manageAccount0.run();
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("orig.src.Account", e);
//      }
//  }
//
//    @Test(timeout = 4000)
//    public void test9()  throws Throwable  {
//        ManageAccount manageAccount0 = new ManageAccount("D", 0);
//        ManageAccount manageAccount1 = new ManageAccount("S", 0);
//        manageAccount0.start();
//        manageAccount1.start();
//        assertEquals(90,manageAccount0.account.amount,0.00);
//        assertEquals(90,manageAccount1.account.amount,0.00);
//    }
//
//    @Test(timeout = 4000)
//    public void test10()  throws Throwable  {
//        ManageAccount manageAccount0 = new ManageAccount("AA", 0);
//        ManageAccount manageAccount1 = new ManageAccount("SS", 0);
//        manageAccount0.start();
//        manageAccount1.start();
////        try{
////            Thread.sleep(1);
////        }catch (Exception e){
////            System.out.println(e.getStackTrace());
////        }
////        manageAccount1.start();
//
//        System.out.println(ManageAccount.num);
////        System.out.println(manageAccount0.account.amount);
////        System.out.println(manageAccount1.account.amount);
//        assertEquals(90.0,manageAccount0.account.amount,0.0 );
//        assertEquals(90.0,manageAccount1.account.amount ,0.0);
//
//    }
//}
