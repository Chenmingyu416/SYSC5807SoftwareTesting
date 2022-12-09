import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find((-1), intArray13, true);
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int[] intArray7 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int9 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, false);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
        int int19 = code.src.BinarySearch.find(2147483647, intArray7, true);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find(10, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find(3, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, true);
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int18 = code.src.BinarySearch.find((-1), intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray7, false);
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = code.src.BinarySearch.find(2147483647, intArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(3, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find(1, intArray7, true);
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((-1), intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int[] intArray9 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int11 = code.src.BinarySearch.find(0, intArray9, false);
        int int13 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int15 = code.src.BinarySearch.find(10, intArray9, false);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (short) 10, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find(0, intArray6, true);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find(3, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray7, false);
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int25 = code.src.BinarySearch.find(3, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int31 = code.src.BinarySearch.find(100, intArray11, true);
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int20 = code.src.BinarySearch.find(3, intArray10, true);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray8, true);
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find(100, intArray8, true);
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray7, true);
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find(3, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, true);
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (short) 100, intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray5, false);
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find(3, intArray10, false);
        int int26 = code.src.BinarySearch.find((-1), intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((-1), intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (short) 1, intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) '4', intArray6, true);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray6, true);
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray7, true);
        int int17 = code.src.BinarySearch.find((-1), intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray7, false);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int16 = code.src.BinarySearch.find(100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, false);
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) ' ', intArray4, false);
        int int10 = code.src.BinarySearch.find(100, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((-1), intArray5, false);
        int int13 = code.src.BinarySearch.find((-1), intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((-1), intArray8, true);
        int int14 = code.src.BinarySearch.find(1, intArray8, false);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int17 = code.src.BinarySearch.find(0, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find(3, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray11, false);
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray7, false);
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int27 = code.src.BinarySearch.find(1, intArray13, true);
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int27 = code.src.BinarySearch.find((-1), intArray13, false);
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int16 = code.src.BinarySearch.find(100, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find(0, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, false);
        int int20 = code.src.BinarySearch.find(10, intArray10, true);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int[] intArray6 = new int[] { 0, (byte) -1, 0, '4', (byte) 10 };
        int int8 = code.src.BinarySearch.find((int) (byte) 100, intArray6, true);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 52, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray8, false);
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((-1), intArray8, true);
        int int14 = code.src.BinarySearch.find(1, intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find(2, intArray12, false);
        int int30 = code.src.BinarySearch.find(0, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find(0, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find(3, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(1, intArray5, false);
        int int11 = code.src.BinarySearch.find(0, intArray5, false);
        int int13 = code.src.BinarySearch.find(10, intArray5, true);
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int25 = code.src.BinarySearch.find(2, intArray9, false);
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, false);
        int int21 = code.src.BinarySearch.find(1, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find((int) (byte) 0, intArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray8, true);
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find(10, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, false);
        int int34 = code.src.BinarySearch.find((-1), intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '4', intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find(1, intArray12, false);
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(1, intArray5, false);
        int int11 = code.src.BinarySearch.find((int) '#', intArray5, true);
        int int13 = code.src.BinarySearch.find((int) (short) -1, intArray5, false);
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        int int31 = code.src.BinarySearch.find(3, intArray11, true);
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray9, false);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((-1), intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, false);
        int int16 = code.src.BinarySearch.find((-1), intArray6, false);
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find((int) 'a', intArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, true);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find(2, intArray10, false);
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (byte) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find(10, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray7, true);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find(0, intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(3, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(3, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray9, true);
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int[] intArray7 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int9 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int11 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find(2, intArray12, false);
        int int30 = code.src.BinarySearch.find(0, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int23 = code.src.BinarySearch.find(2, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find(100, intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find(100, intArray10, true);
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find(2147483647, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) '#', intArray6, true);
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(3, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int21 = code.src.BinarySearch.find(100, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int15 = code.src.BinarySearch.find(100, intArray7, false);
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, false);
        int int27 = code.src.BinarySearch.find(1, intArray13, false);
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int26 = code.src.BinarySearch.find(3, intArray12, false);
        int int28 = code.src.BinarySearch.find((-1), intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int32 = code.src.BinarySearch.find(3, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find(10, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray6, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray6, false);
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
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
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((-1), intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int25 = code.src.BinarySearch.find(3, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray7, false);
        int int19 = code.src.BinarySearch.find(10, intArray7, false);
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int28 = code.src.BinarySearch.find(10, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((-1), intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int33 = code.src.BinarySearch.find(10, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int39 = code.src.BinarySearch.find(10, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray6, true);
        int int16 = code.src.BinarySearch.find((-1), intArray6, false);
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        int int17 = code.src.BinarySearch.find(2, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find(2, intArray7, false);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find(3, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int25 = code.src.BinarySearch.find(2, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray11, true);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(1, intArray5, false);
        int int11 = code.src.BinarySearch.find((int) (short) 100, intArray5, true);
        int int13 = code.src.BinarySearch.find(1, intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find(1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int22 = code.src.BinarySearch.find((-1), intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int19 = code.src.BinarySearch.find(100, intArray11, true);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find(2, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray6, true);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int32 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find(3, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find(2, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find(3, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find((-1), intArray9, false);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int21 = code.src.BinarySearch.find(2, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int8 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int10 = code.src.BinarySearch.find((int) 'a', intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, true);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
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
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((-1), intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (short) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find((int) (short) 1, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (byte) 0, intArray4, false);
        int int10 = code.src.BinarySearch.find((int) '4', intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find(0, intArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((-1), intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int25 = code.src.BinarySearch.find(100, intArray13, true);
        int int27 = code.src.BinarySearch.find((-1), intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((-1), intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, false);
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int[] intArray9 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int11 = code.src.BinarySearch.find(0, intArray9, false);
        int int13 = code.src.BinarySearch.find(0, intArray9, true);
        int int15 = code.src.BinarySearch.find(0, intArray9, true);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, false);
        int int21 = code.src.BinarySearch.find(10, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find(1, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find(1, intArray4, false);
        int int10 = code.src.BinarySearch.find(10, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((-1), intArray4, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray4, false);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, true);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int22 = code.src.BinarySearch.find(100, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (byte) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find((int) (short) 10, intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(10, intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray5, false);
        int int13 = code.src.BinarySearch.find((-1), intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(1, intArray7, true);
        int int17 = code.src.BinarySearch.find(3, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray7, true);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(2, intArray10, true);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
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
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        int int19 = code.src.BinarySearch.find(0, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find(10, intArray8, true);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = code.src.BinarySearch.find(2147483647, intArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find(0, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
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
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find(3, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((-1), intArray8, false);
        int int14 = code.src.BinarySearch.find(2, intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find(10, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int[] intArray8 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int10 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int12 = code.src.BinarySearch.find(3, intArray8, true);
        int int14 = code.src.BinarySearch.find(2, intArray8, false);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, true);
        int int27 = code.src.BinarySearch.find((-1), intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find(100, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int18 = code.src.BinarySearch.find((-1), intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray14, true);
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int36 = code.src.BinarySearch.find(3, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray12, false);
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find(1, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find(2, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((-1), intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find(1, intArray14, false);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
        int int17 = code.src.BinarySearch.find(2147483647, intArray7, false);
        int int19 = code.src.BinarySearch.find((-1), intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find(3, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) ' ', intArray5, false);
        int int11 = code.src.BinarySearch.find(100, intArray5, false);
        int int13 = code.src.BinarySearch.find(0, intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray7, false);
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(2, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int[] intArray4 = new int[] { 0, '#' };
        int int6 = code.src.BinarySearch.find(100, intArray4, true);
        int int8 = code.src.BinarySearch.find((-1), intArray4, false);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        int int39 = code.src.BinarySearch.find((int) ' ', intArray17, true);
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray10, true);
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
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
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
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int24 = code.src.BinarySearch.find(3, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        int int19 = code.src.BinarySearch.find(0, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(2, intArray17, true);
        int int33 = code.src.BinarySearch.find((-1), intArray17, false);
        int int35 = code.src.BinarySearch.find(2, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int39 = code.src.BinarySearch.find(0, intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray7, true);
        int int19 = code.src.BinarySearch.find(10, intArray7, false);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find(3, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find(1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find(3, intArray7, false);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, true);
        int int25 = code.src.BinarySearch.find(100, intArray13, false);
        int int27 = code.src.BinarySearch.find(2, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray6, false);
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find(3, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray7, false);
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int[] intArray7 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find(3, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find(2147483647, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        int int36 = code.src.BinarySearch.find(3, intArray16, false);
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray6, true);
        int int16 = code.src.BinarySearch.find((int) '4', intArray6, false);
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find((-1), intArray12, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, true);
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
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find((-1), intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find(100, intArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find(100, intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, true);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        int[] intArray9 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int11 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int13 = code.src.BinarySearch.find(3, intArray9, true);
        int int15 = code.src.BinarySearch.find(3, intArray9, true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = code.src.BinarySearch.find((int) 'a', intArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int20 = code.src.BinarySearch.find(100, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray7, true);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, true);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find(3, intArray13, false);
        int int29 = code.src.BinarySearch.find((-1), intArray13, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int33 = code.src.BinarySearch.find(3, intArray13, true);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int37 = code.src.BinarySearch.find(2, intArray13, true);
        java.lang.Class<?> wildcardClass38 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find((int) (byte) -1, intArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, true);
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, true);
        int int14 = code.src.BinarySearch.find(2, intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((-1), intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find(10, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find(3, intArray9, true);
        int int23 = code.src.BinarySearch.find(3, intArray9, true);
        int int25 = code.src.BinarySearch.find(1, intArray9, true);
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int34 = code.src.BinarySearch.find(2, intArray16, false);
        int int36 = code.src.BinarySearch.find(0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find(2, intArray6, false);
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((-1), intArray6, false);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int10 = code.src.BinarySearch.find(0, intArray8, false);
        int int12 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find(3, intArray10, false);
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray8, false);
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        java.lang.Class<?> wildcardClass28 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find(3, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find(10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int[] intArray8 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int10 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int12 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int[] intArray9 = new int[] { 1, 10, ' ', (byte) 1, ' ' };
        int int11 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int13 = code.src.BinarySearch.find(3, intArray9, true);
        int int15 = code.src.BinarySearch.find(2, intArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = code.src.BinarySearch.find((int) 'a', intArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 32, 1, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find(0, intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, true);
        int int18 = code.src.BinarySearch.find(100, intArray10, true);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find((-1), intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, false);
        int int34 = code.src.BinarySearch.find((-1), intArray16, false);
        int int36 = code.src.BinarySearch.find(100, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int13 = code.src.BinarySearch.find(100, intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((-1), intArray6, true);
        int int12 = code.src.BinarySearch.find(2, intArray6, true);
        int int14 = code.src.BinarySearch.find(0, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray6, false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((-1), intArray5, false);
        int int13 = code.src.BinarySearch.find(1, intArray5, true);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int25 = code.src.BinarySearch.find(10, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find((int) (byte) 100, intArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find(1, intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(0, intArray5, false);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int13 = code.src.BinarySearch.find((-1), intArray5, false);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find(10, intArray10, true);
        int int18 = code.src.BinarySearch.find(100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find(3, intArray9, true);
        int int23 = code.src.BinarySearch.find(3, intArray9, true);
        int int25 = code.src.BinarySearch.find(10, intArray9, false);
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((-1), intArray5, true);
        int int11 = code.src.BinarySearch.find(0, intArray5, true);
        int int13 = code.src.BinarySearch.find(100, intArray5, false);
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, true);
        int int20 = code.src.BinarySearch.find(2, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((-1), intArray7, false);
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
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find(0, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(3, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int37 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find(0, intArray7, true);
        int int19 = code.src.BinarySearch.find(2, intArray7, true);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find(3, intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, true);
        int int19 = code.src.BinarySearch.find(100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int18 = code.src.BinarySearch.find(1, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(100, intArray8, false);
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find(2, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find(2, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray6, false);
        int int14 = code.src.BinarySearch.find((-1), intArray6, true);
        int int16 = code.src.BinarySearch.find((int) '4', intArray6, false);
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        int int37 = code.src.BinarySearch.find(3, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray17, true);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find(2, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, false);
        int int27 = code.src.BinarySearch.find((-1), intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int[] intArray5 = new int[] { 0, '#' };
        int int7 = code.src.BinarySearch.find(100, intArray5, true);
        int int9 = code.src.BinarySearch.find((-1), intArray5, false);
        int int11 = code.src.BinarySearch.find((int) (byte) 10, intArray5, false);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find(2, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((-1), intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, false);
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int17 = code.src.BinarySearch.find(0, intArray7, false);
        int int19 = code.src.BinarySearch.find(0, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find(10, intArray10, true);
        int int18 = code.src.BinarySearch.find(100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int25 = code.src.BinarySearch.find(2, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(2, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find(2, intArray10, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int7 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int9 = code.src.BinarySearch.find(3, intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((-1), intArray7, false);
        int int19 = code.src.BinarySearch.find((-1), intArray7, false);
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find(2, intArray13, true);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find(2, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray18, false);
        int int32 = code.src.BinarySearch.find(100, intArray18, true);
        int int34 = code.src.BinarySearch.find(3, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray18, false);
        int int38 = code.src.BinarySearch.find(100, intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 1, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (short) 100, intArray18, false);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, false);
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
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray8, false);
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
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find(0, intArray7, true);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find(10, intArray11, true);
        int int19 = code.src.BinarySearch.find(100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = code.src.BinarySearch.find(2147483647, intArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, true);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find(1, intArray9, false);
        int int25 = code.src.BinarySearch.find(100, intArray9, true);
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray8, false);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((-1), intArray6, false);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray6, true);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find(3, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 100, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray6, false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find(1, intArray4, false);
        int int10 = code.src.BinarySearch.find(0, intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find(10, intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find(0, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (short) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find(0, intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 100, intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find(3, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 100, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, false);
        int int20 = code.src.BinarySearch.find(2, intArray8, true);
        int int22 = code.src.BinarySearch.find(10, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        int int29 = code.src.BinarySearch.find(2, intArray13, false);
        int int31 = code.src.BinarySearch.find(0, intArray13, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int35 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        java.lang.Class<?> wildcardClass38 = intArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        int int37 = code.src.BinarySearch.find(10, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(100, intArray13, false);
        int int27 = code.src.BinarySearch.find((-1), intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(2, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find(10, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find(10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(3, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int12 = code.src.BinarySearch.find(100, intArray6, false);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(3, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int17 = code.src.BinarySearch.find((-1), intArray9, true);
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int8 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int10 = code.src.BinarySearch.find((int) 'a', intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 1, intArray6, true);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((-1), intArray10, false);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((-1), intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int[] intArray8 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((-1), intArray8, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find(3, intArray10, true);
        int int28 = code.src.BinarySearch.find(3, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        int int38 = code.src.BinarySearch.find(2, intArray14, true);
        int int40 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int24 = code.src.BinarySearch.find(10, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}

