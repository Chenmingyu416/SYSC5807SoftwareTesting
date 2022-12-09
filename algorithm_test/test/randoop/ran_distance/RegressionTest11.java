import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        double double4 = code.src.Distance.euclideanDistance(1.4764533763248394E125d, 5.791260282386601E24d, 5.6508057255525505E124d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.113728037695844E124d + "'", double4 == 9.113728037695844E124d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double4 = code.src.Distance.euclideanDistance(2.9411186287809066E128d, 9.324540890451003E30d, 7.406698157764146E250d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray2, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long[] longArray71 = new long[] { 'a', 1L };
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray71, longArray77);
        long long80 = code.src.Distance.chebyshevDistance(longArray66, longArray77);
        long[] longArray83 = new long[] { 'a', 1L };
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray83, longArray89);
        long long92 = code.src.Distance.chebyshevDistance(longArray66, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray49, longArray66);
        long long94 = code.src.Distance.chebyshevDistance(longArray2, longArray66);
        java.lang.Class<?> wildcardClass95 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 98L + "'", long79 == 98L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double4 = code.src.Distance.euclideanDistance(6.923658324661806E125d, 2.048095142025898E256d, 5.717560488315264E251d, 6.858438111975517E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double4 = code.src.Distance.euclideanDistance(1.449255956357967E248d, 4.717807507424959E124d, 20084.432052190223d, 8.320188026225052E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double4 = code.src.Distance.euclideanDistance(8.806176891199752E248d, 2.888107199940184E15d, 3.80522029780604E250d, 1.1438880985737782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double4 = code.src.Distance.squaredDistance(1.2652744319531763E198d, 3.353869668626517E49d, 9.778776737535161E212d, 2.244898434111624E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double4 = code.src.Distance.euclideanDistance(5.811522158789176E247d, 7.562847533034203E125d, 7.732824116021177E127d, 1.328881783205065E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.5597917633235E123d, 9.036472295700742E256d, 2.575569517141002E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double4 = code.src.Distance.euclideanDistance(3.2722991527031632E128d, 1.1341134428019932E16d, (double) 'a', 3.536773594809233E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.2722991718162803E128d + "'", double4 == 3.2722991718162803E128d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double4 = code.src.Distance.euclideanDistance(5.715044819636229E251d, 2.8095584331559984E250d, 6.923434529559351E123d, 6.18368725714255E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long long58 = code.src.Distance.chebyshevDistance(longArray8, longArray55);
        long[] longArray59 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long60 = code.src.Distance.chebyshevDistance(longArray55, longArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double4 = code.src.Distance.squaredDistance(5.728851506743641E251d, 4.8406811122263884E123d, 2.1255055543791955E128d, 8.341163188864031E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double4 = code.src.Distance.squaredDistance(7.559791763329331E123d, 1.203713755180189E124d, 1.4319457653113712E123d, 5.791260381620597E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8244317701642394E248d + "'", double4 == 1.8244317701642394E248d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double4 = code.src.Distance.squaredDistance(7.5597917633235E123d, 3.3607494419832777E49d, 1.2496907143570294E31d, 5.715043495807318E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 0, (short) -1 };
        long[] longArray17 = new long[] { (short) -1, (short) -1 };
        long long18 = code.src.Distance.chebyshevDistance(longArray14, longArray17);
        long[] longArray21 = new long[] { 'a', 1L };
        long[] longArray24 = new long[] { 0, (short) -1 };
        long[] longArray27 = new long[] { (short) -1, (short) -1 };
        long long28 = code.src.Distance.chebyshevDistance(longArray24, longArray27);
        long long29 = code.src.Distance.chebyshevDistance(longArray21, longArray27);
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray38, longArray49);
        long[] longArray55 = new long[] { 'a', 1L };
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray55, longArray61);
        long long64 = code.src.Distance.chebyshevDistance(longArray49, longArray61);
        long long65 = code.src.Distance.chebyshevDistance(longArray27, longArray61);
        long[] longArray68 = new long[] { 0, (short) -1 };
        long[] longArray71 = new long[] { (short) -1, (short) -1 };
        long long72 = code.src.Distance.chebyshevDistance(longArray68, longArray71);
        long[] longArray79 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long80 = code.src.Distance.chebyshevDistance(longArray71, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray61, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray17, longArray61);
        long[] longArray85 = new long[] { 'a', 1L };
        long[] longArray88 = new long[] { 0, (short) -1 };
        long[] longArray91 = new long[] { (short) -1, (short) -1 };
        long long92 = code.src.Distance.chebyshevDistance(longArray88, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray85, longArray91);
        long long94 = code.src.Distance.chebyshevDistance(longArray61, longArray91);
        long long95 = code.src.Distance.chebyshevDistance(longArray3, longArray91);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 98L + "'", long29 == 98L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 98L + "'", long51 == 98L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 98L + "'", long63 == 98L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 11L + "'", long80 == 11L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 11L + "'", long81 == 11L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 98L + "'", long95 == 98L);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.413179166381833E250d, 3.353869565834853E49d, 4.655892762958032E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double4 = code.src.Distance.euclideanDistance(3.0568118497974055E15d, 1.1438880985737782E248d, 6.92256251604893E61d, 5.9798424948214894E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double4 = code.src.Distance.squaredDistance(9.715913234165533E248d, 2.334819913507481E250d, 1.723220116172223E254d, 7.425202750921865E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double4 = code.src.Distance.euclideanDistance(5.726018993608619E251d, 9.324546092905923E30d, 1.1090019187308395E257d, 3.4806291687247766E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double4 = code.src.Distance.squaredDistance(4.471374129726301E62d, 0.0d, 1.024464211209343E25d, 2.0850307160336277E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.9993186607985635E125d + "'", double4 == 1.9993186607985635E125d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray31, longArray42);
        long[] longArray48 = new long[] { 'a', 1L };
        long[] longArray51 = new long[] { 0, (short) -1 };
        long[] longArray54 = new long[] { (short) -1, (short) -1 };
        long long55 = code.src.Distance.chebyshevDistance(longArray51, longArray54);
        long long56 = code.src.Distance.chebyshevDistance(longArray48, longArray54);
        long long57 = code.src.Distance.chebyshevDistance(longArray42, longArray54);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray42, longArray60);
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long[] longArray83 = new long[] { 'a', 1L };
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray83, longArray89);
        long long92 = code.src.Distance.chebyshevDistance(longArray72, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray60, longArray72);
        long long94 = code.src.Distance.chebyshevDistance(longArray19, longArray60);
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray60, longArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 98L + "'", long56 == 98L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double4 = code.src.Distance.euclideanDistance(4.675240277191704E248d, 5.811870955696386E120d, 3.353869565834853E49d, 3.0234847996883654E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double4 = code.src.Distance.squaredDistance(0.0d, 5.185424875331702E249d, 1.4223699416343344E126d, 1.433158224335312E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double4 = code.src.Distance.squaredDistance(5.64433727473721E251d, 1.1918576465896191E249d, 7.5597917633235E123d, 2.6593879130842587E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double4 = code.src.Distance.squaredDistance((double) 'a', 0.0d, 8.69470629945289E61d, 1.1248441754132943E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.265274418961214E198d + "'", double4 == 1.265274418961214E198d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double4 = code.src.Distance.squaredDistance(1.0214528145753511E257d, 5.525994208076646E7d, (double) 1.0f, 7.365251658636869E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double4 = code.src.Distance.squaredDistance(2.262179825118349E251d, 140.71602609511115d, 0.0d, 1.4253988300352539E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double4 = code.src.Distance.euclideanDistance(2.2840367152798036E31d, 5.492742669460755E251d, 6.563804083986358E256d, 12313.549023578462d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double4 = code.src.Distance.euclideanDistance(7.559791732623826E123d, 7.559791544536665E125d, (double) 1, 1.5119582431985447E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.408981413846232E125d + "'", double4 == 7.408981413846232E125d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double4 = code.src.Distance.squaredDistance(5.116365001163083E256d, 16122.636173942763d, 4.5182371393605655E256d, 9.113728037695844E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double4 = code.src.Distance.euclideanDistance(2.05329249062104E256d, 0.0d, 7.877914654122638E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double4 = code.src.Distance.euclideanDistance(2.123180521041554E128d, 1.457948741083528E64d, 2.048095142025898E256d, 6.923434529559351E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double4 = code.src.Distance.euclideanDistance(1.1047365604210307E126d, 7.590729215407016E125d, 5.484533507010109E251d, 8.641507908782172E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.3848836126517604E124d, 3.5776180632559095E250d, 9.095699028095402E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double4 = code.src.Distance.euclideanDistance(1.231115082248268E64d, 4.485940704933021E256d, 1.6830116762241088E124d, 4.485950827314113E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double4 = code.src.Distance.squaredDistance(5.525929037215044E7d, 0.0d, 9.144070917092657E248d, 2.2965057957235622E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double4 = code.src.Distance.squaredDistance(4.4848752944105095E256d, (double) 98L, 1.3335864706024715E248d, 2.1255797182038412E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double4 = code.src.Distance.euclideanDistance(2.12553893505374E128d, 6.188205857868469E251d, 7.876508236289523E125d, 1.077343123590583E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        long[] longArray10 = new long[] { 0, (short) -1 };
        long[] longArray13 = new long[] { (short) -1, (short) -1 };
        long long14 = code.src.Distance.chebyshevDistance(longArray10, longArray13);
        long[] longArray17 = new long[] { 'a', 1L };
        long[] longArray20 = new long[] { 0, (short) -1 };
        long[] longArray23 = new long[] { (short) -1, (short) -1 };
        long long24 = code.src.Distance.chebyshevDistance(longArray20, longArray23);
        long long25 = code.src.Distance.chebyshevDistance(longArray17, longArray23);
        long[] longArray28 = new long[] { 'a', 1L };
        long[] longArray31 = new long[] { 0, (short) -1 };
        long[] longArray34 = new long[] { (short) -1, (short) -1 };
        long long35 = code.src.Distance.chebyshevDistance(longArray31, longArray34);
        long long36 = code.src.Distance.chebyshevDistance(longArray28, longArray34);
        long long37 = code.src.Distance.chebyshevDistance(longArray23, longArray34);
        long[] longArray40 = new long[] { 'a', 1L };
        long[] longArray43 = new long[] { 0, (short) -1 };
        long[] longArray46 = new long[] { (short) -1, (short) -1 };
        long long47 = code.src.Distance.chebyshevDistance(longArray43, longArray46);
        long long48 = code.src.Distance.chebyshevDistance(longArray40, longArray46);
        long long49 = code.src.Distance.chebyshevDistance(longArray23, longArray46);
        long long50 = code.src.Distance.chebyshevDistance(longArray13, longArray46);
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray46, longArray56);
        long long59 = code.src.Distance.chebyshevDistance(longArray3, longArray46);
        // The following exception was thrown during execution in test generation
        try {
            long long60 = code.src.Distance.chebyshevDistance(longArray0, longArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 98L + "'", long36 == 98L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 98L + "'", long48 == 98L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double4 = code.src.Distance.euclideanDistance(6.449576703798581E175d, 3.0054630325063084E128d, 5.791260371133832E24d, 5.6044914253382785E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double4 = code.src.Distance.euclideanDistance(7.814856790247367E7d, (double) 0, 2.1254910133153752E128d, 3.05680775507396E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1254910133153752E128d + "'", double4 == 2.1254910133153752E128d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double4 = code.src.Distance.euclideanDistance(9.284544414987072E30d, 1.2634745840023956E64d, 2.1256287435569485E128d, 4.181639060777985E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double4 = code.src.Distance.euclideanDistance(8.341162879156251E30d, 4.1811108493051547E256d, 6.063099723657831E251d, 1.223220513063486E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double4 = code.src.Distance.euclideanDistance(4.1824175494475645E256d, 5.715045150548505E247d, 6.518731715344327E256d, 4.5323471056617066E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double4 = code.src.Distance.euclideanDistance(4.92586451367552E248d, 0.0d, 3.0568118497973945E15d, 1.6544106198611494E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double4 = code.src.Distance.euclideanDistance(9.466542772840854E21d, 7.565603634330283E123d, 8.951751003550235E62d, 3.890146281899556E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1335859184665276E124d + "'", double4 == 3.1335859184665276E124d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double4 = code.src.Distance.euclideanDistance(7.562847533034203E125d, 0.0d, 0.0d, 3.053611124550097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.562847533034203E125d + "'", double4 == 7.562847533034203E125d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double4 = code.src.Distance.euclideanDistance(1.449255956357967E248d, 5.717877332771251E251d, 3.4778825197957035E62d, 2.2964930079195337E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double4 = code.src.Distance.squaredDistance(4.92586451367552E248d, 6.151508697220018E30d, 0.0d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double4 = code.src.Distance.squaredDistance(4.182726770879422E256d, 6.972502032003872E201d, (double) 100.0f, 5.039568979476821E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double4 = code.src.Distance.squaredDistance(4.1827873952477334E256d, (-1.0d), 9.095699028095402E123d, 4.792979223186968E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double4 = code.src.Distance.squaredDistance(1.9660977441160548E252d, 5.525939237192507E7d, 1.0691159266556964E124d, 7.559791544504537E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double4 = code.src.Distance.squaredDistance(5.722457520259434E251d, 2.3848836126517604E124d, 9.324540562451319E30d, 2.117752378578906E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double4 = code.src.Distance.squaredDistance(2.3516426728808653E249d, 1.265274418961214E198d, 8.694706281769284E61d, 2.2965057953353264E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double4 = code.src.Distance.squaredDistance(2.406503766681E12d, 7.559943432502878E125d, 1.589750982408489E254d, 6.073378130472233E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double4 = code.src.Distance.euclideanDistance(1.0190538431654038E252d, 4.675240277191704E248d, 2.1179790857622837E128d, 4.557896970053384E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double4 = code.src.Distance.squaredDistance(16122.636173942763d, 1.1473791318585206E252d, 0.0d, 2.048095142025898E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double4 = code.src.Distance.euclideanDistance(4.792979223186968E123d, 7.559791732617994E123d, 5.86750417512918E251d, 4.1827840536706536E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double4 = code.src.Distance.euclideanDistance(3.0239723409974164E124d, 0.0d, 2.0451715735252107E128d, 9.351743915519625E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.044869176291111E128d + "'", double4 == 2.044869176291111E128d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double4 = code.src.Distance.squaredDistance(5.829917481072086E251d, 1.7307558713743367E254d, 3.4131592097982255E102d, 7.920443263990935E119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double4 = code.src.Distance.euclideanDistance(1.4311155692585877E128d, 6.073378130472233E251d, 2.2496883671214544E99d, 8.34116319834633E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        long[] longArray10 = new long[] { 'a', 1L };
        long[] longArray13 = new long[] { 0, (short) -1 };
        long[] longArray16 = new long[] { (short) -1, (short) -1 };
        long long17 = code.src.Distance.chebyshevDistance(longArray13, longArray16);
        long long18 = code.src.Distance.chebyshevDistance(longArray10, longArray16);
        long[] longArray21 = new long[] { 'a', 1L };
        long[] longArray24 = new long[] { 0, (short) -1 };
        long[] longArray27 = new long[] { (short) -1, (short) -1 };
        long long28 = code.src.Distance.chebyshevDistance(longArray24, longArray27);
        long long29 = code.src.Distance.chebyshevDistance(longArray21, longArray27);
        long long30 = code.src.Distance.chebyshevDistance(longArray16, longArray27);
        long[] longArray33 = new long[] { 'a', 1L };
        long[] longArray36 = new long[] { 0, (short) -1 };
        long[] longArray39 = new long[] { (short) -1, (short) -1 };
        long long40 = code.src.Distance.chebyshevDistance(longArray36, longArray39);
        long long41 = code.src.Distance.chebyshevDistance(longArray33, longArray39);
        long long42 = code.src.Distance.chebyshevDistance(longArray16, longArray39);
        long long43 = code.src.Distance.chebyshevDistance(longArray6, longArray39);
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray6, longArray46);
        long[] longArray54 = new long[] { 0, (short) -1 };
        long[] longArray57 = new long[] { (short) -1, (short) -1 };
        long long58 = code.src.Distance.chebyshevDistance(longArray54, longArray57);
        long[] longArray65 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long66 = code.src.Distance.chebyshevDistance(longArray57, longArray65);
        long long67 = code.src.Distance.chebyshevDistance(longArray6, longArray57);
        // The following exception was thrown during execution in test generation
        try {
            long long68 = code.src.Distance.chebyshevDistance(longArray0, longArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 98L + "'", long18 == 98L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 98L + "'", long29 == 98L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 98L + "'", long41 == 98L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 11L + "'", long66 == 11L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double4 = code.src.Distance.squaredDistance(1.5479045176720047E126d, 4.507895615716358E256d, 0.0d, 6.013009312291666E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double4 = code.src.Distance.squaredDistance(1.4299366702240583E248d, 1.7683618323195464E53d, 5.869790192858356E251d, 1.0691160040444007E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 1, 6.520222954978057E248d, 1.6661357026280876E31d, 2.125614474048533E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double4 = code.src.Distance.squaredDistance(2.728966543133093E124d, 1.5428050829066223E249d, 0.0d, 1.102865396833695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double4 = code.src.Distance.squaredDistance(7.562847533034203E125d, 7.710682094138496E10d, 1.2632922663800816E127d, 1.102865396833695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4105452805706393E254d + "'", double4 == 1.4105452805706393E254d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double4 = code.src.Distance.euclideanDistance(1.7169939815538626E256d, 1.5891491557236519E254d, 6.001964575767696E256d, 2.0536526821066443E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double4 = code.src.Distance.euclideanDistance(1.4214639124928905E128d, 4.675240277191704E248d, 4.655892762958032E251d, 6.421433566443406E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double4 = code.src.Distance.squaredDistance(1.5656099294436052E250d, 3.353869565834853E49d, 4.753127358123107E124d, 4.5169109784901915E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double4 = code.src.Distance.squaredDistance(5.039568979476821E248d, 1.223220513063486E125d, 6.957500350144719E61d, 144.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double4 = code.src.Distance.euclideanDistance(1.082419432581764E249d, 5.948654328288416E248d, (double) 0.0f, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double4 = code.src.Distance.squaredDistance(3.571903018105419E250d, 1.380250332732779E124d, 5.865141437237654E125d, 9.00164862028326E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double4 = code.src.Distance.squaredDistance(2.671898174954098E125d, 8.694715983872712E61d, 8.341162879156251E30d, 3.4131592097982255E102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.13903985732304E250d + "'", double4 == 7.13903985732304E250d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double4 = code.src.Distance.euclideanDistance(1.3142885088073338E127d, 1.706058486042649E128d, 8.050471177320619E123d, 4.484875136976614E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double4 = code.src.Distance.squaredDistance(1.0779309106645648E249d, 7.559791763329331E123d, 3.829739330285951E249d, 5.53979513351125E119d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double4 = code.src.Distance.squaredDistance(1.5134476182871558E249d, 1.7683618323195464E53d, 2.3432193630265306E247d, 9.284544414987072E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double4 = code.src.Distance.squaredDistance(8.694705670079996E61d, 2.035085750794639E128d, 4.655892762958032E251d, 1.1598302651166806E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double4 = code.src.Distance.euclideanDistance(2.5619166543842657E128d, 5.791260368077024E24d, 6.151502905962372E30d, 7.393566762337766E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 0, (short) -1 };
        long[] longArray63 = new long[] { (short) -1, (short) -1 };
        long long64 = code.src.Distance.chebyshevDistance(longArray60, longArray63);
        long long65 = code.src.Distance.chebyshevDistance(longArray55, longArray63);
        long long66 = code.src.Distance.chebyshevDistance(longArray42, longArray63);
        java.lang.Class<?> wildcardClass67 = longArray42.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double4 = code.src.Distance.euclideanDistance(9.32454089993304E30d, 1.511958352664876E124d, 8.841771681470747E249d, 8.27605827574068E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 0, (short) -1 };
        long[] longArray28 = new long[] { (short) -1, (short) -1 };
        long long29 = code.src.Distance.chebyshevDistance(longArray25, longArray28);
        long[] longArray36 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long37 = code.src.Distance.chebyshevDistance(longArray28, longArray36);
        long[] longArray40 = new long[] { 'a', 1L };
        long[] longArray43 = new long[] { 0, (short) -1 };
        long[] longArray46 = new long[] { (short) -1, (short) -1 };
        long long47 = code.src.Distance.chebyshevDistance(longArray43, longArray46);
        long long48 = code.src.Distance.chebyshevDistance(longArray40, longArray46);
        long[] longArray51 = new long[] { 'a', 1L };
        long[] longArray54 = new long[] { 0, (short) -1 };
        long[] longArray57 = new long[] { (short) -1, (short) -1 };
        long long58 = code.src.Distance.chebyshevDistance(longArray54, longArray57);
        long long59 = code.src.Distance.chebyshevDistance(longArray51, longArray57);
        long long60 = code.src.Distance.chebyshevDistance(longArray46, longArray57);
        long long61 = code.src.Distance.chebyshevDistance(longArray28, longArray46);
        long long62 = code.src.Distance.chebyshevDistance(longArray19, longArray46);
        long[] longArray65 = new long[] { 'a', 1L };
        long[] longArray68 = new long[] { 0, (short) -1 };
        long[] longArray71 = new long[] { (short) -1, (short) -1 };
        long long72 = code.src.Distance.chebyshevDistance(longArray68, longArray71);
        long long73 = code.src.Distance.chebyshevDistance(longArray65, longArray71);
        long[] longArray76 = new long[] { 'a', 1L };
        long[] longArray79 = new long[] { 0, (short) -1 };
        long[] longArray82 = new long[] { (short) -1, (short) -1 };
        long long83 = code.src.Distance.chebyshevDistance(longArray79, longArray82);
        long long84 = code.src.Distance.chebyshevDistance(longArray76, longArray82);
        long long85 = code.src.Distance.chebyshevDistance(longArray65, longArray82);
        long[] longArray88 = new long[] { 'a', 1L };
        long[] longArray91 = new long[] { 0, (short) -1 };
        long[] longArray94 = new long[] { (short) -1, (short) -1 };
        long long95 = code.src.Distance.chebyshevDistance(longArray91, longArray94);
        long long96 = code.src.Distance.chebyshevDistance(longArray88, longArray94);
        long long97 = code.src.Distance.chebyshevDistance(longArray65, longArray88);
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray88);
        java.lang.Class<?> wildcardClass99 = longArray19.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 98L + "'", long48 == 98L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 98L + "'", long59 == 98L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 98L + "'", long73 == 98L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 98L + "'", long85 == 98L);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1L + "'", long95 == 1L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 98L + "'", long96 == 98L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.2634745840023956E64d, 5.791260371133755E24d, 8.841771681470747E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long[] longArray35 = new long[] { 'a', 1L };
        long[] longArray38 = new long[] { 0, (short) -1 };
        long[] longArray41 = new long[] { (short) -1, (short) -1 };
        long long42 = code.src.Distance.chebyshevDistance(longArray38, longArray41);
        long long43 = code.src.Distance.chebyshevDistance(longArray35, longArray41);
        long long44 = code.src.Distance.chebyshevDistance(longArray30, longArray41);
        long[] longArray47 = new long[] { 'a', 1L };
        long[] longArray50 = new long[] { 0, (short) -1 };
        long[] longArray53 = new long[] { (short) -1, (short) -1 };
        long long54 = code.src.Distance.chebyshevDistance(longArray50, longArray53);
        long long55 = code.src.Distance.chebyshevDistance(longArray47, longArray53);
        long long56 = code.src.Distance.chebyshevDistance(longArray41, longArray53);
        long long57 = code.src.Distance.chebyshevDistance(longArray19, longArray53);
        long long58 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray59 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long60 = code.src.Distance.chebyshevDistance(longArray8, longArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 98L + "'", long43 == 98L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 98L + "'", long55 == 98L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double4 = code.src.Distance.squaredDistance(1.2756882071026236E198d, 1.4272033862877643E128d, 5.618790528635277E251d, 1.3179319637108076E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double4 = code.src.Distance.squaredDistance(3.598765218630986E247d, 8.917458244322077E62d, (double) 'a', 3.772588879245304E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double4 = code.src.Distance.squaredDistance(1.4579486012297467E64d, 3.02286459429887E15d, 12313.549023578462d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.133627508430731E128d + "'", double4 == 2.133627508430731E128d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double4 = code.src.Distance.squaredDistance(6.182228556491662E251d, 7.877914654122638E125d, 0.0d, 2.3498127622806567E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray15, longArray26);
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long long41 = code.src.Distance.chebyshevDistance(longArray15, longArray38);
        long long42 = code.src.Distance.chebyshevDistance(longArray5, longArray38);
        long[] longArray45 = new long[] { 0, (short) -1 };
        long[] longArray48 = new long[] { (short) -1, (short) -1 };
        long long49 = code.src.Distance.chebyshevDistance(longArray45, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray38, longArray45);
        long[] longArray53 = new long[] { 'a', 1L };
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray53, longArray59);
        long[] longArray64 = new long[] { 'a', 1L };
        long[] longArray67 = new long[] { 0, (short) -1 };
        long[] longArray70 = new long[] { (short) -1, (short) -1 };
        long long71 = code.src.Distance.chebyshevDistance(longArray67, longArray70);
        long long72 = code.src.Distance.chebyshevDistance(longArray64, longArray70);
        long[] longArray75 = new long[] { 'a', 1L };
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray75, longArray81);
        long long84 = code.src.Distance.chebyshevDistance(longArray70, longArray81);
        long[] longArray87 = new long[] { 'a', 1L };
        long[] longArray90 = new long[] { 0, (short) -1 };
        long[] longArray93 = new long[] { (short) -1, (short) -1 };
        long long94 = code.src.Distance.chebyshevDistance(longArray90, longArray93);
        long long95 = code.src.Distance.chebyshevDistance(longArray87, longArray93);
        long long96 = code.src.Distance.chebyshevDistance(longArray70, longArray93);
        long long97 = code.src.Distance.chebyshevDistance(longArray59, longArray70);
        long long98 = code.src.Distance.chebyshevDistance(longArray45, longArray70);
        java.lang.Class<?> wildcardClass99 = longArray45.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 98L + "'", long72 == 98L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 98L + "'", long83 == 98L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 98L + "'", long95 == 98L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 1L + "'", long98 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double4 = code.src.Distance.euclideanDistance(8.806176891199752E248d, 2.0850307160336277E31d, 8.273174080969564E247d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double4 = code.src.Distance.euclideanDistance(2.133627508430731E128d, 2.02313625086486E252d, 2.4065001431929946E12d, 1.2698920395085755E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double4 = code.src.Distance.euclideanDistance(3.1335859184665276E124d, 9.137715554420027E30d, 4.471374129726301E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1335859184665276E124d + "'", double4 == 3.1335859184665276E124d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double4 = code.src.Distance.euclideanDistance(7.77326133854061E10d, 1.4579745280790234E64d, 3.068933012127493E239d, 4.476410859359017E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double4 = code.src.Distance.euclideanDistance(3.353869677235983E49d, 7.393562733187527E246d, 9.003112128419027E256d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double4 = code.src.Distance.euclideanDistance(5.527131618909466E7d, 5.9798424948214894E255d, 2.010262836799118E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double4 = code.src.Distance.squaredDistance(7.76081660665762E125d, 7.559791763374587E123d, 1.3186892203577162E31d, 7.982252697215275E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.5156683110561225E248d, 4.3190021108187545E15d, 1.3179319637108076E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double4 = code.src.Distance.euclideanDistance(2.0450959756078844E128d, 4.5182371393605655E256d, 8.694705670079996E61d, 7.366529754618401E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double4 = code.src.Distance.euclideanDistance(1.1248441811882996E99d, 1.4312682764476429E128d, 16122.636173942763d, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4312682764476429E128d + "'", double4 == 1.4312682764476429E128d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double4 = code.src.Distance.squaredDistance(2.052610979139937E256d, 4.5335011029982485E256d, 0.0d, 1.6544106198611494E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double4 = code.src.Distance.squaredDistance(6.18529391824118E251d, 7.891149462745871E255d, 2.769446841189903E125d, 9.324535099190634E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double4 = code.src.Distance.squaredDistance(3.053611069269292E15d, 3.439988407880217E251d, 2.9106355825640894E256d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        long[] longArray10 = new long[] { 100L, 1 };
        long long11 = code.src.Distance.chebyshevDistance(longArray6, longArray10);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray31, longArray42);
        long[] longArray48 = new long[] { 'a', 1L };
        long[] longArray51 = new long[] { 0, (short) -1 };
        long[] longArray54 = new long[] { (short) -1, (short) -1 };
        long long55 = code.src.Distance.chebyshevDistance(longArray51, longArray54);
        long long56 = code.src.Distance.chebyshevDistance(longArray48, longArray54);
        long long57 = code.src.Distance.chebyshevDistance(longArray31, longArray54);
        long long58 = code.src.Distance.chebyshevDistance(longArray14, longArray31);
        long[] longArray61 = new long[] { 0, (short) -1 };
        long[] longArray64 = new long[] { (short) -1, (short) -1 };
        long long65 = code.src.Distance.chebyshevDistance(longArray61, longArray64);
        long[] longArray72 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long73 = code.src.Distance.chebyshevDistance(longArray64, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray31, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray10, longArray31);
        // The following exception was thrown during execution in test generation
        try {
            long long76 = code.src.Distance.chebyshevDistance(longArray0, longArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 101L + "'", long11 == 101L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 98L + "'", long56 == 98L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 11L + "'", long73 == 11L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 11L + "'", long74 == 11L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 101L + "'", long75 == 101L);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double4 = code.src.Distance.squaredDistance(1811672.00533166d, 2.0536526821066443E256d, 5.525994208076646E7d, 5.715044985152495E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 'a', 1L };
        long[] longArray20 = new long[] { 0, (short) -1 };
        long[] longArray23 = new long[] { (short) -1, (short) -1 };
        long long24 = code.src.Distance.chebyshevDistance(longArray20, longArray23);
        long long25 = code.src.Distance.chebyshevDistance(longArray17, longArray23);
        long[] longArray28 = new long[] { 'a', 1L };
        long[] longArray31 = new long[] { 0, (short) -1 };
        long[] longArray34 = new long[] { (short) -1, (short) -1 };
        long long35 = code.src.Distance.chebyshevDistance(longArray31, longArray34);
        long long36 = code.src.Distance.chebyshevDistance(longArray28, longArray34);
        long long37 = code.src.Distance.chebyshevDistance(longArray23, longArray34);
        long long38 = code.src.Distance.chebyshevDistance(longArray5, longArray23);
        long[] longArray41 = new long[] { 0, (short) -1 };
        long[] longArray44 = new long[] { (short) -1, (short) -1 };
        long long45 = code.src.Distance.chebyshevDistance(longArray41, longArray44);
        long[] longArray52 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long53 = code.src.Distance.chebyshevDistance(longArray44, longArray52);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray59, longArray63);
        long long69 = code.src.Distance.chebyshevDistance(longArray52, longArray59);
        long long70 = code.src.Distance.chebyshevDistance(longArray23, longArray59);
        java.lang.Class<?> wildcardClass71 = longArray59.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 98L + "'", long36 == 98L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 11L + "'", long53 == 11L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double4 = code.src.Distance.squaredDistance(625.0d, 7.677886613131662E20d, 3.068933012127493E239d, 1.0251810742299723E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double4 = code.src.Distance.euclideanDistance(1.2346234984976643E249d, 3.650997547418172E43d, 8.694706299452896E61d, 4.518236899385757E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double4 = code.src.Distance.euclideanDistance(5.525929037215044E7d, 5.976212418396983E251d, 0.0d, 2.0450959756078844E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double4 = code.src.Distance.euclideanDistance(3.3607494419832777E49d, 6.92256251604893E61d, 7.732944131972951E127d, 8.320193817483419E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.732944131972951E127d + "'", double4 == 7.732944131972951E127d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double4 = code.src.Distance.euclideanDistance(8.824228056978371E247d, 7.561664719340081E125d, 2.1256287435569485E128d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double4 = code.src.Distance.squaredDistance(9.374059300997487E248d, 0.0d, 7.863642449363113E125d, 7.862188778631282E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double4 = code.src.Distance.euclideanDistance(3.7841059251973525E61d, 1.7683618323195464E53d, (double) 10.0f, 5.3119477457783107E253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double4 = code.src.Distance.squaredDistance(2.108919516827715E128d, 1.7874479094211152E62d, 4.518236903714711E256d, 5.5259489E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double4 = code.src.Distance.squaredDistance(4.347353086803702E62d, 3.053611124550097E15d, 1.0595365456818555E252d, 2.010262836799118E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double4 = code.src.Distance.euclideanDistance(1.1341134428019932E16d, 2.948678716579241E31d, 20737.0d, 6.117725723239335E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.117725723239335E125d + "'", double4 == 6.117725723239335E125d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double4 = code.src.Distance.euclideanDistance(5.976212418396983E251d, 1.7369446609706255E256d, 7.661073336008042E123d, 5.717877332771251E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double4 = code.src.Distance.euclideanDistance(2.7030845353965203E124d, 3.559657110785834E251d, 1.2126872764393267E249d, 6.087679543111817E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double4 = code.src.Distance.squaredDistance(7.559791763325273E123d, 1.8434127311838973E250d, 8.609551723439344E256d, 3.583333528970715E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double4 = code.src.Distance.squaredDistance(1.6432333679662337E252d, 6.385337334710284E62d, 7.235240391572074E248d, 3.054769716678889E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double4 = code.src.Distance.euclideanDistance(7.661073336008042E123d, 6.458990228650728E249d, 1.889947887669239E125d, 4.484874987983141E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double4 = code.src.Distance.euclideanDistance(2.117752378578906E128d, 2.003282354999151E124d, 9.958849630795155E247d, 1.4331582329756537E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double4 = code.src.Distance.euclideanDistance(2.125614474048533E128d, 1.8649081799905601E31d, 7.380601634026061E248d, 2.9486787165792413E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double4 = code.src.Distance.squaredDistance(5.5259389E7d, 3.053611124543087E15d, 5.618790528635277E251d, 5.722457520259434E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double4 = code.src.Distance.squaredDistance(2.296505818800933E247d, 1.1245688124397413E248d, 1.7583641551952374E124d, 1.3415049736556993E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double4 = code.src.Distance.squaredDistance(1.1503513373584828E252d, 9.386961461524785E62d, 1.077343123590583E252d, 2.0147440391085077E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double4 = code.src.Distance.squaredDistance(2.125690131439817E128d, 2.742264228911255E125d, 20084.432052190223d, 3.053611124550097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5185660549137277E256d + "'", double4 == 4.5185660549137277E256d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double4 = code.src.Distance.euclideanDistance(3.353869668626517E49d, 1.917769450392853E125d, 6.063099723657831E251d, 1.2296171124372597E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double4 = code.src.Distance.euclideanDistance(1.039575455679478E8d, 4.794956959071923E255d, 2.1254910133153752E128d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double4 = code.src.Distance.euclideanDistance(5.497143053457335E251d, 5.715616324151285E251d, 5.717560488315264E251d, 7.559791732623814E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double4 = code.src.Distance.squaredDistance(2.285850535203458E248d, 7.701874509023016E125d, 1.6205790789034482E254d, 5.719393272657122E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double4 = code.src.Distance.squaredDistance(0.0d, 7.559791763374577E123d, 8.013384602956264E125d, 5.715044985152495E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double4 = code.src.Distance.euclideanDistance(8.73117060907958E61d, 2.7191106511481887E123d, 1.8649081799851445E31d, 2.4389863321241504E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1670752670093316E124d + "'", double4 == 2.1670752670093316E124d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        double double4 = code.src.Distance.euclideanDistance(4.518033412506453E256d, 9.324535099190634E30d, (double) (-1.0f), 7.520013101166239E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double4 = code.src.Distance.squaredDistance(1.6205790789034482E254d, 7.393562733187527E246d, 1.45794860122975E64d, 8.694706281769278E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 'a', 1L };
        long[] longArray20 = new long[] { 0, (short) -1 };
        long[] longArray23 = new long[] { (short) -1, (short) -1 };
        long long24 = code.src.Distance.chebyshevDistance(longArray20, longArray23);
        long long25 = code.src.Distance.chebyshevDistance(longArray17, longArray23);
        long[] longArray28 = new long[] { 'a', 1L };
        long[] longArray31 = new long[] { 0, (short) -1 };
        long[] longArray34 = new long[] { (short) -1, (short) -1 };
        long long35 = code.src.Distance.chebyshevDistance(longArray31, longArray34);
        long long36 = code.src.Distance.chebyshevDistance(longArray28, longArray34);
        long[] longArray39 = new long[] { 'a', 1L };
        long[] longArray42 = new long[] { 0, (short) -1 };
        long[] longArray45 = new long[] { (short) -1, (short) -1 };
        long long46 = code.src.Distance.chebyshevDistance(longArray42, longArray45);
        long long47 = code.src.Distance.chebyshevDistance(longArray39, longArray45);
        long long48 = code.src.Distance.chebyshevDistance(longArray34, longArray45);
        long[] longArray51 = new long[] { 'a', 1L };
        long[] longArray54 = new long[] { 0, (short) -1 };
        long[] longArray57 = new long[] { (short) -1, (short) -1 };
        long long58 = code.src.Distance.chebyshevDistance(longArray54, longArray57);
        long long59 = code.src.Distance.chebyshevDistance(longArray51, longArray57);
        long long60 = code.src.Distance.chebyshevDistance(longArray45, longArray57);
        long long61 = code.src.Distance.chebyshevDistance(longArray23, longArray57);
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long[] longArray75 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long76 = code.src.Distance.chebyshevDistance(longArray67, longArray75);
        long long77 = code.src.Distance.chebyshevDistance(longArray57, longArray75);
        long long78 = code.src.Distance.chebyshevDistance(longArray5, longArray57);
        long[] longArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray5, longArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 98L + "'", long36 == 98L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 98L + "'", long59 == 98L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 11L + "'", long76 == 11L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double4 = code.src.Distance.euclideanDistance(1.4390013713198977E128d, 2.12373890011799E128d, 2.9411186287809066E128d, 1552637.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.6012733749140157E128d + "'", double4 == 2.6012733749140157E128d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double4 = code.src.Distance.euclideanDistance(1.4251979253203356E128d, 1.0699880226301655E124d, 1.3292180507676446E247d, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double4 = code.src.Distance.squaredDistance(2.225770767711531E249d, 8.841771681470747E249d, 7.611134977058946E125d, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double4 = code.src.Distance.squaredDistance(1.4328545305891465E128d, 0.0d, 0.0d, 2.1256287435569485E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.571369661265336E256d + "'", double4 == 6.571369661265336E256d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double4 = code.src.Distance.euclideanDistance(8.0133847820028E125d, 3.3993126052584937E124d, 0.0d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.020591557130731E125d + "'", double4 == 8.020591557130731E125d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double4 = code.src.Distance.euclideanDistance(3.053584521181947E15d, 1552637.0032203277d, 1.069116001870466E124d, 3.4778825197957035E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.069116001870466E124d + "'", double4 == 1.069116001870466E124d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double4 = code.src.Distance.squaredDistance(1.918367176323824E125d, 1.5649646924973942E62d, 1.4579745280790234E64d, 5.492742669460755E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double4 = code.src.Distance.euclideanDistance(3.0005186432380365E128d, 4.64617159966005E124d, 0.0d, 2.4805194246531137E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.000518651053434E128d + "'", double4 == 3.000518651053434E128d);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 0, (short) -1 };
        long[] longArray12 = new long[] { (short) -1, (short) -1 };
        long long13 = code.src.Distance.chebyshevDistance(longArray9, longArray12);
        long[] longArray16 = new long[] { 'a', 1L };
        long[] longArray19 = new long[] { 0, (short) -1 };
        long[] longArray22 = new long[] { (short) -1, (short) -1 };
        long long23 = code.src.Distance.chebyshevDistance(longArray19, longArray22);
        long long24 = code.src.Distance.chebyshevDistance(longArray16, longArray22);
        long[] longArray27 = new long[] { 'a', 1L };
        long[] longArray30 = new long[] { 0, (short) -1 };
        long[] longArray33 = new long[] { (short) -1, (short) -1 };
        long long34 = code.src.Distance.chebyshevDistance(longArray30, longArray33);
        long long35 = code.src.Distance.chebyshevDistance(longArray27, longArray33);
        long long36 = code.src.Distance.chebyshevDistance(longArray22, longArray33);
        long[] longArray39 = new long[] { 'a', 1L };
        long[] longArray42 = new long[] { 0, (short) -1 };
        long[] longArray45 = new long[] { (short) -1, (short) -1 };
        long long46 = code.src.Distance.chebyshevDistance(longArray42, longArray45);
        long long47 = code.src.Distance.chebyshevDistance(longArray39, longArray45);
        long long48 = code.src.Distance.chebyshevDistance(longArray22, longArray45);
        long long49 = code.src.Distance.chebyshevDistance(longArray12, longArray45);
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray12, longArray52);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long[] longArray71 = new long[] { 'a', 1L };
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray71, longArray77);
        long long80 = code.src.Distance.chebyshevDistance(longArray66, longArray77);
        long[] longArray83 = new long[] { 'a', 1L };
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray83, longArray89);
        long long92 = code.src.Distance.chebyshevDistance(longArray77, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray12, longArray77);
        long long94 = code.src.Distance.chebyshevDistance(longArray5, longArray77);
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray5, longArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 98L + "'", long24 == 98L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 98L + "'", long35 == 98L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 98L + "'", long79 == 98L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double4 = code.src.Distance.squaredDistance(8.320193817483419E30d, 9.778776737535161E212d, 1.1929678834484718E32d, 2.02313625086486E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double4 = code.src.Distance.squaredDistance(5.952906869765997E125d, 3.0054630325063084E128d, 3.583333108359959E250d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double4 = code.src.Distance.squaredDistance(2.048095142025898E256d, 1.143009020812949E248d, 4.1824175494475645E256d, 7.732824116021177E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double4 = code.src.Distance.euclideanDistance(2.1670752670093316E124d, 9.715913234165533E248d, 8.917458244322077E62d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double4 = code.src.Distance.squaredDistance(4.3184582665404395E15d, 4.485515365493677E256d, 5.580834364125841E251d, 7.592234862162515E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double4 = code.src.Distance.squaredDistance(2.3516426728808653E249d, 10.04987562112089d, 4.507895615716358E256d, 2.286018050924669E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double4 = code.src.Distance.squaredDistance(2.1179790857622837E128d, 5.525928500007007E7d, 7.814857737225062E7d, 4.629561777660613E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double4 = code.src.Distance.euclideanDistance(4.5308038792299146E256d, 1.1918576465896191E249d, 6.540287573520957E256d, 8.69470629942351E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long long23 = code.src.Distance.chebyshevDistance(longArray9, longArray20);
        long[] longArray26 = new long[] { 'a', 1L };
        long[] longArray29 = new long[] { 0, (short) -1 };
        long[] longArray32 = new long[] { (short) -1, (short) -1 };
        long long33 = code.src.Distance.chebyshevDistance(longArray29, longArray32);
        long long34 = code.src.Distance.chebyshevDistance(longArray26, longArray32);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray32, longArray43);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long long58 = code.src.Distance.chebyshevDistance(longArray43, longArray55);
        long[] longArray61 = new long[] { 'a', 1L };
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray61, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray43, longArray61);
        long long71 = code.src.Distance.chebyshevDistance(longArray20, longArray61);
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long[] longArray85 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long86 = code.src.Distance.chebyshevDistance(longArray77, longArray85);
        long long87 = code.src.Distance.chebyshevDistance(longArray61, longArray77);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray0, longArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 98L + "'", long34 == 98L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 98L + "'", long71 == 98L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11L + "'", long86 == 11L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 98L + "'", long87 == 98L);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double4 = code.src.Distance.squaredDistance(3.0535834157458975E15d, 1.4579746669762032E64d, 1.9993186607985635E125d, 7.608198465098248E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.18819589917407E251d + "'", double4 == 6.18819589917407E251d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double4 = code.src.Distance.squaredDistance(6.587293214563927E247d, 2.769446841189903E125d, 1.4292308816699378E126d, 1.7091751902317117E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double4 = code.src.Distance.euclideanDistance(1.5119583495997528E124d, 6.535960763430168E175d, 1.1416037601853007E32d, 7.608574040480504E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double4 = code.src.Distance.squaredDistance(5.863139033023053E125d, 6.556084846280365E12d, 1.1958657793748695E32d, 3.477882519775504E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.43763993205585E251d + "'", double4 == 3.43763993205585E251d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double4 = code.src.Distance.squaredDistance(3.194777076918012E128d, 8.899687221465109E59d, 2.1256145316270446E128d, 9.466542772840854E21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.14310854825306E256d + "'", double4 == 1.14310854825306E256d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray31, longArray42);
        long[] longArray48 = new long[] { 'a', 1L };
        long[] longArray51 = new long[] { 0, (short) -1 };
        long[] longArray54 = new long[] { (short) -1, (short) -1 };
        long long55 = code.src.Distance.chebyshevDistance(longArray51, longArray54);
        long long56 = code.src.Distance.chebyshevDistance(longArray48, longArray54);
        long long57 = code.src.Distance.chebyshevDistance(longArray42, longArray54);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray42, longArray60);
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray60);
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray73);
        long[] longArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray19, longArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 98L + "'", long56 == 98L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 98L + "'", long82 == 98L);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double4 = code.src.Distance.squaredDistance(5.719666280792153E251d, 4.5182406995808964E256d, 2.316460326605626E249d, 2.406503766681E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double4 = code.src.Distance.squaredDistance(1.6544106198611494E250d, 5.741400496898164E251d, 2.1255055543791955E128d, 5.726018993608619E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double4 = code.src.Distance.euclideanDistance(9.797098384561698E7d, 8.116214151045995E123d, 7.65996356070261E125d, 1.1649654526156026E205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double4 = code.src.Distance.squaredDistance(7.559791763325273E123d, 1.891459241752112E125d, 6.17830490479184E248d, 7.764261239969174E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        double double4 = code.src.Distance.squaredDistance(1.4299366702240583E248d, 2.0246776224200723E128d, 8.694715983872712E61d, 8.694866271304194E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double4 = code.src.Distance.euclideanDistance(4.8406811122263884E123d, 2.244898434111624E124d, 4.877950885822437E248d, 7.39356285262388E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double4 = code.src.Distance.euclideanDistance(7.786532742293105E125d, 8.08452890614547E87d, 4.172449883594742E250d, 7.610605585266955E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.131035907806524E126d, 5.999148008594126E125d, 5.527131618909466E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2802890271489155E126d + "'", double4 == 1.2802890271489155E126d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double4 = code.src.Distance.euclideanDistance(3.559657110785834E251d, 1.7683618323195464E53d, 4.849373849148842E124d, 8.05047120619714E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double4 = code.src.Distance.squaredDistance(100.0d, 5.8330261552214634E125d, 6.087679543111817E251d, 1.2570568699721244E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double4 = code.src.Distance.euclideanDistance(6.922562516048925E61d, 1.9395881659392382E249d, 7.559791732623792E123d, 1.4272033862877643E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double4 = code.src.Distance.euclideanDistance(1.231115082248268E64d, (double) 0, 8.058264513507916E247d, 1.5119583495997528E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.3292180507676446E247d, 2.9064639308329233E248d, 2.1255797182038412E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 0, (short) -1 };
        long[] longArray28 = new long[] { (short) -1, (short) -1 };
        long long29 = code.src.Distance.chebyshevDistance(longArray25, longArray28);
        long[] longArray36 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long37 = code.src.Distance.chebyshevDistance(longArray28, longArray36);
        long[] longArray40 = new long[] { 'a', 1L };
        long[] longArray43 = new long[] { 0, (short) -1 };
        long[] longArray46 = new long[] { (short) -1, (short) -1 };
        long long47 = code.src.Distance.chebyshevDistance(longArray43, longArray46);
        long long48 = code.src.Distance.chebyshevDistance(longArray40, longArray46);
        long[] longArray51 = new long[] { 'a', 1L };
        long[] longArray54 = new long[] { 0, (short) -1 };
        long[] longArray57 = new long[] { (short) -1, (short) -1 };
        long long58 = code.src.Distance.chebyshevDistance(longArray54, longArray57);
        long long59 = code.src.Distance.chebyshevDistance(longArray51, longArray57);
        long long60 = code.src.Distance.chebyshevDistance(longArray46, longArray57);
        long long61 = code.src.Distance.chebyshevDistance(longArray28, longArray46);
        long long62 = code.src.Distance.chebyshevDistance(longArray19, longArray46);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray68);
        long[] longArray73 = new long[] { 0, (short) -1 };
        long[] longArray76 = new long[] { (short) -1, (short) -1 };
        long long77 = code.src.Distance.chebyshevDistance(longArray73, longArray76);
        long[] longArray84 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long85 = code.src.Distance.chebyshevDistance(longArray76, longArray84);
        long long86 = code.src.Distance.chebyshevDistance(longArray19, longArray84);
        long[] longArray89 = new long[] { 'a', 1L };
        long[] longArray92 = new long[] { 0, (short) -1 };
        long[] longArray95 = new long[] { (short) -1, (short) -1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray92, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray89, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray84, longArray89);
        java.lang.Class<?> wildcardClass99 = longArray84.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 98L + "'", long48 == 98L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 98L + "'", long59 == 98L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 11L + "'", long85 == 11L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11L + "'", long86 == 11L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1L + "'", long96 == 1L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 98L + "'", long97 == 98L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 97L + "'", long98 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double4 = code.src.Distance.squaredDistance(4.172449883594742E250d, 1.4330571085588943E128d, 8.866898431039124E62d, 2.129673436349805E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double4 = code.src.Distance.euclideanDistance(1.7307558713743367E254d, 3.0535834157458975E15d, 7.862183193182798E125d, 1.4223699416343344E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double4 = code.src.Distance.squaredDistance(5.791260368077024E24d, 5.791260368077024E24d, (double) (-1L), 1.0695270443395895E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1438880985737782E248d + "'", double4 == 1.1438880985737782E248d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double4 = code.src.Distance.euclideanDistance(2.286018050924669E248d, 1.2038504689988316E124d, 2.1254910133153752E128d, 3.0234847996883654E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double4 = code.src.Distance.euclideanDistance(2.129673436349805E128d, 1.0d, 5.484533507010109E251d, 5.5259489E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double4 = code.src.Distance.euclideanDistance(5.715045150481383E247d, 2.031825603955293E256d, 3.8265338665801504E250d, 4.485940704933021E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double4 = code.src.Distance.squaredDistance(5.865141437237654E125d, 8.841771681470747E249d, 8.694866271304194E61d, 3.4806291687247766E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double4 = code.src.Distance.squaredDistance(1.0691159266556964E124d, 8.273174080969564E247d, 1.7307558713743367E254d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double4 = code.src.Distance.euclideanDistance(1.736952180983727E256d, 8.866895281429006E62d, (double) (short) 100, 7.877914654122638E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double4 = code.src.Distance.squaredDistance(7.408981413846232E125d, 7.862701231474445E125d, 4.654121416639182E124d, 5.715045104064703E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long long34 = code.src.Distance.chebyshevDistance(longArray20, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray31, longArray43);
        long long47 = code.src.Distance.chebyshevDistance(longArray3, longArray43);
        long[] longArray50 = new long[] { 'a', 1L };
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray50, longArray56);
        long[] longArray61 = new long[] { 'a', 1L };
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray61, longArray67);
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray67, longArray78);
        long[] longArray84 = new long[] { 'a', 1L };
        long[] longArray87 = new long[] { 0, (short) -1 };
        long[] longArray90 = new long[] { (short) -1, (short) -1 };
        long long91 = code.src.Distance.chebyshevDistance(longArray87, longArray90);
        long long92 = code.src.Distance.chebyshevDistance(longArray84, longArray90);
        long long93 = code.src.Distance.chebyshevDistance(longArray67, longArray90);
        long long94 = code.src.Distance.chebyshevDistance(longArray50, longArray67);
        long long95 = code.src.Distance.chebyshevDistance(longArray3, longArray67);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 98L + "'", long95 == 98L);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double4 = code.src.Distance.euclideanDistance(5.999148008594126E125d, (double) 10, 7.876508236289523E125d, 2.1092217904410153E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double4 = code.src.Distance.squaredDistance(1.9582663354766428E125d, 5.715044985152495E251d, 1.5134476182871558E249d, 7.559791732674063E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double4 = code.src.Distance.squaredDistance(6.571369661265336E256d, 9.977005894109556E248d, 4.485940704933021E256d, 4.689593133831153E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double4 = code.src.Distance.squaredDistance(2.0786247129419894E256d, 1.5941288904220582E249d, 0.0d, 5.715045150481366E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double4 = code.src.Distance.euclideanDistance(6.922552879173873E61d, 8.991400839772017E43d, 5.525928500007007E7d, 7.592234862162515E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.592234862162515E125d + "'", double4 == 7.592234862162515E125d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double4 = code.src.Distance.squaredDistance(6.181392456316606E251d, 3.772588879245304E249d, 1.4328545305891465E128d, 6.518731715344327E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double4 = code.src.Distance.euclideanDistance(6.047401286148532E124d, 9.095699028095402E123d, 4.4851952518236286E256d, 7.559791732617994E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double4 = code.src.Distance.euclideanDistance(7.590793803572108E125d, 1.5737202213962112E124d, 9.466542772834739E21d, 3.829739330285951E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double4 = code.src.Distance.squaredDistance(6.421433566443406E251d, 3.583333528970715E250d, 3.2973523484734863E250d, 4.70381733357983E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double4 = code.src.Distance.euclideanDistance(7.771738451246113E125d, 7.560644248248633E125d, 2.2194288710556866E124d, 4.485515365493677E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        long[] longArray13 = new long[] { 0, (short) -1 };
        long[] longArray16 = new long[] { (short) -1, (short) -1 };
        long long17 = code.src.Distance.chebyshevDistance(longArray13, longArray16);
        long[] longArray24 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long25 = code.src.Distance.chebyshevDistance(longArray16, longArray24);
        long[] longArray28 = new long[] { 'a', 1L };
        long[] longArray31 = new long[] { 0, (short) -1 };
        long[] longArray34 = new long[] { (short) -1, (short) -1 };
        long long35 = code.src.Distance.chebyshevDistance(longArray31, longArray34);
        long long36 = code.src.Distance.chebyshevDistance(longArray28, longArray34);
        long[] longArray39 = new long[] { 'a', 1L };
        long[] longArray42 = new long[] { 0, (short) -1 };
        long[] longArray45 = new long[] { (short) -1, (short) -1 };
        long long46 = code.src.Distance.chebyshevDistance(longArray42, longArray45);
        long long47 = code.src.Distance.chebyshevDistance(longArray39, longArray45);
        long[] longArray50 = new long[] { 'a', 1L };
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray50, longArray56);
        long long59 = code.src.Distance.chebyshevDistance(longArray45, longArray56);
        long[] longArray62 = new long[] { 'a', 1L };
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray62, longArray68);
        long long71 = code.src.Distance.chebyshevDistance(longArray45, longArray68);
        long long72 = code.src.Distance.chebyshevDistance(longArray28, longArray45);
        long[] longArray75 = new long[] { 'a', 1L };
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray75, longArray81);
        long[] longArray86 = new long[] { 'a', 1L };
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray86, longArray92);
        long long95 = code.src.Distance.chebyshevDistance(longArray75, longArray92);
        long long96 = code.src.Distance.chebyshevDistance(longArray28, longArray92);
        long long97 = code.src.Distance.chebyshevDistance(longArray16, longArray28);
        long long98 = code.src.Distance.chebyshevDistance(longArray9, longArray28);
        java.lang.Class<?> wildcardClass99 = longArray9.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 11L + "'", long25 == 11L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 98L + "'", long36 == 98L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 98L + "'", long72 == 98L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 98L + "'", long83 == 98L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 98L + "'", long95 == 98L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 98L + "'", long96 == 98L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 98L + "'", long97 == 98L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 3L + "'", long98 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double4 = code.src.Distance.euclideanDistance(2.884474619048523E15d, 6.151508697220018E30d, 1.5617254340936532E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5617254340936532E62d + "'", double4 == 1.5617254340936532E62d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double4 = code.src.Distance.euclideanDistance(3.508619807280285E256d, 7.864154807481348E125d, 8.694706299452407E61d, 8.991400839772116E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double4 = code.src.Distance.squaredDistance(4.5179005661205605E256d, 2.0527657397400854E256d, 7.590729215407016E125d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double4 = code.src.Distance.euclideanDistance(1.4329715861471609E125d, 1.5338908798484704E249d, 9.839391355390219E61d, 1.0421930753617213E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double4 = code.src.Distance.euclideanDistance(9.951221440466418E248d, 3.053611124543088E15d, 7.590729215407016E125d, 1.1309348446938204E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double4 = code.src.Distance.euclideanDistance(104.0d, 1.265274418961214E198d, 3.0005186432380365E128d, 7.559791763374577E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double4 = code.src.Distance.squaredDistance(6.106325777130968E125d, 5.262553411785863E62d, 1.380250332732779E124d, 7.864877677880983E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.747691465716283E251d + "'", double4 == 9.747691465716283E251d);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double4 = code.src.Distance.euclideanDistance(7.425749067574235E250d, 1.5617268815501826E62d, 8.013384602956264E125d, 2.0530721058298435E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double4 = code.src.Distance.euclideanDistance(2.1256233372092894E128d, 2.123180521041554E128d, 3.583333108359959E250d, 2.316460326605626E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double4 = code.src.Distance.euclideanDistance(1.2387871038033346E124d, 7.635389630576875E125d, 7.611134977058946E125d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0693838469587942E126d + "'", double4 == 1.0693838469587942E126d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double4 = code.src.Distance.squaredDistance(103.39245620450265d, 2.55346448847492E124d, 2.7234837376481807E125d, 1.3415049736556993E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.793532880268111E254d + "'", double4 == 1.793532880268111E254d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double4 = code.src.Distance.squaredDistance(7.5597917633235E123d, 1.4329715861471609E125d, 5.714207540805018E247d, 6.18819589917407E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double4 = code.src.Distance.euclideanDistance(3.053611124540608E15d, 2.125614498247224E128d, 2.1253025614605642E128d, 2.244907423513874E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.005852287273883E128d + "'", double4 == 3.005852287273883E128d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double4 = code.src.Distance.euclideanDistance(6.563804083986358E256d, 4.510324073423701E256d, 1.1438880985737782E248d, 7.891149462745871E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double4 = code.src.Distance.euclideanDistance(9.351743915519625E30d, 0.0d, 8.694705670080019E61d, 4.518236903714711E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double4 = code.src.Distance.euclideanDistance(4.1519250136110354E256d, 1.5656099294436052E250d, 2.7676045845140174E123d, 1.0486765404643746E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double4 = code.src.Distance.euclideanDistance(1.4331582329756537E128d, (double) (short) 0, 6.923434529559351E123d, 1.231235105847726E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4330890039194221E128d + "'", double4 == 1.4330890039194221E128d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double4 = code.src.Distance.squaredDistance(8.694706299426858E61d, 4.792979223186968E123d, 2.316460326605626E249d, 7.562847533034203E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double4 = code.src.Distance.euclideanDistance(4.5169109784901915E256d, 9.324540890452801E30d, 6.957500350144719E61d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double4 = code.src.Distance.euclideanDistance(5.717877332771251E251d, 8.694866271304194E61d, 1.4291186487223539E128d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double4 = code.src.Distance.euclideanDistance(9.012004300008916E249d, 7.771738451246113E125d, 1.433158224335312E128d, 2.1167681449070773E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double4 = code.src.Distance.euclideanDistance(5.52593680000932E7d, 7.850374433297587E251d, 5.715043495807318E247d, 5.715616324151285E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long long34 = code.src.Distance.chebyshevDistance(longArray20, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray31, longArray43);
        long long47 = code.src.Distance.chebyshevDistance(longArray9, longArray43);
        long[] longArray50 = new long[] { 'a', 1L };
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray50, longArray56);
        long[] longArray61 = new long[] { 0, (short) -1 };
        long[] longArray64 = new long[] { (short) -1, (short) -1 };
        long long65 = code.src.Distance.chebyshevDistance(longArray61, longArray64);
        long long66 = code.src.Distance.chebyshevDistance(longArray56, longArray64);
        long long67 = code.src.Distance.chebyshevDistance(longArray43, longArray64);
        // The following exception was thrown during execution in test generation
        try {
            long long68 = code.src.Distance.chebyshevDistance(longArray0, longArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double4 = code.src.Distance.euclideanDistance(1.0852821850087336E126d, 4.4851952518236286E256d, 4.794486294195585E251d, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double4 = code.src.Distance.euclideanDistance(7.864154807481348E125d, 4.675240277191704E248d, 1.102865396833695E32d, 8.694706299426871E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double4 = code.src.Distance.euclideanDistance(4.8406811122263884E123d, 1.0486765404643746E16d, 7.425749067574235E250d, 4.518297579366302E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double4 = code.src.Distance.euclideanDistance(5.763138746578841E251d, 2.0450959756078844E128d, 1.511958352664876E124d, 2.12562792029767E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double4 = code.src.Distance.squaredDistance(2.884474619048523E15d, 5.5218522892182536E247d, 8.34116319834633E30d, 1.224365486934459E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double4 = code.src.Distance.squaredDistance(4.518236951771165E256d, 2.0452199803289235E128d, 6.120040302792729E125d, 5.52593680000932E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double4 = code.src.Distance.squaredDistance(1.158095138919963E126d, 4.979659311150055E251d, (double) (-1), 7.559791732674063E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double4 = code.src.Distance.euclideanDistance(2.5619922088623362E128d, 5.869204465969338E247d, 5.715922571126109E251d, 7.05498227594466E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double4 = code.src.Distance.squaredDistance(5.715465761239799E247d, 1.5891483284062439E254d, 1.7996320167102433E254d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double4 = code.src.Distance.squaredDistance(1.7369446609706255E256d, 2.0451720082100127E128d, 7.764261239969174E251d, 2.4389863321241504E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double4 = code.src.Distance.squaredDistance(3.0536111245430885E15d, 1.3415037258095196E127d, 9.374059300997487E248d, 1811816.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 0, (short) -1 };
        long[] longArray52 = new long[] { (short) -1, (short) -1 };
        long long53 = code.src.Distance.chebyshevDistance(longArray49, longArray52);
        long[] longArray56 = new long[] { 'a', 1L };
        long[] longArray59 = new long[] { 0, (short) -1 };
        long[] longArray62 = new long[] { (short) -1, (short) -1 };
        long long63 = code.src.Distance.chebyshevDistance(longArray59, longArray62);
        long long64 = code.src.Distance.chebyshevDistance(longArray56, longArray62);
        long[] longArray67 = new long[] { 'a', 1L };
        long[] longArray70 = new long[] { 0, (short) -1 };
        long[] longArray73 = new long[] { (short) -1, (short) -1 };
        long long74 = code.src.Distance.chebyshevDistance(longArray70, longArray73);
        long long75 = code.src.Distance.chebyshevDistance(longArray67, longArray73);
        long long76 = code.src.Distance.chebyshevDistance(longArray62, longArray73);
        long[] longArray79 = new long[] { 'a', 1L };
        long[] longArray82 = new long[] { 0, (short) -1 };
        long[] longArray85 = new long[] { (short) -1, (short) -1 };
        long long86 = code.src.Distance.chebyshevDistance(longArray82, longArray85);
        long long87 = code.src.Distance.chebyshevDistance(longArray79, longArray85);
        long long88 = code.src.Distance.chebyshevDistance(longArray62, longArray85);
        long long89 = code.src.Distance.chebyshevDistance(longArray52, longArray85);
        long[] longArray92 = new long[] { 0, (short) -1 };
        long[] longArray95 = new long[] { (short) -1, (short) -1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray92, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray85, longArray92);
        long long98 = code.src.Distance.chebyshevDistance(longArray42, longArray85);
        java.lang.Class<?> wildcardClass99 = longArray42.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 98L + "'", long64 == 98L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 98L + "'", long75 == 98L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 98L + "'", long87 == 98L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1L + "'", long96 == 1L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1L + "'", long97 == 1L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double4 = code.src.Distance.euclideanDistance(8.133851138224599E174d, 1.0691159266556964E124d, 2.133627508430731E128d, 1.7683618323195464E53d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.7676045845140174E123d, 6.191637431199285E31d, 8.694706299452896E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7676045845140174E123d + "'", double4 == 2.7676045845140174E123d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray19, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
        long[] longArray49 = new long[] { 0, (short) -1 };
        long[] longArray52 = new long[] { (short) -1, (short) -1 };
        long long53 = code.src.Distance.chebyshevDistance(longArray49, longArray52);
        long long54 = code.src.Distance.chebyshevDistance(longArray2, longArray52);
        long[] longArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 98L + "'", long54 == 98L);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double4 = code.src.Distance.squaredDistance((double) 33L, 5.715851632357578E251d, 7.850374433297587E251d, 6.182228556491662E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double4 = code.src.Distance.squaredDistance(7.559791544536665E125d, 6.858438111975517E125d, 0.0d, 4.753127358123107E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.789473776466673E251d + "'", double4 == 9.789473776466673E251d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray15, longArray26);
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long long41 = code.src.Distance.chebyshevDistance(longArray15, longArray38);
        long long42 = code.src.Distance.chebyshevDistance(longArray5, longArray38);
        long[] longArray45 = new long[] { 0, (short) -1 };
        long[] longArray48 = new long[] { (short) -1, (short) -1 };
        long long49 = code.src.Distance.chebyshevDistance(longArray45, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray38, longArray48);
        long[] longArray53 = new long[] { 'a', 1L };
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray53, longArray59);
        long[] longArray64 = new long[] { 'a', 1L };
        long[] longArray67 = new long[] { 0, (short) -1 };
        long[] longArray70 = new long[] { (short) -1, (short) -1 };
        long long71 = code.src.Distance.chebyshevDistance(longArray67, longArray70);
        long long72 = code.src.Distance.chebyshevDistance(longArray64, longArray70);
        long[] longArray75 = new long[] { 'a', 1L };
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray75, longArray81);
        long long84 = code.src.Distance.chebyshevDistance(longArray70, longArray81);
        long[] longArray87 = new long[] { 'a', 1L };
        long[] longArray90 = new long[] { 0, (short) -1 };
        long[] longArray93 = new long[] { (short) -1, (short) -1 };
        long long94 = code.src.Distance.chebyshevDistance(longArray90, longArray93);
        long long95 = code.src.Distance.chebyshevDistance(longArray87, longArray93);
        long long96 = code.src.Distance.chebyshevDistance(longArray81, longArray93);
        long long97 = code.src.Distance.chebyshevDistance(longArray53, longArray93);
        long long98 = code.src.Distance.chebyshevDistance(longArray38, longArray93);
        java.lang.Class<?> wildcardClass99 = longArray38.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 98L + "'", long72 == 98L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 98L + "'", long83 == 98L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 98L + "'", long95 == 98L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 98L + "'", long97 == 98L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double4 = code.src.Distance.squaredDistance(6.42143426575965E251d, 5.714644157457502E251d, 2.0536526821066443E256d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double4 = code.src.Distance.euclideanDistance((double) 0, 6.072806626010396E251d, 8.69470629942351E61d, 1.143009020812949E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double4 = code.src.Distance.euclideanDistance(2.1255055543791955E128d, 6.965152111856186E127d, 7.76081660665762E125d, 10105.000049480455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.2293443461646345E128d + "'", double4 == 2.2293443461646345E128d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 5.185424875331702E249d, 9.324540899982978E30d, 5.527131618909466E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double4 = code.src.Distance.squaredDistance(2.048095142025898E256d, 7.559791732623826E123d, 2.043215881875234E128d, 6.957499817664781E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double4 = code.src.Distance.squaredDistance(2.286018050924669E248d, 6.151502905962372E30d, 1.0190538431654038E252d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double4 = code.src.Distance.squaredDistance(2.481557946718722E62d, 4.1996701178995654E256d, 1.8649081799905601E31d, 5.8330261552214634E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double4 = code.src.Distance.euclideanDistance(3.068933012127493E239d, 1.5879222763876448E128d, 2.0504686747931686E246d, 6.182228556491662E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double4 = code.src.Distance.euclideanDistance(3.068933012127493E239d, 2.0450959756078844E128d, 2.0451720082100127E128d, 2.2840367152798036E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double4 = code.src.Distance.euclideanDistance(1.4328545305891465E128d, 8.694706299424537E61d, 6.20393819963367E251d, 8.42249655260944E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double4 = code.src.Distance.squaredDistance(2.4389863321241504E124d, 1.3436331804825283E127d, 6.965152111856186E127d, 8.084528906135836E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.028472419203864E255d + "'", double4 == 5.028472419203864E255d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double4 = code.src.Distance.euclideanDistance(12329.400413486055d, 7.520013101166239E250d, 1.1210148155066758E127d, 8.73117060907958E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double4 = code.src.Distance.euclideanDistance(1.8649081799851445E31d, 2.7234837376481807E125d, 1.0486765404656112E16d, 2.031028428232339E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray9, longArray26);
        long[] longArray32 = new long[] { 0, (short) -1 };
        long[] longArray35 = new long[] { (short) -1, (short) -1 };
        long long36 = code.src.Distance.chebyshevDistance(longArray32, longArray35);
        long[] longArray39 = new long[] { 'a', 1L };
        long[] longArray42 = new long[] { 0, (short) -1 };
        long[] longArray45 = new long[] { (short) -1, (short) -1 };
        long long46 = code.src.Distance.chebyshevDistance(longArray42, longArray45);
        long long47 = code.src.Distance.chebyshevDistance(longArray39, longArray45);
        long[] longArray50 = new long[] { 'a', 1L };
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray50, longArray56);
        long long59 = code.src.Distance.chebyshevDistance(longArray45, longArray56);
        long[] longArray62 = new long[] { 'a', 1L };
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray62, longArray68);
        long long71 = code.src.Distance.chebyshevDistance(longArray45, longArray68);
        long long72 = code.src.Distance.chebyshevDistance(longArray35, longArray68);
        long[] longArray78 = new long[] { 0L, 'a', 1, 'a', (byte) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray68, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray9, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray2, longArray9);
        long[] longArray84 = new long[] { 'a', 1L };
        long[] longArray87 = new long[] { 0, (short) -1 };
        long[] longArray90 = new long[] { (short) -1, (short) -1 };
        long long91 = code.src.Distance.chebyshevDistance(longArray87, longArray90);
        long long92 = code.src.Distance.chebyshevDistance(longArray84, longArray90);
        long long93 = code.src.Distance.chebyshevDistance(longArray2, longArray90);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 98L + "'", long29 == 98L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, 97, 1, 97, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 98L + "'", long79 == 98L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 97L + "'", long80 == 97L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 97L + "'", long81 == 97L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double4 = code.src.Distance.squaredDistance(2.3848836126517604E124d, 7.366529754618401E123d, 5.185424875331702E249d, 4.347362196294934E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double4 = code.src.Distance.squaredDistance(4.182726770879422E256d, 0.0d, 1552637.0032203277d, 3.353869565834853E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double4 = code.src.Distance.euclideanDistance(2.7065537201582164E49d, 2.24721340011667E248d, 2.125614474048533E128d, 1.738941196953288E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double4 = code.src.Distance.euclideanDistance(2.1256287435569485E128d, 7.568917694587279E125d, 1.1047365604210307E126d, 1.4579746669762032E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1145949239747002E128d + "'", double4 == 2.1145949239747002E128d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double4 = code.src.Distance.squaredDistance(5.948654328288416E248d, 7.408981413846232E125d, 1.2400472875600966E124d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double4 = code.src.Distance.euclideanDistance(3.598765218630986E247d, 8.806176891199752E248d, 4.5182371393605655E256d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double4 = code.src.Distance.squaredDistance(3.0522370255297355E15d, 3.119392465129366E124d, 2.5573985948136816E128d, 2.0483124887933698E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double4 = code.src.Distance.squaredDistance(1.0997224744491414E32d, 2.0483124887933698E256d, 2.0454154726104665E128d, 3.119392465129366E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double4 = code.src.Distance.euclideanDistance(3.023916486461334E124d, 4.546779423345663E248d, 1.8128492217045236E248d, 8.722498761879103E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double4 = code.src.Distance.squaredDistance((double) 2L, 101.0d, 0.0d, 1.231235105847726E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.515939885871861E248d + "'", double4 == 1.515939885871861E248d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double4 = code.src.Distance.euclideanDistance(7.863642449363113E125d, 3.0005186432380365E128d, 1.2570568699721244E254d, 5.71504510406472E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double4 = code.src.Distance.squaredDistance(1.9582663354766428E125d, 2.2496883671214544E99d, 6.047401286148532E124d, 2.964908885240041E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8320419833463618E250d + "'", double4 == 1.8320419833463618E250d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double4 = code.src.Distance.squaredDistance(3.3662285038614664E124d, 3.4778825197957035E62d, 4.183411062201243E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double4 = code.src.Distance.squaredDistance(1.2606145944433818E127d, 1.0063874635772352E61d, 7.5597917633235E123d, 2.1167681432297242E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.4965798094968406E256d + "'", double4 == 4.4965798094968406E256d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double4 = code.src.Distance.euclideanDistance(4.8406811122263884E123d, 20.0d, 3.321083216563934E61d, 8.694706299426871E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.8406811122263884E123d + "'", double4 == 4.8406811122263884E123d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double4 = code.src.Distance.euclideanDistance(6.185630088803056E251d, 1.0214528145753511E257d, 1.2570568699721244E254d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double4 = code.src.Distance.euclideanDistance(2.4065001431929946E12d, 3.353869565834853E49d, 9.958849630795155E247d, 3.7142566826117396E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long long23 = code.src.Distance.chebyshevDistance(longArray9, longArray20);
        long[] longArray26 = new long[] { 'a', 1L };
        long[] longArray29 = new long[] { 0, (short) -1 };
        long[] longArray32 = new long[] { (short) -1, (short) -1 };
        long long33 = code.src.Distance.chebyshevDistance(longArray29, longArray32);
        long long34 = code.src.Distance.chebyshevDistance(longArray26, longArray32);
        long long35 = code.src.Distance.chebyshevDistance(longArray20, longArray32);
        long[] longArray38 = new long[] { 'a', 1L };
        long[] longArray41 = new long[] { 0, (short) -1 };
        long[] longArray44 = new long[] { (short) -1, (short) -1 };
        long long45 = code.src.Distance.chebyshevDistance(longArray41, longArray44);
        long long46 = code.src.Distance.chebyshevDistance(longArray38, longArray44);
        long long47 = code.src.Distance.chebyshevDistance(longArray20, longArray38);
        long[] longArray50 = new long[] { 'a', 1L };
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray50, longArray56);
        long[] longArray61 = new long[] { 'a', 1L };
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray61, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray50, longArray67);
        long long71 = code.src.Distance.chebyshevDistance(longArray20, longArray50);
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray50, longArray74);
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray0, longArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 98L + "'", long34 == 98L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 98L + "'", long47 == 98L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 98L + "'", long71 == 98L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 97L + "'", long79 == 97L);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        double double4 = code.src.Distance.squaredDistance(7.863642449363113E125d, 2.244907423513874E31d, 6.192735015311481E251d, 1.598827773271099E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double4 = code.src.Distance.euclideanDistance(8.620276499386763E61d, 5.719393272657122E251d, 5.741400496898164E251d, 1.2018396007595654E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double4 = code.src.Distance.squaredDistance((double) 3L, 7.592234862162515E125d, 0.0d, 2.125690131439817E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.4863386994866856E256d + "'", double4 == 4.4863386994866856E256d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double4 = code.src.Distance.euclideanDistance(5.71504515055861E247d, 2.2194288710556866E124d, 1.0d, 1.602837247029983E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double4 = code.src.Distance.euclideanDistance(5.52593680000932E7d, 7.56145520935968E125d, 2.0519346354678006E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double4 = code.src.Distance.euclideanDistance(1.0207804596239174E249d, 3.6801326231966413E250d, (double) (byte) -1, (double) 33L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double4 = code.src.Distance.euclideanDistance(2.118121211849783E128d, 3.0559985941685375E15d, 1811672.00533166d, 1.8244317701642394E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double4 = code.src.Distance.squaredDistance(2.261894190902627E124d, 1.4299366702240583E248d, 8.694706299423517E61d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double4 = code.src.Distance.euclideanDistance(8.874969428842853E62d, 4.92586451367552E248d, 0.0d, 6.521492935459065E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double4 = code.src.Distance.squaredDistance(4.64617159966005E124d, 2.3516426728808653E249d, 5.527131720196977E7d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long long34 = code.src.Distance.chebyshevDistance(longArray20, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray31, longArray43);
        long long47 = code.src.Distance.chebyshevDistance(longArray9, longArray43);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = code.src.Distance.chebyshevDistance(longArray0, longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double4 = code.src.Distance.squaredDistance((double) 3L, 0.0d, 0.0d, 2.55346448847492E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.520180893902484E248d + "'", double4 == 6.520180893902484E248d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double4 = code.src.Distance.euclideanDistance(3.0234847996883654E124d, 1.0408126756135268E126d, 1.223220513063486E125d, 1.836507598757228E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double4 = code.src.Distance.euclideanDistance(7.560169524654381E125d, 6.458990228650728E249d, 8.620276499386763E61d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double4 = code.src.Distance.squaredDistance(1.3292180507676446E247d, 7.380601634026061E248d, 3.583333108359959E250d, 4.085911751455954E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double4 = code.src.Distance.squaredDistance(2.728966543133093E124d, 1.0379514071432164E126d, 1811717.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.078087849429937E252d + "'", double4 == 1.078087849429937E252d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double4 = code.src.Distance.squaredDistance(6.957500334326037E61d, 4.655892762958032E251d, 4.484932138384625E256d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double4 = code.src.Distance.euclideanDistance(2.3498127622806567E12d, 20084.432052190223d, 3.577618063209475E250d, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray15, longArray26);
        long long30 = code.src.Distance.chebyshevDistance(longArray5, longArray15);
        long[] longArray33 = new long[] { 'a', 1L };
        long[] longArray36 = new long[] { 0, (short) -1 };
        long[] longArray39 = new long[] { (short) -1, (short) -1 };
        long long40 = code.src.Distance.chebyshevDistance(longArray36, longArray39);
        long long41 = code.src.Distance.chebyshevDistance(longArray33, longArray39);
        long[] longArray44 = new long[] { 'a', 1L };
        long[] longArray47 = new long[] { 0, (short) -1 };
        long[] longArray50 = new long[] { (short) -1, (short) -1 };
        long long51 = code.src.Distance.chebyshevDistance(longArray47, longArray50);
        long long52 = code.src.Distance.chebyshevDistance(longArray44, longArray50);
        long long53 = code.src.Distance.chebyshevDistance(longArray39, longArray50);
        long[] longArray56 = new long[] { 'a', 1L };
        long[] longArray59 = new long[] { 0, (short) -1 };
        long[] longArray62 = new long[] { (short) -1, (short) -1 };
        long long63 = code.src.Distance.chebyshevDistance(longArray59, longArray62);
        long long64 = code.src.Distance.chebyshevDistance(longArray56, longArray62);
        long long65 = code.src.Distance.chebyshevDistance(longArray50, longArray62);
        long long66 = code.src.Distance.chebyshevDistance(longArray15, longArray62);
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long[] longArray80 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long81 = code.src.Distance.chebyshevDistance(longArray72, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray15, longArray80);
        java.lang.Class<?> wildcardClass83 = longArray80.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 98L + "'", long41 == 98L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 98L + "'", long52 == 98L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 98L + "'", long64 == 98L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 11L + "'", long81 == 11L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 11L + "'", long82 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.7874479094211152E62d, 2.0450959756078844E128d, 7.850374433297587E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long long58 = code.src.Distance.chebyshevDistance(longArray42, longArray49);
        java.lang.Class<?> wildcardClass59 = longArray49.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 98L + "'", long58 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double4 = code.src.Distance.euclideanDistance(5.57426963143218E251d, 8.013384602956264E125d, 8.694706299424537E61d, 7.562667037928565E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double4 = code.src.Distance.squaredDistance(2.133627508430731E128d, 2.554335603593525E128d, 4.70381733357983E251d, 7.474529365309457E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double4 = code.src.Distance.squaredDistance(5.068357262307933E248d, 1.0408126756135268E126d, 3.3301680419024496E128d, 4.518033412506453E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double4 = code.src.Distance.squaredDistance(6.563804083986358E256d, 0.0d, 1.538872884789353E254d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double4 = code.src.Distance.squaredDistance(1.351489046187395E257d, 4.31382490545285E15d, 2.0786247129419894E256d, 5.501575976011727E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double4 = code.src.Distance.squaredDistance(6.307309197813705E251d, 1.1281672401093064E126d, 8.320193827934524E30d, 7.708622247449806E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double4 = code.src.Distance.euclideanDistance(7.850374433297587E251d, 1.2802890271489155E126d, 1.3415037258095196E127d, 4.792979223186968E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double4 = code.src.Distance.euclideanDistance(5.64433727473721E251d, 8.991400839772116E43d, 3.0918445022754607E248d, 2.7464291874496756E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double4 = code.src.Distance.squaredDistance(5.715851632357578E251d, 1.1090019187308395E257d, 1.4223699416343344E126d, 3.053584521181947E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 4.518297579366302E256d, (double) (short) 10, 7.408981413846232E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        double double4 = code.src.Distance.euclideanDistance(1.7683618323195464E53d, (double) 0L, 5.715616324151285E251d, 4.347362196294934E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double4 = code.src.Distance.squaredDistance(8.866895281429006E62d, 3.311955036268193E63d, 3.0005186432380365E128d, 4.629561777660613E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double4 = code.src.Distance.squaredDistance(7.235240391572074E248d, 2.262179825118349E251d, 5.604659899440947E124d, 8.69470629945289E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double4 = code.src.Distance.euclideanDistance(7.850374433297587E251d, 1.2074554820296805E32d, 0.0d, 1.5479045176720047E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double4 = code.src.Distance.euclideanDistance(0.0d, (double) 100.0f, 6.540287573520957E256d, 7.13903985732304E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double4 = code.src.Distance.squaredDistance(3.43763993205585E251d, 6.922562516048925E61d, (double) 33L, 1.602837247029983E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double4 = code.src.Distance.squaredDistance(6.151502905962372E30d, 2.1145949239747002E128d, 2.118121211849783E128d, 1.231235105847726E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.957428463045953E256d + "'", double4 == 8.957428463045953E256d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double4 = code.src.Distance.squaredDistance(4.794956959071923E255d, 7.864154807481348E125d, 9.344073313646239E30d, 2.6012733749140157E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.769446841189903E125d, 1.1438880985737782E248d, 1.4255337706659871E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double4 = code.src.Distance.squaredDistance(1.3415049736556993E127d, 5.763159931203444E251d, 3.4131592097982255E102d, 1.9993186607985635E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double4 = code.src.Distance.euclideanDistance(3.80522029780604E250d, 1.3675232181739833E252d, 2.048095142025898E256d, 7.406698157764146E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double4 = code.src.Distance.squaredDistance(1.511958352664876E124d, 3.583333528970715E250d, 0.0d, 1.4312682764476429E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double4 = code.src.Distance.squaredDistance(3.657106231571092E249d, 5.604659899440947E124d, 1.223220513063486E125d, 3.7454893307807313E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray15, longArray26);
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long long41 = code.src.Distance.chebyshevDistance(longArray15, longArray38);
        long long42 = code.src.Distance.chebyshevDistance(longArray5, longArray38);
        long[] longArray45 = new long[] { 0, (short) -1 };
        long[] longArray48 = new long[] { (short) -1, (short) -1 };
        long long49 = code.src.Distance.chebyshevDistance(longArray45, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray5, longArray45);
        long[] longArray53 = new long[] { 'a', 1L };
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray53, longArray59);
        long[] longArray64 = new long[] { 'a', 1L };
        long[] longArray67 = new long[] { 0, (short) -1 };
        long[] longArray70 = new long[] { (short) -1, (short) -1 };
        long long71 = code.src.Distance.chebyshevDistance(longArray67, longArray70);
        long long72 = code.src.Distance.chebyshevDistance(longArray64, longArray70);
        long long73 = code.src.Distance.chebyshevDistance(longArray59, longArray70);
        long[] longArray76 = new long[] { 'a', 1L };
        long[] longArray79 = new long[] { 0, (short) -1 };
        long[] longArray82 = new long[] { (short) -1, (short) -1 };
        long long83 = code.src.Distance.chebyshevDistance(longArray79, longArray82);
        long long84 = code.src.Distance.chebyshevDistance(longArray76, longArray82);
        long long85 = code.src.Distance.chebyshevDistance(longArray59, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray45, longArray82);
        java.lang.Class<?> wildcardClass87 = longArray45.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 98L + "'", long72 == 98L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double4 = code.src.Distance.squaredDistance(4.840680371280547E123d, 1.429206919930926E126d, 6.922562516048925E61d, 6.120040302792729E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.678439950414687E251d + "'", double4 == 6.678439950414687E251d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double4 = code.src.Distance.euclideanDistance(5.373609040983584E61d, 0.0d, 3.650997547418172E43d, 1.077343123590583E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double4 = code.src.Distance.squaredDistance(7.5597917633235E123d, 8.951751003550235E62d, 2.1256901295443705E128d, 3.8265338665801504E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double4 = code.src.Distance.euclideanDistance(4.181639060777985E256d, 4.5169109784901915E256d, 2.003282354999151E124d, 1.1548101448300805E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double4 = code.src.Distance.squaredDistance(4.877950885822437E248d, 4.182726770879422E256d, 1.1438880985737782E248d, 5.5259489E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double4 = code.src.Distance.euclideanDistance(2.1255797182038412E128d, 1.109007633775659E257d, 4.182726770879422E256d, 1.0693838469587942E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double4 = code.src.Distance.euclideanDistance(4.630067801207703E249d, 0.0d, 5.786405680011157E251d, 2.125614474048533E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double4 = code.src.Distance.euclideanDistance(6.678439950414687E251d, 1.060042331216179E124d, 1.0670318622827465E252d, 7.635389630576875E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double4 = code.src.Distance.euclideanDistance(1.0832910257177886E252d, 6.858438111975517E125d, (double) 3L, 7.5597917633235E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double4 = code.src.Distance.euclideanDistance(3.5776180632559095E250d, 3.0559985941685375E15d, 1.1801491380487327E249d, 2.0698339792640068E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long[] longArray47 = new long[] { 'a', 1L };
        long[] longArray50 = new long[] { 0, (short) -1 };
        long[] longArray53 = new long[] { (short) -1, (short) -1 };
        long long54 = code.src.Distance.chebyshevDistance(longArray50, longArray53);
        long long55 = code.src.Distance.chebyshevDistance(longArray47, longArray53);
        long long56 = code.src.Distance.chebyshevDistance(longArray42, longArray53);
        long[] longArray59 = new long[] { 'a', 1L };
        long[] longArray62 = new long[] { 0, (short) -1 };
        long[] longArray65 = new long[] { (short) -1, (short) -1 };
        long long66 = code.src.Distance.chebyshevDistance(longArray62, longArray65);
        long long67 = code.src.Distance.chebyshevDistance(longArray59, longArray65);
        long long68 = code.src.Distance.chebyshevDistance(longArray53, longArray65);
        long long69 = code.src.Distance.chebyshevDistance(longArray31, longArray65);
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray65);
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long[] longArray84 = new long[] { 'a', 1L };
        long[] longArray87 = new long[] { 0, (short) -1 };
        long[] longArray90 = new long[] { (short) -1, (short) -1 };
        long long91 = code.src.Distance.chebyshevDistance(longArray87, longArray90);
        long long92 = code.src.Distance.chebyshevDistance(longArray84, longArray90);
        long long93 = code.src.Distance.chebyshevDistance(longArray73, longArray90);
        long long94 = code.src.Distance.chebyshevDistance(longArray65, longArray73);
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray73, longArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 98L + "'", long55 == 98L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 98L + "'", long67 == 98L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double4 = code.src.Distance.euclideanDistance(1.0670548273407037E252d, 6.922552879173873E61d, 2.3432193417162093E247d, 1.4105452805706393E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double4 = code.src.Distance.euclideanDistance(7.610605585266955E125d, 2.2194288710556866E124d, 4.654121416639182E124d, 3.194777076918012E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1945631247719256E128d + "'", double4 == 3.1945631247719256E128d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double4 = code.src.Distance.euclideanDistance(3.7142566826117396E249d, 2.0481498109123508E256d, 6.047401286148532E124d, 7.13903985732304E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double4 = code.src.Distance.squaredDistance(4.849373849148842E124d, 0.0d, 7.393563040080829E246d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray19, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray55, longArray66);
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray66, longArray78);
        long[] longArray84 = new long[] { 'a', 1L };
        long[] longArray87 = new long[] { 0, (short) -1 };
        long[] longArray90 = new long[] { (short) -1, (short) -1 };
        long long91 = code.src.Distance.chebyshevDistance(longArray87, longArray90);
        long long92 = code.src.Distance.chebyshevDistance(longArray84, longArray90);
        long long93 = code.src.Distance.chebyshevDistance(longArray66, longArray84);
        long long94 = code.src.Distance.chebyshevDistance(longArray19, longArray66);
        java.lang.Class<?> wildcardClass95 = longArray19.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double4 = code.src.Distance.euclideanDistance(6.520222954978057E248d, 100.0d, 3.4131590244458324E102d, 3.1335859184665276E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double4 = code.src.Distance.euclideanDistance(3.890305409973818E124d, 2.553460170097694E124d, 3.728721449645412E251d, 1.918367176323824E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double4 = code.src.Distance.squaredDistance(1.5617268815501826E62d, 6.520222954978057E248d, 4.080492135606123E124d, 9.79709836214289E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double4 = code.src.Distance.euclideanDistance(3.194777076918012E128d, 3.0568077560623055E15d, 4.172449883594742E250d, 7.592234862162515E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double4 = code.src.Distance.squaredDistance(5.53979513351125E119d, 1.6661357026280876E31d, 0.0d, 7.862188778636408E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.181401239094693E251d + "'", double4 == 6.181401239094693E251d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double4 = code.src.Distance.squaredDistance(7.562667037928565E125d, 1.836507598757228E249d, (double) 100.0f, 5.721223146643194E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double4 = code.src.Distance.euclideanDistance(1.314288479667479E127d, 2.2496883671214544E99d, 1.1294636811790911E99d, 6.151508697220018E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.314288479667479E127d + "'", double4 == 1.314288479667479E127d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double4 = code.src.Distance.squaredDistance(0.0d, 8.790684697775343E244d, 9.747691465716283E251d, 1.511958349599839E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double4 = code.src.Distance.euclideanDistance(1.1918576465896191E249d, 8.084528906135836E87d, 5.714207540805018E247d, 2.884474619048523E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double4 = code.src.Distance.squaredDistance(1.0486765404656112E16d, 8.73117060907958E61d, 5.64433727473721E251d, 7.05498227594466E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        double double4 = code.src.Distance.squaredDistance(8.94428757683438E62d, 8.068127213490246E247d, 8.133851138224599E174d, 7.416985483562336E245d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double4 = code.src.Distance.euclideanDistance(3.0234847996883654E124d, 0.0d, 2.1253025614605642E128d, 6.556084846139649E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1250002129805954E128d + "'", double4 == 2.1250002129805954E128d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double4 = code.src.Distance.squaredDistance(3.006072569932526E128d, 1.0486765404656112E16d, 4.182726770879422E256d, 2.721524969160516E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double4 = code.src.Distance.euclideanDistance(4.48487495250148E256d, 8.811504548015154E125d, 5.71561648966755E251d, 5.603244642552161E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray19, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray55, longArray66);
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray66, longArray78);
        long[] longArray84 = new long[] { 'a', 1L };
        long[] longArray87 = new long[] { 0, (short) -1 };
        long[] longArray90 = new long[] { (short) -1, (short) -1 };
        long long91 = code.src.Distance.chebyshevDistance(longArray87, longArray90);
        long long92 = code.src.Distance.chebyshevDistance(longArray84, longArray90);
        long long93 = code.src.Distance.chebyshevDistance(longArray66, longArray84);
        long long94 = code.src.Distance.chebyshevDistance(longArray19, longArray66);
        java.lang.Class<?> wildcardClass95 = longArray66.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 98L + "'", long92 == 98L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double4 = code.src.Distance.squaredDistance(5.762488506678416E251d, 1.0997224744491414E32d, 3.321083216563934E61d, 8.694706236541855E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 3.577618063209475E250d, 5.715045150548505E247d, 1.4272033862877643E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double4 = code.src.Distance.squaredDistance(2.553460170097694E124d, 1.4390013713198977E128d, 1.024464211209343E25d, 6.182207065542976E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double4 = code.src.Distance.squaredDistance(2.1670752670093316E124d, 0.0d, (double) 100L, 1.2637714837637312E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5971230593895956E254d + "'", double4 == 1.5971230593895956E254d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double4 = code.src.Distance.euclideanDistance(3.6510102203732055E43d, 3.890146281899556E124d, 7.559791732674063E123d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.962920968804578E124d + "'", double4 == 3.962920968804578E124d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double4 = code.src.Distance.squaredDistance(1.5119583526749173E124d, 4.840680371280547E123d, 4.484875220721362E256d, 5.525939237192507E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double4 = code.src.Distance.squaredDistance(2.0483124887933698E256d, 1.9660977441160548E252d, 1.2296171124372597E62d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double4 = code.src.Distance.euclideanDistance(5.71504515055861E247d, 0.0d, 7.560261194608789E125d, 1.9395881659392382E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 0, (short) -1 };
        long[] longArray63 = new long[] { (short) -1, (short) -1 };
        long long64 = code.src.Distance.chebyshevDistance(longArray60, longArray63);
        long long65 = code.src.Distance.chebyshevDistance(longArray55, longArray63);
        long long66 = code.src.Distance.chebyshevDistance(longArray42, longArray63);
        java.lang.Class<?> wildcardClass67 = longArray63.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double4 = code.src.Distance.squaredDistance(3.194965507832467E124d, 0.0d, 2.0424280514670966E256d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double4 = code.src.Distance.squaredDistance(7.559791732623792E123d, 7.76081660665762E125d, 4.557896970053384E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double4 = code.src.Distance.euclideanDistance(2.262179825118349E251d, 2.044869176291111E128d, 3.746054054544959E251d, 1.0779309106645648E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double4 = code.src.Distance.squaredDistance(5.811870955696386E120d, 8.694706299423517E61d, 0.0d, 5.52593680000932E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.377784400566722E241d + "'", double4 == 3.377784400566722E241d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double4 = code.src.Distance.euclideanDistance(1.3443741988905585E127d, 1.3415037258095196E127d, 7.849802928787181E251d, 4.5169109784901915E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long long23 = code.src.Distance.chebyshevDistance(longArray9, longArray20);
        long[] longArray26 = new long[] { 'a', 1L };
        long[] longArray29 = new long[] { 0, (short) -1 };
        long[] longArray32 = new long[] { (short) -1, (short) -1 };
        long long33 = code.src.Distance.chebyshevDistance(longArray29, longArray32);
        long long34 = code.src.Distance.chebyshevDistance(longArray26, longArray32);
        long long35 = code.src.Distance.chebyshevDistance(longArray20, longArray32);
        long[] longArray38 = new long[] { 0, (short) -1 };
        long[] longArray41 = new long[] { (short) -1, (short) -1 };
        long long42 = code.src.Distance.chebyshevDistance(longArray38, longArray41);
        long[] longArray49 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long50 = code.src.Distance.chebyshevDistance(longArray41, longArray49);
        long[] longArray53 = new long[] { 'a', 1L };
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray53, longArray59);
        long[] longArray64 = new long[] { 'a', 1L };
        long[] longArray67 = new long[] { 0, (short) -1 };
        long[] longArray70 = new long[] { (short) -1, (short) -1 };
        long long71 = code.src.Distance.chebyshevDistance(longArray67, longArray70);
        long long72 = code.src.Distance.chebyshevDistance(longArray64, longArray70);
        long long73 = code.src.Distance.chebyshevDistance(longArray59, longArray70);
        long long74 = code.src.Distance.chebyshevDistance(longArray41, longArray59);
        long long75 = code.src.Distance.chebyshevDistance(longArray20, longArray59);
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray59, longArray78);
        long[] longArray86 = new long[] { 'a', 1L };
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray86, longArray92);
        long long95 = code.src.Distance.chebyshevDistance(longArray78, longArray86);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 98L + "'", long34 == 98L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 11L + "'", long50 == 11L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 98L + "'", long72 == 98L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 97L + "'", long95 == 97L);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double4 = code.src.Distance.euclideanDistance(3.4806291687247766E248d, 1.8663667958684514E31d, (double) '#', 4.3184582665404395E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double4 = code.src.Distance.euclideanDistance(1.0486765404643798E16d, 2.1167681432297242E128d, 16122.636173942763d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1167681432297242E128d + "'", double4 == 2.1167681432297242E128d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double4 = code.src.Distance.squaredDistance(1.314288479667479E127d, 2.4389863314950092E124d, 0.0d, 4.1811108493051547E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double4 = code.src.Distance.squaredDistance(3.5776180632559095E250d, 3.746054054544959E251d, 5.492742669460755E251d, 4.4965798094968406E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double4 = code.src.Distance.euclideanDistance((double) (-1L), 1.2296171124372597E62d, 1.891459241752112E125d, 7.559791732623814E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.892969389164426E125d + "'", double4 == 1.892969389164426E125d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double4 = code.src.Distance.euclideanDistance(2.0786247129419894E256d, 8.694706173607399E62d, 5.463413916504991E251d, 2.010262836799118E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double4 = code.src.Distance.squaredDistance(3.3662285038614664E124d, 1.333420484783642E125d, 8.866898431036233E62d, 2.5538701944624236E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.51544409582312E256d + "'", double4 == 6.51544409582312E256d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double4 = code.src.Distance.euclideanDistance(1.2094207749824497E64d, 8.694706299452896E61d, 7.865071652244784E247d, 3.80522029780604E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double4 = code.src.Distance.squaredDistance(1.3186892203577162E31d, 5.72017387759611E251d, 1.0214528145753511E257d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double4 = code.src.Distance.euclideanDistance(1.097417397239037E249d, 6.53596076341459E175d, 2.0480917725743317E256d, 8.341162879156251E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double4 = code.src.Distance.squaredDistance(2.244898434111624E124d, 7.559791544504537E125d, 9922.0d, 3.353869565834853E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.720084388615706E251d + "'", double4 == 5.720084388615706E251d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long long22 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        long[] longArray25 = new long[] { 'a', 1L };
        long[] longArray28 = new long[] { 0, (short) -1 };
        long[] longArray31 = new long[] { (short) -1, (short) -1 };
        long long32 = code.src.Distance.chebyshevDistance(longArray28, longArray31);
        long long33 = code.src.Distance.chebyshevDistance(longArray25, longArray31);
        long long34 = code.src.Distance.chebyshevDistance(longArray8, longArray31);
        long[] longArray37 = new long[] { 0, (short) -1 };
        long[] longArray40 = new long[] { (short) -1, (short) -1 };
        long long41 = code.src.Distance.chebyshevDistance(longArray37, longArray40);
        long[] longArray48 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long49 = code.src.Distance.chebyshevDistance(longArray40, longArray48);
        long[] longArray52 = new long[] { 'a', 1L };
        long[] longArray55 = new long[] { 0, (short) -1 };
        long[] longArray58 = new long[] { (short) -1, (short) -1 };
        long long59 = code.src.Distance.chebyshevDistance(longArray55, longArray58);
        long long60 = code.src.Distance.chebyshevDistance(longArray52, longArray58);
        long[] longArray63 = new long[] { 'a', 1L };
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long long71 = code.src.Distance.chebyshevDistance(longArray63, longArray69);
        long long72 = code.src.Distance.chebyshevDistance(longArray58, longArray69);
        long long73 = code.src.Distance.chebyshevDistance(longArray40, longArray58);
        long[] longArray76 = new long[] { 'a', 1L };
        long[] longArray79 = new long[] { 0, (short) -1 };
        long[] longArray82 = new long[] { (short) -1, (short) -1 };
        long long83 = code.src.Distance.chebyshevDistance(longArray79, longArray82);
        long long84 = code.src.Distance.chebyshevDistance(longArray76, longArray82);
        long long85 = code.src.Distance.chebyshevDistance(longArray40, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray8, longArray40);
        java.lang.Class<?> wildcardClass87 = longArray8.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11L + "'", long49 == 11L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 98L + "'", long60 == 98L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 98L + "'", long71 == 98L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double4 = code.src.Distance.euclideanDistance(7.1990513445280965E124d, (double) 100L, 8.866898431036233E62d, 4.080492135606123E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.27506835801948E124d + "'", double4 == 8.27506835801948E124d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray55, longArray66);
        long long70 = code.src.Distance.chebyshevDistance(longArray8, longArray66);
        long[] longArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray66, longArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double4 = code.src.Distance.euclideanDistance(7.559943432502878E125d, (double) 100, 5.869204465969338E247d, 3.0559985941685375E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.0539425682826672E256d, 1.4292308816699378E126d, 1.4255337706659871E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452407E61d, 8.694706299424537E61d, 1.4214639124928905E128d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4214639124928905E128d + "'", double4 == 1.4214639124928905E128d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double4 = code.src.Distance.euclideanDistance(1.7273558189764936E254d, 4.085911751455954E251d, 1811672.00533166d, 1.1341134428019932E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double4 = code.src.Distance.squaredDistance(7.850374433297587E251d, 7.590793803572108E125d, 9.951221440466418E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double4 = code.src.Distance.euclideanDistance(2.0317618246658705E256d, 8.991400839772116E43d, 0.0d, 5.715045150481366E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double4 = code.src.Distance.euclideanDistance(4.4848752944105095E256d, 5.715851632357578E251d, 5.791260371133755E24d, 4.1996701178995654E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double4 = code.src.Distance.squaredDistance(1.177837421097331E252d, 2.7464291874496756E125d, 4.2522853448307394E125d, 1.380250332732779E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double4 = code.src.Distance.euclideanDistance(99.41369581878968d, 1.4319457653113712E123d, 0.0d, 3.4806291687247766E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double4 = code.src.Distance.squaredDistance(1.7273558189764936E254d, 7.876508236289523E125d, 20084.432052190223d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double4 = code.src.Distance.euclideanDistance(3.746054054544959E251d, 7.408981413846232E125d, 6.117725723239335E125d, 5.527131720196977E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double4 = code.src.Distance.euclideanDistance(4.1811108493051547E256d, 99.41369581878968d, 2.125614474048533E128d, 8.694706299424537E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double4 = code.src.Distance.squaredDistance(3.321083216563934E61d, 1.131035907806524E126d, 1.1918576465896191E249d, 2.0535093708374117E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double4 = code.src.Distance.squaredDistance(20084.432052190223d, 2.0481498109123508E256d, 8.694705670080019E61d, 1.4561688805466475E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double4 = code.src.Distance.squaredDistance(0.0d, 5.715045150484065E247d, 2.3432193630265306E247d, 5.609603932884302E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double4 = code.src.Distance.euclideanDistance(4.765564004129822E124d, 4.182726770879422E256d, 1.887468026859852E249d, 3.119392465129366E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double4 = code.src.Distance.euclideanDistance(2.8519907324927616E87d, 0.0d, 3.0234847996883654E124d, 1.45794860122975E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0234847996883654E124d + "'", double4 == 3.0234847996883654E124d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double4 = code.src.Distance.euclideanDistance(5.028472419203864E255d, 4.484875220721362E256d, 3.596149286247409E250d, 2.0698339792640068E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double4 = code.src.Distance.euclideanDistance(1.209452028348699E64d, 1.3415036402150548E127d, 4.1824175494475645E256d, 100.40866620345955d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        double double4 = code.src.Distance.squaredDistance(3.746054054544959E251d, 2.2964930079195337E247d, 7.562667037928565E125d, 6.51544409582312E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double4 = code.src.Distance.euclideanDistance(3.053611124543097E15d, 1.4863323052241262E252d, 0.0d, 1.2036924699110032E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double4 = code.src.Distance.euclideanDistance(1.2296171569516298E62d, 3.3993126052584937E124d, 5.715851632357578E251d, 6.182207065542976E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double4 = code.src.Distance.euclideanDistance(3.000518651053434E128d, 4.476410859359017E256d, 2.244898434111624E124d, 12329.400413486055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double4 = code.src.Distance.euclideanDistance(4.64617159966005E124d, 2.60716228554408E250d, 9.374059300997487E248d, 9.324540890466497E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double4 = code.src.Distance.squaredDistance(7.393562733187527E246d, 2.0424280514670966E256d, 5.719666280792153E251d, 2.2710600277457865E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double4 = code.src.Distance.euclideanDistance(7.982252697215275E251d, 2.1586910533487628E249d, 1.102865396833695E32d, 5.394413031427706E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        double double4 = code.src.Distance.squaredDistance(2.296505818800933E247d, 5.719393272657122E251d, 1.956152822910355E125d, 3.053533391929702E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double4 = code.src.Distance.euclideanDistance(2.285850535203458E248d, 2.0530721058298435E256d, 7.849802928787181E251d, 2.251301237575268E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double4 = code.src.Distance.euclideanDistance(1.4253988300352539E128d, 1.5988706255405772E125d, 1.74402177078084E62d, 9.00164862028326E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double4 = code.src.Distance.squaredDistance(3.1404935889650543E122d, 5.8330261552214634E125d, 1.143009020812949E248d, 3.0568118497974055E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double4 = code.src.Distance.squaredDistance(1.6830116762241088E124d, 7.849802928787181E251d, 1.0691160040444007E124d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double4 = code.src.Distance.euclideanDistance(2.7234837376481807E125d, 1.2018396007595654E126d, 6.001964575767696E256d, 6.556084846279365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double4 = code.src.Distance.squaredDistance(5.715465761239799E247d, 8.779875994255162E124d, 1811717.0d, 7.56145520935968E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double4 = code.src.Distance.squaredDistance(2.261894190902627E124d, 7.05498227594466E127d, 4.298224851119434E25d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.977278003005864E255d + "'", double4 == 4.977278003005864E255d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double4 = code.src.Distance.squaredDistance(4.48487495250148E256d, 1.4393703580922914E128d, 2.125614532971372E128d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double4 = code.src.Distance.squaredDistance(6.678439950414687E251d, 2.2965057957235622E247d, 4.753127358123107E124d, 4.302581716460107E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double4 = code.src.Distance.euclideanDistance(1.0997224744491414E32d, 9.324535099190634E30d, 5.609603932884302E251d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double4 = code.src.Distance.squaredDistance(1.203713755180189E124d, 3.0059284446479725E128d, 7.366529754618401E123d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.035605816525238E256d + "'", double4 == 9.035605816525238E256d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double4 = code.src.Distance.euclideanDistance(8.745511426145833E61d, 4.92586451367552E248d, 1.7307558713743367E254d, 9.324546092905923E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        double double4 = code.src.Distance.euclideanDistance(2.12373890011799E128d, 4.182726770879422E256d, 8.694715983872712E61d, 1.1341134428019932E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double4 = code.src.Distance.squaredDistance(12313.553084145538d, 0.0d, 3.772588879245304E249d, 1.069116001870466E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double4 = code.src.Distance.euclideanDistance(9.324540890451003E30d, 5.525939237192507E7d, 3.681736809627178E250d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        double double4 = code.src.Distance.squaredDistance(1346.0d, 0.0d, 2.0480917725743317E256d, 1.3675232181739833E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double4 = code.src.Distance.euclideanDistance(1.5617254340933177E62d, 3.477882519775504E62d, 1552637.0032203277d, 4.689593133831153E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double4 = code.src.Distance.euclideanDistance(12329.400413486055d, 8.42249655260944E125d, 1.5617254340933177E62d, 9.466542772834739E21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.42249655260944E125d + "'", double4 == 8.42249655260944E125d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double4 = code.src.Distance.squaredDistance(6.53596076341459E175d, 2.5156683110561225E248d, 5.527131618909466E7d, 8.084528906135836E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double4 = code.src.Distance.euclideanDistance((double) 97L, 8.694706299426858E61d, 1.7388170690697642E62d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double4 = code.src.Distance.squaredDistance(4.5185660549137277E256d, 1.1958657793748695E32d, 7.708622247449806E249d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double4 = code.src.Distance.euclideanDistance(5.280231960268402E251d, 6.924240949293447E125d, 7.862701231474445E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double4 = code.src.Distance.squaredDistance(3.477882519775504E62d, 1.695194259018638E248d, 1.6527387211967322E125d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double4 = code.src.Distance.euclideanDistance(2.0454154726104665E128d, 4.977278003005864E255d, 0.0d, 5.715044985152495E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double4 = code.src.Distance.euclideanDistance(7.732944131972951E127d, 7.821589175633897E62d, 7.661073336008042E123d, 4.1829248331382305E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double4 = code.src.Distance.euclideanDistance(5.57426963143218E251d, 1.2346234984976643E249d, (double) 33L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double4 = code.src.Distance.squaredDistance(7.559791763367894E123d, 0.0d, 2.1177523428484083E128d, 6.421433566443406E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double4 = code.src.Distance.squaredDistance(4.262266330560975E124d, 0.0d, 1.109007633775659E257d, 3.053611124550097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        double double4 = code.src.Distance.squaredDistance(4.31382490545285E15d, 1.4300949526255977E64d, 3.7426568024784246E251d, 2.334819913507481E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double4 = code.src.Distance.euclideanDistance(1.1929678955220982E32d, 4.630067801207703E249d, 2.0424280514670966E256d, 5.999148008594126E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double4 = code.src.Distance.euclideanDistance(9.324540890452801E30d, 1.082419432581764E249d, 2.108919516827715E128d, 4.5182354114743835E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double4 = code.src.Distance.euclideanDistance(12313.553084145538d, 1.4510644048118655E256d, 6.047401286148532E124d, 1.4331582268127545E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double4 = code.src.Distance.euclideanDistance(4.717807507424959E124d, 5.64433727473721E251d, 5.715616324151285E251d, 6.106325777130968E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double4 = code.src.Distance.squaredDistance(99.41369581878968d, 5.786405680011157E251d, 5.865141437237654E125d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double4 = code.src.Distance.squaredDistance(8.320188026225052E30d, 1.0922306970231484E16d, 12313.549023578462d, 6.518731715344327E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double4 = code.src.Distance.euclideanDistance(3.559657110785834E251d, 1.333420484783642E125d, 6.520158840275344E248d, 8.030925665076586E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double4 = code.src.Distance.euclideanDistance(1.5617254340933177E62d, 7.559791763323488E123d, 3.1962305404177685E128d, 1.0807149657353284E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1962305413117977E128d + "'", double4 == 3.1962305413117977E128d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double4 = code.src.Distance.euclideanDistance(2.2710600277457865E249d, 0.0d, 5.763138746578841E251d, 3.4290270810282753E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double4 = code.src.Distance.euclideanDistance(6.563804083986358E256d, 1.4579486012297467E64d, 5.715045150481383E247d, 1.0214528145753511E257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.0807149657353284E16d, 1.7583641551952374E124d, 1.515939885871861E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double4 = code.src.Distance.euclideanDistance(10205.0d, 2.9064639308329233E248d, 3.0366107867949796E124d, 2.406501954865E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double4 = code.src.Distance.euclideanDistance(2.7234837376481807E125d, 1.2094520283486993E64d, 0.0d, 1.265274418961214E198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double4 = code.src.Distance.squaredDistance(1.5479045176720047E126d, 4.5185585268423626E256d, 8.067055176895368E247d, 1.511958349599839E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        long[] longArray14 = new long[] { 'a', 1L };
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long long22 = code.src.Distance.chebyshevDistance(longArray14, longArray20);
        long long23 = code.src.Distance.chebyshevDistance(longArray9, longArray20);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = code.src.Distance.chebyshevDistance(longArray0, longArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 98L + "'", long22 == 98L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double4 = code.src.Distance.squaredDistance(6.51544409582312E256d, 1346.0d, 5.728851506743641E251d, 2.05329249062104E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double4 = code.src.Distance.squaredDistance(4.518236951771165E256d, 1.4579746669762032E64d, 2.0234598189585263E246d, 2.8325283023066844E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double4 = code.src.Distance.euclideanDistance(8.982275443054642E123d, 6.013009312291666E125d, 2.0850307160336277E31d, 1.4393703580922914E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4333573515944157E128d + "'", double4 == 1.4333573515944157E128d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double4 = code.src.Distance.squaredDistance(1.4292308816699378E126d, 8.841771681470747E249d, 6.307309197813705E251d, 1.864891897920854E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double4 = code.src.Distance.squaredDistance(8.694705670079996E61d, 5.78903989294274E251d, 1.2296178404951322E62d, 5.722457520259434E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double4 = code.src.Distance.euclideanDistance(8.899687221465109E59d, 5.9798424948214894E255d, 2.031028428232339E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double4 = code.src.Distance.euclideanDistance(99.41369581878968d, 7.590729215407016E125d, 1.4393703580922914E128d, 2.5573985948136816E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.9280210346275794E128d + "'", double4 == 2.9280210346275794E128d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double4 = code.src.Distance.euclideanDistance(4.979659311150055E251d, 5.492742669460755E251d, 6.556084846280365E12d, 5.492742669460755E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double4 = code.src.Distance.squaredDistance(12313.553084145538d, 101.0d, 3.54371002001072E251d, 3.119392465129366E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.2046853507841718E252d, 1.0852821850087336E126d, 2.7464291874496756E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double4 = code.src.Distance.squaredDistance(8.068127213490246E247d, 7.559791732623792E123d, 0.0d, 4.654121416639182E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.715043495807318E247d, 1552637.0d, 6.192735015311481E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double4 = code.src.Distance.squaredDistance(1.891459241764387E125d, 2.125614532971372E128d, 1.2126872764393267E249d, 3.0568118497973945E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double4 = code.src.Distance.euclideanDistance(1346.0d, 1.1548101448300805E124d, 1124.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1548101448300805E124d + "'", double4 == 1.1548101448300805E124d);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double4 = code.src.Distance.euclideanDistance(1.6830116762241088E124d, 2.406503766681E12d, 3.0239723409974164E124d, 1.143009030111722E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 'a', 1L };
        long[] longArray12 = new long[] { 0, (short) -1 };
        long[] longArray15 = new long[] { (short) -1, (short) -1 };
        long long16 = code.src.Distance.chebyshevDistance(longArray12, longArray15);
        long long17 = code.src.Distance.chebyshevDistance(longArray9, longArray15);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long long29 = code.src.Distance.chebyshevDistance(longArray15, longArray26);
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long long41 = code.src.Distance.chebyshevDistance(longArray15, longArray38);
        long long42 = code.src.Distance.chebyshevDistance(longArray5, longArray38);
        long[] longArray45 = new long[] { 0, (short) -1 };
        long[] longArray48 = new long[] { (short) -1, (short) -1 };
        long long49 = code.src.Distance.chebyshevDistance(longArray45, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray5, longArray45);
        long[] longArray53 = new long[] { 0, (short) -1 };
        long[] longArray56 = new long[] { (short) -1, (short) -1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray53, longArray56);
        long[] longArray64 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long65 = code.src.Distance.chebyshevDistance(longArray56, longArray64);
        long[] longArray68 = new long[] { 0, (short) -1 };
        long[] longArray71 = new long[] { (short) -1, (short) -1 };
        long long72 = code.src.Distance.chebyshevDistance(longArray68, longArray71);
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray71, longArray75);
        long long81 = code.src.Distance.chebyshevDistance(longArray64, longArray71);
        long long82 = code.src.Distance.chebyshevDistance(longArray5, longArray71);
        long[] longArray85 = new long[] { 0, (short) -1 };
        long[] longArray88 = new long[] { (short) -1, (short) -1 };
        long long89 = code.src.Distance.chebyshevDistance(longArray85, longArray88);
        long[] longArray96 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long97 = code.src.Distance.chebyshevDistance(longArray88, longArray96);
        long long98 = code.src.Distance.chebyshevDistance(longArray71, longArray88);
        java.lang.Class<?> wildcardClass99 = longArray88.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 11L + "'", long65 == 11L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 11L + "'", long81 == 11L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 1L + "'", long89 == 1L);
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double4 = code.src.Distance.euclideanDistance(1.6830116762241088E124d, 4.840681090214691E123d, 1.1294636811790911E99d, 2.3432193417162093E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double4 = code.src.Distance.euclideanDistance(1.2606142663028386E127d, 1.4331582268127545E128d, 7.814857737225062E7d, 2.010262836799118E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double4 = code.src.Distance.squaredDistance(8.73117060907958E61d, 3.000518651053434E128d, 2.406501954865E12d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.003112175319519E256d + "'", double4 == 9.003112175319519E256d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.821589175633897E62d, 2.12373890011799E128d, 1.2606142663028386E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1274770032031917E128d + "'", double4 == 2.1274770032031917E128d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double4 = code.src.Distance.squaredDistance(2.1177523428484083E128d, 1811707.0012909174d, 2.0450959756078844E128d, 1.5988706255405772E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.281504087867087E253d + "'", double4 == 5.281504087867087E253d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double4 = code.src.Distance.squaredDistance(1.6527387211967322E125d, 4.3184582665404395E15d, 3.424182432006193E63d, 20737.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7315452805430098E250d + "'", double4 == 2.7315452805430098E250d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double4 = code.src.Distance.euclideanDistance(1.0486765404643798E16d, 2.8519907324927616E87d, 1.0251810742299723E249d, 1.1090019187308395E257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double4 = code.src.Distance.euclideanDistance(9.324546092905923E30d, 9.789473776466673E251d, 5.280231960268402E251d, 2.9106355825640894E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double4 = code.src.Distance.squaredDistance(6.063099723657831E251d, 2.1253025614605642E128d, 1.5665408678303301E62d, 8.991400839772116E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double4 = code.src.Distance.euclideanDistance(1.2093895208085425E64d, 1.0807149657353284E16d, 8.319893191678016E125d, 1.1236897439702315E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double4 = code.src.Distance.squaredDistance(2.6593879130842587E124d, 7.559791763329331E123d, 3.353869565834853E49d, 1346.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.643848587307668E248d + "'", double4 == 7.643848587307668E248d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double4 = code.src.Distance.squaredDistance(10.04987562112089d, 5.262553411785863E62d, 6.192735015311481E251d, 2.2496883671214544E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double4 = code.src.Distance.squaredDistance(9.324540890451006E30d, 1.3335864706024715E248d, 9.095699028095402E123d, 3.0234847996883654E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double4 = code.src.Distance.squaredDistance(1.956152822910355E125d, (double) (short) -1, 5.431528668105863E251d, 1.5338908798484704E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double4 = code.src.Distance.squaredDistance(5.715465761239799E247d, 7.559791732623814E123d, 2.406503766581682E12d, 7.365251658636869E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double4 = code.src.Distance.squaredDistance(3.890305409973818E124d, 8.69470629942351E61d, 3.631389561388303E250d, 1.449255956357967E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double4 = code.src.Distance.euclideanDistance((double) 10L, 1.515435523161302E124d, 5.714644157457502E251d, 8.957428463045953E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double4 = code.src.Distance.euclideanDistance(7.568917694587279E125d, 3.1962305413117977E128d, 3.0536111245430885E15d, 4.7921872029386884E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1961915814487598E128d + "'", double4 == 3.1961915814487598E128d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double4 = code.src.Distance.euclideanDistance(2.0536526763911784E256d, 2.562003512797882E128d, 3.053611124550097E15d, 1.4291186487223539E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double4 = code.src.Distance.squaredDistance(1.5665408678303301E62d, 0.0d, 5.116365001163083E256d, 3.053611124543088E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double4 = code.src.Distance.euclideanDistance(16122.636173942763d, 7.559791732623826E123d, 7.590793803572108E125d, 6.087679543111817E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double4 = code.src.Distance.squaredDistance(9.00164862028326E256d, 2.1670752670093316E124d, 7.520013101166239E250d, 1.3335864706024715E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double4 = code.src.Distance.euclideanDistance(6.922562516048925E61d, 7.786590871947086E125d, 2.1179790857622837E128d, 1.2400472875600966E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.117992946860976E128d + "'", double4 == 2.117992946860976E128d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        long[] longArray13 = new long[] { 0, (short) -1 };
        long[] longArray16 = new long[] { (short) -1, (short) -1 };
        long long17 = code.src.Distance.chebyshevDistance(longArray13, longArray16);
        long[] longArray20 = new long[] { 'a', 1L };
        long[] longArray23 = new long[] { 0, (short) -1 };
        long[] longArray26 = new long[] { (short) -1, (short) -1 };
        long long27 = code.src.Distance.chebyshevDistance(longArray23, longArray26);
        long long28 = code.src.Distance.chebyshevDistance(longArray20, longArray26);
        long[] longArray31 = new long[] { 'a', 1L };
        long[] longArray34 = new long[] { 0, (short) -1 };
        long[] longArray37 = new long[] { (short) -1, (short) -1 };
        long long38 = code.src.Distance.chebyshevDistance(longArray34, longArray37);
        long long39 = code.src.Distance.chebyshevDistance(longArray31, longArray37);
        long long40 = code.src.Distance.chebyshevDistance(longArray26, longArray37);
        long long41 = code.src.Distance.chebyshevDistance(longArray16, longArray26);
        long long42 = code.src.Distance.chebyshevDistance(longArray5, longArray16);
        java.lang.Class<?> wildcardClass43 = longArray16.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 98L + "'", long39 == 98L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double4 = code.src.Distance.squaredDistance(9.324540890466497E30d, 7.416985483562336E245d, 2.1254910133153752E128d, 1.024464211209343E25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double4 = code.src.Distance.squaredDistance(4.182530750552227E256d, 6.535960763430168E175d, 2.0452199803289235E128d, 1.3186892203577162E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double4 = code.src.Distance.euclideanDistance(5.715045150484065E247d, 8.69470629942351E61d, 3.353869565834853E49d, 5.609603932884302E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double4 = code.src.Distance.squaredDistance(2.262179825118349E251d, 1.1503513373584828E252d, 2.035085750794639E128d, 1.102865396833695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double4 = code.src.Distance.squaredDistance(9.00164862028326E256d, 1.0486765404643746E16d, 7.708622247449806E249d, 4.471374129726301E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double4 = code.src.Distance.squaredDistance(1.4223699416343344E126d, 2.671898174954098E125d, 1.2036924699110032E126d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.192102352125387E251d + "'", double4 == 1.192102352125387E251d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double4 = code.src.Distance.euclideanDistance(12313.553084145538d, 5.791260282386601E24d, 3.005852287273883E128d, 4.471374129726301E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.005852287273883E128d + "'", double4 == 3.005852287273883E128d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double4 = code.src.Distance.squaredDistance(7.592234862162515E125d, 1.5617254340936532E62d, 0.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.764203020223586E251d + "'", double4 == 5.764203020223586E251d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double4 = code.src.Distance.squaredDistance(6.923434529559351E123d, 1.239466100464527E124d, (double) 1.0f, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.529658328435227E251d + "'", double4 == 5.529658328435227E251d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double4 = code.src.Distance.squaredDistance(8.745511426145833E61d, 2.0504686747931686E246d, 7.559791763374587E123d, 7.561664719340081E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double4 = code.src.Distance.euclideanDistance(5.6508057255525505E124d, 1.5665408678303301E62d, 1225.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.6508057255525505E124d + "'", double4 == 5.6508057255525505E124d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double4 = code.src.Distance.squaredDistance(2.125628747841743E128d, 4.1827840536706536E256d, 9.012004300008916E249d, 1.1548101448300805E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double4 = code.src.Distance.euclideanDistance(2.5619166543842657E128d, 2.285850535203458E248d, 4.5185660549137277E256d, 2.3432193630265306E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 'a', 1L };
        long[] longArray16 = new long[] { 0, (short) -1 };
        long[] longArray19 = new long[] { (short) -1, (short) -1 };
        long long20 = code.src.Distance.chebyshevDistance(longArray16, longArray19);
        long long21 = code.src.Distance.chebyshevDistance(longArray13, longArray19);
        long[] longArray24 = new long[] { 'a', 1L };
        long[] longArray27 = new long[] { 0, (short) -1 };
        long[] longArray30 = new long[] { (short) -1, (short) -1 };
        long long31 = code.src.Distance.chebyshevDistance(longArray27, longArray30);
        long long32 = code.src.Distance.chebyshevDistance(longArray24, longArray30);
        long long33 = code.src.Distance.chebyshevDistance(longArray19, longArray30);
        long[] longArray36 = new long[] { 'a', 1L };
        long[] longArray39 = new long[] { 0, (short) -1 };
        long[] longArray42 = new long[] { (short) -1, (short) -1 };
        long long43 = code.src.Distance.chebyshevDistance(longArray39, longArray42);
        long long44 = code.src.Distance.chebyshevDistance(longArray36, longArray42);
        long long45 = code.src.Distance.chebyshevDistance(longArray30, longArray42);
        long long46 = code.src.Distance.chebyshevDistance(longArray2, longArray42);
        long[] longArray49 = new long[] { 'a', 1L };
        long[] longArray52 = new long[] { 0, (short) -1 };
        long[] longArray55 = new long[] { (short) -1, (short) -1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray52, longArray55);
        long long57 = code.src.Distance.chebyshevDistance(longArray49, longArray55);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long[] longArray71 = new long[] { 'a', 1L };
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray71, longArray77);
        long long80 = code.src.Distance.chebyshevDistance(longArray66, longArray77);
        long[] longArray83 = new long[] { 'a', 1L };
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray83, longArray89);
        long long92 = code.src.Distance.chebyshevDistance(longArray66, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray49, longArray66);
        long long94 = code.src.Distance.chebyshevDistance(longArray2, longArray66);
        java.lang.Class<?> wildcardClass95 = longArray66.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 98L + "'", long32 == 98L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 98L + "'", long44 == 98L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 98L + "'", long68 == 98L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 98L + "'", long79 == 98L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double4 = code.src.Distance.squaredDistance(3.3301680419024496E128d, 1.4579486012297467E64d, 7.235240391572074E248d, 1.4331582268127545E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }
}

