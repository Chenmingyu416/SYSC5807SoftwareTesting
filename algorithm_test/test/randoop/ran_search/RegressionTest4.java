import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find((-1), intArray7, true);
        int int17 = code.src.BinarySearch.find((-1), intArray7, false);
        int int19 = code.src.BinarySearch.find(3, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(3, intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int34 = code.src.BinarySearch.find(3, intArray14, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int38 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int40 = code.src.BinarySearch.find(100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find((-1), intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int22 = code.src.BinarySearch.find(100, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int28 = code.src.BinarySearch.find(2, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find(10, intArray18, true);
        int int32 = code.src.BinarySearch.find(2, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int38 = code.src.BinarySearch.find(3, intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find(100, intArray12, true);
        int int24 = code.src.BinarySearch.find(100, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int36 = code.src.BinarySearch.find(10, intArray14, false);
        int int38 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int40 = code.src.BinarySearch.find(0, intArray14, true);
        java.lang.Class<?> wildcardClass41 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int32 = code.src.BinarySearch.find(0, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int20 = code.src.BinarySearch.find((-1), intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        java.lang.Class<?> wildcardClass28 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, false);
        int int27 = code.src.BinarySearch.find((-1), intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int31 = code.src.BinarySearch.find(100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find(0, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int32 = code.src.BinarySearch.find(0, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(3, intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int34 = code.src.BinarySearch.find(3, intArray14, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int38 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        java.lang.Class<?> wildcardClass41 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int36 = code.src.BinarySearch.find((-1), intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(2, intArray11, false);
        int int29 = code.src.BinarySearch.find(0, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int29 = code.src.BinarySearch.find(10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int31 = code.src.BinarySearch.find(2147483647, intArray17, true);
        int int33 = code.src.BinarySearch.find(0, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = code.src.BinarySearch.find(2147483647, intArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((-1), intArray5, true);
        int int11 = code.src.BinarySearch.find(0, intArray5, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find(0, intArray19, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray19, true);
        int int35 = code.src.BinarySearch.find(0, intArray19, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray19, true);
        int int39 = code.src.BinarySearch.find(3, intArray19, true);
        int int41 = code.src.BinarySearch.find((int) (short) 10, intArray19, true);
        int int43 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int45 = code.src.BinarySearch.find((int) (short) -1, intArray19, true);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find(2147483647, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int28 = code.src.BinarySearch.find(2, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = code.src.BinarySearch.find(2147483647, intArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find(1, intArray11, true);
        int int29 = code.src.BinarySearch.find((-1), intArray11, true);
        int int31 = code.src.BinarySearch.find(0, intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int[] intArray20 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int22 = code.src.BinarySearch.find(0, intArray20, false);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray20, true);
        int int26 = code.src.BinarySearch.find(0, intArray20, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray20, false);
        int int30 = code.src.BinarySearch.find(0, intArray20, true);
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray20, false);
        int int34 = code.src.BinarySearch.find(100, intArray20, true);
        int int36 = code.src.BinarySearch.find((int) '4', intArray20, false);
        int int38 = code.src.BinarySearch.find(10, intArray20, false);
        int int40 = code.src.BinarySearch.find((int) 'a', intArray20, true);
        int int42 = code.src.BinarySearch.find((int) (byte) 0, intArray20, true);
        int int44 = code.src.BinarySearch.find((int) (short) 100, intArray20, true);
        int int46 = code.src.BinarySearch.find((int) (byte) 10, intArray20, false);
        int int48 = code.src.BinarySearch.find((int) (short) 0, intArray20, false);
        java.lang.Class<?> wildcardClass49 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find((-1), intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int34 = code.src.BinarySearch.find((-1), intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find(10, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int28 = code.src.BinarySearch.find(10, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int32 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = code.src.BinarySearch.find(2147483647, intArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int29 = code.src.BinarySearch.find(0, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find(10, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int29 = code.src.BinarySearch.find(10, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find(2, intArray11, true);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        int int23 = code.src.BinarySearch.find(3, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray14 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int34 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int36 = code.src.BinarySearch.find((int) '4', intArray14, false);
        java.lang.Class<?> wildcardClass37 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((-1), intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((-1), intArray15, true);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int20 = code.src.BinarySearch.find(100, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int14 = code.src.BinarySearch.find(100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find(10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int33 = code.src.BinarySearch.find(1, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int37 = code.src.BinarySearch.find(3, intArray17, false);
        int int39 = code.src.BinarySearch.find(100, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, true);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int34 = code.src.BinarySearch.find(100, intArray16, true);
        int int36 = code.src.BinarySearch.find(1, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(3, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, false);
        int int32 = code.src.BinarySearch.find((-1), intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, false);
        int int31 = code.src.BinarySearch.find(3, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int26 = code.src.BinarySearch.find(2, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int34 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find(3, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(2, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find(3, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find(2, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find(100, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(2, intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find(1, intArray11, true);
        int int19 = code.src.BinarySearch.find((-1), intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) ' ', intArray5, false);
        int int11 = code.src.BinarySearch.find((int) (short) 0, intArray5, true);
        int int13 = code.src.BinarySearch.find((int) (short) -1, intArray5, true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, false);
        int int24 = code.src.BinarySearch.find(2, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int37 = code.src.BinarySearch.find(1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = code.src.BinarySearch.find(2147483647, intArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = code.src.BinarySearch.find(2147483647, intArray16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, false);
        int int29 = code.src.BinarySearch.find((-1), intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int39 = code.src.BinarySearch.find(10, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find(10, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        int int17 = code.src.BinarySearch.find(2147483647, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find(3, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(10, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find(10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, false);
        int int20 = code.src.BinarySearch.find(1, intArray10, false);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, true);
        int int24 = code.src.BinarySearch.find(100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        int int25 = code.src.BinarySearch.find(0, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        java.lang.Class<?> wildcardClass28 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find(1, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int37 = code.src.BinarySearch.find(1, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) '4', intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((-1), intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find(100, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int19 = code.src.BinarySearch.find(3, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, false);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int27 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((-1), intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int25 = code.src.BinarySearch.find(1, intArray17, true);
        int int27 = code.src.BinarySearch.find((-1), intArray17, false);
        int int29 = code.src.BinarySearch.find(100, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int35 = code.src.BinarySearch.find((-1), intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, true);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find(2, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find(1, intArray11, true);
        int int29 = code.src.BinarySearch.find((-1), intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int20 = code.src.BinarySearch.find(100, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find(10, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        int int26 = code.src.BinarySearch.find(100, intArray12, true);
        int int28 = code.src.BinarySearch.find(2, intArray12, true);
        int int30 = code.src.BinarySearch.find(3, intArray12, true);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int33 = code.src.BinarySearch.find(0, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find(2, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int20 = code.src.BinarySearch.find(100, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int23 = code.src.BinarySearch.find((-1), intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find(10, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find(2147483647, intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find(1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int25 = code.src.BinarySearch.find(0, intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find(2, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int33 = code.src.BinarySearch.find(10, intArray13, true);
        int int35 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int37 = code.src.BinarySearch.find(0, intArray13, true);
        java.lang.Class<?> wildcardClass38 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(3, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int23 = code.src.BinarySearch.find(10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find(2, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int[] intArray14 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        java.lang.Class<?> wildcardClass37 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
        int int22 = code.src.BinarySearch.find(0, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int29 = code.src.BinarySearch.find(0, intArray17, true);
        int int31 = code.src.BinarySearch.find((-1), intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int37 = code.src.BinarySearch.find(100, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int23 = code.src.BinarySearch.find(10, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find(1, intArray10, true);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int35 = code.src.BinarySearch.find(2, intArray17, false);
        int int37 = code.src.BinarySearch.find(0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find(2, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray17, false);
        int int31 = code.src.BinarySearch.find((-1), intArray17, true);
        int int33 = code.src.BinarySearch.find(10, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find(0, intArray12, false);
        int int28 = code.src.BinarySearch.find((-1), intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
        int int32 = code.src.BinarySearch.find(0, intArray14, false);
        int int34 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int40 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        java.lang.Class<?> wildcardClass41 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(10, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int34 = code.src.BinarySearch.find((-1), intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) ' ', intArray5, false);
        int int11 = code.src.BinarySearch.find(100, intArray5, false);
        int int13 = code.src.BinarySearch.find(1, intArray5, false);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find(0, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int35 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find(100, intArray16, false);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find(10, intArray16, false);
        int int32 = code.src.BinarySearch.find(1, intArray16, false);
        int int34 = code.src.BinarySearch.find(1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(2, intArray16, true);
        int int32 = code.src.BinarySearch.find((-1), intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find(0, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int37 = code.src.BinarySearch.find(10, intArray17, false);
        int int39 = code.src.BinarySearch.find(10, intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find(10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) '4', intArray5, false);
        int int11 = code.src.BinarySearch.find((int) (byte) 10, intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (short) 0, intArray5, true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find(3, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, false);
        int int24 = code.src.BinarySearch.find(2147483647, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find(1, intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int30 = code.src.BinarySearch.find(2, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int38 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int40 = code.src.BinarySearch.find(100, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find(3, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(10, intArray9, true);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find(1, intArray8, false);
        int int22 = code.src.BinarySearch.find(1, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find(10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int27 = code.src.BinarySearch.find(100, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int31 = code.src.BinarySearch.find(10, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find(2, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int35 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int37 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        java.lang.Class<?> wildcardClass38 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray6, false);
        int int16 = code.src.BinarySearch.find((-1), intArray6, true);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find(1, intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int30 = code.src.BinarySearch.find(2, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int38 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int40 = code.src.BinarySearch.find(100, intArray18, false);
        int int42 = code.src.BinarySearch.find(100, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find(10, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int28 = code.src.BinarySearch.find(10, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int32 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int34 = code.src.BinarySearch.find(1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, true);
        int int29 = code.src.BinarySearch.find(0, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int33 = code.src.BinarySearch.find(0, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find(3, intArray13, true);
        int int27 = code.src.BinarySearch.find(3, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int32 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int40 = code.src.BinarySearch.find(3, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) -1, intArray18, false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int32 = code.src.BinarySearch.find(2, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find(2, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((-1), intArray6, false);
        int int14 = code.src.BinarySearch.find((int) '4', intArray6, true);
        int int16 = code.src.BinarySearch.find(2, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int32 = code.src.BinarySearch.find(100, intArray14, true);
        int int34 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int36 = code.src.BinarySearch.find(3, intArray14, true);
        int int38 = code.src.BinarySearch.find(0, intArray14, false);
        int int40 = code.src.BinarySearch.find((-1), intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find(2, intArray7, true);
        int int19 = code.src.BinarySearch.find(10, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int22 = code.src.BinarySearch.find((-1), intArray12, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find(2, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(100, intArray13, false);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = code.src.BinarySearch.find(2147483647, intArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        int int29 = code.src.BinarySearch.find(2, intArray13, true);
        int int31 = code.src.BinarySearch.find((-1), intArray13, true);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        java.lang.Class<?> wildcardClass34 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find(2, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find(1, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, false);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray17, true);
        int int29 = code.src.BinarySearch.find(3, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, false);
        int int28 = code.src.BinarySearch.find((-1), intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        int int25 = code.src.BinarySearch.find((-1), intArray19, false);
        int int27 = code.src.BinarySearch.find(3, intArray19, true);
        int int29 = code.src.BinarySearch.find(2, intArray19, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray19, false);
        int int33 = code.src.BinarySearch.find(100, intArray19, true);
        int int35 = code.src.BinarySearch.find(3, intArray19, true);
        int int37 = code.src.BinarySearch.find(2, intArray19, true);
        int int39 = code.src.BinarySearch.find((int) (short) 0, intArray19, true);
        int int41 = code.src.BinarySearch.find((-1), intArray19, true);
        int int43 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int45 = code.src.BinarySearch.find((int) (short) 10, intArray19, true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find(100, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find(100, intArray11, true);
        int int31 = code.src.BinarySearch.find(0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, true);
        int int15 = code.src.BinarySearch.find(10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray11, false);
        int int27 = code.src.BinarySearch.find(1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find(0, intArray19, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray19, true);
        int int35 = code.src.BinarySearch.find(0, intArray19, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray19, true);
        int int39 = code.src.BinarySearch.find(3, intArray19, true);
        int int41 = code.src.BinarySearch.find((int) (short) 10, intArray19, true);
        int int43 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int45 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int23 = code.src.BinarySearch.find(10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find(3, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, false);
        int int23 = code.src.BinarySearch.find(100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find(3, intArray12, false);
        int int24 = code.src.BinarySearch.find(3, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int29 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int31 = code.src.BinarySearch.find(0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find(3, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int15 = code.src.BinarySearch.find((int) '#', intArray7, false);
        java.lang.Class<?> wildcardClass16 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find(2147483647, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((-1), intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find(2, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find(1, intArray13, true);
        int int19 = code.src.BinarySearch.find(10, intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int25 = code.src.BinarySearch.find(2, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int29 = code.src.BinarySearch.find(0, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(100, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(3, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, false);
        int int32 = code.src.BinarySearch.find(3, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find(0, intArray4, false);
        int int10 = code.src.BinarySearch.find((int) (short) 10, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int12 = code.src.BinarySearch.find(100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find(100, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int28 = code.src.BinarySearch.find(100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int23 = code.src.BinarySearch.find(2, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find(10, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find(10, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find(10, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find(3, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int32 = code.src.BinarySearch.find(100, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int36 = code.src.BinarySearch.find(2, intArray18, false);
        int int38 = code.src.BinarySearch.find(0, intArray18, false);
        int int40 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) -1, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(2, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find((-1), intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find(0, intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int23 = code.src.BinarySearch.find(10, intArray9, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find(0, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int29 = code.src.BinarySearch.find((-1), intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find(0, intArray19, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray19, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int35 = code.src.BinarySearch.find(0, intArray19, false);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int39 = code.src.BinarySearch.find(2, intArray19, true);
        int int41 = code.src.BinarySearch.find(3, intArray19, false);
        int int43 = code.src.BinarySearch.find((int) (short) 10, intArray19, true);
        int int45 = code.src.BinarySearch.find(0, intArray19, true);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int[] intArray22 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int24 = code.src.BinarySearch.find(0, intArray22, false);
        int int26 = code.src.BinarySearch.find(0, intArray22, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray22, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray22, true);
        int int32 = code.src.BinarySearch.find((int) '#', intArray22, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray22, false);
        int int36 = code.src.BinarySearch.find(2147483647, intArray22, true);
        int int38 = code.src.BinarySearch.find(0, intArray22, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 0, intArray22, true);
        int int42 = code.src.BinarySearch.find(3, intArray22, true);
        int int44 = code.src.BinarySearch.find((int) (short) 10, intArray22, true);
        int int46 = code.src.BinarySearch.find((int) '#', intArray22, false);
        int int48 = code.src.BinarySearch.find((int) (short) -1, intArray22, true);
        int int50 = code.src.BinarySearch.find((int) (short) -1, intArray22, false);
        int int52 = code.src.BinarySearch.find((int) (byte) 10, intArray22, true);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = code.src.BinarySearch.find(2147483647, intArray22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, false);
        int int26 = code.src.BinarySearch.find(0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int29 = code.src.BinarySearch.find(0, intArray11, true);
        int int31 = code.src.BinarySearch.find(1, intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, true);
        int int29 = code.src.BinarySearch.find(0, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        int int35 = code.src.BinarySearch.find(100, intArray17, true);
        int int37 = code.src.BinarySearch.find(1, intArray17, false);
        int int39 = code.src.BinarySearch.find(10, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find(1, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find(0, intArray10, false);
        int int28 = code.src.BinarySearch.find(100, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int18 = code.src.BinarySearch.find((-1), intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        int int26 = code.src.BinarySearch.find(0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((-1), intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = code.src.BinarySearch.find(2147483647, intArray15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find(3, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find((-1), intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find((-1), intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int30 = code.src.BinarySearch.find(2, intArray18, false);
        int int32 = code.src.BinarySearch.find(0, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int38 = code.src.BinarySearch.find(3, intArray18, true);
        int int40 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int42 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int[] intArray3 = new int[] { (short) 0 };
        int int5 = code.src.BinarySearch.find((-1), intArray3, true);
        int int7 = code.src.BinarySearch.find(0, intArray3, true);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int29 = code.src.BinarySearch.find(2, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((-1), intArray6, false);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find(0, intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((-1), intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int29 = code.src.BinarySearch.find(0, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int13 = code.src.BinarySearch.find(2, intArray5, true);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(2, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int37 = code.src.BinarySearch.find((-1), intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, true);
        int int19 = code.src.BinarySearch.find(100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find(2147483647, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int35 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int37 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find(10, intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int26 = code.src.BinarySearch.find(10, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int33 = code.src.BinarySearch.find(100, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find(10, intArray18, true);
        int int32 = code.src.BinarySearch.find(2, intArray18, true);
        int int34 = code.src.BinarySearch.find((-1), intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int40 = code.src.BinarySearch.find(100, intArray18, true);
        int int42 = code.src.BinarySearch.find(100, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find(0, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, true);
        int int20 = code.src.BinarySearch.find(2, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        java.lang.Class<?> wildcardClass28 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray11, false);
        int int29 = code.src.BinarySearch.find(1, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find(100, intArray11, true);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find(1, intArray13, true);
        int int19 = code.src.BinarySearch.find(10, intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int30 = code.src.BinarySearch.find(0, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find(3, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) '4', intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find(0, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray17, true);
        int int29 = code.src.BinarySearch.find(3, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        int int35 = code.src.BinarySearch.find(2147483647, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int39 = code.src.BinarySearch.find(0, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find(3, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int25 = code.src.BinarySearch.find(100, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find(3, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int28 = code.src.BinarySearch.find((-1), intArray12, true);
        int int30 = code.src.BinarySearch.find(0, intArray12, true);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find(0, intArray19, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray19, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray19, false);
        int int31 = code.src.BinarySearch.find(2, intArray19, false);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray19, true);
        int int35 = code.src.BinarySearch.find(1, intArray19, true);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int39 = code.src.BinarySearch.find(3, intArray19, false);
        int int41 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int43 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int45 = code.src.BinarySearch.find((int) '4', intArray19, true);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray7, false);
        int int19 = code.src.BinarySearch.find(2, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, true);
        int int25 = code.src.BinarySearch.find(2, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, false);
        int int26 = code.src.BinarySearch.find(0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int23 = code.src.BinarySearch.find(3, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, false);
        int int15 = code.src.BinarySearch.find(2, intArray9, true);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        int int26 = code.src.BinarySearch.find(10, intArray10, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find(0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(2, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find(2, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, true);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = code.src.BinarySearch.find(2147483647, intArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = code.src.BinarySearch.find(2147483647, intArray14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int31 = code.src.BinarySearch.find(2, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int35 = code.src.BinarySearch.find(3, intArray17, false);
        int int37 = code.src.BinarySearch.find(2, intArray17, false);
        int int39 = code.src.BinarySearch.find(2147483647, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int35 = code.src.BinarySearch.find(0, intArray17, true);
        int int37 = code.src.BinarySearch.find(10, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) '4', intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int24 = code.src.BinarySearch.find(0, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int28 = code.src.BinarySearch.find(0, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray18, false);
        int int32 = code.src.BinarySearch.find(100, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (byte) -1, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int26 = code.src.BinarySearch.find(10, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int[] intArray3 = new int[] { (short) 0 };
        int int5 = code.src.BinarySearch.find((-1), intArray3, true);
        int int7 = code.src.BinarySearch.find((int) (short) 1, intArray3, true);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int37 = code.src.BinarySearch.find(10, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((-1), intArray8, false);
        int int14 = code.src.BinarySearch.find(10, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find(0, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int30 = code.src.BinarySearch.find(1, intArray12, false);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find((-1), intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int23 = code.src.BinarySearch.find(100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int23 = code.src.BinarySearch.find(2, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int20 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int22 = code.src.BinarySearch.find(2147483647, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find(2, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find(3, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int29 = code.src.BinarySearch.find(2, intArray11, false);
        int int31 = code.src.BinarySearch.find(2, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int33 = code.src.BinarySearch.find(0, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find(2, intArray17, true);
        int int39 = code.src.BinarySearch.find(3, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int[] intArray15 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int19 = code.src.BinarySearch.find(1, intArray15, true);
        int int21 = code.src.BinarySearch.find(10, intArray15, true);
        int int23 = code.src.BinarySearch.find(100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        java.lang.Class<?> wildcardClass36 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int21 = code.src.BinarySearch.find(3, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find(10, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        int int26 = code.src.BinarySearch.find(0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find(0, intArray19, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray19, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray19, true);
        int int35 = code.src.BinarySearch.find(0, intArray19, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray19, true);
        int int39 = code.src.BinarySearch.find(3, intArray19, true);
        int int41 = code.src.BinarySearch.find((int) (short) 10, intArray19, true);
        int int43 = code.src.BinarySearch.find(3, intArray19, true);
        int int45 = code.src.BinarySearch.find(1, intArray19, false);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find(0, intArray11, true);
        int int27 = code.src.BinarySearch.find(2, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find(3, intArray10, true);
        int int24 = code.src.BinarySearch.find(3, intArray10, true);
        int int26 = code.src.BinarySearch.find(0, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(2, intArray16, true);
        int int32 = code.src.BinarySearch.find((-1), intArray16, false);
        int int34 = code.src.BinarySearch.find(2, intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int38 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int40 = code.src.BinarySearch.find(100, intArray14, false);
        java.lang.Class<?> wildcardClass41 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int16 = code.src.BinarySearch.find(1, intArray10, true);
        int int18 = code.src.BinarySearch.find((-1), intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int23 = code.src.BinarySearch.find(100, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int29 = code.src.BinarySearch.find((-1), intArray11, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int25 = code.src.BinarySearch.find(0, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int29 = code.src.BinarySearch.find(3, intArray11, false);
        int int31 = code.src.BinarySearch.find(100, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int[] intArray15 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find(2147483647, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int35 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int37 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (byte) 0, intArray5, false);
        int int11 = code.src.BinarySearch.find((int) '4', intArray5, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 100, intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(3, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((-1), intArray5, false);
        int int13 = code.src.BinarySearch.find(3, intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((-1), intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, true);
        int int26 = code.src.BinarySearch.find(0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find(2, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find(10, intArray8, true);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find(3, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((-1), intArray12, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find(0, intArray6, false);
        int int14 = code.src.BinarySearch.find(10, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray6, false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find(3, intArray16, false);
        int int36 = code.src.BinarySearch.find(1, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find(1, intArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find(3, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int35 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int37 = code.src.BinarySearch.find((-1), intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        int int26 = code.src.BinarySearch.find(100, intArray12, true);
        int int28 = code.src.BinarySearch.find(3, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }
}

