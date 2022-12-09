import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int30 = code.src.BinarySearch.find(2, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        int int34 = code.src.BinarySearch.find(3, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray18, true);
        int int38 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int40 = code.src.BinarySearch.find(0, intArray18, true);
        int int42 = code.src.BinarySearch.find(2, intArray18, true);
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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray18, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray18, true);
        int int34 = code.src.BinarySearch.find(0, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray18, true);
        int int38 = code.src.BinarySearch.find((int) ' ', intArray18, true);
        int int40 = code.src.BinarySearch.find(2, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find(2, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, true);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        int int42 = code.src.BinarySearch.find((-1), intArray18, true);
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((-1), intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int28 = code.src.BinarySearch.find(10, intArray10, false);
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
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
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(2, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, false);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find(100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (short) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (short) 1, intArray5, false);
        int int13 = code.src.BinarySearch.find(2, intArray5, false);
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
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
        int int25 = code.src.BinarySearch.find(10, intArray9, false);
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        int int39 = code.src.BinarySearch.find(0, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find(0, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int17 = code.src.BinarySearch.find(100, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        int int37 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int24 = code.src.BinarySearch.find(0, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray18, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int38 = code.src.BinarySearch.find(1, intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (short) 10, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) -1, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (short) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find(2147483647, intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int23 = code.src.BinarySearch.find(3, intArray9, false);
        int int25 = code.src.BinarySearch.find(100, intArray9, true);
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, false);
        int int15 = code.src.BinarySearch.find(2, intArray9, true);
        int int17 = code.src.BinarySearch.find(2, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find(2, intArray16, true);
        int int34 = code.src.BinarySearch.find(100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        int int34 = code.src.BinarySearch.find(10, intArray12, false);
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((-1), intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, true);
        int int21 = code.src.BinarySearch.find(2, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray9, false);
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find(2, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(2, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
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
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find(3, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find(1, intArray11, false);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int31 = code.src.BinarySearch.find(100, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(10, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((-1), intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find(3, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find(2, intArray13, true);
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find(3, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int21 = code.src.BinarySearch.find(100, intArray9, true);
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int25 = code.src.BinarySearch.find(10, intArray11, false);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int31 = code.src.BinarySearch.find(10, intArray11, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int34 = code.src.BinarySearch.find(1, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int16 = code.src.BinarySearch.find(100, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int26 = code.src.BinarySearch.find(2, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int30 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
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
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find(0, intArray9, false);
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
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        int int25 = code.src.BinarySearch.find((-1), intArray19, false);
        int int27 = code.src.BinarySearch.find(3, intArray19, true);
        int int29 = code.src.BinarySearch.find(2, intArray19, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray19, false);
        int int33 = code.src.BinarySearch.find(100, intArray19, true);
        int int35 = code.src.BinarySearch.find(3, intArray19, true);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray19, false);
        int int39 = code.src.BinarySearch.find(100, intArray19, false);
        int int41 = code.src.BinarySearch.find((int) (byte) 1, intArray19, false);
        int int43 = code.src.BinarySearch.find(10, intArray19, false);
        int int45 = code.src.BinarySearch.find((int) (short) 100, intArray19, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(2, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
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
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int33 = code.src.BinarySearch.find(3, intArray13, true);
        int int35 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int34 = code.src.BinarySearch.find(0, intArray14, false);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int38 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int40 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find(2, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
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
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        int[] intArray20 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int22 = code.src.BinarySearch.find(0, intArray20, false);
        int int24 = code.src.BinarySearch.find(0, intArray20, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray20, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray20, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray20, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray20, false);
        int int34 = code.src.BinarySearch.find(2147483647, intArray20, true);
        int int36 = code.src.BinarySearch.find(0, intArray20, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 0, intArray20, true);
        int int40 = code.src.BinarySearch.find(3, intArray20, true);
        int int42 = code.src.BinarySearch.find((int) (short) 10, intArray20, true);
        int int44 = code.src.BinarySearch.find((int) '#', intArray20, false);
        int int46 = code.src.BinarySearch.find((int) (short) -1, intArray20, true);
        int int48 = code.src.BinarySearch.find((int) (short) -1, intArray20, false);
        java.lang.Class<?> wildcardClass49 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, true);
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
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find((-1), intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
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
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int26 = code.src.BinarySearch.find((-1), intArray10, false);
        int int28 = code.src.BinarySearch.find(10, intArray10, false);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray9, false);
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
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int23 = code.src.BinarySearch.find(10, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find(2, intArray11, false);
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray10, true);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find(10, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 100, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find(0, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
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
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray18, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray18, true);
        int int34 = code.src.BinarySearch.find(0, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray18, true);
        int int38 = code.src.BinarySearch.find(3, intArray18, true);
        int int40 = code.src.BinarySearch.find((int) (short) 10, intArray18, true);
        int int42 = code.src.BinarySearch.find(2, intArray18, false);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find(2, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int39 = code.src.BinarySearch.find(1, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int31 = code.src.BinarySearch.find(0, intArray13, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int37 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass38 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int13 = code.src.BinarySearch.find(100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int19 = code.src.BinarySearch.find(100, intArray7, true);
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
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((-1), intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
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
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
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
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray11, false);
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
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
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
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find(2, intArray16, false);
        int int36 = code.src.BinarySearch.find((-1), intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find(100, intArray15, true);
        int int33 = code.src.BinarySearch.find(100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find(2147483647, intArray8, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int32 = code.src.BinarySearch.find(10, intArray16, true);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        int int26 = code.src.BinarySearch.find(1, intArray12, false);
        int int28 = code.src.BinarySearch.find(0, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find(1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
        int int25 = code.src.BinarySearch.find(2, intArray9, true);
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
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int20 = code.src.BinarySearch.find((-1), intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find(10, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, true);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find(1, intArray13, false);
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
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        int int34 = code.src.BinarySearch.find((int) '4', intArray12, false);
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
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find(3, intArray8, true);
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        int int38 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int19 = code.src.BinarySearch.find(0, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find(100, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
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
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int22 = code.src.BinarySearch.find(100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find(100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find((-1), intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((-1), intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, true);
        int int17 = code.src.BinarySearch.find(0, intArray11, false);
        int int19 = code.src.BinarySearch.find((-1), intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find(0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, false);
        int int33 = code.src.BinarySearch.find(10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find(2, intArray12, false);
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        int int32 = code.src.BinarySearch.find(1, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, true);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(2, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 10, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) '#', intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int23 = code.src.BinarySearch.find(10, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find(10, intArray11, true);
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, false);
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
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
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
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int25 = code.src.BinarySearch.find(10, intArray9, true);
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        java.lang.Class<?> wildcardClass32 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray6, false);
        int int16 = code.src.BinarySearch.find((-1), intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((-1), intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        int int39 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int20 = code.src.BinarySearch.find(10, intArray8, true);
        int int22 = code.src.BinarySearch.find(2, intArray8, true);
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
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int32 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int34 = code.src.BinarySearch.find(0, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray18, false);
        int int38 = code.src.BinarySearch.find(2, intArray18, true);
        int int40 = code.src.BinarySearch.find(3, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) '4', intArray18, true);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int[] intArray14 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int36 = code.src.BinarySearch.find(2, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find(1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
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
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int22 = code.src.BinarySearch.find(10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find(1, intArray9, true);
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int22 = code.src.BinarySearch.find(100, intArray8, true);
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int29 = code.src.BinarySearch.find(3, intArray11, true);
        int int31 = code.src.BinarySearch.find(100, intArray11, true);
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(3, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find(10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find(1, intArray13, true);
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
        int int19 = code.src.BinarySearch.find(0, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find(0, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, false);
        int int21 = code.src.BinarySearch.find(10, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int18 = code.src.BinarySearch.find(1, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
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
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, true);
        int int24 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, true);
        int int30 = code.src.BinarySearch.find(3, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray8, false);
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find(100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int18 = code.src.BinarySearch.find(100, intArray12, true);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        int int35 = code.src.BinarySearch.find(10, intArray13, false);
        int int37 = code.src.BinarySearch.find((int) 'a', intArray13, true);
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
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int30 = code.src.BinarySearch.find(10, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find(100, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '4', intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int30 = code.src.BinarySearch.find(10, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find(10, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
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
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find(2, intArray12, true);
        int int24 = code.src.BinarySearch.find((-1), intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int30 = code.src.BinarySearch.find(0, intArray12, false);
        int int32 = code.src.BinarySearch.find(10, intArray12, true);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int30 = code.src.BinarySearch.find(3, intArray12, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray12, false);
        int int34 = code.src.BinarySearch.find(100, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find((-1), intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
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
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
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
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
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
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, false);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int34 = code.src.BinarySearch.find(1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int39 = code.src.BinarySearch.find(0, intArray17, true);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((-1), intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int26 = code.src.BinarySearch.find(3, intArray12, true);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find(100, intArray11, true);
        int int23 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find(100, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int34 = code.src.BinarySearch.find(0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find(2, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int39 = code.src.BinarySearch.find((int) '#', intArray17, true);
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int24 = code.src.BinarySearch.find(0, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int28 = code.src.BinarySearch.find(1, intArray18, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray18, true);
        int int32 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (byte) -1, intArray18, false);
        int int36 = code.src.BinarySearch.find((-1), intArray18, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int40 = code.src.BinarySearch.find(1, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) (byte) -1, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find(3, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
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
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray11, false);
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
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
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
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
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = code.src.BinarySearch.find(2147483647, intArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
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
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, true);
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
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int31 = code.src.BinarySearch.find(100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
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
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int20 = code.src.BinarySearch.find((-1), intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int26 = code.src.BinarySearch.find(3, intArray10, true);
        int int28 = code.src.BinarySearch.find(10, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        int int19 = code.src.BinarySearch.find(3, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find(100, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find(3, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int12 = code.src.BinarySearch.find(100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, false);
        int int16 = code.src.BinarySearch.find(100, intArray6, false);
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
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find(1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
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
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find((-1), intArray10, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find(10, intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int[] intArray15 = new int[] { (short) 0 };
        int int17 = code.src.BinarySearch.find((-1), intArray15, true);
        int int19 = code.src.BinarySearch.find(0, intArray15, false);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(3, intArray15, false);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int35 = code.src.BinarySearch.find(3, intArray15, true);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int39 = code.src.BinarySearch.find(2, intArray15, true);
        int int41 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int43 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        java.lang.Class<?> wildcardClass44 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray10, true);
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
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((-1), intArray13, false);
        int int19 = code.src.BinarySearch.find(2, intArray13, true);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int28 = code.src.BinarySearch.find((-1), intArray12, true);
        int int30 = code.src.BinarySearch.find(10, intArray12, false);
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int31 = code.src.BinarySearch.find(100, intArray13, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int35 = code.src.BinarySearch.find(3, intArray13, true);
        int int37 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, false);
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
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int24 = code.src.BinarySearch.find(0, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find(2, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int21 = code.src.BinarySearch.find(2, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find(3, intArray9, false);
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, true);
        int int21 = code.src.BinarySearch.find(2, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
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
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        int int39 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find((-1), intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
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
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
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
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(3, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find(100, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, true);
        int int25 = code.src.BinarySearch.find(0, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
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
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find((-1), intArray8, false);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
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
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, true);
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
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find((-1), intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find(2, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray18, false);
        int int32 = code.src.BinarySearch.find(0, intArray18, false);
        int int34 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int38 = code.src.BinarySearch.find(100, intArray18, true);
        int int40 = code.src.BinarySearch.find((int) '#', intArray18, false);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = code.src.BinarySearch.find(2147483647, intArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find(10, intArray10, false);
        int int24 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, false);
        int int22 = code.src.BinarySearch.find(10, intArray12, true);
        int int24 = code.src.BinarySearch.find(10, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, false);
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
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find(1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
        int int19 = code.src.BinarySearch.find(10, intArray7, false);
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
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int31 = code.src.BinarySearch.find(10, intArray11, true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        int int26 = code.src.BinarySearch.find(100, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int32 = code.src.BinarySearch.find((-1), intArray12, false);
        int int34 = code.src.BinarySearch.find(2147483647, intArray12, false);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int30 = code.src.BinarySearch.find(3, intArray12, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int34 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find(10, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 100, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
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
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((-1), intArray6, true);
        int int12 = code.src.BinarySearch.find(0, intArray6, true);
        int int14 = code.src.BinarySearch.find(100, intArray6, false);
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
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(1, intArray17, true);
        int int35 = code.src.BinarySearch.find(2, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        int int33 = code.src.BinarySearch.find(1, intArray13, false);
        int int35 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int37 = code.src.BinarySearch.find(0, intArray13, true);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
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
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((-1), intArray13, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int23 = code.src.BinarySearch.find(10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, true);
        int int29 = code.src.BinarySearch.find(0, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int33 = code.src.BinarySearch.find(0, intArray17, true);
        int int35 = code.src.BinarySearch.find(10, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int39 = code.src.BinarySearch.find(0, intArray17, true);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
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
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int23 = code.src.BinarySearch.find((-1), intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find(2147483647, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int29 = code.src.BinarySearch.find(100, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int37 = code.src.BinarySearch.find(2, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find(3, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find(10, intArray10, true);
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
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
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
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int24 = code.src.BinarySearch.find(0, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int28 = code.src.BinarySearch.find(0, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray18, false);
        int int32 = code.src.BinarySearch.find(100, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int36 = code.src.BinarySearch.find(10, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        int int40 = code.src.BinarySearch.find((int) (byte) 0, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) '#', intArray18, false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find(3, intArray16, false);
        int int30 = code.src.BinarySearch.find(10, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '4', intArray16, true);
        int int36 = code.src.BinarySearch.find(100, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((-1), intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray7, false);
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
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int32 = code.src.BinarySearch.find((-1), intArray12, false);
        int int34 = code.src.BinarySearch.find(2147483647, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find(2, intArray16, true);
        int int34 = code.src.BinarySearch.find(100, intArray16, true);
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
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
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, true);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int17 = code.src.BinarySearch.find(2, intArray11, true);
        int int19 = code.src.BinarySearch.find(10, intArray11, false);
        int int21 = code.src.BinarySearch.find(10, intArray11, true);
        int int23 = code.src.BinarySearch.find(3, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find(0, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int21 = code.src.BinarySearch.find(100, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
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
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find(0, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int18 = code.src.BinarySearch.find(2, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray8, true);
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
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find(10, intArray18, true);
        int int32 = code.src.BinarySearch.find(2, intArray18, true);
        int int34 = code.src.BinarySearch.find((-1), intArray18, false);
        int int36 = code.src.BinarySearch.find(2, intArray18, true);
        int int38 = code.src.BinarySearch.find((int) (byte) 1, intArray18, false);
        int int40 = code.src.BinarySearch.find(3, intArray18, false);
        int int42 = code.src.BinarySearch.find(0, intArray18, true);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
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
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, true);
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
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
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
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int[] intArray13 = new int[] { (short) 0 };
        int int15 = code.src.BinarySearch.find((-1), intArray13, true);
        int int17 = code.src.BinarySearch.find(0, intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int29 = code.src.BinarySearch.find(0, intArray13, false);
        int int31 = code.src.BinarySearch.find(100, intArray13, true);
        int int33 = code.src.BinarySearch.find(1, intArray13, true);
        int int35 = code.src.BinarySearch.find((-1), intArray13, false);
        int int37 = code.src.BinarySearch.find(3, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray10, true);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((-1), intArray6, true);
        int int12 = code.src.BinarySearch.find(0, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int36 = code.src.BinarySearch.find((-1), intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find(10, intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        int int25 = code.src.BinarySearch.find((-1), intArray19, false);
        int int27 = code.src.BinarySearch.find(3, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray19, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray19, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray19, true);
        int int35 = code.src.BinarySearch.find((int) '4', intArray19, false);
        int int37 = code.src.BinarySearch.find(0, intArray19, true);
        int int39 = code.src.BinarySearch.find(10, intArray19, false);
        int int41 = code.src.BinarySearch.find((int) (short) 100, intArray19, false);
        int int43 = code.src.BinarySearch.find((int) ' ', intArray19, true);
        int int45 = code.src.BinarySearch.find((int) (byte) 10, intArray19, false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int21 = code.src.BinarySearch.find(3, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, false);
        int int24 = code.src.BinarySearch.find(100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int23 = code.src.BinarySearch.find(3, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
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
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find(3, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int33 = code.src.BinarySearch.find(0, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int39 = code.src.BinarySearch.find(2, intArray17, false);
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
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray10, false);
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
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(2, intArray17, true);
        int int33 = code.src.BinarySearch.find((-1), intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int37 = code.src.BinarySearch.find((-1), intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        int int41 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        int int43 = code.src.BinarySearch.find((int) ' ', intArray19, false);
        int int45 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray9, false);
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
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find(3, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int22 = code.src.BinarySearch.find((-1), intArray8, false);
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
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, false);
        int int24 = code.src.BinarySearch.find(2, intArray12, true);
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int18 = code.src.BinarySearch.find(3, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find(2, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray18, false);
        int int32 = code.src.BinarySearch.find(100, intArray18, true);
        int int34 = code.src.BinarySearch.find(3, intArray18, true);
        int int36 = code.src.BinarySearch.find(2, intArray18, true);
        int int38 = code.src.BinarySearch.find(10, intArray18, true);
        int int40 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = code.src.BinarySearch.find(2147483647, intArray18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        int int34 = code.src.BinarySearch.find((int) '4', intArray12, true);
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
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int[] intArray20 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int22 = code.src.BinarySearch.find(0, intArray20, false);
        int int24 = code.src.BinarySearch.find(0, intArray20, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray20, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray20, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray20, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray20, false);
        int int34 = code.src.BinarySearch.find(2147483647, intArray20, true);
        int int36 = code.src.BinarySearch.find(0, intArray20, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 0, intArray20, true);
        int int40 = code.src.BinarySearch.find((int) ' ', intArray20, true);
        int int42 = code.src.BinarySearch.find((int) (short) 100, intArray20, false);
        int int44 = code.src.BinarySearch.find((int) (short) 1, intArray20, false);
        int int46 = code.src.BinarySearch.find((int) (short) 100, intArray20, false);
        int int48 = code.src.BinarySearch.find((int) (byte) 0, intArray20, true);
        java.lang.Class<?> wildcardClass49 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find(0, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
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
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, true);
        int int22 = code.src.BinarySearch.find(10, intArray8, false);
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
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find(10, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((-1), intArray7, false);
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(2, intArray17, true);
        int int33 = code.src.BinarySearch.find((-1), intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int39 = code.src.BinarySearch.find(3, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int22 = code.src.BinarySearch.find((-1), intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find(3, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, true);
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
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(2, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find(10, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        int int42 = code.src.BinarySearch.find((int) '4', intArray18, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int19 = code.src.BinarySearch.find(100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
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
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        int int24 = code.src.BinarySearch.find(0, intArray10, true);
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
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int23 = code.src.BinarySearch.find(100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
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
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
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
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find(1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
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
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find(2, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find(3, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find(10, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int[] intArray7 = new int[] { 0, (byte) -1, 0, '4', (byte) 10 };
        int int9 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 0, 52, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int25 = code.src.BinarySearch.find(100, intArray11, false);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int30 = code.src.BinarySearch.find(2, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int34 = code.src.BinarySearch.find(3, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray18, true);
        int int30 = code.src.BinarySearch.find(100, intArray18, false);
        int int32 = code.src.BinarySearch.find(0, intArray18, false);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray18, true);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int40 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        int int42 = code.src.BinarySearch.find(1, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int34 = code.src.BinarySearch.find(2, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int27 = code.src.BinarySearch.find(0, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int16 = code.src.BinarySearch.find(100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((-1), intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int21 = code.src.BinarySearch.find(3, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find(0, intArray9, false);
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
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find(0, intArray16, true);
        int int36 = code.src.BinarySearch.find(1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find(100, intArray17, false);
        int int29 = code.src.BinarySearch.find((-1), intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        int int33 = code.src.BinarySearch.find(1, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
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
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int27 = code.src.BinarySearch.find(3, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray18, true);
        int int28 = code.src.BinarySearch.find((-1), intArray18, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int32 = code.src.BinarySearch.find(10, intArray18, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray18, false);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int38 = code.src.BinarySearch.find(0, intArray18, true);
        int int40 = code.src.BinarySearch.find(3, intArray18, true);
        int int42 = code.src.BinarySearch.find(2, intArray18, true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
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
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (short) 10, intArray5, true);
        int int13 = code.src.BinarySearch.find(2147483647, intArray5, false);
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
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray12, false);
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
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
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
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
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
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray11, true);
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
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(3, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find(100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find(1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int35 = code.src.BinarySearch.find(1, intArray17, true);
        int int37 = code.src.BinarySearch.find(1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
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
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        int int39 = code.src.BinarySearch.find(1, intArray17, true);
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
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray7, true);
        int int17 = code.src.BinarySearch.find(2, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
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
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) ' ', intArray6, false);
        int int12 = code.src.BinarySearch.find(100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
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
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((-1), intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find(0, intArray11, true);
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find(1, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
        int int25 = code.src.BinarySearch.find(2, intArray9, false);
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
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((-1), intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
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
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find(3, intArray15, false);
        int int29 = code.src.BinarySearch.find(10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
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
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, true);
        int int25 = code.src.BinarySearch.find(0, intArray9, true);
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
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
        int int34 = code.src.BinarySearch.find((-1), intArray16, true);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
        int int27 = code.src.BinarySearch.find(2147483647, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
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
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
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
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find(2147483647, intArray17, true);
        int int37 = code.src.BinarySearch.find((-1), intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (byte) 0, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int26 = code.src.BinarySearch.find(3, intArray10, false);
        int int28 = code.src.BinarySearch.find(10, intArray10, false);
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(3, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, false);
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
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        int int31 = code.src.BinarySearch.find(0, intArray11, false);
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
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find(100, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(2, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
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
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
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
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int11 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int15 = code.src.BinarySearch.find((-1), intArray7, true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(3, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (byte) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 0, intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int27 = code.src.BinarySearch.find(0, intArray17, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int37 = code.src.BinarySearch.find(0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find(2, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray13, false);
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
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, false);
        int int30 = code.src.BinarySearch.find(3, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int30 = code.src.BinarySearch.find(0, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((-1), intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        int int31 = code.src.BinarySearch.find((int) '4', intArray11, false);
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
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find(10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        int int37 = code.src.BinarySearch.find(10, intArray17, true);
        int int39 = code.src.BinarySearch.find((int) '4', intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int25 = code.src.BinarySearch.find(3, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(10, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        int int20 = code.src.BinarySearch.find(1, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
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
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
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
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int34 = code.src.BinarySearch.find(3, intArray14, true);
        int int36 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int38 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int40 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((-1), intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
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
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find(2147483647, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int24 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find(100, intArray17, true);
        int int33 = code.src.BinarySearch.find(1, intArray17, true);
        int int35 = code.src.BinarySearch.find(2, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
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
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(3, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int20 = code.src.BinarySearch.find(2147483647, intArray10, true);
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int35 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int37 = code.src.BinarySearch.find(0, intArray13, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int30 = code.src.BinarySearch.find(1, intArray12, false);
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
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        int int40 = code.src.BinarySearch.find(2, intArray14, true);
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
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray8, true);
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
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(3, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find(1, intArray10, true);
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
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray7, true);
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
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
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
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray7, false);
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
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int[] intArray15 = new int[] { (short) 0 };
        int int17 = code.src.BinarySearch.find((-1), intArray15, true);
        int int19 = code.src.BinarySearch.find(0, intArray15, false);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int35 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int37 = code.src.BinarySearch.find(10, intArray15, false);
        int int39 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int41 = code.src.BinarySearch.find(0, intArray15, true);
        int int43 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int24 = code.src.BinarySearch.find(0, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray18, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int38 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) 'a', intArray18, true);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
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
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int24 = code.src.BinarySearch.find((-1), intArray10, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int23 = code.src.BinarySearch.find(3, intArray9, false);
        int int25 = code.src.BinarySearch.find(1, intArray9, false);
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
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int36 = code.src.BinarySearch.find((-1), intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
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
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find(10, intArray16, true);
        int int36 = code.src.BinarySearch.find(100, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
        int int22 = code.src.BinarySearch.find((-1), intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, true);
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
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) '#', intArray6, false);
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
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, true);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
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
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int24 = code.src.BinarySearch.find(10, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int34 = code.src.BinarySearch.find(1, intArray12, true);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
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
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find(10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
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
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int34 = code.src.BinarySearch.find(0, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find(3, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int24 = code.src.BinarySearch.find(3, intArray12, false);
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
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int34 = code.src.BinarySearch.find(100, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        int int36 = code.src.BinarySearch.find((-1), intArray16, true);
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(100, intArray16, true);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int32 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int36 = code.src.BinarySearch.find(100, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find(1, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((-1), intArray11, false);
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
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find(1, intArray11, true);
        int int27 = code.src.BinarySearch.find(3, intArray11, false);
        java.lang.Class<?> wildcardClass28 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int26 = code.src.BinarySearch.find(2, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((-1), intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }
}

