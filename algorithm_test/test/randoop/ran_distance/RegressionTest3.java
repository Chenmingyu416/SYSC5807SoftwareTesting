import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        long[] longArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray19, longArray71);
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
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        double double4 = code.src.Distance.euclideanDistance((double) 1, 4.675240277191704E248d, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double double4 = code.src.Distance.euclideanDistance(9.324540562451319E30d, 3.056811849797306E15d, 5.71504510406472E247d, 2.8519907324927616E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        double double4 = code.src.Distance.squaredDistance(7.559791732617994E123d, 1.433007028500352E128d, 1.0807149657353284E16d, 1.039575455679478E8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.053509149446454E256d + "'", double4 == 2.053509149446454E256d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        double double4 = code.src.Distance.euclideanDistance(7.393562733187527E246d, 2.0850307160336277E31d, 1552637.0032203277d, 1.2496907143570294E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray70, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray45, longArray70);
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray45, longArray92);
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray92, longArray95);
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
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double double4 = code.src.Distance.euclideanDistance(1.433007028500352E128d, 1.8648415840790313E31d, 5.715044819684806E251d, 3.053611124543097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double double4 = code.src.Distance.euclideanDistance(3.353869668626517E49d, 0.0d, 3.05361112455053E15d, 100.40866620345955d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.353869668626517E49d + "'", double4 == 3.353869668626517E49d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray19, longArray37);
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
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray55);
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
        long long94 = code.src.Distance.chebyshevDistance(longArray19, longArray90);
        java.lang.Class<?> wildcardClass95 = longArray90.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
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
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double double4 = code.src.Distance.euclideanDistance(1.1548101448300805E124d, 1.0691159266556964E124d, 5.525928500007007E7d, 12329.400413486055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5737202213962112E124d + "'", double4 == 1.5737202213962112E124d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double4 = code.src.Distance.euclideanDistance(1.1548101448300805E124d, 6.17830490479184E248d, 5.53979513351125E119d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double4 = code.src.Distance.euclideanDistance(8.859911358917301E125d, 1.2094207749824497E64d, 1552636.4832506673d, 3.0535834157458975E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.859911358917301E125d + "'", double4 == 8.859911358917301E125d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double4 = code.src.Distance.squaredDistance((double) '#', 3.4131590244458324E102d, 2.719110673110582E123d, 3.3127290822508215E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1048109600916608E249d + "'", double4 == 1.1048109600916608E249d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        double double4 = code.src.Distance.squaredDistance(1.433007028500352E128d, 2.4065001431929946E12d, 1.143009030111722E248d, 1.2296171124372597E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        long[] longArray37 = new long[] { 0, (short) -1 };
        long[] longArray40 = new long[] { (short) -1, (short) -1 };
        long long41 = code.src.Distance.chebyshevDistance(longArray37, longArray40);
        long[] longArray48 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long49 = code.src.Distance.chebyshevDistance(longArray40, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray19, longArray48);
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
        long long86 = code.src.Distance.chebyshevDistance(longArray48, longArray59);
        long[] longArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray48, longArray87);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11L + "'", long49 == 11L);
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
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11L + "'", long86 == 11L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        double double4 = code.src.Distance.squaredDistance(5.786405680011157E251d, 5.721223146643194E251d, 2.948678716579241E31d, 9.862699982330608E244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        double double4 = code.src.Distance.squaredDistance(5.791260371133832E24d, 9.344073313646239E30d, 0.0d, 8.620276499386763E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.43091669258797E123d + "'", double4 == 7.43091669258797E123d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double double4 = code.src.Distance.euclideanDistance(8.976783674294438E123d, 8.694715983872712E61d, 9.351743906023566E30d, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.849373849148842E124d + "'", double4 == 4.849373849148842E124d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        double double4 = code.src.Distance.squaredDistance(4.630067801207703E249d, 4.1827267651555864E256d, 1.5119582431985447E124d, 6.556084846279365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double double4 = code.src.Distance.euclideanDistance(5.791260381620597E24d, 7433.0d, 8.694706299426858E61d, 5.948676378854077E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double double4 = code.src.Distance.squaredDistance(5.262553411785863E62d, 1.0d, (double) (byte) 100, 1.8474736870780683E51d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.769446841189903E125d + "'", double4 == 2.769446841189903E125d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double double4 = code.src.Distance.euclideanDistance(9.324540562451319E30d, 6.520158840275344E248d, 8.69470629942351E61d, 2.0850307160336277E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        long long22 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
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
        long long58 = code.src.Distance.chebyshevDistance(longArray19, longArray54);
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
        long long81 = code.src.Distance.chebyshevDistance(longArray61, longArray78);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray78);
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
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
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray19, longArray60);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long[] longArray76 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long77 = code.src.Distance.chebyshevDistance(longArray68, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray60, longArray68);
        java.lang.Class<?> wildcardClass79 = longArray68.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        double double4 = code.src.Distance.squaredDistance(100.40866620345955d, 9.324540890451006E30d, 2.406503766681E12d, 5.715043495807318E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 3.0536111245430885E15d, 7.559791732623814E123d, 3.053611124543087E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791732623814E123d + "'", double4 == 7.559791732623814E123d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        double double4 = code.src.Distance.squaredDistance(6.922562533439975E61d, 7.559791763325273E123d, 12313.553084145538d, 5.715045104064755E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        long[] longArray48 = new long[] { 'a', 1L };
        long[] longArray51 = new long[] { 0, (short) -1 };
        long[] longArray54 = new long[] { (short) -1, (short) -1 };
        long long55 = code.src.Distance.chebyshevDistance(longArray51, longArray54);
        long long56 = code.src.Distance.chebyshevDistance(longArray48, longArray54);
        long long57 = code.src.Distance.chebyshevDistance(longArray43, longArray54);
        long[] longArray60 = new long[] { 'a', 1L };
        long[] longArray63 = new long[] { 0, (short) -1 };
        long[] longArray66 = new long[] { (short) -1, (short) -1 };
        long long67 = code.src.Distance.chebyshevDistance(longArray63, longArray66);
        long long68 = code.src.Distance.chebyshevDistance(longArray60, longArray66);
        long long69 = code.src.Distance.chebyshevDistance(longArray54, longArray66);
        long long70 = code.src.Distance.chebyshevDistance(longArray32, longArray66);
        long long71 = code.src.Distance.chebyshevDistance(longArray20, longArray66);
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long[] longArray85 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long86 = code.src.Distance.chebyshevDistance(longArray77, longArray85);
        long long87 = code.src.Distance.chebyshevDistance(longArray66, longArray85);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray0, longArray66);
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
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11L + "'", long86 == 11L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 11L + "'", long87 == 11L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray19, longArray37);
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
        long long94 = code.src.Distance.chebyshevDistance(longArray37, longArray84);
        java.lang.Class<?> wildcardClass95 = longArray84.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        double double4 = code.src.Distance.squaredDistance(5.5259489E7d, 1.5119583526749173E124d, 2.4389863314950092E124d, 7.56145520935968E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.497143053457335E251d + "'", double4 == 5.497143053457335E251d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double4 = code.src.Distance.euclideanDistance(8.08452890614697E87d, 9.351743906023566E30d, 2.296505818800933E247d, 6.520158840275344E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double4 = code.src.Distance.squaredDistance(4.675240277191704E248d, 1.0063874635772352E61d, 3.3127290822508215E124d, 1.024464211209343E25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        double double4 = code.src.Distance.squaredDistance(2.4065001431929946E12d, 10.0d, 1.1649654526156026E205d, 1.3101817078026575E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double4 = code.src.Distance.euclideanDistance(8.273174080969564E247d, 1.0922306970231484E16d, 1.2296178404951322E62d, 1.2296171124372597E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double4 = code.src.Distance.euclideanDistance(1.1473791318585206E252d, 8.868523920159873E123d, 7.559791544504537E125d, 1.8649081799851445E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        double double4 = code.src.Distance.squaredDistance(7.559791732617994E123d, 4.298224851119434E25d, 5.715043495807318E247d, 2.719110673110582E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        long[] longArray31 = new long[] { 'a', 1L };
        long[] longArray34 = new long[] { 0, (short) -1 };
        long[] longArray37 = new long[] { (short) -1, (short) -1 };
        long long38 = code.src.Distance.chebyshevDistance(longArray34, longArray37);
        long long39 = code.src.Distance.chebyshevDistance(longArray31, longArray37);
        long long40 = code.src.Distance.chebyshevDistance(longArray26, longArray37);
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray37, longArray49);
        long long53 = code.src.Distance.chebyshevDistance(longArray15, longArray49);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long[] longArray67 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long68 = code.src.Distance.chebyshevDistance(longArray59, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray49, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray5, longArray49);
        long[] longArray73 = new long[] { 0, (short) -1 };
        long[] longArray76 = new long[] { (short) -1, (short) -1 };
        long long77 = code.src.Distance.chebyshevDistance(longArray73, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray49, longArray73);
        java.lang.Class<?> wildcardClass79 = longArray49.getClass();
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 98L + "'", long39 == 98L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 98L + "'", long51 == 98L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 11L + "'", long68 == 11L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        long long66 = code.src.Distance.chebyshevDistance(longArray5, longArray56);
        long[] longArray69 = new long[] { 'a', 1L };
        long[] longArray72 = new long[] { 0, (short) -1 };
        long[] longArray75 = new long[] { (short) -1, (short) -1 };
        long long76 = code.src.Distance.chebyshevDistance(longArray72, longArray75);
        long long77 = code.src.Distance.chebyshevDistance(longArray69, longArray75);
        long[] longArray80 = new long[] { 'a', 1L };
        long[] longArray83 = new long[] { 0, (short) -1 };
        long[] longArray86 = new long[] { (short) -1, (short) -1 };
        long long87 = code.src.Distance.chebyshevDistance(longArray83, longArray86);
        long long88 = code.src.Distance.chebyshevDistance(longArray80, longArray86);
        long long89 = code.src.Distance.chebyshevDistance(longArray75, longArray86);
        long long90 = code.src.Distance.chebyshevDistance(longArray5, longArray86);
        java.lang.Class<?> wildcardClass91 = longArray86.getClass();
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
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 98L + "'", long77 == 98L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 98L + "'", long88 == 98L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double double4 = code.src.Distance.euclideanDistance(2.719111392042953E123d, 1.7874479094211152E62d, 8.976783674294438E123d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2387871038033346E124d + "'", double4 == 1.2387871038033346E124d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double double4 = code.src.Distance.euclideanDistance(7.865071652244784E247d, 3.326166438578114E248d, 7.814856790247367E7d, 1.2496907143570294E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double double4 = code.src.Distance.euclideanDistance(1552637.0032203277d, 3.0568118497974055E15d, 7.559790668932122E123d, 4.51823713706406E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double double4 = code.src.Distance.squaredDistance(5.52593680000932E7d, 2.721524969160516E125d, (double) 97L, 5.250078299133718E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 10, 3.4131590244458324E102d, 1.4253988300352539E128d, 7.393562733187527E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        double double4 = code.src.Distance.squaredDistance(1552636.4832506673d, 2.4389863321241504E124d, 1.4579746669762032E64d, 1.1294636811790911E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.948654328288417E248d + "'", double4 == 5.948654328288417E248d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        double double4 = code.src.Distance.euclideanDistance(8.273174080969564E247d, (double) 100.0f, (double) 101L, 9.32454089993304E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double double4 = code.src.Distance.euclideanDistance(9.324540899918096E30d, 1.6830116762241088E124d, 7.814856790247367E7d, 1811816.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6830116762241088E124d + "'", double4 == 1.6830116762241088E124d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double4 = code.src.Distance.euclideanDistance(9.144408719117394E248d, 9.331617684325628E30d, 1.5377172753851527E248d, 2.948678716579241E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        double double4 = code.src.Distance.squaredDistance(4.182530750552227E256d, 3.05680775507396E15d, 8.951751003550235E62d, 3.0918445022754607E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double double4 = code.src.Distance.euclideanDistance((double) '4', 0.0d, 9.344073313646239E30d, 8.350150916003777E100d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.350150916003777E100d + "'", double4 == 8.350150916003777E100d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        double double4 = code.src.Distance.squaredDistance(1.1294636811790911E99d, 6.556084846280549E12d, 1.2634745840023956E64d, 8.694706299423517E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2756882071026236E198d + "'", double4 == 1.2756882071026236E198d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        double double4 = code.src.Distance.squaredDistance(8.793716013138559E63d, 3.05361112455053E15d, 100.40866620345955d, 3.326166438578114E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double double4 = code.src.Distance.squaredDistance((double) 10, 2.3498127622806567E12d, 1.1958657793748695E32d, 6.922552879173873E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.792173836495848E123d + "'", double4 == 4.792173836495848E123d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double4 = code.src.Distance.squaredDistance(7.786590871947086E125d, 10105.000049480455d, 1.6830116762241088E124d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0481498109123508E256d + "'", double4 == 2.0481498109123508E256d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374587E123d, 6.18368725714255E251d, 5.71504510406472E247d, 2.0234598189585263E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        double double4 = code.src.Distance.euclideanDistance(10.04987562112089d, 9.351743906023566E30d, 8.694706299452407E61d, 9.797098384561698E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694706299452407E61d + "'", double4 == 8.694706299452407E61d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        long[] longArray54 = new long[] { (byte) 10, 100, (byte) 1 };
        long long55 = code.src.Distance.chebyshevDistance(longArray45, longArray54);
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray54, longArray58);
        java.lang.Class<?> wildcardClass64 = longArray54.getClass();
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
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 101L + "'", long55 == 101L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 101L + "'", long63 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double4 = code.src.Distance.euclideanDistance(1.891459241764387E125d, 2.285850535203458E248d, 2.285850535203458E248d, 7.559791653975984E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double4 = code.src.Distance.euclideanDistance(9.324540890466497E30d, 6.191637431199285E31d, 3.053611124543097E15d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.261457075442417E31d + "'", double4 == 6.261457075442417E31d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double double4 = code.src.Distance.squaredDistance(3.0918445022754607E248d, 2.286018050924669E248d, (double) 100L, 5.525939237192507E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        double double4 = code.src.Distance.squaredDistance(100.0d, 3.598765218630986E247d, 7.32543304010228E98d, 8.694866271304194E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        long[] longArray49 = new long[] { 0, (short) -1 };
        long[] longArray52 = new long[] { (short) -1, (short) -1 };
        long long53 = code.src.Distance.chebyshevDistance(longArray49, longArray52);
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
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
        long long97 = code.src.Distance.chebyshevDistance(longArray60, longArray70);
        long long98 = code.src.Distance.chebyshevDistance(longArray2, longArray60);
        java.lang.Class<?> wildcardClass99 = longArray60.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
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
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 97L + "'", long98 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double4 = code.src.Distance.euclideanDistance(3.353869680772834E49d, 3.0239723409974164E124d, 5.250078299133718E247d, 1.8649081799851445E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        double double4 = code.src.Distance.squaredDistance(6.191637431199285E31d, 3.598765218630986E247d, 8.341162879156255E30d, 7.559791732623826E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        long long42 = code.src.Distance.chebyshevDistance(longArray27, longArray39);
        long[] longArray45 = new long[] { 0, (short) -1 };
        long[] longArray48 = new long[] { (short) -1, (short) -1 };
        long long49 = code.src.Distance.chebyshevDistance(longArray45, longArray48);
        long[] longArray56 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long57 = code.src.Distance.chebyshevDistance(longArray48, longArray56);
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
        long long81 = code.src.Distance.chebyshevDistance(longArray48, longArray66);
        long long82 = code.src.Distance.chebyshevDistance(longArray27, longArray66);
        long long83 = code.src.Distance.chebyshevDistance(longArray3, longArray66);
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray0, longArray3);
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
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 11L + "'", long57 == 11L);
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
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double4 = code.src.Distance.squaredDistance(1.4311155692585877E128d, 12313.549023578462d, 9.374059300997487E248d, 3.0580621176685875E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double double4 = code.src.Distance.squaredDistance(9.324540890466497E30d, 7.5597917633235E123d, 16122.636173942763d, 5.463413916504991E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double4 = code.src.Distance.euclideanDistance(8.69470629945289E61d, 3.0918445022754607E248d, 3.053584521181947E15d, 4.31382490545285E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray19, longArray60);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long[] longArray76 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long77 = code.src.Distance.chebyshevDistance(longArray68, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray60, longArray68);
        java.lang.Class<?> wildcardClass79 = longArray60.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.286018050924408E248d, (double) 100.0f, 5.715045150558624E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        double double4 = code.src.Distance.squaredDistance(9.324540890452801E30d, 4.5182371542091934E256d, 9.324540899933299E30d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double4 = code.src.Distance.squaredDistance((double) 100L, 7.559791544536665E125d, 2.884474619048523E15d, 1.2074554820296805E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715044819684806E251d + "'", double4 == 5.715044819684806E251d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double double4 = code.src.Distance.euclideanDistance(3.053611124550097E15d, 99.41369581878968d, 7.677886613131662E20d, 4.629561777660613E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double4 = code.src.Distance.euclideanDistance(1811672.00533166d, 1.097417397239037E249d, 8.69470629942351E61d, 2.8519907324927616E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double double4 = code.src.Distance.squaredDistance((double) 11L, 9.386961461524785E62d, 0.0d, 8.068127213490246E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        double double4 = code.src.Distance.euclideanDistance(8.694866271304194E61d, 7.40859570957669E125d, 1.2756882071026236E198d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.948678716579241E31d, 6.261457075442417E31d, 5.811870955696386E120d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.811870955696386E120d + "'", double4 == 5.811870955696386E120d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        double double4 = code.src.Distance.euclideanDistance(5.7150451504902E247d, 140.71602609511115d, 8.116214151045995E123d, 1.0486765404656112E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        double double4 = code.src.Distance.euclideanDistance((double) 100, 8.030925665076586E87d, 1.4990708455962547E124d, 6.17830490479184E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double4 = code.src.Distance.euclideanDistance((double) 33L, 4.849373849148842E124d, 8.694706173607399E62d, 7.40859570957669E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.923658324661806E125d + "'", double4 == 6.923658324661806E125d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double double4 = code.src.Distance.squaredDistance(3.477821790930845E62d, 6.922552879173873E61d, 9.862699982330608E244d, 1.0486765404643798E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double4 = code.src.Distance.squaredDistance(2.719111392042953E123d, 5.5218522892182536E247d, 5.715045150548505E247d, 103.39245620450265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double double4 = code.src.Distance.euclideanDistance(2.7065537201582164E49d, 9.324540899918096E30d, (double) 10.0f, 10205.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7065537201582164E49d + "'", double4 == 2.7065537201582164E49d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        double double4 = code.src.Distance.squaredDistance(8.991400839772116E43d, 1.0486765404643798E16d, 1.4300949526255977E64d, 6.117725723239335E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7426568024784246E251d + "'", double4 == 3.7426568024784246E251d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double double4 = code.src.Distance.squaredDistance(5.715044819684806E251d, 7.865071652244784E247d, 5.948654328288416E248d, 7.865071652244784E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double4 = code.src.Distance.euclideanDistance((double) 11L, 1.3186892203577162E31d, 9.32387494085701E30d, 3.890201679850891E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.890201679850891E124d + "'", double4 == 3.890201679850891E124d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double double4 = code.src.Distance.euclideanDistance(9.862699982330608E244d, 10105.000049480455d, 8.116214151045995E123d, 4.840681090214691E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        double double4 = code.src.Distance.euclideanDistance(6.072806626010396E251d, 6.922562516048925E61d, 8.859911358917301E125d, 5.715045104064703E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double double4 = code.src.Distance.squaredDistance(20.0d, 1.143009030111722E248d, 4.840680371280547E123d, 1.7874479094211152E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double double4 = code.src.Distance.squaredDistance(4.792187178860569E123d, 0.0d, 2.2965057953353264E247d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        double double4 = code.src.Distance.euclideanDistance(2.24721340011667E248d, 2.8519907324927616E87d, 1.433158224335312E128d, 8.273174080969564E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double double4 = code.src.Distance.squaredDistance(5.721223146643194E251d, 8.694705670079996E61d, 3.1271035700045434E106d, 2.1177523428484083E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double4 = code.src.Distance.euclideanDistance((double) 1, 8.058264513507916E247d, 3.054769716678889E15d, 144.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double4 = code.src.Distance.squaredDistance(9.144408719117394E248d, 1.229617155703251E62d, 8.976783674294438E123d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        double double4 = code.src.Distance.euclideanDistance(6.17830490479184E248d, 3.0568077560623055E15d, 1.8649081799851445E31d, 8.320193827934524E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double double4 = code.src.Distance.euclideanDistance((double) 10, 3.4290270810282753E248d, 7.568917694587279E125d, 1.231115082248268E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double double4 = code.src.Distance.euclideanDistance(3.0559985941685375E15d, (double) 101L, 5.791260378563789E24d, 1.45794860122975E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.45794860122975E64d + "'", double4 == 1.45794860122975E64d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double4 = code.src.Distance.squaredDistance(4.7921872029386884E123d, 12313.549023578462d, 4.298224851119434E25d, 1.5119582431985447E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5156683110561225E248d + "'", double4 == 2.5156683110561225E248d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        double double4 = code.src.Distance.squaredDistance(8.694706281769265E61d, 1.0922306970231484E16d, 3.4778825197957035E62d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715043495807318E247d + "'", double4 == 5.715043495807318E247d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double double4 = code.src.Distance.euclideanDistance(2.721524969160516E125d, 9.374059300997487E248d, 5.524950700000004E7d, 1.223220513063486E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        double double4 = code.src.Distance.squaredDistance((double) 3L, 10105.000049480455d, 9.344073313646239E30d, 3.053611124543097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.73117060907958E61d + "'", double4 == 8.73117060907958E61d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double4 = code.src.Distance.euclideanDistance(1811672.00533166d, 4.484874987983141E256d, 1.1548101448300805E124d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double double4 = code.src.Distance.euclideanDistance(2.7191106511481887E123d, 7.559791763325273E123d, 2.0786247129419894E256d, 1.2296178404951322E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
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
        long long74 = code.src.Distance.chebyshevDistance(longArray19, longArray58);
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray58, longArray77);
        java.lang.Class<?> wildcardClass83 = longArray77.getClass();
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
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        long long22 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
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
        long long58 = code.src.Distance.chebyshevDistance(longArray19, longArray54);
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
        long long81 = code.src.Distance.chebyshevDistance(longArray61, longArray78);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray78);
        java.lang.Class<?> wildcardClass83 = longArray78.getClass();
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
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
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double4 = code.src.Distance.euclideanDistance(1.4579745280790234E64d, 1.7683618323195464E53d, 7.393562733187527E246d, 2.4065001431929946E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        double double4 = code.src.Distance.euclideanDistance(10.04987562112089d, (double) 10L, (double) 98L, 1.1248441811882996E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1248441811882996E99d + "'", double4 == 1.1248441811882996E99d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        long long51 = code.src.Distance.chebyshevDistance(longArray20, longArray49);
        // The following exception was thrown during execution in test generation
        try {
            long long52 = code.src.Distance.chebyshevDistance(longArray0, longArray20);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 11L + "'", long51 == 11L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452407E61d, 1.433158224335312E128d, 6.556084846279365E12d, 4.31382490545285E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.433158224335312E128d + "'", double4 == 1.433158224335312E128d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        double double4 = code.src.Distance.squaredDistance(9.386961461524785E62d, 5.715045104064703E247d, 2.4389863314950092E124d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        double double4 = code.src.Distance.euclideanDistance(5.71504510406472E247d, 1.231115082248268E64d, 9.951221440466418E248d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double double4 = code.src.Distance.euclideanDistance(1.143009020812949E248d, 2.4389908525564578E124d, 0.0d, 5.78903989294274E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double double4 = code.src.Distance.squaredDistance(3.353869680772834E49d, 7.865071652244784E247d, 140.71602609511115d, 1.457948741083528E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double4 = code.src.Distance.euclideanDistance(1.143009030111722E248d, 2.575569517141002E250d, 5.948654328288417E248d, 5.749414470161792E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        double double4 = code.src.Distance.euclideanDistance(3.201844896665003E124d, 1.2634745840023956E64d, 5.53979513351125E119d, 1.891459241764387E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.918367176323824E125d + "'", double4 == 1.918367176323824E125d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        long long35 = code.src.Distance.chebyshevDistance(longArray9, longArray32);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = code.src.Distance.chebyshevDistance(longArray0, longArray32);
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
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double4 = code.src.Distance.squaredDistance(6.151502905962372E30d, 1.602837247029983E254d, (double) 'a', 9.351743906023566E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double double4 = code.src.Distance.euclideanDistance(3.0239723409974164E124d, 6.151508697220018E30d, 9.324540890451006E30d, 9.862699982330608E244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double double4 = code.src.Distance.euclideanDistance(8.067055176895368E247d, 1.918367176323824E125d, 8.694715983872712E61d, 2.285850535203458E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double double4 = code.src.Distance.euclideanDistance(3.0568077560623055E15d, (double) (short) -1, 6.804460155815231E124d, 7.560169524654381E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.590729215407016E125d + "'", double4 == 7.590729215407016E125d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        double double4 = code.src.Distance.euclideanDistance(3.0568118497973945E15d, 4.7921872029386884E123d, 4.792173836495848E123d, 3.165779550192911E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.728966543133093E124d + "'", double4 == 2.728966543133093E124d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray19, longArray60);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long[] longArray76 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long77 = code.src.Distance.chebyshevDistance(longArray68, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray60, longArray68);
        long[] longArray79 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray68, longArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        double double4 = code.src.Distance.euclideanDistance(1.2634745840023956E64d, 2.7030845353965203E124d, 1.1236897393274192E248d, 103.39245620450265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        long[] longArray48 = new long[] { 0, (short) -1 };
        long[] longArray51 = new long[] { (short) -1, (short) -1 };
        long long52 = code.src.Distance.chebyshevDistance(longArray48, longArray51);
        long[] longArray59 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long60 = code.src.Distance.chebyshevDistance(longArray51, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray30, longArray59);
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
        long long98 = code.src.Distance.chebyshevDistance(longArray8, longArray59);
        java.lang.Class<?> wildcardClass99 = longArray59.getClass();
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
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 11L + "'", long60 == 11L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
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
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 11L + "'", long98 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        double double4 = code.src.Distance.euclideanDistance(5.71504515055861E247d, 0.0d, 8.951751003550235E62d, 3.4778825197957035E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double double4 = code.src.Distance.euclideanDistance(2.7065537201582164E49d, 5.791260371133832E24d, 1.7874479094211152E62d, 8.341162879156255E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7874479094208446E62d + "'", double4 == 1.7874479094208446E62d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        double double4 = code.src.Distance.euclideanDistance(5.715045150490167E247d, 9.324540899918096E30d, 4.849373849148842E124d, 8.99140083977295E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        double double4 = code.src.Distance.euclideanDistance(2.8325283023066844E248d, 5.525928500007007E7d, 5.7150451504902E247d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        java.lang.Class<?> wildcardClass83 = longArray73.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double4 = code.src.Distance.squaredDistance(3.053611124550097E15d, 5.497143053457335E251d, 8.694866271304194E61d, 3.477882519775504E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double4 = code.src.Distance.euclideanDistance(5.788468388432333E251d, 1.1958657793748695E32d, 7.559791732617994E123d, 7.559791732623826E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        double double4 = code.src.Distance.euclideanDistance(3.7426568024784246E251d, 9.324540890466497E30d, 8.084528906135836E87d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double double4 = code.src.Distance.euclideanDistance(9.466542772834739E21d, 5.715044819684806E251d, 1811672.00533166d, 144.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double4 = code.src.Distance.euclideanDistance(1.2093895208085425E64d, 1.1929678834484718E32d, 2.2840367152798036E31d, 1.060042331216179E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.060042331216179E124d + "'", double4 == 1.060042331216179E124d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray42, longArray60);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray60, longArray65);
        java.lang.Class<?> wildcardClass71 = longArray60.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 11L + "'", long70 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double4 = code.src.Distance.squaredDistance(2.4389863314950092E124d, 5.791260371133832E24d, 1.1473791318585206E252d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double4 = code.src.Distance.euclideanDistance((double) 98L, 2.125614474048533E128d, 7.559791732623814E123d, 1811717.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256144753928608E128d + "'", double4 == 2.1256144753928608E128d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double4 = code.src.Distance.squaredDistance(5.525994208076646E7d, 1.143009020812949E248d, 5.715616324151285E251d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double double4 = code.src.Distance.euclideanDistance(9.466542772840854E21d, 2.2840367152798036E31d, 0.0d, 5.788468388432333E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double4 = code.src.Distance.squaredDistance(7.608198465098248E125d, 5.524950700000004E7d, 3.053611069269292E15d, 7.710682094138496E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.788468388432333E251d + "'", double4 == 5.788468388432333E251d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double4 = code.src.Distance.squaredDistance(7.43091669258797E123d, 5.525939237192507E7d, 0.0d, 5.528905595074321E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.5218522892182536E247d + "'", double4 == 5.5218522892182536E247d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double double4 = code.src.Distance.squaredDistance(9.951221440466418E248d, 5.791260378563789E24d, 0.0d, 4.1827267651555864E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double double4 = code.src.Distance.squaredDistance(6.922562533439975E61d, 5.811870955696386E120d, 6.922562533439975E61d, 1.4579486012297467E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.377784400566722E241d + "'", double4 == 3.377784400566722E241d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double4 = code.src.Distance.squaredDistance(0.0d, 8.34116319834633E30d, 2.719111392042953E123d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.393566762337766E246d + "'", double4 == 7.393566762337766E246d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        double double4 = code.src.Distance.euclideanDistance(9.324540899933299E30d, (double) 10, 2.7676045845140174E123d, 3.0239723409974164E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0366107867949796E124d + "'", double4 == 3.0366107867949796E124d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        double double4 = code.src.Distance.euclideanDistance(7.43091669258797E123d, 1811707.0012909174d, 5.788468388432333E251d, 5.603244642552161E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double double4 = code.src.Distance.squaredDistance(0.0d, (double) (-1.0f), 2.24721340011667E248d, 5.5259489E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        double double4 = code.src.Distance.squaredDistance(1.097417397239037E249d, 0.0d, (double) 33L, 2.2965057957235622E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
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
        long long74 = code.src.Distance.chebyshevDistance(longArray19, longArray58);
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray58, longArray77);
        long[] longArray85 = new long[] { 'a', 1L };
        long[] longArray88 = new long[] { 0, (short) -1 };
        long[] longArray91 = new long[] { (short) -1, (short) -1 };
        long long92 = code.src.Distance.chebyshevDistance(longArray88, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray85, longArray91);
        long long94 = code.src.Distance.chebyshevDistance(longArray77, longArray85);
        java.lang.Class<?> wildcardClass95 = longArray85.getClass();
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
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 97L + "'", long94 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        double double4 = code.src.Distance.squaredDistance(1.433007028500352E128d, 5.715045150490167E247d, 8.620276499386763E61d, 6.261457075442417E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double double4 = code.src.Distance.squaredDistance(8.866895281429006E62d, 2.0504686747931686E246d, 1.4990708455962547E124d, 1.060042331216179E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double4 = code.src.Distance.squaredDistance(5.53979513351125E119d, 9.324540890452801E30d, 7.559791732623792E123d, 3.311955036268193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.714207540805018E247d + "'", double4 == 5.714207540805018E247d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double double4 = code.src.Distance.euclideanDistance(8.859911358917301E125d, (double) (short) 1, 9.351743906023566E30d, 9.351743906023566E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.859911358917301E125d + "'", double4 == 8.859911358917301E125d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double double4 = code.src.Distance.squaredDistance(3.053611124550097E15d, 8.068127213490246E247d, 6.556084846139649E12d, 1.1248441811882996E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double4 = code.src.Distance.squaredDistance(3.1404935889650543E122d, 4.484874987983141E256d, (double) ' ', 1.143009030111722E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double4 = code.src.Distance.euclideanDistance(2.8519907324927616E87d, 9.79709836214289E7d, 1.7703709657756777E62d, 2.7676045845140174E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7676045845140174E123d + "'", double4 == 2.7676045845140174E123d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double double4 = code.src.Distance.squaredDistance(3.053584521181947E15d, 7.559791732623792E123d, (double) '#', 140.71602609511115d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045104064703E247d + "'", double4 == 5.715045104064703E247d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        double double4 = code.src.Distance.euclideanDistance(7.677886613131662E20d, 0.0d, 5.715045150481383E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        double double4 = code.src.Distance.euclideanDistance(9.32454089993304E30d, 2.4065001431929946E12d, 5.791260378563789E24d, 2.125614532971372E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.125614532971372E128d + "'", double4 == 2.125614532971372E128d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double4 = code.src.Distance.euclideanDistance(3.0918445022754607E248d, (double) 'a', 1.917769450392853E125d, 1.1236897393274192E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double double4 = code.src.Distance.euclideanDistance((double) 10.0f, 8.694706281798174E61d, 2.575569517141002E250d, 2.884474619048523E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double4 = code.src.Distance.squaredDistance((double) (short) 100, 1.1929678955220982E32d, 8.793716013138559E63d, 5.525928500007007E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.732944131972951E127d + "'", double4 == 7.732944131972951E127d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double double4 = code.src.Distance.euclideanDistance(8.084528906135836E87d, 1.0486765404643798E16d, 1.2094207749824497E64d, 7.56145520935968E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.56145520935968E125d + "'", double4 == 7.56145520935968E125d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        double double4 = code.src.Distance.squaredDistance(2.0234598189585263E246d, 1.8649081799851445E31d, 8.69470629945289E61d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double double4 = code.src.Distance.euclideanDistance(8.694866271304194E61d, 6.922562533439975E61d, (double) 10.0f, 9.374059300997487E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double4 = code.src.Distance.squaredDistance(1.0997224744491414E32d, 20737.0d, 9.344073313646239E30d, 1.4579486012297467E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256141238277748E128d + "'", double4 == 2.1256141238277748E128d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        double double4 = code.src.Distance.euclideanDistance((double) 100L, 5.580834364125841E251d, 5.463413916504991E251d, 8.982275443054642E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        double double4 = code.src.Distance.squaredDistance(4.182530750552227E256d, 8.084528906135836E87d, 8.866898431039124E62d, 3.0366107867949796E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double4 = code.src.Distance.squaredDistance(104.0d, 2.728966543133093E124d, 16122.636173942763d, 6.922562516048925E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.447258393539782E248d + "'", double4 == 7.447258393539782E248d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374577E123d, 8.976783674294438E123d, 9.144408719117394E248d, 8.694706281769284E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452407E61d, 1.602837247029983E254d, 2.406503766581682E12d, 8.050471177320619E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        long[] longArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = code.src.Distance.chebyshevDistance(longArray45, longArray51);
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
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double4 = code.src.Distance.euclideanDistance((double) 10, 8.067055176895368E247d, 1.1248441811882996E99d, 1811707.0012909174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        double double4 = code.src.Distance.squaredDistance(1.1649654526156026E205d, 1.1294636811790911E99d, 2.2965057953353264E247d, 4.8406811122263884E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 10.04987562112089d, 8.320193817483419E30d, 1.7683618323195464E53d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7683618323195464E53d + "'", double4 == 1.7683618323195464E53d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452896E61d, (double) (byte) 10, 6.117725723239335E125d, 1.6830116762241088E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.120040302792729E125d + "'", double4 == 6.120040302792729E125d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        long[] longArray37 = new long[] { 'a', 1L };
        long[] longArray40 = new long[] { 0, (short) -1 };
        long[] longArray43 = new long[] { (short) -1, (short) -1 };
        long long44 = code.src.Distance.chebyshevDistance(longArray40, longArray43);
        long long45 = code.src.Distance.chebyshevDistance(longArray37, longArray43);
        long long46 = code.src.Distance.chebyshevDistance(longArray19, longArray37);
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
        long long69 = code.src.Distance.chebyshevDistance(longArray49, longArray66);
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray49);
        long[] longArray73 = new long[] { 0, (short) -1 };
        long[] longArray76 = new long[] { (short) -1, (short) -1 };
        long long77 = code.src.Distance.chebyshevDistance(longArray73, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray49, longArray73);
        java.lang.Class<?> wildcardClass79 = longArray73.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 98L + "'", long45 == 98L);
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
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 98L + "'", long69 == 98L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 97L + "'", long78 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double4 = code.src.Distance.squaredDistance(5.720993474013094E251d, 1.33937091808876E127d, 9.344073313646239E30d, 8.34116319834633E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double4 = code.src.Distance.squaredDistance(8.133851138224599E174d, 7.661073336008042E123d, 2.1092217904410153E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double double4 = code.src.Distance.squaredDistance(2.719110673110582E123d, 1.6830116762241088E124d, (double) 10.0f, 2.406503766681E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.9064639308329233E248d + "'", double4 == 2.9064639308329233E248d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        double double4 = code.src.Distance.squaredDistance(8.866898431039124E62d, 3.4131590244458324E102d, (double) '#', 5.811870955696386E120d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.377784400566722E241d + "'", double4 == 3.377784400566722E241d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double4 = code.src.Distance.euclideanDistance(6.957500334326037E61d, 8.868523920159873E123d, 3.052698722606791E15d, 2.7065537201582164E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.868523920159873E123d + "'", double4 == 8.868523920159873E123d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double double4 = code.src.Distance.euclideanDistance(8.320193817483419E30d, 2.8519907324927616E87d, 7.786590871947086E125d, 7.559943432502878E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0852821850087336E126d + "'", double4 == 1.0852821850087336E126d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double double4 = code.src.Distance.euclideanDistance(3.0580621176685875E15d, 1.918367176323824E125d, 2.948678716579241E31d, 3.194965507832467E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5988706255405772E125d + "'", double4 == 1.5988706255405772E125d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double double4 = code.src.Distance.euclideanDistance(8.694706281798174E61d, 7.559791763374587E123d, 5.527131618909466E7d, 1.2093895208085425E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763374587E123d + "'", double4 == 7.559791763374587E123d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double4 = code.src.Distance.squaredDistance(1.0695270443395895E124d, 8.694705670079996E61d, 3.201844896665003E124d, 16122.636173942763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.546779423345663E248d + "'", double4 == 4.546779423345663E248d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double4 = code.src.Distance.euclideanDistance(8.350150916003777E100d, 7.608198465098248E125d, 9.324540899933302E30d, 1.8474736870780683E51d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.608198465098248E125d + "'", double4 == 7.608198465098248E125d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double4 = code.src.Distance.squaredDistance(2.7191106511481887E123d, 6.261457075442417E31d, 3.194965507832467E124d, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1254847552549246E249d + "'", double4 == 3.1254847552549246E249d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double double4 = code.src.Distance.squaredDistance(7.677886613131662E20d, 5.948676378854077E248d, 9.324540562451319E30d, 5.715616324151285E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double4 = code.src.Distance.squaredDistance(1.4300949526255977E64d, 1346.0d, 1.3415036402150548E127d, 6.957499817664781E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7996320167102433E254d + "'", double4 == 1.7996320167102433E254d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        double double4 = code.src.Distance.squaredDistance(4.1827267651555864E256d, 6.117725723239335E125d, 8.961543206990963E43d, 2.4389863314950092E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        double double4 = code.src.Distance.squaredDistance(6.556084846280365E12d, 8.951751003550235E62d, 1.4319457653113712E123d, 5.527131618909466E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0504686747931686E246d + "'", double4 == 2.0504686747931686E246d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double double4 = code.src.Distance.euclideanDistance(9.144408719117394E248d, 8.859911358917301E125d, 5.714207540805018E247d, 5.52593790000923E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double4 = code.src.Distance.euclideanDistance(20.0d, 1811717.0d, 3.053584521181947E15d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5649646924973942E62d + "'", double4 == 1.5649646924973942E62d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double4 = code.src.Distance.euclideanDistance(9.951221440466418E248d, 1.738941196953288E62d, (double) 1, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double double4 = code.src.Distance.squaredDistance(4.3184582665404395E15d, 8.866895281429006E62d, 6.556084846139649E12d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.862183193182798E125d + "'", double4 == 7.862183193182798E125d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double double4 = code.src.Distance.euclideanDistance(2.125614532971372E128d, 5.525929237201556E7d, 5.786405680011157E251d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double double4 = code.src.Distance.squaredDistance(8.320193817483419E30d, 7.559791653975984E125d, (double) (byte) -1, 1.1929678955220982E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715044985152495E251d + "'", double4 == 5.715044985152495E251d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double double4 = code.src.Distance.euclideanDistance(1.2400472875600966E124d, 4.1827267651555864E256d, 2.2965057957235622E247d, 5.78903989294274E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double4 = code.src.Distance.euclideanDistance(2.721524969160516E125d, 9.144408719117394E248d, 7.393563040080829E246d, 10105.000049480455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.Class<?> wildcardClass71 = longArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        double double4 = code.src.Distance.squaredDistance((double) 10L, 4.484874987983141E256d, 2.884474619048523E15d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double4 = code.src.Distance.euclideanDistance(2.3432186456900772E247d, (double) (short) 0, 122.0d, 1811717.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double4 = code.src.Distance.euclideanDistance(1.2637714837637312E127d, 0.0d, 4.792173836495848E123d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2632922663800816E127d + "'", double4 == 1.2632922663800816E127d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        double double4 = code.src.Distance.squaredDistance(8.868523920159873E123d, 3.068933012127493E239d, 8.133851138224599E174d, 5.78903989294274E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double double4 = code.src.Distance.squaredDistance(5.715044819684806E251d, 5.715616324151285E251d, 1.8649081799851445E31d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double4 = code.src.Distance.squaredDistance(5.731031078277051E251d, 7.710682094138496E10d, 1.695194259018638E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double4 = code.src.Distance.squaredDistance(6.556084846280365E12d, 9.324540899933302E30d, 1.0852821850087336E126d, 8.866898431039124E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.177837421097331E252d + "'", double4 == 1.177837421097331E252d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double4 = code.src.Distance.euclideanDistance(5.715616324151285E251d, 2.8519907324927616E87d, 7433.0d, 2.4389863321241504E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double4 = code.src.Distance.euclideanDistance(8.058264513507916E247d, 5.603244642552161E251d, 2.948678716579241E31d, 2.244907423513874E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double4 = code.src.Distance.euclideanDistance(1.4253988300352539E128d, 5.948654328288417E248d, 2.285850535203458E248d, 1.8648415840790313E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        double double4 = code.src.Distance.euclideanDistance(7.559791732623826E123d, 8.08452890614697E87d, 2.0451715735252107E128d, 1.229617155703251E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0450959756078844E128d + "'", double4 == 2.0450959756078844E128d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double double4 = code.src.Distance.squaredDistance(3.4290270810282753E248d, 1.433158224335312E128d, 1811672.00533166d, 8.030925665076586E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double double4 = code.src.Distance.squaredDistance(7.821589175633897E62d, 5.580834364125841E251d, 3.0568118497974055E15d, 9.137715554420027E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double4 = code.src.Distance.squaredDistance(3.053584521181947E15d, 8.866898431039124E62d, 7.559791763374577E123d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.71504515055861E247d + "'", double4 == 5.71504515055861E247d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double4 = code.src.Distance.euclideanDistance(1552637.0032203277d, 3.477882519775504E62d, 1.0695270443395895E124d, 3.1404935889650543E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0699880226301655E124d + "'", double4 == 1.0699880226301655E124d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double double4 = code.src.Distance.squaredDistance(2.0451715735252107E128d, 7.565603634330283E123d, 625.0d, 9.351743906023566E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.182726770879422E256d + "'", double4 == 4.182726770879422E256d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double4 = code.src.Distance.euclideanDistance(5.525928500007007E7d, 8.73117060907958E61d, 5.497143053457335E251d, 1.1341134428019932E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        double double4 = code.src.Distance.squaredDistance(1.5119582431985447E124d, 2.0234598189585263E246d, 0.0d, 8.793716013138559E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double4 = code.src.Distance.euclideanDistance(5.525929037215044E7d, 7.559791732623792E123d, 7.559791763329331E123d, 5.525994208076646E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.069116001870466E124d + "'", double4 == 1.069116001870466E124d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double double4 = code.src.Distance.squaredDistance(7433.0d, 8.694706299452407E61d, 10205.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763373738E123d + "'", double4 == 7.559791763373738E123d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double double4 = code.src.Distance.euclideanDistance(1.4990708455962547E124d, 4.1827267651555864E256d, 6.922562533439975E61d, 8.030925665076586E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double4 = code.src.Distance.squaredDistance(1.5649646924973942E62d, 5.715045150481383E247d, 144.0d, 1.1929678834484718E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double4 = code.src.Distance.euclideanDistance(7.393566762337766E246d, 2.2194288710556866E124d, 1.30972997559812E124d, 5.71504515055861E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double4 = code.src.Distance.euclideanDistance(7.559791544504537E125d, 8.868523920159873E123d, 0.0d, 3.0366107867949796E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.562847533034203E125d + "'", double4 == 7.562847533034203E125d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double4 = code.src.Distance.squaredDistance(4.347353086803702E62d, 9.324540899917549E30d, 1552637.0032203277d, 5.948676378854077E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        double double4 = code.src.Distance.euclideanDistance(4.3184582665404395E15d, 3.3607494419832777E49d, (double) (short) 1, 4.840681090214691E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.840681090214691E123d + "'", double4 == 4.840681090214691E123d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double double4 = code.src.Distance.squaredDistance(6.151502905962372E30d, 1.2756882071026236E198d, 1.7874479094211152E62d, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374587E123d, 1.069116001870466E124d, 2.125614532971372E128d, 1.0699880226301655E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.12553893505374E128d + "'", double4 == 2.12553893505374E128d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray70, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray5, longArray70);
        long[] longArray89 = new long[] { (byte) -1, 97L };
        long long90 = code.src.Distance.chebyshevDistance(longArray5, longArray89);
        java.lang.Class<?> wildcardClass91 = longArray89.getClass();
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, 97]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 98L + "'", long90 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double double4 = code.src.Distance.euclideanDistance(9.331617684325628E30d, 8.859911358917301E125d, 0.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double double4 = code.src.Distance.euclideanDistance(103.39245620450265d, 3.7841059251973525E61d, 1.3186892203577162E31d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7841059251973525E61d + "'", double4 == 3.7841059251973525E61d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double4 = code.src.Distance.euclideanDistance(1.069116001870466E124d, 1.602837247029983E254d, 2.2840367152798036E31d, 1.4990708455962547E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double4 = code.src.Distance.euclideanDistance(1811707.0012909174d, 1.177837421097331E252d, 1.5737202213962112E124d, 5.527131720196977E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        long long46 = code.src.Distance.chebyshevDistance(longArray8, longArray19);
        java.lang.Class<?> wildcardClass47 = longArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double double4 = code.src.Distance.euclideanDistance(3.05361112455053E15d, 2.0451715735252107E128d, 9.324546092905923E30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0451715735252107E128d + "'", double4 == 2.0451715735252107E128d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double4 = code.src.Distance.squaredDistance(1.33937091808876E127d, 5.791260282386601E24d, 4.5182371393605655E256d, 2.1256141238277748E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        double double4 = code.src.Distance.squaredDistance(0.0d, 7.862188778636408E125d, 1.5617268815501826E62d, 1.602837247029983E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        double double4 = code.src.Distance.squaredDistance(1.2634745840023956E64d, 7.821589175633897E62d, 1.143009030111722E248d, 2.1092217904410153E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        double double4 = code.src.Distance.squaredDistance(4.630067801207703E249d, 12313.549023578462d, 6.17830490479184E248d, 1552636.4832506673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        double double4 = code.src.Distance.squaredDistance(5.717560488315264E251d, 7.863642449363113E125d, 1.453465767405697E125d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        long[] longArray49 = new long[] { 0, (short) -1 };
        long[] longArray52 = new long[] { (short) -1, (short) -1 };
        long long53 = code.src.Distance.chebyshevDistance(longArray49, longArray52);
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
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
        long long97 = code.src.Distance.chebyshevDistance(longArray60, longArray70);
        long long98 = code.src.Distance.chebyshevDistance(longArray2, longArray60);
        java.lang.Class<?> wildcardClass99 = longArray2.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
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
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 97L + "'", long98 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double4 = code.src.Distance.euclideanDistance(2.406501954865E12d, 1.7388170690697642E62d, 1.30972997559812E124d, 3.2973523484734863E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double double4 = code.src.Distance.squaredDistance(1.2400472875600966E124d, 1346.0d, 8.058264513507916E247d, 1.1236897393274192E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double double4 = code.src.Distance.euclideanDistance(4.182726770879422E256d, 8.350150916003777E100d, 1.6830116762241088E124d, 7.32543304010228E98d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        double double4 = code.src.Distance.euclideanDistance(1.889947887669239E125d, 8.694706281769284E61d, 2.2965057953353264E247d, 7.710682094138496E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double4 = code.src.Distance.squaredDistance((double) (-1L), 1.864891897920854E31d, 7.561664719340081E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.717877332771251E251d + "'", double4 == 5.717877332771251E251d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double4 = code.src.Distance.euclideanDistance(8.991400839772116E43d, 1.4579486012297467E64d, 7.732944131972951E127d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.732944131972951E127d + "'", double4 == 7.732944131972951E127d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double double4 = code.src.Distance.euclideanDistance(1.2637714837637312E127d, 6.556084846139649E12d, 8.067055176895368E247d, 5.715045150548505E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double double4 = code.src.Distance.euclideanDistance(2.4389908525564578E124d, 8.320193817483419E30d, 5.603244642552161E251d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        double double4 = code.src.Distance.squaredDistance(2.1586910533487628E249d, 5.717877332771251E251d, 4.471374129726301E62d, 5.71504515055861E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double double4 = code.src.Distance.euclideanDistance(4.64617159966005E124d, 2.7191106511481887E123d, 5.527131618909466E7d, 2.3498127622806567E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.654121416639182E124d + "'", double4 == 4.654121416639182E124d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long[] longArray28 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long29 = code.src.Distance.chebyshevDistance(longArray20, longArray28);
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
        long[] longArray54 = new long[] { 'a', 1L };
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray54, longArray60);
        long long63 = code.src.Distance.chebyshevDistance(longArray49, longArray60);
        long[] longArray66 = new long[] { 'a', 1L };
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray66, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray60, longArray72);
        long long76 = code.src.Distance.chebyshevDistance(longArray32, longArray72);
        long long77 = code.src.Distance.chebyshevDistance(longArray28, longArray72);
        long long78 = code.src.Distance.chebyshevDistance(longArray5, longArray72);
        java.lang.Class<?> wildcardClass79 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11L + "'", long29 == 11L);
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
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 98L + "'", long62 == 98L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 98L + "'", long76 == 98L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        long[] longArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = code.src.Distance.chebyshevDistance(longArray8, longArray23);
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
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double4 = code.src.Distance.euclideanDistance(3.053611124540608E15d, 4.840681090214691E123d, 8.866898431039124E62d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.244898434111624E124d + "'", double4 == 2.244898434111624E124d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double4 = code.src.Distance.euclideanDistance(1.4990708455962547E124d, 2.0786247129419894E256d, 1.433158224335312E128d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.7388170690697642E62d, 1.8474736870780683E51d, 1.0329723434258763E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0329723434258763E126d + "'", double4 == 1.0329723434258763E126d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double double4 = code.src.Distance.euclideanDistance(1.433158224335312E128d, 1.8663667958684514E31d, (double) '#', 5.52593790000923E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.433158224335312E128d + "'", double4 == 1.433158224335312E128d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double4 = code.src.Distance.squaredDistance(9.32454089993304E30d, 3.053611124543097E15d, 20084.432052190223d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4805194246531137E124d + "'", double4 == 2.4805194246531137E124d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double4 = code.src.Distance.squaredDistance(10205.0d, 5.5259489E7d, 0.0d, 8.866898431036233E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.862188778631282E125d + "'", double4 == 7.862188778631282E125d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double4 = code.src.Distance.squaredDistance(3.053611124551322E15d, 4.654121416639182E124d, 6.151502905962372E30d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.166084616081951E249d + "'", double4 == 2.166084616081951E249d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double4 = code.src.Distance.squaredDistance(2.769446841189903E125d, 2.728966543133093E124d, 1.2094207749824497E64d, 6.587293214563927E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long[] longArray28 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long29 = code.src.Distance.chebyshevDistance(longArray20, longArray28);
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
        long[] longArray54 = new long[] { 'a', 1L };
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray54, longArray60);
        long long63 = code.src.Distance.chebyshevDistance(longArray49, longArray60);
        long[] longArray66 = new long[] { 'a', 1L };
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray66, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray60, longArray72);
        long long76 = code.src.Distance.chebyshevDistance(longArray32, longArray72);
        long long77 = code.src.Distance.chebyshevDistance(longArray28, longArray72);
        long long78 = code.src.Distance.chebyshevDistance(longArray5, longArray72);
        java.lang.Class<?> wildcardClass79 = longArray72.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11L + "'", long29 == 11L);
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
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 98L + "'", long62 == 98L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 98L + "'", long76 == 98L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double double4 = code.src.Distance.euclideanDistance(6.957500334326037E61d, 2.2840367152798036E31d, 7.661073336008042E123d, 4.629561777660613E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double4 = code.src.Distance.euclideanDistance(3.3127290822508215E124d, 1.0063874635772352E61d, (double) 100, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.3127290822508215E124d + "'", double4 == 3.3127290822508215E124d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double4 = code.src.Distance.euclideanDistance(4.792187178860569E123d, 5.715044985152495E251d, 8.694706299426871E61d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double double4 = code.src.Distance.euclideanDistance(3.353869677235983E49d, 5.715045104064703E247d, 8.341162879156255E30d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.78903989294274E251d, 2.1177523428484083E128d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        double double4 = code.src.Distance.euclideanDistance(5.714207540805018E247d, 1.2496907143570294E31d, 5.715043495807318E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double4 = code.src.Distance.squaredDistance(2.0786247129419894E256d, 5.811870955696386E120d, 8.694705670079996E61d, 5.811870955696386E120d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double4 = code.src.Distance.squaredDistance(3.353869680772834E49d, 5.829917481072086E251d, 1.8649081799851445E31d, 4.484874987983141E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double double4 = code.src.Distance.euclideanDistance(1.4579486012297467E64d, 3.650997547418172E43d, 3.311955036268193E63d, 8.694706299452896E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1267866439017752E64d + "'", double4 == 1.1267866439017752E64d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double4 = code.src.Distance.euclideanDistance(1.0922306970231484E16d, 4.840680371280547E123d, 4.485950827314113E256d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 9.324540899933247E30d, 2.3432193630265306E247d, 4.8406811122263884E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.060042331216179E124d, 1.2093895208085425E64d, 8.73117060907958E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1236897439702315E248d + "'", double4 == 1.1236897439702315E248d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double4 = code.src.Distance.euclideanDistance(1.5649646924973942E62d, 2.1256901295443705E128d, 8.320188026225052E30d, 5.525939237192507E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256901295443705E128d + "'", double4 == 2.1256901295443705E128d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double double4 = code.src.Distance.squaredDistance(4.182726770879422E256d, 5.5259389E7d, 1.2400472875600966E124d, (double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double double4 = code.src.Distance.squaredDistance(1.7388170690697642E62d, 5.715045150558624E247d, 7.559791763325273E123d, 6.556084846279365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double double4 = code.src.Distance.euclideanDistance(5.527131618909466E7d, 5.731031078277051E251d, 7.393562733187527E246d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double4 = code.src.Distance.squaredDistance((double) (short) -1, 1346.0d, 2.0450959756078844E128d, 3.1271035700045434E106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.1824175494475645E256d + "'", double4 == 4.1824175494475645E256d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double4 = code.src.Distance.squaredDistance(1.5737202213962112E124d, 5.715045150484065E247d, 7.568917694587279E125d, 8.694706299424537E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double4 = code.src.Distance.squaredDistance(5.463413916504991E251d, 1.7583641551952374E124d, 1.229617155703251E62d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double4 = code.src.Distance.squaredDistance((double) 33L, 4.92586451367552E248d, 1.4990708455962547E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double4 = code.src.Distance.squaredDistance(9922.0d, 4.51823713706406E256d, 217.94165335165133d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double4 = code.src.Distance.squaredDistance(6.17830490479184E248d, 5.715851632357578E251d, 1.7388170690697642E62d, 5.52593790000923E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray89);
        java.lang.Class<?> wildcardClass99 = longArray89.getClass();
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
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) -1, 1.772143783377933E61d, 1.891459241764387E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.891459241764387E125d + "'", double4 == 1.891459241764387E125d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double4 = code.src.Distance.euclideanDistance(2.3432186456900772E247d, 3.3127290822508215E124d, (double) 11L, 9.862699982330608E244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double double4 = code.src.Distance.euclideanDistance(9.482299742031001E21d, 9.324540562451319E30d, 5.714207540805018E247d, 6.120040302792729E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double4 = code.src.Distance.squaredDistance(7.40859570957669E125d, 1.1236897393274192E248d, 0.0d, 4.182530750552227E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double4 = code.src.Distance.euclideanDistance(12313.549023578462d, 4.347362196294934E62d, 1.5737202213962112E124d, 1.433158224335312E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4331582329756537E128d + "'", double4 == 1.4331582329756537E128d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double4 = code.src.Distance.squaredDistance(4.182726770879422E256d, 9882.0d, 3.4778825197957035E62d, 7.559791763329309E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double4 = code.src.Distance.squaredDistance(5.749414470161792E251d, 8.34116319834633E30d, 0.0d, 2.7191106511481887E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        long[] longArray59 = new long[] { 'a', 1L };
        long[] longArray62 = new long[] { 0, (short) -1 };
        long[] longArray65 = new long[] { (short) -1, (short) -1 };
        long long66 = code.src.Distance.chebyshevDistance(longArray62, longArray65);
        long long67 = code.src.Distance.chebyshevDistance(longArray59, longArray65);
        long[] longArray70 = new long[] { 'a', 1L };
        long[] longArray73 = new long[] { 0, (short) -1 };
        long[] longArray76 = new long[] { (short) -1, (short) -1 };
        long long77 = code.src.Distance.chebyshevDistance(longArray73, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray70, longArray76);
        long long79 = code.src.Distance.chebyshevDistance(longArray65, longArray76);
        long[] longArray82 = new long[] { 'a', 1L };
        long[] longArray85 = new long[] { 0, (short) -1 };
        long[] longArray88 = new long[] { (short) -1, (short) -1 };
        long long89 = code.src.Distance.chebyshevDistance(longArray85, longArray88);
        long long90 = code.src.Distance.chebyshevDistance(longArray82, longArray88);
        long long91 = code.src.Distance.chebyshevDistance(longArray76, longArray88);
        long long92 = code.src.Distance.chebyshevDistance(longArray54, longArray88);
        long long93 = code.src.Distance.chebyshevDistance(longArray31, longArray54);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray54);
        java.lang.Class<?> wildcardClass95 = longArray8.getClass();
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
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 98L + "'", long67 == 98L);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 98L + "'", long78 == 98L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 1L + "'", long89 == 1L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 98L + "'", long90 == 98L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double double4 = code.src.Distance.squaredDistance((double) 1, 1.4311155692585877E128d, 3.0568118497974055E15d, 1.738941196953288E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0480917725743317E256d + "'", double4 == 2.0480917725743317E256d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double4 = code.src.Distance.squaredDistance(1.231115082248268E64d, 1.3186892203577162E31d, 2.1256144753928608E128d, 7.447258393539782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double4 = code.src.Distance.euclideanDistance(2.9064639308329233E248d, 1.891459241752112E125d, 1.2093895208085425E64d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double double4 = code.src.Distance.squaredDistance(2.24721340011667E248d, 2.406503766581682E12d, 8.030925665076586E87d, 4.31382490545285E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        double double4 = code.src.Distance.euclideanDistance(8.991400839766758E43d, 0.0d, 278906.09975124226d, 8.426822856338381E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.426822856338381E123d + "'", double4 == 8.426822856338381E123d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double double4 = code.src.Distance.euclideanDistance(7.559791763325273E123d, 2.4389908525564578E124d, 4.347353086803702E62d, 1225.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.55346448847492E124d + "'", double4 == 2.55346448847492E124d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double double4 = code.src.Distance.euclideanDistance(8.991400839772116E43d, 4.485950827314113E256d, 2.721524969160516E125d, 2.884474619048523E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double4 = code.src.Distance.euclideanDistance(8.341162879156255E30d, 140.71602609511115d, Double.POSITIVE_INFINITY, 2.3432186456900772E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double4 = code.src.Distance.squaredDistance(6.151508697220018E30d, 1552637.0032203277d, 100.0d, 9.466542772834739E21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7841059251973525E61d + "'", double4 == 3.7841059251973525E61d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double4 = code.src.Distance.euclideanDistance(1.2074554820296805E32d, 4.5182371542091934E256d, 7.559791544504537E125d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        double double4 = code.src.Distance.euclideanDistance(217.94165335165133d, 6.556084846139649E12d, (double) 0, 1.1294636811790911E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1294636811790911E99d + "'", double4 == 1.1294636811790911E99d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double double4 = code.src.Distance.squaredDistance(3.833637407942809E63d, 6.556084846280365E12d, 1.45794860122975E64d, 6.117725723239335E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7426568024784246E251d + "'", double4 == 3.7426568024784246E251d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double4 = code.src.Distance.squaredDistance(7.559791544504537E125d, 9.32454089993304E30d, 278906.09975124226d, 5.715045150484065E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double double4 = code.src.Distance.euclideanDistance(2.4065001431929946E12d, 3.0621788818790405E248d, 3.0621788818790405E248d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double double4 = code.src.Distance.euclideanDistance(2.406503766581682E12d, 2.3432186456900772E247d, 2.2965057957235622E247d, (double) 98L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double double4 = code.src.Distance.squaredDistance(1.1438880985737782E248d, 2.4389863314950092E124d, 625.0d, 2.721524969160516E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double4 = code.src.Distance.euclideanDistance(5.791260282386601E24d, 5.525939237192507E7d, 3.054769716678889E15d, 4.675240277191704E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        double double4 = code.src.Distance.euclideanDistance(7.590729215407016E125d, 1.069116001870466E124d, 8.694706299424537E61d, 7.559791763325273E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.590793803572108E125d + "'", double4 == 7.590793803572108E125d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double4 = code.src.Distance.squaredDistance(1.3186892203577162E31d, 100.40866620345955d, 4.792173836495848E123d, 1.864891897920854E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.2964930079195337E247d + "'", double4 == 2.2964930079195337E247d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double4 = code.src.Distance.squaredDistance(9.951221440466418E248d, 5.527131720196977E7d, 1.457948741083528E64d, 1.5737202213962112E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double double4 = code.src.Distance.euclideanDistance(1.8649081799851445E31d, 5.525928500007007E7d, 2.948678716579241E31d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double double4 = code.src.Distance.euclideanDistance(5.791260371133832E24d, 122.0d, (double) 100, 1.0329723434258763E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0329723434258763E126d + "'", double4 == 1.0329723434258763E126d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        long long68 = code.src.Distance.chebyshevDistance(longArray42, longArray65);
        long long69 = code.src.Distance.chebyshevDistance(longArray25, longArray42);
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
        long long93 = code.src.Distance.chebyshevDistance(longArray25, longArray89);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray25);
        java.lang.Class<?> wildcardClass95 = longArray25.getClass();
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
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        double double4 = code.src.Distance.squaredDistance(8.050471177320619E123d, 5.5259389E7d, 12313.549023578462d, 5.948654328288417E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double4 = code.src.Distance.euclideanDistance(2.8519907324927616E87d, 8.116214151045995E123d, 6.922552879173873E61d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.116214151045995E123d + "'", double4 == 8.116214151045995E123d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double double4 = code.src.Distance.squaredDistance(5.525994208076646E7d, 2.2840367152798036E31d, 8.08452890614697E87d, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.2710600277457865E249d + "'", double4 == 2.2710600277457865E249d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double4 = code.src.Distance.squaredDistance(2.125614532971372E128d, 1.864891897920854E31d, 5.948676378854077E248d, 5.948654328288416E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double4 = code.src.Distance.squaredDistance(3.4778825197957035E62d, 5.791260381620597E24d, 1.1248441811882996E99d, 7.559791763374577E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.71504515055861E247d + "'", double4 == 5.71504515055861E247d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double4 = code.src.Distance.euclideanDistance(1.0063874635772352E61d, 5.720993474013094E251d, 140.71602609511115d, 3.311955036268193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        double double4 = code.src.Distance.euclideanDistance(3.353869680772834E49d, 2.0234598189585263E246d, 7.559791732617994E123d, 4.840680371280547E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        long[] longArray31 = new long[] { 'a', 1L };
        long[] longArray34 = new long[] { 0, (short) -1 };
        long[] longArray37 = new long[] { (short) -1, (short) -1 };
        long long38 = code.src.Distance.chebyshevDistance(longArray34, longArray37);
        long long39 = code.src.Distance.chebyshevDistance(longArray31, longArray37);
        long long40 = code.src.Distance.chebyshevDistance(longArray26, longArray37);
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray37, longArray49);
        long long53 = code.src.Distance.chebyshevDistance(longArray15, longArray49);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long[] longArray67 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long68 = code.src.Distance.chebyshevDistance(longArray59, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray49, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray5, longArray49);
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray49, longArray79);
        java.lang.Class<?> wildcardClass83 = longArray79.getClass();
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 98L + "'", long39 == 98L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 98L + "'", long51 == 98L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 11L + "'", long68 == 11L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double double4 = code.src.Distance.squaredDistance(4.5182371393605655E256d, 2.553460170097694E124d, 5.463413916504991E251d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double4 = code.src.Distance.squaredDistance(4.1827267651555864E256d, 1.45794860122975E64d, 1.1649654526156026E205d, 3.053611069269292E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double double4 = code.src.Distance.squaredDistance(1.024464211209343E25d, 1.2632922663800816E127d, 3.052698722606791E15d, 2.4389908525564578E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.589750982408489E254d + "'", double4 == 1.589750982408489E254d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double double4 = code.src.Distance.euclideanDistance(10.0d, 2.286018050924669E248d, 5.527200037395124E7d, 3.598765218630986E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double4 = code.src.Distance.squaredDistance(0.0d, (double) 0L, 10.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1124.0d + "'", double4 == 1124.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        double double4 = code.src.Distance.squaredDistance(3.4290270810282753E248d, 8.341162879156251E30d, 2.7676045845140174E123d, 8.694706281769284E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        long[] longArray71 = new long[] { 'a', 1L };
        long[] longArray74 = new long[] { 0, (short) -1 };
        long[] longArray77 = new long[] { (short) -1, (short) -1 };
        long long78 = code.src.Distance.chebyshevDistance(longArray74, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray71, longArray77);
        long long80 = code.src.Distance.chebyshevDistance(longArray53, longArray71);
        long long81 = code.src.Distance.chebyshevDistance(longArray30, longArray71);
        long[] longArray84 = new long[] { 0, (short) -1 };
        long[] longArray87 = new long[] { (short) -1, (short) -1 };
        long long88 = code.src.Distance.chebyshevDistance(longArray84, longArray87);
        long[] longArray95 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long96 = code.src.Distance.chebyshevDistance(longArray87, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray30, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray2, longArray95);
        java.lang.Class<?> wildcardClass99 = longArray2.getClass();
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
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 98L + "'", long79 == 98L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1L + "'", long88 == 1L);
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 11L + "'", long96 == 11L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 97L + "'", long98 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        double double4 = code.src.Distance.euclideanDistance(8.991400839766758E43d, 8.341163188864031E30d, 8.6947061736074E62d, 3.4131590244458324E102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.4131590244458324E102d + "'", double4 == 3.4131590244458324E102d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double4 = code.src.Distance.euclideanDistance(1.889947887669239E125d, 7.559791544536665E125d, 5.715045104064755E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double double4 = code.src.Distance.squaredDistance((double) 10.0f, 5.7150451504902E247d, 2.2964930079195337E247d, 3.0535834157458975E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        double double4 = code.src.Distance.euclideanDistance(5.463413916504991E251d, 103.39245620450265d, 8.694706299452407E61d, 8.084528906135836E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double4 = code.src.Distance.euclideanDistance(1.7996320167102433E254d, 1.3415036402150548E127d, 0.0d, 1.2387871038033346E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double double4 = code.src.Distance.squaredDistance(2.948678716579241E31d, 9.797098384561698E7d, 10205.0d, 3.052698722606791E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694706173607399E62d + "'", double4 == 8.694706173607399E62d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double4 = code.src.Distance.squaredDistance(3.2973523484734863E250d, 2.4805194246531137E124d, 3.0568118497973945E15d, 3.833637407942809E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double4 = code.src.Distance.squaredDistance(7.814857737225062E7d, 8.982275443054642E123d, 3.890305409973818E124d, 8.694706173607399E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5941288904220582E249d + "'", double4 == 1.5941288904220582E249d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        double double4 = code.src.Distance.euclideanDistance(2.553460170097694E124d, 4.7921872029386884E123d, 5.715045104064755E247d, 4.347353086803702E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        long long22 = code.src.Distance.chebyshevDistance(longArray2, longArray19);
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
        long long58 = code.src.Distance.chebyshevDistance(longArray19, longArray54);
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
        long long81 = code.src.Distance.chebyshevDistance(longArray61, longArray78);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray78);
        java.lang.Class<?> wildcardClass83 = longArray19.getClass();
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
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
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) -1, 4.629561777660613E248d, 3.7841059251973525E61d, 5.525994208076646E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double double4 = code.src.Distance.squaredDistance((double) 10.0f, 5.721223146643194E251d, 4.347353086803702E62d, 1.5119583495997528E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double4 = code.src.Distance.squaredDistance(7.562847533034203E125d, 1.0486765404656112E16d, 1.231115082248268E64d, 1.2296171124372597E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.719666280792153E251d + "'", double4 == 5.719666280792153E251d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double4 = code.src.Distance.euclideanDistance(278906.09975124226d, 8.811504548015154E125d, 3.068933012127493E239d, 2.4389863321241504E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        double double4 = code.src.Distance.squaredDistance(7.393566762337766E246d, 2.0234598189585263E246d, 122.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double4 = code.src.Distance.euclideanDistance(8.976783674294438E123d, (double) 11L, 0.0d, 7.862188778636408E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.862701231474445E125d + "'", double4 == 7.862701231474445E125d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray89);
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
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double4 = code.src.Distance.squaredDistance(2.884474619048523E15d, (double) (byte) 10, 9.466542772834739E21d, 1.0329723434258763E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0670318622827465E252d + "'", double4 == 1.0670318622827465E252d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double4 = code.src.Distance.euclideanDistance(6.072806626010396E251d, 7.559791732623826E123d, 1.1929678955220982E32d, 8.982275443054642E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double4 = code.src.Distance.euclideanDistance(1.143009020812949E248d, 8.951751003550235E62d, 2.553460170097694E124d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double4 = code.src.Distance.squaredDistance(1.2652744319531763E198d, 2.3432186456900772E247d, 4.1827267651555864E256d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double4 = code.src.Distance.squaredDistance(3.377784400566722E241d, 1.433007028500352E128d, 8.620276499386763E61d, 1.143009020812949E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 2.2965057957235622E247d, 2.553460170097694E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double4 = code.src.Distance.euclideanDistance(1.918367176323824E125d, 2.1256145316270446E128d, 8.982275443054642E123d, 3.598765218630986E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double double4 = code.src.Distance.euclideanDistance(3.068933012127493E239d, 0.0d, 1225.0d, 7.559791763373738E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double double4 = code.src.Distance.squaredDistance(8.068127213490246E247d, 1.2637714837637312E127d, (double) 101L, 3.598765218630986E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double4 = code.src.Distance.squaredDistance(3.650997547418172E43d, 0.0d, 4.792173836495848E123d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.2964930079195337E247d + "'", double4 == 2.2964930079195337E247d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        double double4 = code.src.Distance.squaredDistance((double) 'a', 5.717560488315264E251d, 1.1267866439017752E64d, 1.4990708455962547E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double4 = code.src.Distance.euclideanDistance(3.3662285038614664E124d, 8.961543206990963E43d, 8.694705670079996E61d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.3662285038614664E124d + "'", double4 == 3.3662285038614664E124d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double4 = code.src.Distance.squaredDistance(8.341162879156255E30d, 3.4290270810282753E248d, 1.7388170690697642E62d, 7.677886613131662E20d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        long[] longArray49 = new long[] { 0L, 'a', 1, 'a', (byte) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray39, longArray49);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = code.src.Distance.chebyshevDistance(longArray0, longArray39);
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
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, 97, 1, 97, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 98L + "'", long50 == 98L);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double4 = code.src.Distance.euclideanDistance(8.694706236541855E62d, 9.466542772840854E21d, 0.0d, 4.654121416639182E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.654121416639182E124d + "'", double4 == 4.654121416639182E124d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double double4 = code.src.Distance.squaredDistance(1811672.00533166d, 100.0d, 6.120040302792729E125d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7454893307807313E251d + "'", double4 == 3.7454893307807313E251d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double4 = code.src.Distance.squaredDistance(6.556084846139649E12d, 3.650997547418172E43d, 8.341162879156251E30d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.013384602956264E125d + "'", double4 == 8.013384602956264E125d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.lang.Class<?> wildcardClass59 = longArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        double double4 = code.src.Distance.squaredDistance(1.8663667958684514E31d, 7.559791732623826E123d, 1.0670318622827465E252d, 3.053533391929702E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double4 = code.src.Distance.euclideanDistance(7.862701231474445E125d, 9.324540899917549E30d, 9.324540890451003E30d, 1.5119583526749173E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.864154807481348E125d + "'", double4 == 7.864154807481348E125d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double4 = code.src.Distance.euclideanDistance(1.918367176323824E125d, (double) 'a', 9882.0d, 9.324540890451006E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.918367176323824E125d + "'", double4 == 1.918367176323824E125d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double4 = code.src.Distance.squaredDistance(1.0486765404656112E16d, 7.559791544536665E125d, 12313.549023578462d, 1.2296178404951322E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715044819684806E251d + "'", double4 == 5.715044819684806E251d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double double4 = code.src.Distance.squaredDistance(9.144408719117394E248d, 5.525929237201556E7d, 3.0239723409974164E124d, 7.559791763329331E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.lang.Class<?> wildcardClass59 = longArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double double4 = code.src.Distance.squaredDistance(8.694706299452407E61d, 4.546779423345663E248d, 7.559791732623792E123d, 12313.553084145538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        long[] longArray40 = new long[] { 'a', 1L };
        long[] longArray43 = new long[] { 0, (short) -1 };
        long[] longArray46 = new long[] { (short) -1, (short) -1 };
        long long47 = code.src.Distance.chebyshevDistance(longArray43, longArray46);
        long long48 = code.src.Distance.chebyshevDistance(longArray40, longArray46);
        long long49 = code.src.Distance.chebyshevDistance(longArray23, longArray46);
        long long50 = code.src.Distance.chebyshevDistance(longArray13, longArray23);
        java.lang.Class<?> wildcardClass51 = longArray13.getClass();
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
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 98L + "'", long48 == 98L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 11L + "'", long50 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double4 = code.src.Distance.squaredDistance(2.2840367152798036E31d, 7.862188778636408E125d, 2.721524969160516E125d, 4.546779423345663E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double double4 = code.src.Distance.euclideanDistance(1.30972997559812E124d, 2.2710600277457865E249d, 5.527131720196977E7d, 278906.09975124226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 2.166084616081951E249d, 4.64617159966005E124d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double double4 = code.src.Distance.euclideanDistance(1.024464211209343E25d, 8.341162879156251E30d, 8.874969428842853E62d, 1.1048109600916608E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double4 = code.src.Distance.euclideanDistance(1.8474736870780683E51d, 5.715044819684806E251d, 9.79709836214289E7d, 8.320188026225052E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double double4 = code.src.Distance.euclideanDistance(7.393566762337766E246d, 1.1416037601853007E32d, 625.0d, 100.40866620345955d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double double4 = code.src.Distance.euclideanDistance(1.2652744319531763E198d, 1.7389572568057607E62d, 278906.09975124226d, 2.55346448847492E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        double double4 = code.src.Distance.euclideanDistance(1.891459241764387E125d, 0.0d, (double) (short) 10, 8.426822856338381E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8933354688488568E125d + "'", double4 == 1.8933354688488568E125d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        long long35 = code.src.Distance.chebyshevDistance(longArray9, longArray32);
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
        long long75 = code.src.Distance.chebyshevDistance(longArray9, longArray59);
        // The following exception was thrown during execution in test generation
        try {
            long long76 = code.src.Distance.chebyshevDistance(longArray0, longArray59);
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
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double double4 = code.src.Distance.euclideanDistance(7.40859570957669E125d, 4.1827267651555864E256d, 8.341163188864031E30d, 3.4131590244458324E102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        double double4 = code.src.Distance.euclideanDistance(2.3498127622806567E12d, 9.466542772840854E21d, (double) (short) -1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.466542772840854E21d + "'", double4 == 9.466542772840854E21d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double double4 = code.src.Distance.euclideanDistance(7.862188778631282E125d, 4.51823713706406E256d, (double) 2L, 9.095699028095402E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double4 = code.src.Distance.squaredDistance(1.589750982408489E254d, 1.2496907143570294E31d, 5.580834364125841E251d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double double4 = code.src.Distance.euclideanDistance(1.2634745840023956E64d, 3.1254847552549246E249d, 3.194965507832467E124d, 6.120040302792729E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double double4 = code.src.Distance.squaredDistance(7.862183193182798E125d, 7.559791763329331E123d, 6.957500350144719E61d, 3.3662285038614664E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.188205857868469E251d + "'", double4 == 6.188205857868469E251d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double4 = code.src.Distance.squaredDistance(3.4778825197957035E62d, 6.587293214563927E247d, 1.223220513063486E125d, 3.326166438578114E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        double double4 = code.src.Distance.euclideanDistance(8.320193817483419E30d, 1811816.0d, 1.0699880226301655E124d, 6.922562533439975E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0699880226301655E124d + "'", double4 == 1.0699880226301655E124d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double4 = code.src.Distance.squaredDistance(7.559791732623814E123d, 1.4579486012297467E64d, 7.559791732623792E123d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9778761674495435E218d + "'", double4 == 4.9778761674495435E218d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double4 = code.src.Distance.euclideanDistance(3.194965507832467E124d, 1.3101817078026575E64d, 9.284544414987072E30d, 1.0486765404643798E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.194965507832467E124d + "'", double4 == 3.194965507832467E124d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double4 = code.src.Distance.squaredDistance(1.4253988300352539E128d, 3.0239723409974164E124d, 5.64433727473721E251d, 8.058264513507916E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double double4 = code.src.Distance.euclideanDistance(3.890201679850891E124d, 2.1177523428484083E128d, 9.324540890451003E30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.117752378578906E128d + "'", double4 == 2.117752378578906E128d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 1, 8.067055176895368E247d, 9.797098384561698E7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double4 = code.src.Distance.squaredDistance(12329.400413486055d, 1.1236897439702315E248d, 8.811504548015154E125d, 5.497143053457335E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double double4 = code.src.Distance.squaredDistance(3.2973523484734863E250d, 2.948678716579241E31d, 1552637.0d, 8.133851138224599E174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double4 = code.src.Distance.euclideanDistance(9.778776737535161E212d, 1.1267866439017752E64d, 9.324540899917549E30d, 9.331617684325628E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double double4 = code.src.Distance.euclideanDistance(4.485950827314113E256d, 5.527131720196977E7d, 1.4319457653113712E123d, 2.4389863314950092E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double4 = code.src.Distance.euclideanDistance(2.6593879130842587E124d, 4.51823713706406E256d, 7433.0d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double4 = code.src.Distance.squaredDistance(2.0481498109123508E256d, 8.341163188864031E30d, 7.864154807481348E125d, 9.32454089993304E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double4 = code.src.Distance.squaredDistance(9.324540899918096E30d, 1.1236897439702315E248d, 4.471374129726301E62d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        double double4 = code.src.Distance.euclideanDistance((double) 2L, 8.694866271304194E61d, 103.39245620450265d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694866271304194E61d + "'", double4 == 8.694866271304194E61d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double4 = code.src.Distance.euclideanDistance(5.791260378563789E24d, 9.324540899933302E30d, 8.991400839772116E43d, 2.244907423513874E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.991400839772116E43d + "'", double4 == 8.991400839772116E43d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 8.068127213490246E247d, (double) 3L, 8.694715983872712E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double double4 = code.src.Distance.euclideanDistance(7.559791653975984E125d, 1.2400472875600966E124d, 1552636.4832506673d, 5.948654328288417E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452407E61d, 5.5218522892182536E247d, 8.350150916003777E100d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double4 = code.src.Distance.squaredDistance(8.793716013138559E63d, (double) 1L, 4.485950827314113E256d, 3.7454893307807313E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double4 = code.src.Distance.squaredDistance(3.353869680772834E49d, 7.559791732617994E123d, 8.859911358917301E125d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.850374433297587E251d + "'", double4 == 7.850374433297587E251d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        long long59 = code.src.Distance.chebyshevDistance(longArray9, longArray56);
        // The following exception was thrown during execution in test generation
        try {
            long long60 = code.src.Distance.chebyshevDistance(longArray0, longArray9);
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
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        double double4 = code.src.Distance.squaredDistance(5.78903989294274E251d, 5.715045150548505E247d, 12313.549023578462d, 2.0504686747931686E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double4 = code.src.Distance.squaredDistance(2.7065537201582164E49d, 0.0d, 9.324546353624267E30d, 3.477821790930845E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.209524440947343E125d + "'", double4 == 1.209524440947343E125d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double4 = code.src.Distance.squaredDistance(9.331617684325628E30d, 1.1267866439017752E64d, 7.413179166381833E250d, 9.778776737535161E212d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        java.lang.Class<?> wildcardClass71 = longArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double4 = code.src.Distance.euclideanDistance(3.0366107867949796E124d, 4.765564004129822E124d, 20.0d, 6.556084846279365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.6508057255525505E124d + "'", double4 == 5.6508057255525505E124d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
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
        long long74 = code.src.Distance.chebyshevDistance(longArray19, longArray58);
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray58, longArray77);
        long[] longArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray58, longArray83);
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
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        long[] longArray60 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long61 = code.src.Distance.chebyshevDistance(longArray52, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray42, longArray60);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray60, longArray65);
        java.lang.Class<?> wildcardClass71 = longArray65.getClass();
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
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 11L + "'", long70 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        double double4 = code.src.Distance.euclideanDistance(3.0239723409974164E124d, 1.2093895208085425E64d, 5.528905595074321E7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0239723409974164E124d + "'", double4 == 3.0239723409974164E124d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double double4 = code.src.Distance.euclideanDistance(8.116214151045995E123d, (double) (short) 100, 3.0559985941685375E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.116214151045995E123d + "'", double4 == 8.116214151045995E123d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double4 = code.src.Distance.euclideanDistance(5.527131618909466E7d, 1.209524440947343E125d, 1.0807149657353284E16d, 1.0329723434258763E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.12019899331142E125d + "'", double4 == 9.12019899331142E125d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double4 = code.src.Distance.euclideanDistance((double) 98L, 1124.0d, 6.261457075442417E31d, 8.722498761879103E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.722498761879103E62d + "'", double4 == 8.722498761879103E62d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double4 = code.src.Distance.squaredDistance(8.694706299426871E61d, 1.918367176323824E125d, 8.34116319834633E30d, 5.749414470161792E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double double4 = code.src.Distance.squaredDistance(2.1256901295443705E128d, 1.695194259018638E248d, 1.5617268815501826E62d, 1.0486765404656112E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double4 = code.src.Distance.euclideanDistance(1.891459241764387E125d, (double) '#', 2.769446841189903E125d, 5.528905595074321E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.779875994255162E124d + "'", double4 == 8.779875994255162E124d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 100.40866620345955d, 20737.0d, 8.050471177320619E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.050471177320619E123d + "'", double4 == 8.050471177320619E123d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        double double4 = code.src.Distance.squaredDistance(10.04987562112089d, 0.0d, 1225.0d, 3.377784400566722E241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double4 = code.src.Distance.squaredDistance(2.2710600277457865E249d, 5.811870955696386E120d, 7.863642449363113E125d, 1.7996320167102433E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        double double4 = code.src.Distance.euclideanDistance(1.4579746669762032E64d, 9.778776737535161E212d, 3.053611124543088E15d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double4 = code.src.Distance.squaredDistance(6.188205857868469E251d, 0.0d, 1.0852821850087336E126d, 2.1177523428484083E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double4 = code.src.Distance.squaredDistance(3.1254847552549246E249d, 2.948678716579241E31d, 8.951751003550235E62d, 6.18368725714255E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double double4 = code.src.Distance.euclideanDistance(7.559791732623792E123d, 4.484874987983141E256d, 5.791260371133755E24d, 2.884474619048523E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        long[] longArray37 = new long[] { 0, (short) -1 };
        long[] longArray40 = new long[] { (short) -1, (short) -1 };
        long long41 = code.src.Distance.chebyshevDistance(longArray37, longArray40);
        long[] longArray48 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long49 = code.src.Distance.chebyshevDistance(longArray40, longArray48);
        long long50 = code.src.Distance.chebyshevDistance(longArray19, longArray48);
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
        long long86 = code.src.Distance.chebyshevDistance(longArray48, longArray59);
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray59, longArray89);
        java.lang.Class<?> wildcardClass95 = longArray89.getClass();
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
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 11L + "'", long86 == 11L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double4 = code.src.Distance.euclideanDistance(3.053611069269292E15d, 2.4389908525564578E124d, 3.353869565834853E49d, 8.866895281429006E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4389908525564578E124d + "'", double4 == 2.4389908525564578E124d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double double4 = code.src.Distance.squaredDistance(1.5941288904220582E249d, 0.0d, 2.24721340011667E248d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double4 = code.src.Distance.euclideanDistance(5.78903989294274E251d, 3.023916486461334E124d, 0.0d, 5.731031078277051E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double4 = code.src.Distance.squaredDistance(7.56145520935968E125d, 9.284544414987072E30d, 4.5182371393605655E256d, 9.32454089993304E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double4 = code.src.Distance.euclideanDistance(5.525928500007007E7d, 12313.549023578462d, 1.2387871038033346E124d, 5.715616324151285E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double4 = code.src.Distance.squaredDistance(2.553460170097694E124d, 2.117752378578906E128d, 9.482299742031001E21d, 2.1256901295443705E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.307309197813705E251d + "'", double4 == 6.307309197813705E251d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double double4 = code.src.Distance.squaredDistance(3.0568118497974055E15d, 8.694706299452407E61d, 5.715045150484065E247d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double4 = code.src.Distance.squaredDistance(1.1473791318585206E252d, 8.976783674294438E123d, 1811816.0d, 1.4579745280790234E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        double double4 = code.src.Distance.squaredDistance(0.0d, 3.053611124543087E15d, 1811717.0d, 9.324540562451319E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694705670079989E61d + "'", double4 == 8.694705670079989E61d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double double4 = code.src.Distance.squaredDistance(2.4389863314950092E124d, 0.0d, (double) 2L, 8.694706299424537E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.948654325219483E248d + "'", double4 == 5.948654325219483E248d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double4 = code.src.Distance.squaredDistance(3.3127290822508215E124d, 4.182726770879422E256d, 5.580834364125841E251d, 3.650997547418172E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double double4 = code.src.Distance.squaredDistance(1.7583641551952374E124d, 5.715045150481383E247d, 7.559790668932122E123d, 9.324546092905923E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        long[] longArray14 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long15 = code.src.Distance.chebyshevDistance(longArray6, longArray14);
        long[] longArray18 = new long[] { 'a', 1L };
        long[] longArray21 = new long[] { 0, (short) -1 };
        long[] longArray24 = new long[] { (short) -1, (short) -1 };
        long long25 = code.src.Distance.chebyshevDistance(longArray21, longArray24);
        long long26 = code.src.Distance.chebyshevDistance(longArray18, longArray24);
        long[] longArray29 = new long[] { 'a', 1L };
        long[] longArray32 = new long[] { 0, (short) -1 };
        long[] longArray35 = new long[] { (short) -1, (short) -1 };
        long long36 = code.src.Distance.chebyshevDistance(longArray32, longArray35);
        long long37 = code.src.Distance.chebyshevDistance(longArray29, longArray35);
        long long38 = code.src.Distance.chebyshevDistance(longArray24, longArray35);
        long[] longArray41 = new long[] { 'a', 1L };
        long[] longArray44 = new long[] { 0, (short) -1 };
        long[] longArray47 = new long[] { (short) -1, (short) -1 };
        long long48 = code.src.Distance.chebyshevDistance(longArray44, longArray47);
        long long49 = code.src.Distance.chebyshevDistance(longArray41, longArray47);
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
        long[] longArray75 = new long[] { 'a', 1L };
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray75, longArray81);
        long long84 = code.src.Distance.chebyshevDistance(longArray69, longArray81);
        long long85 = code.src.Distance.chebyshevDistance(longArray47, longArray81);
        long long86 = code.src.Distance.chebyshevDistance(longArray24, longArray47);
        long long87 = code.src.Distance.chebyshevDistance(longArray6, longArray47);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray0, longArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11L + "'", long15 == 11L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 98L + "'", long26 == 98L);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 98L + "'", long37 == 98L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 98L + "'", long49 == 98L);
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
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 98L + "'", long83 == 98L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double4 = code.src.Distance.squaredDistance(5.731031078277051E251d, 5.463413916504991E251d, 7.732944131972951E127d, 9.324540899917549E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double double4 = code.src.Distance.squaredDistance((-1.0d), 3.053611124543097E15d, 6.17830490479184E248d, 5.715045150484065E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double4 = code.src.Distance.squaredDistance(7.786590871947086E125d, 5.714207540805018E247d, 6.188205857868469E251d, 1.143009020812949E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        double double4 = code.src.Distance.euclideanDistance(1.433158224335312E128d, 10.0d, 8.961543206990963E43d, 8.426822856338381E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4331582268127545E128d + "'", double4 == 1.4331582268127545E128d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double double4 = code.src.Distance.squaredDistance((double) 1.0f, 8.991400839766758E43d, 1.1048109600916608E249d, 7.32543304010228E98d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double double4 = code.src.Distance.euclideanDistance(1.45794860122975E64d, 8.694706173607399E62d, 0.0d, 1.1438880985737782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double4 = code.src.Distance.euclideanDistance(7.559791763329309E123d, 2.0850307160336277E31d, 5.525929037215044E7d, 8.133851138224599E174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double double4 = code.src.Distance.squaredDistance(3.056811849797306E15d, 1.0997224744491414E32d, (double) (short) 0, (double) 11L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2093895208085425E64d + "'", double4 == 1.2093895208085425E64d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        double double4 = code.src.Distance.squaredDistance(5.525929037215044E7d, 1.8648415840790313E31d, 1.1236897393274192E248d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double4 = code.src.Distance.euclideanDistance(1.1649654526156026E205d, 6.923658324661806E125d, 2.7065537201582164E49d, 7.559791763325273E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double double4 = code.src.Distance.euclideanDistance(9882.0d, 8.694706299424537E61d, 8.874969428842853E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.917458244322077E62d + "'", double4 == 8.917458244322077E62d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double4 = code.src.Distance.euclideanDistance(3.023916486461334E124d, 5.797197117558862E24d, 10205.0d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 100, 10205.0d, 1.1929678955220982E32d, 7.559791763325273E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045150484065E247d + "'", double4 == 5.715045150484065E247d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 10, 2.1092217904410153E248d, 1.1958657793748695E32d, 4.654121416639182E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.298224851119434E25d, 2.4805194246531137E124d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4805194246531137E124d + "'", double4 == 2.4805194246531137E124d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double4 = code.src.Distance.squaredDistance(12329.400413486055d, 1.5119583495997528E124d, 3.0568077560623055E15d, 8.793716013138559E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.286018050924408E248d + "'", double4 == 2.286018050924408E248d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double4 = code.src.Distance.squaredDistance(8.320193827934524E30d, 625.0d, 0.0d, 9.797098384561698E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.922562533439975E61d + "'", double4 == 6.922562533439975E61d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        double double4 = code.src.Distance.squaredDistance(7.635389630576875E125d, 7.590729215407016E125d, 8.99140083977295E43d, 3.377784400566722E241d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double double4 = code.src.Distance.squaredDistance(7.862188778636408E125d, 2.7191106511481887E123d, 278906.09975124226d, 1.602837247029983E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        long long33 = code.src.Distance.chebyshevDistance(longArray13, longArray30);
        long[] longArray36 = new long[] { 0, (short) -1 };
        long[] longArray39 = new long[] { (short) -1, (short) -1 };
        long long40 = code.src.Distance.chebyshevDistance(longArray36, longArray39);
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long[] longArray54 = new long[] { 'a', 1L };
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray54, longArray60);
        long long63 = code.src.Distance.chebyshevDistance(longArray49, longArray60);
        long[] longArray66 = new long[] { 'a', 1L };
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray66, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray49, longArray72);
        long long76 = code.src.Distance.chebyshevDistance(longArray39, longArray72);
        long[] longArray82 = new long[] { 0L, 'a', 1, 'a', (byte) -1 };
        long long83 = code.src.Distance.chebyshevDistance(longArray72, longArray82);
        long long84 = code.src.Distance.chebyshevDistance(longArray13, longArray82);
        long long85 = code.src.Distance.chebyshevDistance(longArray8, longArray82);
        java.lang.Class<?> wildcardClass86 = longArray8.getClass();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 98L + "'", long51 == 98L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 98L + "'", long62 == 98L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[0, 97, 1, 97, -1]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 98L + "'", long83 == 98L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 97L + "'", long84 == 97L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 98L + "'", long85 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        long long46 = code.src.Distance.chebyshevDistance(longArray26, longArray43);
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
        long[] longArray95 = new long[] { 0L, 'a', 1, 'a', (byte) -1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray85, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray26, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray20, longArray95);
        // The following exception was thrown during execution in test generation
        try {
            long long99 = code.src.Distance.chebyshevDistance(longArray0, longArray95);
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 98L + "'", long46 == 98L);
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
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[0, 97, 1, 97, -1]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 98L + "'", long96 == 98L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 97L + "'", long97 == 97L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        long[] longArray31 = new long[] { 'a', 1L };
        long[] longArray34 = new long[] { 0, (short) -1 };
        long[] longArray37 = new long[] { (short) -1, (short) -1 };
        long long38 = code.src.Distance.chebyshevDistance(longArray34, longArray37);
        long long39 = code.src.Distance.chebyshevDistance(longArray31, longArray37);
        long long40 = code.src.Distance.chebyshevDistance(longArray26, longArray37);
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray37, longArray49);
        long long53 = code.src.Distance.chebyshevDistance(longArray15, longArray49);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long[] longArray67 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long68 = code.src.Distance.chebyshevDistance(longArray59, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray49, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray5, longArray49);
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray49, longArray79);
        java.lang.Class<?> wildcardClass83 = longArray49.getClass();
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 98L + "'", long39 == 98L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 98L + "'", long51 == 98L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 11L + "'", long68 == 11L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double4 = code.src.Distance.squaredDistance(144.0d, 5.720993474013094E251d, 12313.549023578462d, 8.013384602956264E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.527200037395124E7d, (double) (byte) 10, 1.457948741083528E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.457948741083528E64d + "'", double4 == 1.457948741083528E64d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double4 = code.src.Distance.euclideanDistance(1.069116001870466E124d, 1.4579486012297467E64d, 1.2387871038033346E124d, 2.244898434111624E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.251301237575268E124d + "'", double4 == 2.251301237575268E124d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double double4 = code.src.Distance.squaredDistance(8.866898431039124E62d, 3.052698722606791E15d, 5.829917481072086E251d, 1.2637714837637312E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double4 = code.src.Distance.squaredDistance(1.453465767405697E125d, (double) (short) 0, 8.694705670079989E61d, 1.3186892203577162E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1125627370202318E250d + "'", double4 == 2.1125627370202318E250d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        java.lang.Class<?> wildcardClass71 = longArray68.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray78, longArray90);
        long long94 = code.src.Distance.chebyshevDistance(longArray56, longArray90);
        long long95 = code.src.Distance.chebyshevDistance(longArray43, longArray56);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray43);
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
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double4 = code.src.Distance.squaredDistance(3.068933012127493E239d, 100.40866620345955d, 1.177837421097331E252d, 5.811870955696386E120d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double4 = code.src.Distance.squaredDistance(1.060042331216179E124d, (double) 0L, 9.351743906023566E30d, 7.590793803572108E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.763138746578841E251d + "'", double4 == 5.763138746578841E251d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double4 = code.src.Distance.squaredDistance(1.1236897393274192E248d, 12329.400413486055d, (double) 101L, 4.792173836495848E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double double4 = code.src.Distance.euclideanDistance(8.976783674294438E123d, 1.8649081799905601E31d, 1.1503513373584828E252d, 3.0918445022754607E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double double4 = code.src.Distance.euclideanDistance(8.694706299424537E61d, 4.849373849148842E124d, 2.0850307160336277E31d, 1124.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.849373849148842E124d + "'", double4 == 4.849373849148842E124d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double4 = code.src.Distance.squaredDistance(20084.432052190223d, 8.991400839772116E43d, 5.5259489E7d, 8.694866271304194E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.56006994758633E123d + "'", double4 == 7.56006994758633E123d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double double4 = code.src.Distance.squaredDistance(5.603244642552161E251d, 2.964908885240041E122d, 3.833637407942809E63d, 1.8663667958684514E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double4 = code.src.Distance.euclideanDistance(7.559791763325273E123d, 4.485950827314113E256d, 8.341162879156255E30d, 1.4579746669762032E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double double4 = code.src.Distance.squaredDistance(4.298224851119434E25d, 1.024464211209343E25d, 8.69470629945289E61d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763374577E123d + "'", double4 == 7.559791763374577E123d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double double4 = code.src.Distance.euclideanDistance(1.024464211209343E25d, 5.7150451504902E247d, 3.353869668626517E49d, 4.5182371542091934E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double4 = code.src.Distance.euclideanDistance(2.0786247129419894E256d, 5.5218522892182536E247d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double double4 = code.src.Distance.euclideanDistance(9.324540890466497E30d, 1.589750982408489E254d, 1.0852821850087336E126d, 2.721524969160516E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 'a', 1L };
        long[] longArray6 = new long[] { 0, (short) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) -1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray6, longArray9);
        long long11 = code.src.Distance.chebyshevDistance(longArray3, longArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = code.src.Distance.chebyshevDistance(longArray0, longArray3);
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
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double4 = code.src.Distance.squaredDistance(6.922562533439975E61d, 1.5617254340936532E62d, 144.0d, 2.1092217904410153E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double4 = code.src.Distance.euclideanDistance(1.43186707723895E64d, 2.9064639308329233E248d, 2.7030845353965203E124d, 7.562847533034203E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double double4 = code.src.Distance.squaredDistance(6.957500350144719E61d, 7.5597917633235E123d, 7.862188778636408E125d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.18529391824118E251d + "'", double4 == 6.18529391824118E251d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double double4 = code.src.Distance.euclideanDistance(6.923658324661806E125d, 8.08452890614697E87d, 9.324546092905923E30d, 6.922552879173873E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.923658324661806E125d + "'", double4 == 6.923658324661806E125d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.lang.Class<?> wildcardClass59 = longArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double4 = code.src.Distance.euclideanDistance(2.7065537201582164E49d, 0.0d, 1.511958349599839E124d, 1.102865396833695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.511958349599839E124d + "'", double4 == 1.511958349599839E124d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        double double4 = code.src.Distance.squaredDistance(5.603244642552161E251d, 6.17830490479184E248d, 7.413179166381833E250d, 2.1256141238277748E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double4 = code.src.Distance.euclideanDistance(1.8474736870780683E51d, 8.806176891199752E248d, 3.0568118497973945E15d, 6.151502905962372E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        double double4 = code.src.Distance.squaredDistance(5.721223146643194E251d, 2.0234598189585263E246d, 5.524950700000004E7d, 1.1929678834484718E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double4 = code.src.Distance.squaredDistance(9.284544414987072E30d, 1.4331582268127545E128d, 3.0568118497973945E15d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.172449883594742E250d + "'", double4 == 4.172449883594742E250d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double double4 = code.src.Distance.squaredDistance(1.891459241764387E125d, 8.694706236541855E62d, 1.0807149657353284E16d, 3.4778825197957035E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.5776180632559095E250d + "'", double4 == 3.5776180632559095E250d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double4 = code.src.Distance.squaredDistance(6.957499817664781E61d, 8.722498761879103E62d, 1.8649081799905601E31d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.656605268811053E125d + "'", double4 == 7.656605268811053E125d);
    }
}

