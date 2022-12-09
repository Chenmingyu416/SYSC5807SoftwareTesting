import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray9, false);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray14, true);
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
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int[] intArray15 = new int[] { (short) 0 };
        int int17 = code.src.BinarySearch.find((-1), intArray15, true);
        int int19 = code.src.BinarySearch.find(0, intArray15, false);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int35 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int37 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int39 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int41 = code.src.BinarySearch.find(100, intArray15, false);
        int int43 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(1, intArray8, false);
        int int14 = code.src.BinarySearch.find(0, intArray8, false);
        int int16 = code.src.BinarySearch.find(10, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, true);
        int int22 = code.src.BinarySearch.find(10, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, true);
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find(2, intArray12, true);
        int int24 = code.src.BinarySearch.find(3, intArray12, true);
        int int26 = code.src.BinarySearch.find(3, intArray12, true);
        int int28 = code.src.BinarySearch.find(1, intArray12, true);
        int int30 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int32 = code.src.BinarySearch.find(3, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find(1, intArray18, false);
        int int28 = code.src.BinarySearch.find(100, intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int32 = code.src.BinarySearch.find(2, intArray18, false);
        int int34 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int36 = code.src.BinarySearch.find(3, intArray18, false);
        int int38 = code.src.BinarySearch.find(2, intArray18, false);
        int int40 = code.src.BinarySearch.find(2147483647, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) ' ', intArray18, false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, true);
        int int22 = code.src.BinarySearch.find(2, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray16, true);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find(10, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find(2, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(100, intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find(3, intArray13, false);
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, false);
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
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
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
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, false);
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
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
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(2147483647, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int20 = code.src.BinarySearch.find((-1), intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int29 = code.src.BinarySearch.find(10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, false);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int29 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find(2, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
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
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int29 = code.src.BinarySearch.find(0, intArray13, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find(10, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
        int int16 = code.src.BinarySearch.find(100, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray17, false);
        int int35 = code.src.BinarySearch.find(3, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find(3, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 100, intArray6, true);
        int int16 = code.src.BinarySearch.find(0, intArray6, false);
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int20 = code.src.BinarySearch.find(3, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find(3, intArray9, false);
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
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int28 = code.src.BinarySearch.find(2, intArray10, true);
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
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        int int39 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
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
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray17, true);
        int int27 = code.src.BinarySearch.find((-1), intArray17, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray17, false);
        int int31 = code.src.BinarySearch.find(10, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int35 = code.src.BinarySearch.find(10, intArray17, false);
        int int37 = code.src.BinarySearch.find(0, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(0, intArray9, false);
        int int23 = code.src.BinarySearch.find(1, intArray9, false);
        int int25 = code.src.BinarySearch.find(10, intArray9, false);
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
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, true);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find(2, intArray11, true);
        int int23 = code.src.BinarySearch.find(3, intArray11, true);
        int int25 = code.src.BinarySearch.find(3, intArray11, true);
        int int27 = code.src.BinarySearch.find(1, intArray11, true);
        int int29 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int31 = code.src.BinarySearch.find(3, intArray11, false);
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
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, false);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find(100, intArray10, true);
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int19 = code.src.BinarySearch.find(1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(3, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int23 = code.src.BinarySearch.find(2, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int31 = code.src.BinarySearch.find(2, intArray11, false);
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
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
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find(0, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(3, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray16, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find(3, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray12, false);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) '#', intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int16 = code.src.BinarySearch.find(100, intArray6, false);
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
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (short) 100, intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray5, false);
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(100, intArray10, true);
        int int22 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int24 = code.src.BinarySearch.find(2, intArray10, false);
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find(3, intArray10, true);
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
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int24 = code.src.BinarySearch.find(0, intArray10, true);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
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
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((-1), intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find(0, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) 0, intArray6, false);
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
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        int int31 = code.src.BinarySearch.find((int) ' ', intArray11, false);
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find(1, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find(0, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, true);
        java.lang.Class<?> wildcardClass29 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int28 = code.src.BinarySearch.find(3, intArray10, false);
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, true);
        int int28 = code.src.BinarySearch.find(3, intArray14, true);
        int int30 = code.src.BinarySearch.find(1, intArray14, true);
        int int32 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int34 = code.src.BinarySearch.find(3, intArray14, false);
        int int36 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int38 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int40 = code.src.BinarySearch.find(2, intArray14, true);
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((-1), intArray13, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        java.lang.Class<?> wildcardClass30 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
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
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int16 = code.src.BinarySearch.find(1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(1, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find((-1), intArray10, false);
        int int20 = code.src.BinarySearch.find(100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        int[] intArray15 = new int[] { (short) 0 };
        int int17 = code.src.BinarySearch.find((-1), intArray15, true);
        int int19 = code.src.BinarySearch.find(0, intArray15, false);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find(3, intArray15, true);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int35 = code.src.BinarySearch.find(3, intArray15, false);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int39 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int41 = code.src.BinarySearch.find(2, intArray15, true);
        int int43 = code.src.BinarySearch.find(3, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find(3, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find(3, intArray12, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int29 = code.src.BinarySearch.find(10, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, true);
        int int37 = code.src.BinarySearch.find((int) (short) 10, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int34 = code.src.BinarySearch.find(100, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find(1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, false);
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
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray7, false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((-1), intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((-1), intArray11, false);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find(10, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find(10, intArray7, true);
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
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int27 = code.src.BinarySearch.find(100, intArray11, false);
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray7, true);
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int[] intArray21 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int23 = code.src.BinarySearch.find(0, intArray21, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray21, true);
        int int27 = code.src.BinarySearch.find(0, intArray21, false);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray21, false);
        int int31 = code.src.BinarySearch.find(0, intArray21, true);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray21, false);
        int int35 = code.src.BinarySearch.find(100, intArray21, true);
        int int37 = code.src.BinarySearch.find((int) '4', intArray21, false);
        int int39 = code.src.BinarySearch.find(10, intArray21, false);
        int int41 = code.src.BinarySearch.find((int) 'a', intArray21, true);
        int int43 = code.src.BinarySearch.find((int) (byte) 0, intArray21, true);
        int int45 = code.src.BinarySearch.find((int) (short) 100, intArray21, true);
        int int47 = code.src.BinarySearch.find((int) (byte) 10, intArray21, false);
        int int49 = code.src.BinarySearch.find((int) (short) 0, intArray21, false);
        int int51 = code.src.BinarySearch.find((int) '4', intArray21, true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
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
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, true);
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
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find(0, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        int int19 = code.src.BinarySearch.find(2, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int25 = code.src.BinarySearch.find(1, intArray9, true);
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, true);
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int18 = code.src.BinarySearch.find(2, intArray10, false);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int24 = code.src.BinarySearch.find(3, intArray10, false);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((-1), intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        int int36 = code.src.BinarySearch.find(2, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray9, false);
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
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int34 = code.src.BinarySearch.find(1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray16, true);
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
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
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
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
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(1, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, false);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray9, true);
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((-1), intArray12, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = code.src.BinarySearch.find(2147483647, intArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find(3, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
        java.lang.Class<?> wildcardClass23 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int28 = code.src.BinarySearch.find((-1), intArray10, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int28 = code.src.BinarySearch.find(100, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int32 = code.src.BinarySearch.find(10, intArray12, false);
        int int34 = code.src.BinarySearch.find(3, intArray12, false);
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int32 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int34 = code.src.BinarySearch.find(0, intArray18, true);
        int int36 = code.src.BinarySearch.find(3, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int40 = code.src.BinarySearch.find(2, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(10, intArray10, true);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find((-1), intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray7, true);
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, true);
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray7, false);
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(3, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int26 = code.src.BinarySearch.find(2, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int26 = code.src.BinarySearch.find(2, intArray12, false);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find(2, intArray8, false);
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find(100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find(100, intArray9, true);
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray9, false);
        int int25 = code.src.BinarySearch.find((-1), intArray9, true);
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int28 = code.src.BinarySearch.find(0, intArray10, true);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        int int45 = code.src.BinarySearch.find((int) '4', intArray19, false);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray17, true);
        int int29 = code.src.BinarySearch.find(100, intArray17, false);
        int int31 = code.src.BinarySearch.find(0, intArray17, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        int int35 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int39 = code.src.BinarySearch.find(10, intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find(3, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, true);
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int22 = code.src.BinarySearch.find(100, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 10, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        int int25 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int27 = code.src.BinarySearch.find((-1), intArray11, false);
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        int int39 = code.src.BinarySearch.find(0, intArray17, true);
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
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find(1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find(3, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int26 = code.src.BinarySearch.find(3, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int21 = code.src.BinarySearch.find(2147483647, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray13, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        java.lang.Class<?> wildcardClass34 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find(100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        int int31 = code.src.BinarySearch.find(1, intArray11, false);
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
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        int int36 = code.src.BinarySearch.find(0, intArray16, true);
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray17, true);
        int int29 = code.src.BinarySearch.find(100, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
        int int37 = code.src.BinarySearch.find((int) (byte) 1, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) -1, intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int29 = code.src.BinarySearch.find((-1), intArray13, false);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int33 = code.src.BinarySearch.find(2, intArray13, false);
        java.lang.Class<?> wildcardClass34 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int23 = code.src.BinarySearch.find((-1), intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        java.lang.Class<?> wildcardClass26 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find(10, intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find(1, intArray13, true);
        int int23 = code.src.BinarySearch.find((-1), intArray13, false);
        int int25 = code.src.BinarySearch.find(1, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        int int39 = code.src.BinarySearch.find((int) '4', intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(1, intArray15, true);
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int28 = code.src.BinarySearch.find(100, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int34 = code.src.BinarySearch.find(1, intArray12, false);
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
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, false);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray17, true);
        int int33 = code.src.BinarySearch.find(3, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        int int37 = code.src.BinarySearch.find((int) '#', intArray17, false);
        int int39 = code.src.BinarySearch.find(0, intArray17, true);
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, false);
        int int30 = code.src.BinarySearch.find(3, intArray16, true);
        int int32 = code.src.BinarySearch.find(0, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) '#', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
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
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int27 = code.src.BinarySearch.find((int) 'a', intArray13, false);
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
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find(0, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        int int36 = code.src.BinarySearch.find((int) '#', intArray16, false);
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, false);
        int int28 = code.src.BinarySearch.find(2, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find(100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, false);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, false);
        int int26 = code.src.BinarySearch.find(3, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find(3, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int[] intArray3 = new int[] { (short) 0 };
        int int5 = code.src.BinarySearch.find((-1), intArray3, true);
        int int7 = code.src.BinarySearch.find((int) '4', intArray3, false);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, false);
        int int26 = code.src.BinarySearch.find(0, intArray16, false);
        int int28 = code.src.BinarySearch.find(2, intArray16, true);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find(3, intArray16, true);
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) '#', intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray6, false);
        int int16 = code.src.BinarySearch.find((-1), intArray6, false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int32 = code.src.BinarySearch.find((int) ' ', intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray18, true);
        int int36 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int38 = code.src.BinarySearch.find(100, intArray18, true);
        int int40 = code.src.BinarySearch.find((int) (short) 100, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(100, intArray10, true);
        int int22 = code.src.BinarySearch.find(3, intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, false);
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        int int39 = code.src.BinarySearch.find((int) 'a', intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int20 = code.src.BinarySearch.find((-1), intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) '#', intArray9, true);
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) '4', intArray10, true);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        int int26 = code.src.BinarySearch.find(10, intArray10, true);
        int int28 = code.src.BinarySearch.find(100, intArray10, true);
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray18, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray18, false);
        int int32 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) '4', intArray18, false);
        int int36 = code.src.BinarySearch.find(0, intArray18, true);
        int int38 = code.src.BinarySearch.find(10, intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int42 = code.src.BinarySearch.find((int) '4', intArray18, false);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find(2, intArray9, false);
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        int int36 = code.src.BinarySearch.find((int) (byte) 0, intArray16, true);
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int39 = code.src.BinarySearch.find(2, intArray17, true);
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
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(1, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, false);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray9, true);
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
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int20 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int28 = code.src.BinarySearch.find(3, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int23 = code.src.BinarySearch.find((-1), intArray17, false);
        int int25 = code.src.BinarySearch.find(3, intArray17, true);
        int int27 = code.src.BinarySearch.find(2, intArray17, true);
        int int29 = code.src.BinarySearch.find(3, intArray17, false);
        int int31 = code.src.BinarySearch.find(10, intArray17, true);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int35 = code.src.BinarySearch.find((int) '4', intArray17, true);
        int int37 = code.src.BinarySearch.find(100, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray12, true);
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int17 = code.src.BinarySearch.find(1, intArray11, true);
        int int19 = code.src.BinarySearch.find(2, intArray11, true);
        int int21 = code.src.BinarySearch.find(0, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) '4', intArray11, false);
        int int25 = code.src.BinarySearch.find(10, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) '#', intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
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
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find(10, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int27 = code.src.BinarySearch.find(10, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray11, true);
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
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int19 = code.src.BinarySearch.find(100, intArray13, true);
        int int21 = code.src.BinarySearch.find(0, intArray13, true);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray13, false);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int[] intArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = code.src.BinarySearch.find((int) (byte) 1, intArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, true);
        int int25 = code.src.BinarySearch.find(2, intArray9, false);
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, true);
        int int23 = code.src.BinarySearch.find(100, intArray9, false);
        int int25 = code.src.BinarySearch.find(0, intArray9, false);
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((-1), intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int31 = code.src.BinarySearch.find(1, intArray11, false);
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
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
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find(3, intArray15, false);
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find(2, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
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
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, true);
        int int29 = code.src.BinarySearch.find(0, intArray15, true);
        int int31 = code.src.BinarySearch.find(10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int28 = code.src.BinarySearch.find(100, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
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
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) ' ', intArray14, false);
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
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int25 = code.src.BinarySearch.find(1, intArray9, false);
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
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 0, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray6, true);
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int27 = code.src.BinarySearch.find(0, intArray13, false);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int31 = code.src.BinarySearch.find((int) '4', intArray13, false);
        int int33 = code.src.BinarySearch.find(3, intArray13, true);
        java.lang.Class<?> wildcardClass34 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find(1, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find(1, intArray5, false);
        int int11 = code.src.BinarySearch.find(0, intArray5, false);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray5, true);
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int22 = code.src.BinarySearch.find(0, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, true);
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int29 = code.src.BinarySearch.find(100, intArray15, false);
        int int31 = code.src.BinarySearch.find(10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) '4', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        int int37 = code.src.BinarySearch.find(3, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find(2147483647, intArray8, true);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find((-1), intArray8, true);
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '#', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray13, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, true);
        int int27 = code.src.BinarySearch.find(100, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int25 = code.src.BinarySearch.find(100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
        int int22 = code.src.BinarySearch.find(10, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int28 = code.src.BinarySearch.find(2, intArray10, true);
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int28 = code.src.BinarySearch.find(2, intArray14, false);
        int int30 = code.src.BinarySearch.find(3, intArray14, true);
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
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((-1), intArray4, true);
        int int10 = code.src.BinarySearch.find(2, intArray4, true);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int18 = code.src.BinarySearch.find(0, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
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
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find(0, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray11, false);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, false);
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find(2, intArray16, false);
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
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find(100, intArray8, false);
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray11, true);
        int int27 = code.src.BinarySearch.find((int) '#', intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
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
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find(2, intArray14, true);
        int int26 = code.src.BinarySearch.find(1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray8, true);
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
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find(10, intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find(3, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
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
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find(1, intArray14, false);
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
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find((-1), intArray9, true);
        int int23 = code.src.BinarySearch.find(0, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray7, false);
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
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        int int43 = code.src.BinarySearch.find((int) '4', intArray15, false);
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
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int25 = code.src.BinarySearch.find(10, intArray9, false);
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
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int29 = code.src.BinarySearch.find(2, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
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
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find(1, intArray13, false);
        int int23 = code.src.BinarySearch.find(0, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find(100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(10, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) '4', intArray14, true);
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
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find(2, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, false);
        int int27 = code.src.BinarySearch.find(2, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find(1, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray14, true);
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
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(1, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int21 = code.src.BinarySearch.find((-1), intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray11, true);
        int int27 = code.src.BinarySearch.find(3, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray11, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray11, false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int21 = code.src.BinarySearch.find(10, intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int24 = code.src.BinarySearch.find(3, intArray12, true);
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int26 = code.src.BinarySearch.find(1, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int34 = code.src.BinarySearch.find(1, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
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
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find((int) '4', intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
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
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int26 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
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
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find(0, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int21 = code.src.BinarySearch.find(2, intArray9, false);
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
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
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
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int25 = code.src.BinarySearch.find((-1), intArray9, false);
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find(1, intArray12, false);
        int int22 = code.src.BinarySearch.find(1, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
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
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray10, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find(1, intArray10, false);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(0, intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int30 = code.src.BinarySearch.find((-1), intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(1, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find(0, intArray7, false);
        int int15 = code.src.BinarySearch.find(10, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find(2147483647, intArray7, false);
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
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find(3, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
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
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray9, true);
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
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray16, true);
        int int28 = code.src.BinarySearch.find(1, intArray16, false);
        int int30 = code.src.BinarySearch.find(0, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find(0, intArray18, true);
        int int24 = code.src.BinarySearch.find((int) (short) -1, intArray18, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int30 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int32 = code.src.BinarySearch.find((int) '#', intArray18, false);
        int int34 = code.src.BinarySearch.find(0, intArray18, true);
        int int36 = code.src.BinarySearch.find(3, intArray18, false);
        int int38 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int40 = code.src.BinarySearch.find(2, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (short) 10, intArray18, false);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray16, false);
        int int34 = code.src.BinarySearch.find(3, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray9, true);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, false);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        int int40 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
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
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find(10, intArray12, true);
        int int20 = code.src.BinarySearch.find(100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find(0, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray6, true);
        int int16 = code.src.BinarySearch.find(0, intArray6, false);
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int18 = code.src.BinarySearch.find((-1), intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray8, false);
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
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int23 = code.src.BinarySearch.find(0, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (short) 1, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray11, false);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((-1), intArray6, true);
        int int12 = code.src.BinarySearch.find(0, intArray6, true);
        int int14 = code.src.BinarySearch.find(100, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((-1), intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find(0, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, false);
        int int22 = code.src.BinarySearch.find((-1), intArray8, false);
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
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find((-1), intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, false);
        int int23 = code.src.BinarySearch.find(10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find(1, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int27 = code.src.BinarySearch.find(10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
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
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(2, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find(10, intArray15, false);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find(100, intArray14, false);
        int int26 = code.src.BinarySearch.find((-1), intArray14, true);
        int int28 = code.src.BinarySearch.find(0, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (short) 0, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(100, intArray10, true);
        int int22 = code.src.BinarySearch.find(2147483647, intArray10, false);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
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
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int26 = code.src.BinarySearch.find((-1), intArray16, false);
        int int28 = code.src.BinarySearch.find(0, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find(3, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
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
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int[] intArray14 = new int[] { (short) 0 };
        int int16 = code.src.BinarySearch.find((-1), intArray14, true);
        int int18 = code.src.BinarySearch.find(0, intArray14, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int26 = code.src.BinarySearch.find(0, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int32 = code.src.BinarySearch.find(0, intArray14, false);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray14, false);
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int38 = code.src.BinarySearch.find(100, intArray14, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
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
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 1, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray14, false);
        int int28 = code.src.BinarySearch.find(0, intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
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
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (short) 10, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '4', intArray10, false);
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
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int21 = code.src.BinarySearch.find(100, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, false);
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
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray12, true);
        int int20 = code.src.BinarySearch.find(1, intArray12, true);
        int int22 = code.src.BinarySearch.find(100, intArray12, false);
        int int24 = code.src.BinarySearch.find((-1), intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int[] intArray5 = new int[] { (short) 0 };
        int int7 = code.src.BinarySearch.find((-1), intArray5, true);
        int int9 = code.src.BinarySearch.find((int) (short) 1, intArray5, true);
        int int11 = code.src.BinarySearch.find((int) (short) 1, intArray5, false);
        int int13 = code.src.BinarySearch.find(2, intArray5, true);
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
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int[] intArray8 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int10 = code.src.BinarySearch.find(0, intArray8, false);
        int int12 = code.src.BinarySearch.find((-1), intArray8, false);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((-1), intArray6, true);
        int int12 = code.src.BinarySearch.find(0, intArray6, true);
        int int14 = code.src.BinarySearch.find(100, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) '#', intArray6, false);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray19, true);
        int int25 = code.src.BinarySearch.find((-1), intArray19, false);
        int int27 = code.src.BinarySearch.find(3, intArray19, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray19, false);
        int int31 = code.src.BinarySearch.find(10, intArray19, true);
        int int33 = code.src.BinarySearch.find(2, intArray19, true);
        int int35 = code.src.BinarySearch.find((int) (byte) 1, intArray19, true);
        int int37 = code.src.BinarySearch.find((int) '#', intArray19, true);
        int int39 = code.src.BinarySearch.find(3, intArray19, false);
        int int41 = code.src.BinarySearch.find((int) (byte) 100, intArray19, true);
        int int43 = code.src.BinarySearch.find((int) (byte) 100, intArray19, true);
        int int45 = code.src.BinarySearch.find(0, intArray19, false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '4', intArray7, false);
        int int19 = code.src.BinarySearch.find(10, intArray7, true);
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
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        int int39 = code.src.BinarySearch.find(0, intArray17, false);
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
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, true);
        int int15 = code.src.BinarySearch.find(100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find(3, intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray11, true);
        int int27 = code.src.BinarySearch.find(0, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 1, intArray10, false);
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find(10, intArray6, false);
        int int14 = code.src.BinarySearch.find(1, intArray6, true);
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
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) -1, intArray7, true);
        int int17 = code.src.BinarySearch.find(10, intArray7, false);
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
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find(1, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (short) -1, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
        int int24 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int26 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) 1, intArray10, false);
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
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((-1), intArray15, false);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int29 = code.src.BinarySearch.find(10, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray8, true);
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(3, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find(100, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int[] intArray18 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int20 = code.src.BinarySearch.find(0, intArray18, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray18, true);
        int int24 = code.src.BinarySearch.find((-1), intArray18, false);
        int int26 = code.src.BinarySearch.find(3, intArray18, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray18, false);
        int int30 = code.src.BinarySearch.find(10, intArray18, true);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray18, true);
        int int34 = code.src.BinarySearch.find((int) (short) 100, intArray18, true);
        int int36 = code.src.BinarySearch.find(2147483647, intArray18, true);
        int int38 = code.src.BinarySearch.find((int) ' ', intArray18, false);
        int int40 = code.src.BinarySearch.find((int) (byte) 1, intArray18, true);
        int int42 = code.src.BinarySearch.find(1, intArray18, true);
        java.lang.Class<?> wildcardClass43 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(2, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (short) 10, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find(1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
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
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int28 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int30 = code.src.BinarySearch.find((int) '#', intArray16, false);
        int int32 = code.src.BinarySearch.find(0, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
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
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int22 = code.src.BinarySearch.find((int) '4', intArray8, true);
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
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find(3, intArray10, true);
        int int24 = code.src.BinarySearch.find(3, intArray10, true);
        int int26 = code.src.BinarySearch.find(10, intArray10, false);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
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
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find(10, intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
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
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray8, true);
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
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        int int34 = code.src.BinarySearch.find(0, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
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
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) -1, intArray15, true);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find(100, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 10, intArray10, true);
        int int24 = code.src.BinarySearch.find((int) '#', intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 100, intArray10, false);
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        int int37 = code.src.BinarySearch.find(100, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int21 = code.src.BinarySearch.find((-1), intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int27 = code.src.BinarySearch.find(2147483647, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray16, true);
        int int22 = code.src.BinarySearch.find(0, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (short) 100, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int32 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (byte) 1, intArray16, false);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '4', intArray12, false);
        int int22 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray12, true);
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
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (short) -1, intArray8, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int22 = code.src.BinarySearch.find(2, intArray8, false);
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        int int24 = code.src.BinarySearch.find(1, intArray10, false);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 1, intArray9, false);
        int int21 = code.src.BinarySearch.find(10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
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
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) '#', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
        int int25 = code.src.BinarySearch.find(2147483647, intArray9, true);
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
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(1, intArray7, true);
        int int17 = code.src.BinarySearch.find(3, intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 0, intArray7, false);
        java.lang.Class<?> wildcardClass20 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int33 = code.src.BinarySearch.find(0, intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((-1), intArray10, false);
        int int16 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray10, false);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(3, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray16, false);
        int int28 = code.src.BinarySearch.find(10, intArray16, true);
        int int30 = code.src.BinarySearch.find(100, intArray16, true);
        int int32 = code.src.BinarySearch.find(2, intArray16, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(0, intArray7, true);
        int int17 = code.src.BinarySearch.find(2, intArray7, true);
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray13, true);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (short) -1, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
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
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((-1), intArray10, false);
        int int24 = code.src.BinarySearch.find((int) (byte) -1, intArray10, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray10, false);
        int int28 = code.src.BinarySearch.find(2147483647, intArray10, false);
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
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        int int37 = code.src.BinarySearch.find(0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) 'a', intArray17, false);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int23 = code.src.BinarySearch.find(10, intArray11, false);
        int int25 = code.src.BinarySearch.find(2147483647, intArray11, false);
        int int27 = code.src.BinarySearch.find(10, intArray11, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray11, true);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find(2, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find(2, intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(2, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find(3, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(1, intArray10, false);
        int int16 = code.src.BinarySearch.find(0, intArray10, false);
        int int18 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int24 = code.src.BinarySearch.find(10, intArray10, false);
        int int26 = code.src.BinarySearch.find(3, intArray10, false);
        int int28 = code.src.BinarySearch.find(1, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find(3, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 10, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
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
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(1, intArray6, false);
        int int12 = code.src.BinarySearch.find(0, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray6, true);
        int int16 = code.src.BinarySearch.find((int) '4', intArray6, true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int18 = code.src.BinarySearch.find((-1), intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray15, true);
        int int25 = code.src.BinarySearch.find(0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
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
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int18 = code.src.BinarySearch.find((int) 'a', intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, false);
        int int16 = code.src.BinarySearch.find((int) (short) 100, intArray6, true);
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
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int[] intArray4 = new int[] { (short) 0 };
        int int6 = code.src.BinarySearch.find((-1), intArray4, true);
        int int8 = code.src.BinarySearch.find((int) (short) 1, intArray4, true);
        int int10 = code.src.BinarySearch.find((int) (short) 0, intArray4, true);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find(0, intArray15, false);
        int int31 = code.src.BinarySearch.find(2, intArray15, true);
        int int33 = code.src.BinarySearch.find(0, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int7 = code.src.BinarySearch.find((int) (byte) 1, intArray5, true);
        int int9 = code.src.BinarySearch.find((int) '#', intArray5, false);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 0, intArray12, false);
        int int34 = code.src.BinarySearch.find((int) (short) 10, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray7, true);
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(1, intArray7, false);
        int int13 = code.src.BinarySearch.find((int) (short) 100, intArray7, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 10, intArray7, false);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, true);
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
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int14 = code.src.BinarySearch.find((int) (byte) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find(10, intArray6, false);
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
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (short) 1, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, true);
        int int27 = code.src.BinarySearch.find(0, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int31 = code.src.BinarySearch.find(100, intArray15, true);
        int int33 = code.src.BinarySearch.find((-1), intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(100, intArray15, false);
        int int27 = code.src.BinarySearch.find(1, intArray15, false);
        int int29 = code.src.BinarySearch.find(10, intArray15, true);
        int int31 = code.src.BinarySearch.find(1, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) '#', intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find((int) (short) 0, intArray13, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray13, false);
        int int25 = code.src.BinarySearch.find(10, intArray13, false);
        int int27 = code.src.BinarySearch.find(2147483647, intArray13, true);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((-1), intArray12, false);
        int int20 = code.src.BinarySearch.find(0, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int24 = code.src.BinarySearch.find(0, intArray12, true);
        int int26 = code.src.BinarySearch.find((int) (short) -1, intArray12, true);
        int int28 = code.src.BinarySearch.find(2, intArray12, false);
        int int30 = code.src.BinarySearch.find(2147483647, intArray12, false);
        int int32 = code.src.BinarySearch.find(3, intArray12, false);
        int int34 = code.src.BinarySearch.find(3, intArray12, true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        int int40 = code.src.BinarySearch.find((int) (short) 10, intArray18, false);
        int int42 = code.src.BinarySearch.find((int) (short) 0, intArray18, true);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        int int36 = code.src.BinarySearch.find((int) 'a', intArray16, true);
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
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray11 = new int[] { (short) 0 };
        int int13 = code.src.BinarySearch.find((-1), intArray11, true);
        int int15 = code.src.BinarySearch.find(0, intArray11, false);
        int int17 = code.src.BinarySearch.find((-1), intArray11, false);
        int int19 = code.src.BinarySearch.find(0, intArray11, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        int int23 = code.src.BinarySearch.find((int) (byte) 10, intArray11, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray11, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 0, intArray11, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 100, intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int28 = code.src.BinarySearch.find((int) '#', intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int33 = code.src.BinarySearch.find(10, intArray15, false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int30 = code.src.BinarySearch.find((-1), intArray14, true);
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
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 10, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray9, true);
        int int19 = code.src.BinarySearch.find(0, intArray9, true);
        int int21 = code.src.BinarySearch.find(2, intArray9, true);
        int int23 = code.src.BinarySearch.find(10, intArray9, false);
        int int25 = code.src.BinarySearch.find((int) '4', intArray9, false);
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
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray15, false);
        int int27 = code.src.BinarySearch.find(10, intArray15, true);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int33 = code.src.BinarySearch.find(2, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int20 = code.src.BinarySearch.find(0, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int24 = code.src.BinarySearch.find(0, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) '4', intArray14, true);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int13 = code.src.BinarySearch.find(0, intArray11, false);
        int int15 = code.src.BinarySearch.find(0, intArray11, true);
        int int17 = code.src.BinarySearch.find((int) (short) -1, intArray11, false);
        int int19 = code.src.BinarySearch.find((int) (short) 0, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) ' ', intArray11, true);
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
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, true);
        int int22 = code.src.BinarySearch.find((-1), intArray8, true);
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
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int14 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) '4', intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, true);
        int int20 = code.src.BinarySearch.find((int) '4', intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, false);
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
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray10, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int22 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int24 = code.src.BinarySearch.find(0, intArray10, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray10, true);
        int int28 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find(0, intArray6, false);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) -1, intArray6, true);
        int int16 = code.src.BinarySearch.find(3, intArray6, false);
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
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int[] intArray16 = new int[] { (short) 0 };
        int int18 = code.src.BinarySearch.find((-1), intArray16, true);
        int int20 = code.src.BinarySearch.find(0, intArray16, false);
        int int22 = code.src.BinarySearch.find((-1), intArray16, false);
        int int24 = code.src.BinarySearch.find(0, intArray16, true);
        int int26 = code.src.BinarySearch.find(2, intArray16, true);
        int int28 = code.src.BinarySearch.find(3, intArray16, true);
        int int30 = code.src.BinarySearch.find(3, intArray16, true);
        int int32 = code.src.BinarySearch.find(1, intArray16, true);
        int int34 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int36 = code.src.BinarySearch.find(3, intArray16, false);
        int int38 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int40 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int42 = code.src.BinarySearch.find(2, intArray16, true);
        int int44 = code.src.BinarySearch.find(3, intArray16, false);
        int int46 = code.src.BinarySearch.find((int) (byte) 10, intArray16, true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find(2147483647, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) '#', intArray10, true);
        int int18 = code.src.BinarySearch.find((-1), intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(3, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) (byte) 0, intArray7, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray7, false);
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
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int21 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int23 = code.src.BinarySearch.find(0, intArray9, false);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray16, true);
        int int32 = code.src.BinarySearch.find((int) (short) -1, intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, false);
        int int36 = code.src.BinarySearch.find((int) (short) 10, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        int[] intArray6 = new int[] { (short) 0 };
        int int8 = code.src.BinarySearch.find((-1), intArray6, true);
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray6, true);
        int int12 = code.src.BinarySearch.find(10, intArray6, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray6, true);
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 0, intArray9, false);
        int int23 = code.src.BinarySearch.find(2, intArray9, false);
        int int25 = code.src.BinarySearch.find(3, intArray9, false);
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        int int34 = code.src.BinarySearch.find((int) (byte) 1, intArray12, false);
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
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find(3, intArray15, true);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((-1), intArray12, false);
        int int18 = code.src.BinarySearch.find(2, intArray12, true);
        int int20 = code.src.BinarySearch.find(3, intArray12, true);
        int int22 = code.src.BinarySearch.find(3, intArray12, true);
        int int24 = code.src.BinarySearch.find(100, intArray12, false);
        int int26 = code.src.BinarySearch.find(3, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find((int) ' ', intArray9, false);
        int int25 = code.src.BinarySearch.find((int) '#', intArray9, true);
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 1, intArray12, false);
        int int22 = code.src.BinarySearch.find(10, intArray12, true);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray12, true);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int[] intArray19 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int21 = code.src.BinarySearch.find(0, intArray19, false);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray19, true);
        int int25 = code.src.BinarySearch.find(0, intArray19, false);
        int int27 = code.src.BinarySearch.find((int) (short) 0, intArray19, false);
        int int29 = code.src.BinarySearch.find(0, intArray19, true);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray19, false);
        int int33 = code.src.BinarySearch.find(100, intArray19, true);
        int int35 = code.src.BinarySearch.find((int) '4', intArray19, false);
        int int37 = code.src.BinarySearch.find(10, intArray19, false);
        int int39 = code.src.BinarySearch.find((int) 'a', intArray19, true);
        int int41 = code.src.BinarySearch.find((int) (byte) 0, intArray19, true);
        int int43 = code.src.BinarySearch.find((int) (short) 100, intArray19, true);
        int int45 = code.src.BinarySearch.find((int) (short) 0, intArray19, true);
        java.lang.Class<?> wildcardClass46 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((-1), intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, false);
        int int31 = code.src.BinarySearch.find(2147483647, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) 'a', intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(1, intArray10, true);
        int int20 = code.src.BinarySearch.find(3, intArray10, false);
        int int22 = code.src.BinarySearch.find((int) ' ', intArray10, true);
        int int24 = code.src.BinarySearch.find(100, intArray10, true);
        int int26 = code.src.BinarySearch.find(3, intArray10, true);
        int int28 = code.src.BinarySearch.find(1, intArray10, false);
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
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) 'a', intArray16, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        int int28 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray16, false);
        int int32 = code.src.BinarySearch.find(3, intArray16, true);
        int int34 = code.src.BinarySearch.find(2147483647, intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (byte) 10, intArray16, false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        int int22 = code.src.BinarySearch.find(1, intArray8, false);
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (short) -1, intArray14, false);
        int int22 = code.src.BinarySearch.find(0, intArray14, false);
        int int24 = code.src.BinarySearch.find(100, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find(0, intArray14, false);
        java.lang.Class<?> wildcardClass31 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        int int37 = code.src.BinarySearch.find((int) (byte) 0, intArray17, false);
        int int39 = code.src.BinarySearch.find((int) '4', intArray17, true);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find(0, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray14, false);
        int int22 = code.src.BinarySearch.find((int) '4', intArray14, false);
        int int24 = code.src.BinarySearch.find((int) (short) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int28 = code.src.BinarySearch.find((-1), intArray14, true);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray7 = new int[] { (short) 0 };
        int int9 = code.src.BinarySearch.find((-1), intArray7, true);
        int int11 = code.src.BinarySearch.find(0, intArray7, false);
        int int13 = code.src.BinarySearch.find((-1), intArray7, false);
        int int15 = code.src.BinarySearch.find(1, intArray7, true);
        int int17 = code.src.BinarySearch.find((int) '#', intArray7, false);
        int int19 = code.src.BinarySearch.find((int) (short) 10, intArray7, true);
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int[] intArray12 = new int[] { (short) 0 };
        int int14 = code.src.BinarySearch.find((-1), intArray12, true);
        int int16 = code.src.BinarySearch.find(0, intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) -1, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        int int26 = code.src.BinarySearch.find(1, intArray12, false);
        int int28 = code.src.BinarySearch.find(0, intArray12, true);
        int int30 = code.src.BinarySearch.find((int) (byte) 100, intArray12, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray12, true);
        int int34 = code.src.BinarySearch.find(0, intArray12, false);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 100, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '4', intArray8, false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int[] intArray10 = new int[] { (short) 0 };
        int int12 = code.src.BinarySearch.find((-1), intArray10, true);
        int int14 = code.src.BinarySearch.find(0, intArray10, false);
        int int16 = code.src.BinarySearch.find((-1), intArray10, false);
        int int18 = code.src.BinarySearch.find(0, intArray10, true);
        int int20 = code.src.BinarySearch.find(2, intArray10, true);
        int int22 = code.src.BinarySearch.find(3, intArray10, true);
        int int24 = code.src.BinarySearch.find(3, intArray10, true);
        int int26 = code.src.BinarySearch.find(10, intArray10, false);
        int int28 = code.src.BinarySearch.find(0, intArray10, false);
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
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int23 = code.src.BinarySearch.find(1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 10, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 100, intArray14, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int28 = code.src.BinarySearch.find(3, intArray14, false);
        int int30 = code.src.BinarySearch.find(2, intArray14, true);
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
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int[] intArray11 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((-1), intArray11, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray11, false);
        int int21 = code.src.BinarySearch.find(3, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        java.lang.Class<?> wildcardClass24 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find(0, intArray13, true);
        int int19 = code.src.BinarySearch.find((int) (short) -1, intArray13, false);
        int int21 = code.src.BinarySearch.find(0, intArray13, false);
        int int23 = code.src.BinarySearch.find(3, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray13, false);
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
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int16 = code.src.BinarySearch.find(3, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 0, intArray8, false);
        int int20 = code.src.BinarySearch.find(0, intArray8, true);
        int int22 = code.src.BinarySearch.find(3, intArray8, false);
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
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((-1), intArray8, true);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((-1), intArray14, false);
        int int22 = code.src.BinarySearch.find(3, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (short) 1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int30 = code.src.BinarySearch.find(3, intArray14, false);
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
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[] intArray10 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, false);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (short) 100, intArray10, true);
        int int20 = code.src.BinarySearch.find(0, intArray10, true);
        int int22 = code.src.BinarySearch.find(0, intArray10, false);
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
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (byte) 10, intArray15, true);
        int int21 = code.src.BinarySearch.find((-1), intArray15, false);
        int int23 = code.src.BinarySearch.find(3, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 1, intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, true);
        int int31 = code.src.BinarySearch.find((int) (short) 1, intArray15, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find(3, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int25 = code.src.BinarySearch.find((int) (short) 100, intArray13, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find(0, intArray17, true);
        int int23 = code.src.BinarySearch.find((int) (short) -1, intArray17, false);
        int int25 = code.src.BinarySearch.find(0, intArray17, false);
        int int27 = code.src.BinarySearch.find(0, intArray17, false);
        int int29 = code.src.BinarySearch.find(2, intArray17, true);
        int int31 = code.src.BinarySearch.find(0, intArray17, true);
        int int33 = code.src.BinarySearch.find(10, intArray17, false);
        int int35 = code.src.BinarySearch.find((-1), intArray17, false);
        int int37 = code.src.BinarySearch.find((int) '4', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) '#', intArray17, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        int int35 = code.src.BinarySearch.find((int) (short) 10, intArray13, true);
        int int37 = code.src.BinarySearch.find((int) (short) 0, intArray13, true);
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
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int[] intArray14 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int16 = code.src.BinarySearch.find(0, intArray14, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray14, true);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int22 = code.src.BinarySearch.find(1, intArray14, true);
        int int24 = code.src.BinarySearch.find((-1), intArray14, false);
        int int26 = code.src.BinarySearch.find(1, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, false);
        int int30 = code.src.BinarySearch.find(1, intArray14, false);
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray9, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray9, true);
        int int19 = code.src.BinarySearch.find((-1), intArray9, false);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find((-1), intArray9, true);
        int int25 = code.src.BinarySearch.find(2147483647, intArray9, false);
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
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int[] intArray14 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int18 = code.src.BinarySearch.find(1, intArray14, true);
        int int20 = code.src.BinarySearch.find(10, intArray14, true);
        int int22 = code.src.BinarySearch.find(100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (short) 100, intArray14, false);
        int int26 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        int int28 = code.src.BinarySearch.find((-1), intArray14, false);
        int int30 = code.src.BinarySearch.find((int) (byte) -1, intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 100, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int[] intArray10 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int12 = code.src.BinarySearch.find((int) (byte) 1, intArray10, true);
        int int14 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray10, true);
        int int20 = code.src.BinarySearch.find((int) (short) 0, intArray10, true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray11, true);
        int int15 = code.src.BinarySearch.find((int) 'a', intArray11, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray11, true);
        int int19 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray11, true);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray11, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray11, false);
        int int27 = code.src.BinarySearch.find((int) '4', intArray11, true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray17 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int19 = code.src.BinarySearch.find(0, intArray17, false);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        int int23 = code.src.BinarySearch.find(0, intArray17, false);
        int int25 = code.src.BinarySearch.find((int) (short) 0, intArray17, true);
        int int27 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 10, intArray17, true);
        int int31 = code.src.BinarySearch.find((int) (byte) -1, intArray17, false);
        int int33 = code.src.BinarySearch.find(2, intArray17, false);
        int int35 = code.src.BinarySearch.find((int) ' ', intArray17, false);
        int int37 = code.src.BinarySearch.find((int) ' ', intArray17, true);
        int int39 = code.src.BinarySearch.find((int) (short) 100, intArray17, true);
        java.lang.Class<?> wildcardClass40 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int22 = code.src.BinarySearch.find(0, intArray12, false);
        int int24 = code.src.BinarySearch.find(2, intArray12, true);
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
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        int int36 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
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
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((-1), intArray8, false);
        int int16 = code.src.BinarySearch.find(0, intArray8, true);
        int int18 = code.src.BinarySearch.find(1, intArray8, true);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray8, true);
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int25 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int27 = code.src.BinarySearch.find(100, intArray15, false);
        int int29 = code.src.BinarySearch.find((-1), intArray15, false);
        int int31 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int33 = code.src.BinarySearch.find(2147483647, intArray15, true);
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
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (byte) -1, intArray15, false);
        int int25 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 100, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (byte) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find((int) 'a', intArray15, true);
        int int33 = code.src.BinarySearch.find(1, intArray15, false);
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
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int15 = code.src.BinarySearch.find(0, intArray13, false);
        int int17 = code.src.BinarySearch.find((int) (byte) 10, intArray13, true);
        int int19 = code.src.BinarySearch.find((-1), intArray13, false);
        int int21 = code.src.BinarySearch.find((int) '4', intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 10, intArray13, false);
        int int25 = code.src.BinarySearch.find(0, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        java.lang.Class<?> wildcardClass28 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int[] intArray8 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int10 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int12 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (short) 1, intArray8, false);
        int int16 = code.src.BinarySearch.find(2147483647, intArray8, false);
        int int18 = code.src.BinarySearch.find((-1), intArray8, true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int[] intArray16 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int18 = code.src.BinarySearch.find(0, intArray16, false);
        int int20 = code.src.BinarySearch.find(0, intArray16, true);
        int int22 = code.src.BinarySearch.find((int) (short) -1, intArray16, false);
        int int24 = code.src.BinarySearch.find((int) (short) 1, intArray16, true);
        int int26 = code.src.BinarySearch.find((int) (byte) 1, intArray16, true);
        int int28 = code.src.BinarySearch.find(100, intArray16, true);
        int int30 = code.src.BinarySearch.find((-1), intArray16, true);
        int int32 = code.src.BinarySearch.find((int) '4', intArray16, true);
        int int34 = code.src.BinarySearch.find((int) ' ', intArray16, true);
        int int36 = code.src.BinarySearch.find((int) (short) 0, intArray16, false);
        java.lang.Class<?> wildcardClass37 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (short) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) '4', intArray9, true);
        int int19 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 1, intArray9, true);
        int int23 = code.src.BinarySearch.find((int) '#', intArray9, true);
        int int25 = code.src.BinarySearch.find((int) (byte) 0, intArray9, true);
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int21 = code.src.BinarySearch.find(0, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) (short) 0, intArray15, false);
        int int25 = code.src.BinarySearch.find(1, intArray15, false);
        int int27 = code.src.BinarySearch.find((-1), intArray15, false);
        int int29 = code.src.BinarySearch.find((int) '#', intArray15, false);
        int int31 = code.src.BinarySearch.find(100, intArray15, false);
        int int33 = code.src.BinarySearch.find((int) ' ', intArray15, false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        int[] intArray12 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((-1), intArray12, false);
        int int18 = code.src.BinarySearch.find((int) ' ', intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, true);
        int int24 = code.src.BinarySearch.find((-1), intArray12, false);
        int int26 = code.src.BinarySearch.find((int) '4', intArray12, true);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find((int) ' ', intArray8, false);
        int int14 = code.src.BinarySearch.find(100, intArray8, false);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (byte) -1, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) 'a', intArray8, false);
        int int22 = code.src.BinarySearch.find(1, intArray8, false);
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
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int[] intArray14 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int16 = code.src.BinarySearch.find((int) (byte) 1, intArray14, true);
        int int18 = code.src.BinarySearch.find((-1), intArray14, false);
        int int20 = code.src.BinarySearch.find((int) ' ', intArray14, true);
        int int22 = code.src.BinarySearch.find((int) (short) 100, intArray14, true);
        int int24 = code.src.BinarySearch.find((int) (byte) 0, intArray14, true);
        int int26 = code.src.BinarySearch.find(100, intArray14, false);
        int int28 = code.src.BinarySearch.find((int) 'a', intArray14, true);
        int int30 = code.src.BinarySearch.find(2, intArray14, false);
        int int32 = code.src.BinarySearch.find((int) (byte) 1, intArray14, false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find(0, intArray9, true);
        int int19 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 100, intArray9, true);
        int int23 = code.src.BinarySearch.find(2147483647, intArray9, true);
        int int25 = code.src.BinarySearch.find(100, intArray9, false);
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
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) 'a', intArray15, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int27 = code.src.BinarySearch.find(2, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
        int int33 = code.src.BinarySearch.find((int) (byte) 100, intArray15, true);
        java.lang.Class<?> wildcardClass34 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int23 = code.src.BinarySearch.find((int) '4', intArray15, false);
        int int25 = code.src.BinarySearch.find(2, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray15, false);
        int int29 = code.src.BinarySearch.find((int) (short) 1, intArray15, true);
        int int31 = code.src.BinarySearch.find(0, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int[] intArray13 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int15 = code.src.BinarySearch.find((int) (byte) 1, intArray13, true);
        int int17 = code.src.BinarySearch.find(1, intArray13, true);
        int int19 = code.src.BinarySearch.find(10, intArray13, true);
        int int21 = code.src.BinarySearch.find(100, intArray13, true);
        int int23 = code.src.BinarySearch.find((int) (short) 100, intArray13, false);
        int int25 = code.src.BinarySearch.find((int) (byte) 100, intArray13, false);
        int int27 = code.src.BinarySearch.find((int) (byte) 10, intArray13, false);
        int int29 = code.src.BinarySearch.find((-1), intArray13, true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int[] intArray9 = new int[] { 10, ' ', (short) 100, (short) -1, 1 };
        int int11 = code.src.BinarySearch.find((int) (byte) 1, intArray9, true);
        int int13 = code.src.BinarySearch.find(1, intArray9, true);
        int int15 = code.src.BinarySearch.find((int) (byte) 100, intArray9, false);
        int int17 = code.src.BinarySearch.find((int) ' ', intArray9, true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) 0, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) '#', intArray8, false);
        int int20 = code.src.BinarySearch.find((-1), intArray8, false);
        int int22 = code.src.BinarySearch.find(10, intArray8, false);
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
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray12 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int14 = code.src.BinarySearch.find(0, intArray12, false);
        int int16 = code.src.BinarySearch.find(0, intArray12, true);
        int int18 = code.src.BinarySearch.find((int) (byte) 10, intArray12, false);
        int int20 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
        int int22 = code.src.BinarySearch.find((-1), intArray12, false);
        int int24 = code.src.BinarySearch.find(0, intArray12, false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int12 = code.src.BinarySearch.find(0, intArray10, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 10, intArray10, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray10, true);
        int int18 = code.src.BinarySearch.find(0, intArray10, false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 10, 10, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int[] intArray8 = new int[] { (short) 0 };
        int int10 = code.src.BinarySearch.find((-1), intArray8, true);
        int int12 = code.src.BinarySearch.find(0, intArray8, false);
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray8, true);
        int int16 = code.src.BinarySearch.find((int) (byte) -1, intArray8, true);
        int int18 = code.src.BinarySearch.find((int) (short) 10, intArray8, false);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray8, false);
        int int22 = code.src.BinarySearch.find(2147483647, intArray8, false);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int[] intArray15 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 100, (short) 1, 1 };
        int int17 = code.src.BinarySearch.find(0, intArray15, false);
        int int19 = code.src.BinarySearch.find(0, intArray15, true);
        int int21 = code.src.BinarySearch.find((int) (short) -1, intArray15, false);
        int int23 = code.src.BinarySearch.find(0, intArray15, false);
        int int25 = code.src.BinarySearch.find(3, intArray15, true);
        int int27 = code.src.BinarySearch.find((int) (byte) 0, intArray15, true);
        int int29 = code.src.BinarySearch.find((-1), intArray15, false);
        int int31 = code.src.BinarySearch.find((int) (short) 100, intArray15, true);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
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
        int int36 = code.src.BinarySearch.find(100, intArray16, true);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray9 = new int[] { (short) 0 };
        int int11 = code.src.BinarySearch.find((-1), intArray9, true);
        int int13 = code.src.BinarySearch.find(0, intArray9, false);
        int int15 = code.src.BinarySearch.find((-1), intArray9, false);
        int int17 = code.src.BinarySearch.find((-1), intArray9, true);
        int int19 = code.src.BinarySearch.find(100, intArray9, true);
        int int21 = code.src.BinarySearch.find((int) (short) 10, intArray9, false);
        int int23 = code.src.BinarySearch.find(100, intArray9, true);
        int int25 = code.src.BinarySearch.find((int) ' ', intArray9, true);
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
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int[] intArray12 = new int[] { (short) -1, (byte) -1, (short) 1 };
        int int14 = code.src.BinarySearch.find((int) (byte) 1, intArray12, true);
        int int16 = code.src.BinarySearch.find((int) 'a', intArray12, false);
        int int18 = code.src.BinarySearch.find((int) (byte) 0, intArray12, true);
        int int20 = code.src.BinarySearch.find((int) (short) 100, intArray12, true);
        int int22 = code.src.BinarySearch.find((int) '#', intArray12, false);
        int int24 = code.src.BinarySearch.find(1, intArray12, true);
        int int26 = code.src.BinarySearch.find(100, intArray12, true);
        int int28 = code.src.BinarySearch.find(3, intArray12, false);
        int int30 = code.src.BinarySearch.find((int) (short) 10, intArray12, false);
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

