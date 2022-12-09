import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 10, 4.5182371542091934E256d, 3.02286459429887E15d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double4 = code.src.Distance.squaredDistance(1.589750982408489E254d, 8.694705670080019E61d, 2.0451715735252107E128d, 4.792173836495848E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double4 = code.src.Distance.euclideanDistance(2.12553893505374E128d, 5.715045150490167E247d, 7.559791763373738E123d, 1.2055760644133702E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double4 = code.src.Distance.squaredDistance(2.316460326605626E249d, 1.8663667958684514E31d, 2.1256144767371883E128d, 7.891149462745871E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double4 = code.src.Distance.squaredDistance(2.0451715735252107E128d, 7.786532742293105E125d, 140.71602609511115d, 9.324546353624267E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.1827873952477334E256d + "'", double4 == 4.1827873952477334E256d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double4 = code.src.Distance.euclideanDistance(4.793704459665872E251d, 6.923824166576346E125d, 5.714207540805018E247d, 1.4331582268127545E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double4 = code.src.Distance.euclideanDistance(8.69470629945289E61d, 2.1256144753928608E128d, 2.125614532971372E128d, 1.177837421097331E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double4 = code.src.Distance.euclideanDistance(4.8406811122263884E123d, 5.57426963143218E251d, 1.333420484783642E125d, (double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double4 = code.src.Distance.euclideanDistance(4.546779423345663E248d, 0.0d, 6.540349417685828E256d, 2.1125627370202318E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double4 = code.src.Distance.euclideanDistance(2.244907423513874E31d, 5.9798424948214894E255d, 9.482299742031001E21d, 4.1827267651555864E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        long long82 = code.src.Distance.chebyshevDistance(longArray44, longArray78);
        long long83 = code.src.Distance.chebyshevDistance(longArray20, longArray78);
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray0, longArray20);
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
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double4 = code.src.Distance.euclideanDistance(5.068357262307933E248d, 1.2094207749824497E64d, 7.416985483562336E245d, 1.433007028500352E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double4 = code.src.Distance.squaredDistance(8.694706236541855E62d, 8.08452890614697E87d, 2.2710600277457865E249d, 2.251301237575268E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        long[] longArray10 = new long[] { 100L, 1 };
        long long11 = code.src.Distance.chebyshevDistance(longArray6, longArray10);
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
        long long41 = code.src.Distance.chebyshevDistance(longArray27, longArray38);
        long long42 = code.src.Distance.chebyshevDistance(longArray17, longArray27);
        long long43 = code.src.Distance.chebyshevDistance(longArray6, longArray17);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = code.src.Distance.chebyshevDistance(longArray0, longArray17);
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double4 = code.src.Distance.euclideanDistance(3.559657110785834E251d, 8.841771681470747E249d, 4.183411062201243E256d, 5.749414470161792E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double4 = code.src.Distance.euclideanDistance(4.546779423345663E248d, 6.923658324661806E125d, 2.575569517141002E250d, 2.3432193417162093E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double4 = code.src.Distance.squaredDistance(4.793704459665872E251d, 3.054769716678889E15d, 4.183411062201243E256d, 6.385337334710284E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double4 = code.src.Distance.squaredDistance(0.0d, 4.792173836495848E123d, 0.0d, 2.166084616081951E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double4 = code.src.Distance.squaredDistance(8.859911358917301E125d, 7.656605268811053E125d, 8.779875994255162E124d, 1.4764533763248394E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0190538431654038E252d + "'", double4 == 1.0190538431654038E252d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double4 = code.src.Distance.euclideanDistance(8.694706299452407E61d, 1811717.0d, 2.053509149446454E256d, 3.772588879245304E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double4 = code.src.Distance.euclideanDistance(2.316460326605626E249d, 6.820197224490154E125d, 4.630067801207703E249d, 20084.432052190223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double4 = code.src.Distance.squaredDistance(8.866895281429006E62d, 1.2387871038033346E124d, 3.598765218630986E247d, 6.520158840275344E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double4 = code.src.Distance.squaredDistance(5.717560488315264E251d, 1.2496907143570294E31d, 0.0d, 1.5737202213962112E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double4 = code.src.Distance.euclideanDistance((double) 'a', 3.3127290822508215E124d, 1.2387871038033346E124d, 8.320193827934524E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.536773594809233E124d + "'", double4 == 3.536773594809233E124d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double4 = code.src.Distance.euclideanDistance(2.053942520745898E256d, 12313.553084145538d, 1.4251979253203356E128d, 2.24721340011667E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double4 = code.src.Distance.euclideanDistance(2.0234598189585263E246d, 3.772588879245304E249d, 7.406698157764146E250d, 103.39245620450265d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double4 = code.src.Distance.euclideanDistance(1.2496907143570294E31d, 0.0d, 1.33937091808876E127d, 3.3127290822508215E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3393750148468128E127d + "'", double4 == 1.3393750148468128E127d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double4 = code.src.Distance.euclideanDistance(2.4805194246531137E124d, 2.3848836126517604E124d, 1.8663667958684514E31d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double4 = code.src.Distance.euclideanDistance(6.972502032003872E201d, 1.0997224744491414E32d, 5.715045150481383E247d, 1.7683618323195464E53d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double4 = code.src.Distance.squaredDistance(5.791260381620597E24d, 1.3179319637108076E128d, 5.53979513351125E119d, 7.590793803572108E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7169939815538626E256d + "'", double4 == 1.7169939815538626E256d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray49, longArray73);
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
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double4 = code.src.Distance.squaredDistance(6.20393819963367E251d, 8.779875994255162E124d, 4.5182371393605655E256d, 5.715045150490167E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double4 = code.src.Distance.euclideanDistance(9.324540890451003E30d, 7.559791763373738E123d, 5.948654325219483E248d, 3.598765218630986E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double4 = code.src.Distance.euclideanDistance((double) 1.0f, 1.7389572568057607E62d, 5.280231960268402E251d, 7.559791763323488E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double4 = code.src.Distance.euclideanDistance(3.559657110785834E251d, 2.0480917725743317E256d, 9.324546092905923E30d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
            long long24 = code.src.Distance.chebyshevDistance(longArray0, longArray9);
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double4 = code.src.Distance.squaredDistance(2.285850535203458E248d, 8.116214151045995E123d, 2.1256144767371883E128d, 2.0539425682826672E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double4 = code.src.Distance.squaredDistance(2.125614474048533E128d, 4.485940704933021E256d, 7.559791763374587E123d, 7.864154807481348E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double4 = code.src.Distance.euclideanDistance(1.772143783377933E61d, (double) 97L, 3.2831858166490743E124d, 5.250078299133718E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double4 = code.src.Distance.euclideanDistance(3.068933012127493E239d, 9922.0d, 1.1236897439702315E248d, 1.4417436355488089E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.0699880226301655E124d, 4.840680371280547E123d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double4 = code.src.Distance.euclideanDistance(1.1048109600916608E249d, 7.559791653975984E125d, 5.948654325219483E248d, 7.862701231474445E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double4 = code.src.Distance.squaredDistance(1.7583641551952374E124d, 3.1254847552549246E249d, 7.786532742293105E125d, 3.890305409973818E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double4 = code.src.Distance.euclideanDistance(8.94428757683438E62d, 2.0450959756078844E128d, 2.0786247129419894E256d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double4 = code.src.Distance.euclideanDistance(5.714207540805018E247d, 3.0580621176685875E15d, 3.746054054544959E251d, 1.3101817078026575E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double4 = code.src.Distance.euclideanDistance(3.772588879245304E249d, 9.324540899933302E30d, 6.192723950656815E251d, 1.918367176323824E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double4 = code.src.Distance.euclideanDistance(9.144408719117394E248d, 1.2637714837637312E127d, 7.559791763367894E123d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double4 = code.src.Distance.squaredDistance(5.310434588680901E251d, 1.7388170690697642E62d, 2.0539425682826672E256d, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double4 = code.src.Distance.euclideanDistance(3.02286459429887E15d, 5.525929037215044E7d, 4.1811108493051547E256d, 2.5156683110561225E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double4 = code.src.Distance.squaredDistance(2.719110673110582E123d, 9.324540899982978E30d, 1.772143783377933E61d, 2.7030845353965203E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.380601634026061E248d + "'", double4 == 7.380601634026061E248d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double4 = code.src.Distance.euclideanDistance((double) 101L, 4.877950885822437E248d, 1.9395881659392382E249d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double4 = code.src.Distance.squaredDistance(3.0535834157458975E15d, 2.6593879130842587E124d, (double) (byte) -1, 7.610605585266955E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.394413031427706E251d + "'", double4 == 5.394413031427706E251d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        long[] longArray74 = new long[] { 'a', 1L };
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray74, longArray80);
        long long83 = code.src.Distance.chebyshevDistance(longArray69, longArray80);
        long[] longArray86 = new long[] { 'a', 1L };
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray86, longArray92);
        long long95 = code.src.Distance.chebyshevDistance(longArray80, longArray92);
        long long96 = code.src.Distance.chebyshevDistance(longArray52, longArray92);
        long long97 = code.src.Distance.chebyshevDistance(longArray48, longArray92);
        long long98 = code.src.Distance.chebyshevDistance(longArray31, longArray92);
        java.lang.Class<?> wildcardClass99 = longArray92.getClass();
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
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 98L + "'", long82 == 98L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 98L + "'", long96 == 98L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 11L + "'", long97 == 11L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double4 = code.src.Distance.squaredDistance(1.74402177078084E62d, 6.957499817661427E61d, 3.2973523484734863E250d, 1.2857893850944086E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double4 = code.src.Distance.squaredDistance(8.99140083977295E43d, 1.574966483660244E62d, 4.484875220721362E256d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) 0, 7.559791544536665E125d, 2.286018050924408E248d, 122.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double4 = code.src.Distance.euclideanDistance(4.717807507424959E124d, 6.301988755686634E251d, 1.3415049736556993E127d, 7.786532742293105E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double4 = code.src.Distance.euclideanDistance(3.02286459429887E15d, 1.5649646924973942E62d, 1.3393750148468128E127d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3393750148468128E127d + "'", double4 == 1.3393750148468128E127d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double4 = code.src.Distance.squaredDistance(1.143009020812949E248d, 1.453465767405697E125d, 7.862188778631282E125d, 1.1047365604210307E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double4 = code.src.Distance.euclideanDistance(8.067055176895368E247d, 5.525929237201556E7d, (double) 11L, 2.3432193630265306E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double4 = code.src.Distance.squaredDistance(10105.000049480455d, 3.353869668626517E49d, 6.957500334326037E61d, 2.3432186456900772E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double4 = code.src.Distance.squaredDistance((double) 0, 1811707.0012909174d, 6.182228556491662E251d, 3.353869668626517E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double4 = code.src.Distance.euclideanDistance(1811672.00533166d, 2.4389863321241504E124d, 2.0539425682826672E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.166084616081951E249d, 4.64617159966005E124d, 4.182726770879422E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double4 = code.src.Distance.euclideanDistance(5.53979513351125E119d, 8.866895281429006E62d, 5.715045150481383E247d, 5.52593680000932E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double4 = code.src.Distance.squaredDistance(5.786405680011157E251d, 8.694706299423517E61d, 2.719111392042953E123d, 1.4328545305891465E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.0329723434258763E126d, 5.545562436161672E251d, 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double4 = code.src.Distance.euclideanDistance(7.590729215407016E125d, (double) (byte) 1, 2.406503766581682E12d, 6.151502905962372E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.590729215407016E125d + "'", double4 == 7.590729215407016E125d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double4 = code.src.Distance.squaredDistance(7.562847533034203E125d, 1.5737202213962112E124d, 4.1811108493051547E256d, 5.811870955696386E120d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double4 = code.src.Distance.squaredDistance((double) (-1L), 1.951229426380269E125d, 3.8265338665801504E250d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double4 = code.src.Distance.squaredDistance(1.457948741083528E64d, (double) 0, 2.4805194246531137E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.152976616081415E248d + "'", double4 == 6.152976616081415E248d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double4 = code.src.Distance.euclideanDistance(2.3848836126517604E124d, 2.2710600277457865E249d, 1811816.0d, 5.717560488315264E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        long[] longArray51 = new long[] { 'a', 1L };
        long[] longArray54 = new long[] { 0, (short) -1 };
        long[] longArray57 = new long[] { (short) -1, (short) -1 };
        long long58 = code.src.Distance.chebyshevDistance(longArray54, longArray57);
        long long59 = code.src.Distance.chebyshevDistance(longArray51, longArray57);
        long[] longArray62 = new long[] { 'a', 1L };
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray62, longArray68);
        long long71 = code.src.Distance.chebyshevDistance(longArray57, longArray68);
        long[] longArray74 = new long[] { 'a', 1L };
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray74, longArray80);
        long long83 = code.src.Distance.chebyshevDistance(longArray68, longArray80);
        long long84 = code.src.Distance.chebyshevDistance(longArray46, longArray80);
        long long85 = code.src.Distance.chebyshevDistance(longArray23, longArray46);
        long long86 = code.src.Distance.chebyshevDistance(longArray5, longArray46);
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray46, longArray92);
        java.lang.Class<?> wildcardClass95 = longArray46.getClass();
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
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 98L + "'", long59 == 98L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 98L + "'", long70 == 98L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 98L + "'", long82 == 98L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double4 = code.src.Distance.euclideanDistance(3.0568118497974055E15d, 4.183411062201243E256d, 1.864891897920854E31d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double4 = code.src.Distance.squaredDistance(2.5993022064039992E249d, 2.261894190902627E124d, 103.39245620450265d, 3.650997547418172E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double4 = code.src.Distance.squaredDistance(3.053611124543097E15d, 0.0d, 5.823190847653043E249d, 1.4579746669762032E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        long[] longArray76 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long77 = code.src.Distance.chebyshevDistance(longArray68, longArray76);
        long long78 = code.src.Distance.chebyshevDistance(longArray46, longArray68);
        long[] longArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray68, longArray79);
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
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double4 = code.src.Distance.euclideanDistance(1.2046853507841718E252d, 5.791260371133755E24d, 8.694706299426858E61d, 5.869790192858356E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double4 = code.src.Distance.euclideanDistance(1.0695270443395895E124d, 8.694705670079989E61d, 5.717877332771251E251d, 2.1256144753928608E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double4 = code.src.Distance.squaredDistance(4.793704459665872E251d, 8.811504548015154E125d, 5.525929237201556E7d, 2.4065001431929946E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double4 = code.src.Distance.euclideanDistance(2.5619922088623362E128d, 7.416985483562336E245d, 6.520158840275344E248d, 1.5891483284062439E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double4 = code.src.Distance.squaredDistance(9.351743915519625E30d, 5.792131737449658E251d, 3.657106231571092E249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double4 = code.src.Distance.euclideanDistance(5.864222144890665E251d, 1.177837421097331E252d, 4.5182371393605655E256d, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double4 = code.src.Distance.euclideanDistance(8.320188026225052E30d, 5.527131720196977E7d, 3.053611124543088E15d, 3.571903018105419E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double4 = code.src.Distance.euclideanDistance(8.133851138224599E174d, 7.677886613131662E20d, 3.3127290822508215E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double4 = code.src.Distance.squaredDistance(1.3415049736556993E127d, 5.865141437237654E125d, 1.2637714837637312E127d, 5.715045150484065E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double4 = code.src.Distance.squaredDistance((double) 100L, 0.0d, 1.457948741083528E64d, 1.1416037601853007E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256145316270446E128d + "'", double4 == 2.1256145316270446E128d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double4 = code.src.Distance.euclideanDistance(1.3186892203577162E31d, 1.5119583526749173E124d, 2.2840367152798036E31d, 9.79709836214289E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5119583526749173E124d + "'", double4 == 1.5119583526749173E124d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double4 = code.src.Distance.squaredDistance(0.0d, 9.951221440466418E248d, 2.053942520745898E256d, 1.0486765404643798E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double4 = code.src.Distance.squaredDistance(2.286018050924408E248d, 1.333420484783642E125d, 6.923658324661806E125d, 2.5573985948136816E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double4 = code.src.Distance.euclideanDistance(4.794956959071923E255d, 8.899687221465109E59d, 1.589750982408489E254d, 9.324540890452801E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double4 = code.src.Distance.euclideanDistance(7.862701231474445E125d, 0.0d, 8.694705670079989E61d, 3.053611124543087E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.862701231474445E125d + "'", double4 == 7.862701231474445E125d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double4 = code.src.Distance.squaredDistance(8.058264513507916E247d, 7.559791763374587E123d, 2.125614498247224E128d, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double4 = code.src.Distance.squaredDistance(5.524950700000004E7d, 3.657106231571092E249d, 5.7150451504902E247d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double4 = code.src.Distance.squaredDistance(3.4131590244458324E102d, 3.577618063209475E250d, 1.0922306970231484E16d, 8.068127213490246E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double4 = code.src.Distance.squaredDistance(2.0452199803289235E128d, 2.553460170097694E124d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.1829248331382305E256d + "'", double4 == 4.1829248331382305E256d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double4 = code.src.Distance.squaredDistance(9.324540899933247E30d, 3.0580621176685875E15d, 9.324546353624267E30d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.447258393539782E248d + "'", double4 == 7.447258393539782E248d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double4 = code.src.Distance.squaredDistance(2.1256144767371883E128d, 5.604659899440947E124d, 3.3127290822508215E124d, 5.720993474013094E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double4 = code.src.Distance.squaredDistance(5.57426963143218E251d, 5.715851632357578E251d, 8.030925665076586E87d, (double) 90L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double4 = code.src.Distance.squaredDistance(1.917769450392853E125d, 9.351743906023566E30d, 2.3848836126517604E124d, 12313.549023578462d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.819984976301837E250d + "'", double4 == 2.819984976301837E250d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double4 = code.src.Distance.squaredDistance(3.2831858166490743E124d, 8.694706281769284E61d, 4.557896970053384E248d, 8.694706281769278E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double4 = code.src.Distance.squaredDistance(2.964908885240041E122d, 6.18368725714255E251d, 1811672.00533166d, 7.559791653975984E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double4 = code.src.Distance.euclideanDistance(6.191637431199285E31d, 5.714207540805018E247d, 8.976783674294438E123d, 2.406503766581682E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double4 = code.src.Distance.euclideanDistance(3.326166438578114E248d, 3.477882519775504E62d, 2.2840367152798036E31d, 7.862701231474445E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
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
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray26, longArray49);
        long long53 = code.src.Distance.chebyshevDistance(longArray16, longArray49);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray49, longArray56);
        long long62 = code.src.Distance.chebyshevDistance(longArray8, longArray56);
        java.lang.Class<?> wildcardClass63 = longArray56.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double4 = code.src.Distance.squaredDistance(1.0670548273407037E252d, 6.53596076341459E175d, 7.416985483562336E245d, 278906.09975124226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double4 = code.src.Distance.squaredDistance(1.4251979253203356E128d, 8.793716013138559E63d, 1552637.0d, 2.8095584331559984E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double4 = code.src.Distance.euclideanDistance(4.793704459665872E251d, (double) (-1.0f), 6.17830490479184E248d, 9.095699028095402E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.1256901295443705E128d, 1.1649654526156026E205d, 6.449576703798581E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double4 = code.src.Distance.euclideanDistance((double) 90L, 1552637.0d, 1.4764533763248394E125d, 4.485940704933021E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double4 = code.src.Distance.euclideanDistance(1.5133238094576941E249d, 5.715044985152495E251d, 0.0d, 7.559791653975984E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double4 = code.src.Distance.euclideanDistance(9.482299742031001E21d, 6.922562533439975E61d, 4.92586451367552E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.177837421097331E252d, 0.0d, 1.203713755180189E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double4 = code.src.Distance.euclideanDistance(1.449255956357967E248d, 144.0d, 1.4300949526255977E64d, 8.067055176895368E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double4 = code.src.Distance.squaredDistance(5.952906869765997E125d, 8.694706299452896E61d, 0.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.54371002001072E251d + "'", double4 == 3.54371002001072E251d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double4 = code.src.Distance.squaredDistance(5.52593680000932E7d, 2.6593879130842587E124d, 3.477821790930845E62d, 1.5377172753851527E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double4 = code.src.Distance.euclideanDistance(1.239466100464527E124d, 1.1929678834484718E32d, (double) (short) 100, 1.097417397239037E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double4 = code.src.Distance.euclideanDistance((double) 1.0f, (double) 11L, 6.307309197813705E251d, 8.824228056978371E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double4 = code.src.Distance.euclideanDistance((-1.0d), 10105.000049480455d, 9.324540890452801E30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.324540890452801E30d + "'", double4 == 9.324540890452801E30d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double4 = code.src.Distance.euclideanDistance(2.8325283023066844E248d, 5.525939237192507E7d, 1.024464211209343E25d, 6.042358993280212E21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        long[] longArray44 = new long[] { 'a', 1L };
        long[] longArray47 = new long[] { 0, (short) -1 };
        long[] longArray50 = new long[] { (short) -1, (short) -1 };
        long long51 = code.src.Distance.chebyshevDistance(longArray47, longArray50);
        long long52 = code.src.Distance.chebyshevDistance(longArray44, longArray50);
        long[] longArray55 = new long[] { 'a', 1L };
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray55, longArray61);
        long long64 = code.src.Distance.chebyshevDistance(longArray50, longArray61);
        long[] longArray67 = new long[] { 'a', 1L };
        long[] longArray70 = new long[] { 0, (short) -1 };
        long[] longArray73 = new long[] { (short) -1, (short) -1 };
        long long74 = code.src.Distance.chebyshevDistance(longArray70, longArray73);
        long long75 = code.src.Distance.chebyshevDistance(longArray67, longArray73);
        long long76 = code.src.Distance.chebyshevDistance(longArray50, longArray73);
        long long77 = code.src.Distance.chebyshevDistance(longArray40, longArray73);
        long[] longArray80 = new long[] { 0, (short) -1 };
        long[] longArray83 = new long[] { (short) -1, (short) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray80, longArray83);
        long long85 = code.src.Distance.chebyshevDistance(longArray73, longArray80);
        long[] longArray89 = new long[] { (byte) 10, 100, (byte) 1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray80, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray31, longArray89);
        java.lang.Class<?> wildcardClass92 = longArray89.getClass();
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
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 98L + "'", long52 == 98L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 98L + "'", long63 == 98L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 98L + "'", long75 == 98L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 101L + "'", long90 == 101L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 101L + "'", long91 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double4 = code.src.Distance.squaredDistance(4.689593133831153E251d, 1.43186707723895E64d, 2.0454154726104665E128d, 7.661073336008042E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double4 = code.src.Distance.euclideanDistance(2.769446841189903E125d, 1.602837247029983E254d, 5.64433727473721E251d, 2.7030845353965203E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double4 = code.src.Distance.euclideanDistance(2.8519907324927616E87d, 1.5891483284062439E254d, 8.341162879156251E30d, 9.324540890451003E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double4 = code.src.Distance.squaredDistance(6.181392456316606E251d, 6.540287573520957E256d, 2.286018050924669E248d, 5.497143053457335E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double4 = code.src.Distance.squaredDistance(2.05329249062104E256d, 9.324535099190634E30d, 1.4251979253203356E128d, 7.559791544504537E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.5133238094576941E249d, 7.814857737225062E7d, 9.951221440466418E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double4 = code.src.Distance.euclideanDistance(2.0481498109123508E256d, (double) 101L, 7.39356285262388E246d, 4.485950827314113E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double4 = code.src.Distance.squaredDistance(5.715851632357578E251d, 7.366529754618401E123d, 6.261457075442417E31d, 2.0452199803289235E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        long[] longArray44 = new long[] { 'a', 1L };
        long[] longArray47 = new long[] { 0, (short) -1 };
        long[] longArray50 = new long[] { (short) -1, (short) -1 };
        long long51 = code.src.Distance.chebyshevDistance(longArray47, longArray50);
        long long52 = code.src.Distance.chebyshevDistance(longArray44, longArray50);
        long[] longArray55 = new long[] { 'a', 1L };
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray55, longArray61);
        long long64 = code.src.Distance.chebyshevDistance(longArray50, longArray61);
        long[] longArray67 = new long[] { 'a', 1L };
        long[] longArray70 = new long[] { 0, (short) -1 };
        long[] longArray73 = new long[] { (short) -1, (short) -1 };
        long long74 = code.src.Distance.chebyshevDistance(longArray70, longArray73);
        long long75 = code.src.Distance.chebyshevDistance(longArray67, longArray73);
        long long76 = code.src.Distance.chebyshevDistance(longArray50, longArray73);
        long long77 = code.src.Distance.chebyshevDistance(longArray40, longArray73);
        long[] longArray80 = new long[] { 0, (short) -1 };
        long[] longArray83 = new long[] { (short) -1, (short) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray80, longArray83);
        long long85 = code.src.Distance.chebyshevDistance(longArray73, longArray80);
        long[] longArray89 = new long[] { (byte) 10, 100, (byte) 1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray80, longArray89);
        long long91 = code.src.Distance.chebyshevDistance(longArray31, longArray89);
        java.lang.Class<?> wildcardClass92 = longArray31.getClass();
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
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 98L + "'", long52 == 98L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 98L + "'", long63 == 98L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 98L + "'", long75 == 98L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 101L + "'", long90 == 101L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 101L + "'", long91 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double4 = code.src.Distance.euclideanDistance(1.6205790789034482E254d, 20.0d, (double) 3L, 1.2296171569516298E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray31, longArray78);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
        java.lang.Class<?> wildcardClass83 = longArray31.getClass();
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
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double4 = code.src.Distance.squaredDistance(1.0d, 3.4131592097982255E102d, 2.262179825118349E251d, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double4 = code.src.Distance.euclideanDistance(3.201844896665003E124d, 7.560644248248633E125d, 2.12553893505374E128d, 1.5377172753851527E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double4 = code.src.Distance.euclideanDistance(7.416985483562336E245d, 9.797098384561698E7d, 3.3662285038614664E124d, 1811717.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.0483124887933698E256d, 3.0621788818790405E248d, 1.3393750148468128E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double4 = code.src.Distance.euclideanDistance(4.792187178455498E123d, 6.449576703798581E175d, 5.791260371133755E24d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double4 = code.src.Distance.squaredDistance(5.791260381620597E24d, 4.5323471056617066E256d, 0.0d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double4 = code.src.Distance.squaredDistance(8.068127213490246E247d, 7.562847533034203E125d, 8.991400839766758E43d, 2.5156683110561225E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double4 = code.src.Distance.squaredDistance((double) 0L, 1.1248441811882996E99d, 7.850374433297587E251d, 9.374059300997487E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double4 = code.src.Distance.squaredDistance(4.1824175494475645E256d, 8.27605827574068E123d, 8.859911358917301E125d, 5.618790528635277E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double4 = code.src.Distance.euclideanDistance((double) (-1L), 1.5656099294436052E250d, 2.6593879130842587E124d, 2.0850307160336277E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double4 = code.src.Distance.squaredDistance(7.447258393539782E248d, 4.717807507424959E124d, 1.2387871038033346E124d, 7.43091669258797E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double4 = code.src.Distance.euclideanDistance(1.380250332732779E124d, 5.763159931203444E251d, 0.0d, 2.8896627685601946E50d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double4 = code.src.Distance.squaredDistance(3.056811849797306E15d, 3.0059284446479725E128d, 6.120040302792729E125d, 5.64433727473721E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        long[] longArray41 = new long[] { 'a', 1L };
        long[] longArray44 = new long[] { 0, (short) -1 };
        long[] longArray47 = new long[] { (short) -1, (short) -1 };
        long long48 = code.src.Distance.chebyshevDistance(longArray44, longArray47);
        long long49 = code.src.Distance.chebyshevDistance(longArray41, longArray47);
        long long50 = code.src.Distance.chebyshevDistance(longArray5, longArray47);
        long[] longArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = code.src.Distance.chebyshevDistance(longArray5, longArray51);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 98L + "'", long49 == 98L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double4 = code.src.Distance.squaredDistance(9.324540899933302E30d, 2.884474619048523E15d, 3.2900143351994137E124d, 2.3498127622806567E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.082419432581764E249d + "'", double4 == 1.082419432581764E249d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double4 = code.src.Distance.squaredDistance(3.3662285038614664E124d, 4.485950827314113E256d, 6.556084846280549E12d, 5.715044819684806E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double4 = code.src.Distance.squaredDistance(9.324540899918096E30d, 2.4065001431929946E12d, 3.571903018105419E250d, 3.4131592097982255E102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double4 = code.src.Distance.squaredDistance(1.7583641551952374E124d, 2.406501954865E12d, 2.0452199803289235E128d, 5.57426963143218E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double4 = code.src.Distance.squaredDistance(9.137715554420027E30d, 3.053611124540608E15d, 1.5617254340936532E62d, 10205.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4389863314950092E124d + "'", double4 == 2.4389863314950092E124d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double4 = code.src.Distance.euclideanDistance(1.097417397239037E249d, 6.301988755686634E251d, 5.527131720196977E7d, 1.3393750148468128E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        long[] longArray0 = null;
        long[] longArray4 = new long[] { 100L, 101L, 98L };
        // The following exception was thrown during execution in test generation
        try {
            long long5 = code.src.Distance.chebyshevDistance(longArray0, longArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100, 101, 98]");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double4 = code.src.Distance.euclideanDistance(1.1248441754132943E99d, 1.4291186487223539E128d, 1.429206919930926E126d, 1.3179319637108076E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1210148155066758E127d + "'", double4 == 1.1210148155066758E127d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double4 = code.src.Distance.squaredDistance(0.0d, 8.694705670079996E61d, 2.7030845353965203E124d, 3.571903018105419E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double4 = code.src.Distance.squaredDistance(1.1090019187308395E257d, 7.559943432502878E125d, 1.231235105847726E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double4 = code.src.Distance.euclideanDistance((double) 1, 3.0535834157458975E15d, 3.056811849797306E15d, 2.406503766581682E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.3190021108187545E15d + "'", double4 == 4.3190021108187545E15d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double4 = code.src.Distance.squaredDistance(1.4579746669762032E64d, 4.48487495250148E256d, 1.2400472875600966E124d, 1.3415049736556993E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double4 = code.src.Distance.squaredDistance(9.715913234165533E248d, 8.341162879156251E30d, 4.792187178455498E123d, 7.559791763367894E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double4 = code.src.Distance.euclideanDistance(1.2637714837637312E127d, 1.9997892004239E64d, 12313.553084145538d, 4.629561777660613E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double4 = code.src.Distance.squaredDistance(2.053509149446454E256d, 2.1256287435569485E128d, 12329.400413486055d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double4 = code.src.Distance.euclideanDistance(2.0480917725743317E256d, 7.559791653975984E125d, 1.078209334929007E252d, 12313.549023578462d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double4 = code.src.Distance.squaredDistance((double) 'a', 6.42143426575965E251d, 6.972502032003872E201d, 3.3607494419832777E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double4 = code.src.Distance.squaredDistance(3.053611124540608E15d, 5.714644157457502E251d, 5.524950700000004E7d, 4.8406811122263884E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double4 = code.src.Distance.squaredDistance(8.320188026225052E30d, 1.0922306970231484E16d, 1.574966483660244E62d, 8.991400839766758E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4805194246531137E124d + "'", double4 == 2.4805194246531137E124d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double4 = code.src.Distance.squaredDistance(1.956152822910355E125d, 278906.09975124226d, 4.484875220721362E256d, 6.923658324661806E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        long[] longArray74 = new long[] { 'a', 1L };
        long[] longArray77 = new long[] { 0, (short) -1 };
        long[] longArray80 = new long[] { (short) -1, (short) -1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray74, longArray80);
        long long83 = code.src.Distance.chebyshevDistance(longArray50, longArray74);
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray0, longArray74);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 98L + "'", long82 == 98L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double4 = code.src.Distance.euclideanDistance(9.59807360434958E15d, 2.6593879130842587E124d, 2.1256287435569485E128d, 1.30972997559812E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.125628747841743E128d + "'", double4 == 2.125628747841743E128d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double4 = code.src.Distance.euclideanDistance(1.1929678834484718E32d, 1.4311155692585877E128d, 1.5133238094576941E249d, 5.310434588680901E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double4 = code.src.Distance.squaredDistance(5.763159931203444E251d, 5.763138746578841E251d, 5.948654328288416E248d, 1.864891897920854E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray70, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray19, longArray70);
        long[] longArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray70, longArray87);
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double4 = code.src.Distance.euclideanDistance(4.485950827314113E256d, 2.0481498109123508E256d, 5.53979513351125E119d, 1.449255956357967E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double4 = code.src.Distance.squaredDistance(20084.432052190223d, 1.3101817078026575E64d, 5.71504515055861E247d, 1.3186892203577162E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double4 = code.src.Distance.euclideanDistance(8.350150916003777E100d, 1.515435523161302E124d, 7.850374433297587E251d, 7.590793803572108E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double4 = code.src.Distance.euclideanDistance(100.0d, 5.720993474013094E251d, 0.0d, 8.34116319834633E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double4 = code.src.Distance.euclideanDistance(9.482299742031001E21d, 1.8649081799851445E31d, 8.426822856338381E123d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.426822856338381E123d + "'", double4 == 8.426822856338381E123d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double4 = code.src.Distance.euclideanDistance(4.557896970053384E248d, 9.324540899933247E30d, 6.972502032003872E201d, 2.117752378578906E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double4 = code.src.Distance.euclideanDistance(3.054769716678889E15d, 3.0568077560623055E15d, 2.719111392042953E123d, 5.52593680000932E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.719111392042953E123d + "'", double4 == 2.719111392042953E123d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.5737202213962112E124d, (-1.0d), 2.0147440391085077E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double4 = code.src.Distance.squaredDistance(8.859911358917301E125d, 9.284544414987072E30d, 5.715045150490167E247d, 217.94165335165133d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double4 = code.src.Distance.euclideanDistance(1.1267866439017752E64d, 9.324540899982978E30d, 5.068357262307933E248d, 8.99140083977295E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 10, 5.714644157457502E251d, 1.462949373248983E250d, 6.151502905962372E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double4 = code.src.Distance.squaredDistance(3.0559985941685375E15d, 4.183411062201243E256d, 4.347353086803702E62d, 5.714207540805018E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double4 = code.src.Distance.squaredDistance(4.877950885822437E248d, (double) 97L, 5.6044914253382785E125d, 3.7454893307807313E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        long long84 = code.src.Distance.chebyshevDistance(longArray58, longArray81);
        long long85 = code.src.Distance.chebyshevDistance(longArray48, longArray81);
        long long86 = code.src.Distance.chebyshevDistance(longArray5, longArray81);
        java.lang.Class<?> wildcardClass87 = longArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double4 = code.src.Distance.euclideanDistance(1.0190538431654038E252d, 3.477821790930845E62d, 5.715044819684806E251d, 8.068127213490246E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double4 = code.src.Distance.squaredDistance(3.2831858166490743E124d, 8.951751003550235E62d, 3.0568118497974055E15d, 1.7307558713743367E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double4 = code.src.Distance.euclideanDistance(1.4331252154618285E128d, 1.0421930753617213E126d, 1.060042331216179E124d, 8.320193827934524E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4330571085588943E128d + "'", double4 == 1.4330571085588943E128d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double4 = code.src.Distance.euclideanDistance(7.610605585266955E125d, 3.598765218630986E247d, 2.9064639308329233E248d, 3.0054630325063084E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        long[] longArray75 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long76 = code.src.Distance.chebyshevDistance(longArray58, longArray75);
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
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double4 = code.src.Distance.squaredDistance(1.5941288904220582E249d, 2.1256144767371883E128d, 1.3335864706024715E248d, 1.433007028500352E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double4 = code.src.Distance.squaredDistance(2.742264228911255E125d, 1.0063874635772352E61d, 1.2296171124372597E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.520013101166239E250d + "'", double4 == 7.520013101166239E250d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double4 = code.src.Distance.euclideanDistance(100.40866620345955d, (double) 97L, 5.715045150558624E247d, 1.2606145944433818E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double4 = code.src.Distance.squaredDistance(0.0d, 4.92586451367552E248d, 7.608198465098248E125d, 2.8519907324927616E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray49, longArray73);
        java.lang.Class<?> wildcardClass83 = longArray49.getClass();
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
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double4 = code.src.Distance.euclideanDistance(7.862188778631282E125d, 8.99140083977295E43d, 1.4579746669762032E64d, 12329.400413486055d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.862188778631282E125d + "'", double4 == 7.862188778631282E125d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double4 = code.src.Distance.euclideanDistance((double) (-1L), 0.0d, 8.991400839772017E43d, 6.92256251604893E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.92256251604893E61d + "'", double4 == 6.92256251604893E61d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double4 = code.src.Distance.euclideanDistance(5.865141437237654E125d, 7.732944131972951E127d, 5.786405680011157E251d, 1.2387871038033346E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long[] longArray77 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long78 = code.src.Distance.chebyshevDistance(longArray69, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray54, longArray77);
        java.lang.Class<?> wildcardClass80 = longArray54.getClass();
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
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 90L + "'", long79 == 90L);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double4 = code.src.Distance.euclideanDistance(4.5182371542091934E256d, 9.324535099190634E30d, 6.556084846280549E12d, 1.2634745840023956E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        long long86 = code.src.Distance.chebyshevDistance(longArray60, longArray76);
        java.lang.Class<?> wildcardClass87 = longArray76.getClass();
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 98L + "'", long86 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double4 = code.src.Distance.euclideanDistance(7.366529754618401E123d, 4.1829248331382305E256d, 3.4131592097982255E102d, 1.5617268815501826E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double4 = code.src.Distance.euclideanDistance(1.5119583526749173E124d, 3.1404935889650543E122d, 1.0190538431654038E252d, 1.1649654526156026E205d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double4 = code.src.Distance.squaredDistance(2.1256144767371883E128d, 1.956152822910355E125d, 8.694705670079989E61d, 2.285850535203458E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double4 = code.src.Distance.euclideanDistance(6.20393819963367E251d, 4.080492135606123E124d, 1.3415036402150548E127d, 2.2964930079195337E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double4 = code.src.Distance.euclideanDistance(1.5377172753851527E248d, 6.957500334326037E61d, 3.377784400566722E241d, 4.792187178860569E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double4 = code.src.Distance.euclideanDistance(4.793704459665872E251d, 2.6593879130842587E124d, 3.056811849797306E15d, 1.5737202213962112E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double4 = code.src.Distance.euclideanDistance(1.2296171124372597E62d, 4.5182406995808964E256d, 1.515435523161302E124d, 4.5182371542091934E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double4 = code.src.Distance.euclideanDistance(2.406503766581682E12d, 1.772143783377933E61d, 1.0379514071432164E126d, 4.518033412506453E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double4 = code.src.Distance.euclideanDistance(12313.553084145538d, 5.484533507010109E251d, 1.4561688805466475E125d, 5.731031078277051E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double4 = code.src.Distance.euclideanDistance(9922.0d, 9.715913234165533E248d, 1.1929678834484718E32d, 4.675240277191704E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double4 = code.src.Distance.euclideanDistance(7.821589175633897E62d, 3.0239723409974164E124d, 3.053611124550097E15d, 3.477882519775504E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0239723409974164E124d + "'", double4 == 3.0239723409974164E124d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double4 = code.src.Distance.squaredDistance(1.0207804596239174E249d, 0.0d, 2.3848836126517604E124d, 1.738941196953288E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double4 = code.src.Distance.euclideanDistance(5.78903989294274E251d, 7.562667037928565E125d, 103.39245620450265d, 2.0539425682826672E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        double double4 = code.src.Distance.euclideanDistance(7.771738451246113E125d, 7.891149462745871E255d, 2.0451715735252107E128d, 4.840680371280547E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double4 = code.src.Distance.euclideanDistance(4.181639060777985E256d, 7.101134345210695E247d, 1.0486765404656112E16d, (double) 98L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double4 = code.src.Distance.squaredDistance(4.792187178860569E123d, 5.720993474013094E251d, 4.689593133831153E251d, 8.694706236541855E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        long[] longArray89 = new long[] { 0, (short) -1 };
        long[] longArray92 = new long[] { (short) -1, (short) -1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray89, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray70, longArray89);
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray89, longArray95);
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 1L + "'", long94 == 1L);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double4 = code.src.Distance.squaredDistance(2.554335603593525E128d, 4.1829248331382305E256d, 104.0d, 7.413179166381833E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double4 = code.src.Distance.euclideanDistance(9.324540890466497E30d, 7.559791732617994E123d, 1.1548101448300805E124d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double4 = code.src.Distance.euclideanDistance(5.715045104064703E247d, 1.1801491380487327E249d, 0.0d, 1.1801491380487327E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double4 = code.src.Distance.squaredDistance(7.43091669258797E123d, 1.3186892203577162E31d, 8.779875994255162E124d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.458990228650728E249d + "'", double4 == 6.458990228650728E249d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double4 = code.src.Distance.squaredDistance(2.0480917725743317E256d, 1.039575455679478E8d, 0.0d, 5.864222144890665E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double4 = code.src.Distance.euclideanDistance(6.385337334710284E62d, 2.0451715735252107E128d, 1.333420484783642E125d, 1.8474736870780683E51d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0451720082100127E128d + "'", double4 == 2.0451720082100127E128d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double4 = code.src.Distance.euclideanDistance(2.769446841189903E125d, 7.786590871947086E125d, 2.010262836799118E256d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        double double4 = code.src.Distance.squaredDistance(6.301988755686634E251d, 3.54371002001072E251d, 1.3415049736556993E127d, 8.73117060907958E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 0.0d, 3.053611124540608E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.053611124540608E15d + "'", double4 == 3.053611124540608E15d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double4 = code.src.Distance.euclideanDistance(9.324540899917549E30d, 6.261457075442417E31d, 5.715044819636229E251d, 7.76081660665762E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double4 = code.src.Distance.squaredDistance(5.791260371133755E24d, 1.2046853507841718E252d, 7.559791763325273E123d, 1.4579745280790234E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double4 = code.src.Distance.squaredDistance(4.793704459665872E251d, 7.559791763374587E123d, 4.1827840536706536E256d, 2.4389863314950092E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double4 = code.src.Distance.squaredDistance(0.0d, 8.722498761879103E62d, 1.143009030111722E248d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double4 = code.src.Distance.euclideanDistance(6.142140408070548E124d, 6.192723950656815E251d, 8.694706299424537E61d, 6.556084846280549E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double4 = code.src.Distance.squaredDistance(8.694706299423517E61d, (double) 10.0f, 5.788468388432333E251d, 9.324540890451006E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double4 = code.src.Distance.euclideanDistance(6.92256251604893E61d, 1.102865396833695E32d, 3.321083216563934E61d, 4.792173836495848E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.792173836495848E123d + "'", double4 == 4.792173836495848E123d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double4 = code.src.Distance.squaredDistance(2.286018050924408E248d, 1.589750982408489E254d, (double) (byte) 10, 5.717560488315264E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double4 = code.src.Distance.squaredDistance(4.471374129726301E62d, 9882.0d, 6.957499817661427E61d, 5.527200037395124E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4255337706659871E125d + "'", double4 == 1.4255337706659871E125d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double4 = code.src.Distance.euclideanDistance((double) 1.0f, 7.559791763325273E123d, 6.18529391824118E251d, 1.2055760644133702E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double4 = code.src.Distance.squaredDistance(6.520180893902484E248d, 9.32387494085701E30d, 1.224365486934459E62d, 7.77326133854061E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double4 = code.src.Distance.euclideanDistance(9.324540899982978E30d, 8.694706299452896E61d, 2.316460326605626E249d, 4.298224851119434E25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double4 = code.src.Distance.euclideanDistance(1.449255956357967E248d, 20084.432052190223d, 122.0d, 5.715045150548505E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double4 = code.src.Distance.euclideanDistance(4.518236903714711E256d, 3.321083216563934E61d, 2.123180521041554E128d, 7.559791763374587E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double4 = code.src.Distance.euclideanDistance(3.326166438578114E248d, 3.053611124543087E15d, 7.920443263990935E119d, 1.3436331804825283E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        double double4 = code.src.Distance.euclideanDistance(2.7234837376481807E125d, 5.71561648966755E251d, 6.520158840275344E248d, 2.8095584331559984E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double4 = code.src.Distance.squaredDistance(3.054769716678889E15d, 2.964908885240041E122d, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.790684697775343E244d + "'", double4 == 8.790684697775343E244d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double4 = code.src.Distance.squaredDistance(1.1503513373584828E252d, 1.2093895208085425E64d, 6.192735015311481E251d, 8.133851138224599E174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double4 = code.src.Distance.squaredDistance(1.2400472875600966E124d, 4.557896970053384E248d, 5.525929037215044E7d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double4 = code.src.Distance.squaredDistance((double) (-1.0f), 2.244898434111624E124d, 2.7030845353965203E124d, 6.957499817664781E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2346234984976643E249d + "'", double4 == 1.2346234984976643E249d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double4 = code.src.Distance.euclideanDistance(3.353869565834853E49d, 1.0670318622827465E252d, 5.501575976011727E124d, 12313.553084145538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double4 = code.src.Distance.euclideanDistance(4.5182406995808964E256d, (double) 0L, 5.786405680011157E251d, 5.525928500007007E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        long long78 = code.src.Distance.chebyshevDistance(longArray60, longArray76);
        long[] longArray81 = new long[] { 0, (short) -1 };
        long[] longArray84 = new long[] { (short) -1, (short) -1 };
        long long85 = code.src.Distance.chebyshevDistance(longArray81, longArray84);
        long[] longArray92 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long93 = code.src.Distance.chebyshevDistance(longArray84, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray76, longArray92);
        java.lang.Class<?> wildcardClass95 = longArray92.getClass();
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
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 11L + "'", long93 == 11L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 0.0d, 1552636.4832506673d, 3.311955036268193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.311955036268193E63d + "'", double4 == 3.311955036268193E63d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double4 = code.src.Distance.squaredDistance((double) 2L, 1.4312682764476429E128d, 1.6205790789034482E254d, 1.6432333679662337E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double4 = code.src.Distance.squaredDistance(7.425749067574235E250d, (double) 100, 5.717877332771251E251d, 3.3662285038614664E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double4 = code.src.Distance.euclideanDistance(9.324546353624267E30d, 0.0d, 4.689593133831153E251d, 8.694706299424537E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double4 = code.src.Distance.squaredDistance(3.02286459429887E15d, 6.047401286148532E124d, 1.4328545305891465E128d, 5.715044819636229E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double4 = code.src.Distance.euclideanDistance(9.324540899933302E30d, 5.068357262307933E248d, 6.556084846280365E12d, 1.3415049736556993E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        long[] longArray43 = new long[] { 'a', 1L };
        long[] longArray46 = new long[] { 0, (short) -1 };
        long[] longArray49 = new long[] { (short) -1, (short) -1 };
        long long50 = code.src.Distance.chebyshevDistance(longArray46, longArray49);
        long long51 = code.src.Distance.chebyshevDistance(longArray43, longArray49);
        long long52 = code.src.Distance.chebyshevDistance(longArray26, longArray49);
        long long53 = code.src.Distance.chebyshevDistance(longArray16, longArray49);
        long[] longArray56 = new long[] { 0, (short) -1 };
        long[] longArray59 = new long[] { (short) -1, (short) -1 };
        long long60 = code.src.Distance.chebyshevDistance(longArray56, longArray59);
        long long61 = code.src.Distance.chebyshevDistance(longArray49, longArray56);
        long[] longArray65 = new long[] { (byte) 10, 100, (byte) 1 };
        long long66 = code.src.Distance.chebyshevDistance(longArray56, longArray65);
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray65, longArray69);
        long long75 = code.src.Distance.chebyshevDistance(longArray5, longArray69);
        java.lang.Class<?> wildcardClass76 = longArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 101L + "'", long66 == 101L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 101L + "'", long74 == 101L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double4 = code.src.Distance.euclideanDistance(2.2965057953353264E247d, 1.333420484783642E125d, 7.864154807481348E125d, 7.447258393539782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double4 = code.src.Distance.squaredDistance(4.1811108493051547E256d, 3.0580621176685875E15d, 3.053611124543097E15d, 7.608198465098248E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double4 = code.src.Distance.squaredDistance(1.2496907143570294E31d, 10.04987562112089d, 3.2973523484734863E250d, 8.694706299426858E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double4 = code.src.Distance.squaredDistance(8.08452890614547E87d, 1.45794860122975E64d, 6.922552879173873E61d, 8.694705670080019E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.535960763430168E175d + "'", double4 == 6.535960763430168E175d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double4 = code.src.Distance.squaredDistance(6.520180893902484E248d, 99.41369581878968d, 6.18529391824118E251d, 4.794956959071923E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double4 = code.src.Distance.squaredDistance(4.792187178455498E123d, 5.715044819636229E251d, 5.604659899440947E124d, 3.023916486461334E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double4 = code.src.Distance.squaredDistance(1.7683618323195464E53d, (double) 100L, 1.209524440947343E125d, 2.1256901295443705E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.518559989791736E256d + "'", double4 == 4.518559989791736E256d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double4 = code.src.Distance.squaredDistance(5.525929037215044E7d, 1.4579745280790234E64d, 8.694706236541855E62d, 4.485940704933021E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 8.69470629945289E61d, 3.068933012127493E239d, 7.43091669258797E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        long[] longArray93 = new long[] { 0, (short) -1 };
        long[] longArray96 = new long[] { (short) -1, (short) -1 };
        long long97 = code.src.Distance.chebyshevDistance(longArray93, longArray96);
        long long98 = code.src.Distance.chebyshevDistance(longArray89, longArray93);
        java.lang.Class<?> wildcardClass99 = longArray93.getClass();
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
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1L + "'", long97 == 1L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double4 = code.src.Distance.euclideanDistance(5.791260282386601E24d, 7.559791763374587E123d, 1.5617268815501826E62d, 7.865071652244784E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        long[] longArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = code.src.Distance.chebyshevDistance(longArray15, longArray31);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double4 = code.src.Distance.squaredDistance(3.3127290822508215E124d, 2.2964930079195337E247d, 7.393566762337766E246d, 3.053611124551322E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double4 = code.src.Distance.squaredDistance(3.2831858166490743E124d, 8.69470629942351E61d, 7.416985483562336E245d, 7.568917694587279E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double4 = code.src.Distance.euclideanDistance(7.786532742293105E125d, 4.3184582665404395E15d, (double) 2L, 4.793704459665872E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double4 = code.src.Distance.euclideanDistance(2.1256287435569485E128d, 5.71561648966755E251d, 6.151508697220018E30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double4 = code.src.Distance.euclideanDistance(6.535960763430168E175d, 3.2973523484734863E250d, 0.0d, 4.347362196294934E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double4 = code.src.Distance.euclideanDistance(4.471374129726301E62d, 6.458990228650728E249d, 5.185424875331702E249d, 7.40859570957669E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double4 = code.src.Distance.squaredDistance((double) 3L, 4.5182371393605655E256d, 0.0d, 5.715045150558624E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double4 = code.src.Distance.squaredDistance(1.1090019187308395E257d, 3.326166438578114E248d, 2.262179825118349E251d, 1.8914631202919207E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        long[] longArray72 = new long[] { 0, (short) -1 };
        long[] longArray75 = new long[] { (short) -1, (short) -1 };
        long long76 = code.src.Distance.chebyshevDistance(longArray72, longArray75);
        long[] longArray83 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long84 = code.src.Distance.chebyshevDistance(longArray75, longArray83);
        long long85 = code.src.Distance.chebyshevDistance(longArray65, longArray83);
        long long86 = code.src.Distance.chebyshevDistance(longArray19, longArray65);
        java.lang.Class<?> wildcardClass87 = longArray19.getClass();
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
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 11L + "'", long84 == 11L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 11L + "'", long85 == 11L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double4 = code.src.Distance.euclideanDistance(3.54371002001072E251d, 2.8095584331559984E250d, 1.1236897439702315E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double4 = code.src.Distance.squaredDistance(3.194965507832467E124d, 2.8095584331559984E250d, 12313.549023578462d, 3.577618063209475E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double4 = code.src.Distance.squaredDistance(4.484875136976614E256d, 8.841771681470747E249d, 3.772588879245304E249d, 8.976783674294438E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double4 = code.src.Distance.squaredDistance(5.71504510406472E247d, 7.590793803572108E125d, 1552637.0d, 8.991400839766758E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double4 = code.src.Distance.squaredDistance(9.137715554420027E30d, 5.71504515055861E247d, 6.922562516048925E61d, 625.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double4 = code.src.Distance.squaredDistance(3.0568118497974055E15d, 1.082419432581764E249d, 7.623334020485509E123d, 7.764261239969174E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double4 = code.src.Distance.squaredDistance((double) (short) 0, 1.102865396833695E32d, 7.862701231474445E125d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.182207065542976E251d + "'", double4 == 6.182207065542976E251d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double4 = code.src.Distance.squaredDistance(3.311955036268193E63d, 7.559791763374577E123d, 3.424182432006193E63d, 4.655892762958032E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double4 = code.src.Distance.squaredDistance(5.714207540805018E247d, 8.694706299423517E61d, 4.484932138384625E256d, 5.715045104064755E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double4 = code.src.Distance.euclideanDistance(103.39245620450265d, 3.194965507832467E124d, 4.840680371280547E123d, 6.20393819963367E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double4 = code.src.Distance.euclideanDistance(5.714644157457502E251d, 5.528905595074321E7d, 1.6830116762241088E124d, 1.0695270443395895E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double4 = code.src.Distance.squaredDistance(3.681736809627178E250d, 0.0d, 5.53979513351125E119d, 5.068357262307933E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double4 = code.src.Distance.squaredDistance(4.546779423345663E248d, 2.8896627685601946E50d, 8.694866271304194E61d, 1.0486765404656112E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double4 = code.src.Distance.squaredDistance(2.244898434111624E124d, 8.320188026225052E30d, 2.0234598189585263E246d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double4 = code.src.Distance.squaredDistance(2.0451720082100127E128d, 8.0133847820028E125d, 7.560169524654381E125d, 7.559791732617994E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.1519250136110354E256d + "'", double4 == 4.1519250136110354E256d);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double4 = code.src.Distance.squaredDistance(9.144408719117394E248d, 1.3415049736556993E127d, 6.301988755686634E251d, 4.181639060777985E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double4 = code.src.Distance.euclideanDistance(2.1256145491446317E128d, 7.56145520935968E125d, 8.859911358917301E125d, 8.991400839766758E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1167681432297242E128d + "'", double4 == 2.1167681432297242E128d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double4 = code.src.Distance.squaredDistance(1.1210148155066758E127d, 1.4253988300352539E128d, 0.0d, 5.64433727473721E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double4 = code.src.Distance.euclideanDistance(3.536773594809233E124d, 9.862699982330608E244d, 1.7583641551952374E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double4 = code.src.Distance.euclideanDistance(1.7163788789776055E248d, 3.2900143351994137E124d, 4.502871341583352E256d, 1.4253988300352539E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374587E123d, 5.525928500007007E7d, 3.02286459429887E15d, 2.5619922088623362E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.561992209977688E128d + "'", double4 == 2.561992209977688E128d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double4 = code.src.Distance.euclideanDistance(1.1958657793748695E32d, 3.833637407942809E63d, 7.862183193182798E125d, 2.721524969160516E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.319893191678016E125d + "'", double4 == 8.319893191678016E125d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double4 = code.src.Distance.squaredDistance(1.209524440947343E125d, 6.261457075442417E31d, 3.7426568024784246E251d, 7.821589175633897E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double4 = code.src.Distance.euclideanDistance(7.565603634330283E123d, 5.52593790000923E7d, 0.0d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double4 = code.src.Distance.euclideanDistance(1.4331582268127545E128d, 4.7921872029386884E123d, 2.129673436349805E128d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.965152111856186E127d + "'", double4 == 6.965152111856186E127d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) -1, 625.0d, 3.2900143351994137E124d, 4.302581716460107E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double4 = code.src.Distance.squaredDistance(6.17830490479184E248d, 4.518236903714711E256d, 1.1047365604210307E126d, 9.368838995853397E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double4 = code.src.Distance.squaredDistance(5.525928500007007E7d, 7.863642449363113E125d, 8.868523920159873E123d, 2.2964930079195337E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double4 = code.src.Distance.squaredDistance(3.596149286247409E250d, 1.1294636811790911E99d, 8.030925665076586E87d, 1.8649081799905601E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double4 = code.src.Distance.euclideanDistance(1.1245688124397413E248d, 9.324540899933299E30d, 2.286018050924408E248d, 5.715045150484065E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        long[] longArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = code.src.Distance.chebyshevDistance(longArray19, longArray51);
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
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double4 = code.src.Distance.squaredDistance(2.0451720082100127E128d, 7.732944131972951E127d, (double) (short) 0, 2.1177523428484083E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.990295667767534E256d + "'", double4 == 5.990295667767534E256d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double4 = code.src.Distance.squaredDistance(0.0d, 7.559791763367894E123d, 3.0536111245430885E15d, 1.5971183631743827E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double4 = code.src.Distance.squaredDistance(7.393563040080829E246d, 9.386961461524785E62d, 1.2496907143570294E31d, 9.095699028095402E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double4 = code.src.Distance.euclideanDistance(5.715045150490167E247d, 3.7841059251973525E61d, 4.181639060777985E256d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double4 = code.src.Distance.euclideanDistance(3.353869680772834E49d, 2.819984976301837E250d, 2.3848836126517604E124d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double4 = code.src.Distance.squaredDistance(1.5665408678303301E62d, 9.324540562451319E30d, 1.1248441811882996E99d, 16122.636173942763d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2652744319531763E198d + "'", double4 == 1.2652744319531763E198d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double4 = code.src.Distance.euclideanDistance(1.2074554820296805E32d, 1.333420484783642E125d, 1.231235105847726E124d, 5.731031078277051E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double4 = code.src.Distance.euclideanDistance(2.125628747841743E128d, 3.2973523484734863E250d, 8.067055176895368E247d, 6.385337334710284E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double4 = code.src.Distance.euclideanDistance(9.862699982330608E244d, 1.1248441811882996E99d, 2.0147440391085077E256d, 7.862701231474445E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 3.02286459429887E15d, (double) (-1.0f), 1.177837421097331E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double4 = code.src.Distance.euclideanDistance((double) 1L, 8.94428757683438E62d, 9.003112128419027E256d, 2.1256901295443705E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double4 = code.src.Distance.squaredDistance((double) 1, 278906.09975124226d, 4.5182406995808964E256d, 2.5993022064039992E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double4 = code.src.Distance.euclideanDistance(1.2637714837637312E127d, 0.0d, 0.0d, 5.71504510406472E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double4 = code.src.Distance.euclideanDistance(7.559791732623826E123d, 2.2965057953353264E247d, 4.4848752944105095E256d, 2.575569517141002E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double4 = code.src.Distance.euclideanDistance((-1.0d), 2.888107199940184E15d, 1.836507598757228E249d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double4 = code.src.Distance.squaredDistance(2.575569517141002E250d, 2.1167681432297242E128d, 2.0698339792640068E256d, 6.923824166576346E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double4 = code.src.Distance.euclideanDistance(7.416985483562336E245d, (double) (-1), 5.763159931203444E251d, 1.457948741083528E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double4 = code.src.Distance.squaredDistance(4.484875220721362E256d, 8.811504548015154E125d, 2.1586910533487628E249d, 5.525939237192507E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double4 = code.src.Distance.euclideanDistance(9.003112128419027E256d, 3.0369622360804536E124d, 3.2831858166490743E124d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double4 = code.src.Distance.squaredDistance(6.20393819963367E251d, (double) (byte) 10, 3.0369622360804536E124d, 4.182530750552227E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double4 = code.src.Distance.euclideanDistance(2.0450959756078844E128d, 3.02286459429887E15d, 9.144408719117394E248d, 7.5597917633235E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 0, (short) -1 };
        long[] longArray12 = new long[] { (short) -1, (short) -1 };
        long long13 = code.src.Distance.chebyshevDistance(longArray9, longArray12);
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        java.lang.Class<?> wildcardClass15 = longArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double4 = code.src.Distance.euclideanDistance(8.133851138224599E174d, 20737.0d, 6.804460155815231E124d, 4.654121416639182E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double4 = code.src.Distance.euclideanDistance(1.4330571085588943E128d, 2.719111392042953E123d, 5.463413916504991E251d, 4.182726770879422E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
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
        long long56 = code.src.Distance.chebyshevDistance(longArray30, longArray53);
        long long57 = code.src.Distance.chebyshevDistance(longArray13, longArray30);
        long[] longArray60 = new long[] { 0, (short) -1 };
        long[] longArray63 = new long[] { (short) -1, (short) -1 };
        long long64 = code.src.Distance.chebyshevDistance(longArray60, longArray63);
        long[] longArray71 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long72 = code.src.Distance.chebyshevDistance(longArray63, longArray71);
        long long73 = code.src.Distance.chebyshevDistance(longArray30, longArray71);
        long long74 = code.src.Distance.chebyshevDistance(longArray9, longArray30);
        java.lang.Class<?> wildcardClass75 = longArray30.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 98L + "'", long57 == 98L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 11L + "'", long72 == 11L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 11L + "'", long73 == 11L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 101L + "'", long74 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        long[] longArray93 = new long[] { 0, (short) -1 };
        long[] longArray96 = new long[] { (short) -1, (short) -1 };
        long long97 = code.src.Distance.chebyshevDistance(longArray93, longArray96);
        long long98 = code.src.Distance.chebyshevDistance(longArray89, longArray93);
        java.lang.Class<?> wildcardClass99 = longArray89.getClass();
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
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1L + "'", long97 == 1L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double4 = code.src.Distance.euclideanDistance(5.715045104064703E247d, 1.333420484783642E125d, 8.779875994255162E124d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double4 = code.src.Distance.euclideanDistance(9.284544414987072E30d, 9882.0d, 7.710680125905936E10d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double4 = code.src.Distance.euclideanDistance(7.862183193182798E125d, 6.18529391824118E251d, 5.864222144890665E251d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double4 = code.src.Distance.euclideanDistance(6.063099723657831E251d, 7.732944131972951E127d, 1.4990708455962547E124d, 1.0063874635772352E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double4 = code.src.Distance.squaredDistance(5.829917481072086E251d, 1.7583641551952374E124d, 5.527131720196977E7d, 7.32543304010228E98d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double4 = code.src.Distance.squaredDistance(12329.400413486055d, 2.0317618246658705E256d, 1.0807149657353284E16d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 10, 3.54371002001072E251d, 104.0d, 8.694706299426871E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double4 = code.src.Distance.squaredDistance(5.525939237192507E7d, 8.824228056978371E247d, 7.559791763329309E123d, 5.524950700000004E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double4 = code.src.Distance.squaredDistance(1.2387871038033346E124d, 2.1256144753928608E128d, 1.0852821850087336E126d, 3.3301680419024496E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4510644048118655E256d + "'", double4 == 1.4510644048118655E256d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        java.lang.Class<?> wildcardClass11 = longArray9.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double4 = code.src.Distance.euclideanDistance(3.4131590244458324E102d, 0.0d, 4.5182406995808964E256d, 1.30972997559812E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double4 = code.src.Distance.euclideanDistance(1.0670318622827465E252d, 7.814857737225062E7d, 2.251301237575268E124d, 3.681736809627178E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double4 = code.src.Distance.squaredDistance(1.918367176323824E125d, 1.0d, 1.2296178404951322E62d, 3.536773594809233E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.80522029780604E250d + "'", double4 == 3.80522029780604E250d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double4 = code.src.Distance.squaredDistance(0.0d, 3.053611124543087E15d, 1.4330070531769372E128d, 4.792187178455498E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0535092167513552E256d + "'", double4 == 2.0535092167513552E256d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double4 = code.src.Distance.squaredDistance(3.0536111245430885E15d, 3.2831858166490743E124d, 5.527131618909466E7d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0779309106645648E249d + "'", double4 == 1.0779309106645648E249d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double4 = code.src.Distance.squaredDistance((double) 1.0f, 0.0d, 1.5891491557236519E254d, 5.604659899440947E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double4 = code.src.Distance.euclideanDistance(7.764261239969174E251d, 2.0481498109123508E256d, 3.890146281899556E124d, 7.608198465098248E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double4 = code.src.Distance.squaredDistance(2.728966543133093E124d, 4.51823713706406E256d, 2.406503766581682E12d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double4 = code.src.Distance.euclideanDistance(5.373609040983584E61d, 1.3415037258095196E127d, 5.7150451504902E247d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double4 = code.src.Distance.squaredDistance(1.0997224744491414E32d, 8.620276499386763E61d, (double) (byte) 10, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.772588879245304E249d + "'", double4 == 3.772588879245304E249d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double4 = code.src.Distance.squaredDistance(7.77326133854061E10d, 8.694706281769278E61d, (double) 0, 1.4331582329756537E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.053942520745898E256d + "'", double4 == 2.053942520745898E256d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double4 = code.src.Distance.squaredDistance(1.0379514071432164E126d, 5.525939237192507E7d, 1811717.0d, 1552637.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.077343123590583E252d + "'", double4 == 1.077343123590583E252d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double4 = code.src.Distance.squaredDistance((double) 100, 3.598765218630986E247d, 1.0807149657353284E16d, 2.24721340011667E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double4 = code.src.Distance.squaredDistance(5.463413916504991E251d, 9.324540899933247E30d, 3.0621788818790405E248d, 5.791260371133832E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double4 = code.src.Distance.euclideanDistance(3.056811849797306E15d, 6.072806626010396E251d, 3.05361112455053E15d, 4.183411062201243E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double4 = code.src.Distance.squaredDistance(4.792173836495848E123d, 1.4331252154618285E128d, 2.719110673110582E123d, 4.183411062201243E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double4 = code.src.Distance.euclideanDistance(1.7163788789776055E248d, 8.067055176895368E247d, 6.449576703798581E175d, 1.0922306970231484E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double4 = code.src.Distance.squaredDistance(3.657106231571092E249d, 9.351743915519625E30d, 7.425749067574235E250d, 3.772588879245304E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double4 = code.src.Distance.squaredDistance(5.528905595074321E7d, 8.05047120619714E123d, (double) '4', 6.117725723239335E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.644803753780143E251d + "'", double4 == 3.644803753780143E251d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double4 = code.src.Distance.squaredDistance(1.2346234984976643E249d, 0.0d, 1.4255337706659871E125d, 1.1430090254554903E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double4 = code.src.Distance.squaredDistance(7.413179166381833E250d, 1552637.0032203277d, 5.863139033023053E125d, 3.1254847552549246E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double4 = code.src.Distance.euclideanDistance(Double.POSITIVE_INFINITY, 1.7583641551952374E124d, 2.719111392042953E123d, 1.333420484783642E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double4 = code.src.Distance.euclideanDistance(5.791260371133832E24d, 0.0d, 3.053611124543088E15d, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791544536665E125d + "'", double4 == 7.559791544536665E125d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        long long66 = code.src.Distance.chebyshevDistance(longArray5, longArray50);
        java.lang.Class<?> wildcardClass67 = longArray50.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.0504686747931686E246d, 4.654121416639182E124d, 6.182228556491662E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double4 = code.src.Distance.squaredDistance(8.058264513507916E247d, 2.0451715735252107E128d, 8.961543206990963E43d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double4 = code.src.Distance.euclideanDistance(7.814857737225062E7d, 0.0d, 3.6801326231966413E250d, 5.484533507010109E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double4 = code.src.Distance.squaredDistance(4.485940704933021E256d, 1.772143783377933E61d, 278906.09975124226d, 6.957500350144719E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double4 = code.src.Distance.squaredDistance(5.948676378854077E248d, 8.030925665076586E87d, 8.866898431039124E62d, 4.630067801207703E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double4 = code.src.Distance.euclideanDistance(9.32454089993304E30d, 2.8325283023066844E248d, 4.1827267651555864E256d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double4 = code.src.Distance.euclideanDistance((double) 10, 5.262553411785863E62d, 9.32454089993304E30d, 5.71561648966755E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double4 = code.src.Distance.squaredDistance(2.3432186456900772E247d, 5.5259489E7d, 9.344073313646239E30d, 4.172449883594742E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double4 = code.src.Distance.squaredDistance(1.231115082248268E64d, (double) 10L, 5.829917481072086E251d, 1811816.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double4 = code.src.Distance.euclideanDistance(1.2857893850944086E250d, 8.6947061736074E62d, 8.6947061736074E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double4 = code.src.Distance.squaredDistance(8.694706299423517E61d, 1.5941288904220582E249d, 6.117725723239335E125d, 1.3415049736556993E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long[] longArray77 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long78 = code.src.Distance.chebyshevDistance(longArray69, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray54, longArray77);
        long[] longArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long81 = code.src.Distance.chebyshevDistance(longArray77, longArray80);
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
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 101L + "'", long55 == 101L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 101L + "'", long63 == 101L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 90L + "'", long79 == 90L);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double4 = code.src.Distance.squaredDistance(0.0d, 6.858438111975517E125d, 7.56006994758633E123d, 7.559791763329331E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.601263656774569E251d + "'", double4 == 4.601263656774569E251d);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double4 = code.src.Distance.squaredDistance((-1.0d), 8.874969428842853E62d, 5.749414470161792E251d, 5.717877332771251E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double4 = code.src.Distance.euclideanDistance(3.194965507832467E124d, 3.890305409973818E124d, 5.373609040983584E61d, 1.069116001870466E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.262266330560975E124d + "'", double4 == 4.262266330560975E124d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double4 = code.src.Distance.squaredDistance(6.535960763430168E175d, 5.6508057255525505E124d, 9.324540899918096E30d, 1.0379514071432164E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double4 = code.src.Distance.euclideanDistance(9.144070917092657E248d, 3.054769716678889E15d, 1.4561688805466475E125d, 1.956152822910355E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double4 = code.src.Distance.squaredDistance(1.956152822910355E125d, 100.0d, 0.0d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double4 = code.src.Distance.squaredDistance((double) '4', 0.0d, 7.559791544504537E125d, 3.3301680419024496E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.109007633775659E257d + "'", double4 == 1.109007633775659E257d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double4 = code.src.Distance.euclideanDistance(7.425749067574235E250d, 7.864154807481348E125d, (double) (short) -1, 7.560644248248633E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double4 = code.src.Distance.euclideanDistance(3.8265338665801504E250d, 1.1929678834484718E32d, (double) (short) 1, 2.1256145491446317E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double4 = code.src.Distance.squaredDistance(4.485940704933021E256d, 1.143009030111722E248d, 2.12553893505374E128d, 2.0451720082100127E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double4 = code.src.Distance.squaredDistance(9.324540890452801E30d, 7.862188778631282E125d, 5.527131618909466E7d, 6.192735015311481E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double4 = code.src.Distance.squaredDistance(5.484533507010109E251d, 6.53596076341459E175d, 3.0535834157458975E15d, 8.694706236541855E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double4 = code.src.Distance.squaredDistance(1.5971183631743827E254d, 9.284544414987072E30d, 4.70381733357983E251d, 4.65150901809432E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double4 = code.src.Distance.euclideanDistance(3.3127290822508215E124d, 1225.0d, 4.92586451367552E248d, 6.182228556491662E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double4 = code.src.Distance.euclideanDistance(5.618790528635277E251d, 2.125614474048533E128d, 4.48487495250148E256d, 3.353869565834853E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double4 = code.src.Distance.euclideanDistance(1.2093895208085425E64d, 0.0d, 1.836507598757228E249d, 5.720993474013094E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double4 = code.src.Distance.euclideanDistance(10105.000049480455d, 7.416985483562336E245d, 2.262179825118349E251d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double4 = code.src.Distance.squaredDistance(3.439988407880217E251d, 3.353869677235983E49d, 1.2756882071026236E198d, 2.053509149446454E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double4 = code.src.Distance.euclideanDistance(6.535960763430168E175d, 1.74402177078084E62d, 2.5156683110561225E248d, 8.694715983872712E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double4 = code.src.Distance.euclideanDistance(1.33937091808876E127d, 2.1256145316270446E128d, 4.546779423345663E248d, 4.471374129726301E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double4 = code.src.Distance.squaredDistance(5.863139033023053E125d, 8.779875994255162E124d, 5.715045150484065E247d, 2.05329249062104E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double4 = code.src.Distance.squaredDistance(2.286018050924669E248d, 5.64433727473721E251d, 1.231115082248268E64d, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double4 = code.src.Distance.squaredDistance(1.574966483660244E62d, 1.1248441811882996E99d, 8.694705670079996E61d, 3.3127290822508215E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.097417397239037E249d + "'", double4 == 1.097417397239037E249d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        long long70 = code.src.Distance.chebyshevDistance(longArray37, longArray49);
        java.lang.Class<?> wildcardClass71 = longArray49.getClass();
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
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double4 = code.src.Distance.euclideanDistance(5.869204465969338E247d, 8.806176891199752E248d, 1.380250332732779E124d, 6.540349417685828E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double4 = code.src.Distance.squaredDistance(7.56006994758633E123d, 1.4579746669762032E64d, 4.471374129726301E62d, 2.0481498109123508E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double4 = code.src.Distance.euclideanDistance(1.3335864706024715E248d, 4.5182371393605655E256d, 6.540349417685828E256d, 3.0369622360804536E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double4 = code.src.Distance.squaredDistance(4.64617159966005E124d, 2.1177523428484083E128d, 3.0054630325063084E128d, 3.833637407942809E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.351489046187395E257d + "'", double4 == 1.351489046187395E257d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        long long70 = code.src.Distance.chebyshevDistance(longArray37, longArray49);
        java.lang.Class<?> wildcardClass71 = longArray37.getClass();
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
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double4 = code.src.Distance.euclideanDistance(1.4579486012297467E64d, 6.820197224490154E125d, 7.862188778631282E125d, 8.694706299426858E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0408126756135268E126d + "'", double4 == 1.0408126756135268E126d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double4 = code.src.Distance.squaredDistance(1.1801491380487327E249d, 2.8519907324927616E87d, 2.55346448847492E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double4 = code.src.Distance.euclideanDistance(5.525929237201556E7d, 6.17830490479184E248d, 3.052698722606791E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 1, 9.324540899933302E30d, (double) 2L, 7.559791732623826E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045104064755E247d + "'", double4 == 5.715045104064755E247d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double4 = code.src.Distance.squaredDistance(5.52593790000923E7d, 8.694706299426858E61d, 2.125614498247224E128d, 1.7307558713743367E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double4 = code.src.Distance.squaredDistance((double) 1, 7.677886613131662E20d, (double) 101L, 1.4328545305891465E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0530721058298435E256d + "'", double4 == 2.0530721058298435E256d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double4 = code.src.Distance.squaredDistance(7.559791763325273E123d, 0.0d, 8.350150916003777E100d, 1.891459241752112E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.583333108359959E250d + "'", double4 == 3.583333108359959E250d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double4 = code.src.Distance.squaredDistance(5.525939237192507E7d, 8.08452890614697E87d, 8.320193817483419E30d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.535960763432593E175d + "'", double4 == 6.535960763432593E175d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double4 = code.src.Distance.squaredDistance(0.0d, 6.182207065542976E251d, 1.4328545305891465E128d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double4 = code.src.Distance.squaredDistance(8.6947061736074E62d, 1225.0d, 7.559791732623814E123d, 6.047401286148532E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.7142566826117396E249d + "'", double4 == 3.7142566826117396E249d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double4 = code.src.Distance.squaredDistance(8.319893191678016E125d, 5.5259389E7d, 1.1958657793748695E32d, 5.71504515055861E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double4 = code.src.Distance.squaredDistance(2.1256144767371883E128d, 5.715045150558624E247d, 9.324546092905923E30d, 1.736952180983727E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double4 = code.src.Distance.squaredDistance(1.8933354688488568E125d, 0.0d, 3.4778825197957035E62d, 2.4805194246531137E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.646248963761934E250d + "'", double4 == 3.646248963761934E250d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double4 = code.src.Distance.euclideanDistance(5.714644157457502E251d, 5.9798424948214894E255d, 4.840680371280547E123d, 7.559791763323488E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double4 = code.src.Distance.euclideanDistance(10.04987562112089d, 3.4131592097982255E102d, 0.0d, 1.1267866439017752E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.4131592097982255E102d + "'", double4 == 3.4131592097982255E102d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double4 = code.src.Distance.squaredDistance(20737.0d, 9.466542772834739E21d, 1.2634745840023956E64d, 3.311955036268193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.706058486042649E128d + "'", double4 == 1.706058486042649E128d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double4 = code.src.Distance.squaredDistance(1.1929678955220982E32d, 1.74402177078084E62d, 8.620276499386763E61d, 5.580834364125841E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double4 = code.src.Distance.squaredDistance(9.715913234165533E248d, 2.719110673110582E123d, 1.5133238094576941E249d, 1.1248441754132943E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        long[] longArray57 = new long[] { (byte) 0, 1L, (byte) -1, 11L, 11L, (-1) };
        long long58 = code.src.Distance.chebyshevDistance(longArray45, longArray57);
        long[] longArray59 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long60 = code.src.Distance.chebyshevDistance(longArray57, longArray59);
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
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, 1, -1, 11, 11, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 2L + "'", long58 == 2L);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double4 = code.src.Distance.squaredDistance(2.575569517141002E250d, 7.862701231474445E125d, 0.0d, 1.3415037258095196E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double4 = code.src.Distance.squaredDistance(2.7065537201582164E49d, 0.0d, 5.525929237201556E7d, 1.5133238094576941E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double4 = code.src.Distance.euclideanDistance(7.862183193182798E125d, 6.182228556491662E251d, 8.058264513507916E247d, 7.380601634026061E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double4 = code.src.Distance.euclideanDistance(2.2496883671214544E99d, 6.073378130472233E251d, 1.2046853507841718E252d, 8.69470629945289E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double4 = code.src.Distance.euclideanDistance(7.560261194608789E125d, 0.0d, 10.0d, 2.1256144753928608E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.12562792029767E128d + "'", double4 == 2.12562792029767E128d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double4 = code.src.Distance.euclideanDistance(7.814856790247367E7d, 1.2652744319531763E198d, 5.715045150481383E247d, 1811707.0012909174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double4 = code.src.Distance.euclideanDistance((double) 0.0f, 8.050471177320619E123d, 6.192735015311481E251d, 5.525994208076646E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double4 = code.src.Distance.squaredDistance(7.559791544536665E125d, 5.952906869765997E125d, 4.7921872029386884E123d, 3.1254847552549246E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double4 = code.src.Distance.euclideanDistance(6.142140408070548E124d, 1.077343123590583E252d, 1.1267866439017752E64d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double4 = code.src.Distance.euclideanDistance(6.957500350144719E61d, 9922.0d, 5.791260371133755E24d, 8.08452890614697E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.08452890614697E87d + "'", double4 == 8.08452890614697E87d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        long long60 = code.src.Distance.chebyshevDistance(longArray34, longArray57);
        long long61 = code.src.Distance.chebyshevDistance(longArray17, longArray34);
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long[] longArray75 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long76 = code.src.Distance.chebyshevDistance(longArray67, longArray75);
        long long77 = code.src.Distance.chebyshevDistance(longArray34, longArray75);
        long[] longArray80 = new long[] { 0, (short) -1 };
        long[] longArray83 = new long[] { (short) -1, (short) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray80, longArray83);
        long[] longArray91 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long92 = code.src.Distance.chebyshevDistance(longArray83, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray75, longArray91);
        long long94 = code.src.Distance.chebyshevDistance(longArray13, longArray75);
        java.lang.Class<?> wildcardClass95 = longArray75.getClass();
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 11L + "'", long76 == 11L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 11L + "'", long92 == 11L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double4 = code.src.Distance.squaredDistance(2.12562792029767E128d, 7.559791653975984E125d, 1.060042331216179E124d, 4.3184582665404395E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5179005661205605E256d + "'", double4 == 4.5179005661205605E256d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double4 = code.src.Distance.euclideanDistance(5.6044914253382785E125d, 5.788468388432333E251d, 3.8265338665801504E250d, 8.319893191678016E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 0, 1.077343123590583E252d, (double) 3L, 2.125628747841743E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double4 = code.src.Distance.squaredDistance(3.0054630325063084E128d, 1.143009020812949E248d, 3.326166438578114E248d, 2.166084616081951E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double4 = code.src.Distance.squaredDistance(1.4764533763248394E125d, 1.1341134428019932E16d, 4.181639060777985E256d, 3.053584521181947E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double4 = code.src.Distance.squaredDistance(6.042358993280212E21d, 5.524950700000004E7d, 2.1177523428484083E128d, 4.302581716460107E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double4 = code.src.Distance.euclideanDistance(1.177837421097331E252d, 6.181401239083565E251d, 9.79709836214289E7d, 1.231235105847726E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double4 = code.src.Distance.euclideanDistance(1552636.4832506673d, 3.3993126052584937E124d, 5.791260378563789E24d, 5.720993474013094E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        long long70 = code.src.Distance.chebyshevDistance(longArray19, longArray66);
        long[] longArray73 = new long[] { 0, (short) -1 };
        long[] longArray76 = new long[] { (short) -1, (short) -1 };
        long long77 = code.src.Distance.chebyshevDistance(longArray73, longArray76);
        long[] longArray80 = new long[] { 100L, 1 };
        long long81 = code.src.Distance.chebyshevDistance(longArray76, longArray80);
        long long82 = code.src.Distance.chebyshevDistance(longArray66, longArray80);
        java.lang.Class<?> wildcardClass83 = longArray80.getClass();
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
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 101L + "'", long81 == 101L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 101L + "'", long82 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double4 = code.src.Distance.euclideanDistance(8.694706236541855E62d, 5.463413916504991E251d, 2.285850535203458E248d, 2.1256144767371883E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 0, (short) -1 };
        long[] longArray12 = new long[] { (short) -1, (short) -1 };
        long long13 = code.src.Distance.chebyshevDistance(longArray9, longArray12);
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        java.lang.Class<?> wildcardClass15 = longArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double4 = code.src.Distance.euclideanDistance(3.0621788818790405E248d, 5.497143053457335E251d, 1.836507598757228E249d, 5.715045150548505E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double4 = code.src.Distance.squaredDistance(4.546779423345663E248d, 4.840681090214691E123d, 1.30972997559812E124d, 2.7030845353965203E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.0063874635772352E61d, 0.0d, 4.182726770879422E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double4 = code.src.Distance.squaredDistance(5.497143053457335E251d, 3.3127290822508215E124d, (double) 33L, 4.5179005661205605E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        long long60 = code.src.Distance.chebyshevDistance(longArray34, longArray57);
        long long61 = code.src.Distance.chebyshevDistance(longArray17, longArray34);
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long[] longArray75 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long76 = code.src.Distance.chebyshevDistance(longArray67, longArray75);
        long long77 = code.src.Distance.chebyshevDistance(longArray34, longArray75);
        long[] longArray80 = new long[] { 0, (short) -1 };
        long[] longArray83 = new long[] { (short) -1, (short) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray80, longArray83);
        long[] longArray91 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long92 = code.src.Distance.chebyshevDistance(longArray83, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray75, longArray91);
        long long94 = code.src.Distance.chebyshevDistance(longArray13, longArray75);
        java.lang.Class<?> wildcardClass95 = longArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 98L + "'", long61 == 98L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 11L + "'", long76 == 11L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 11L + "'", long77 == 11L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 11L + "'", long92 == 11L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        long[] longArray44 = new long[] { 'a', 1L };
        long[] longArray47 = new long[] { 0, (short) -1 };
        long[] longArray50 = new long[] { (short) -1, (short) -1 };
        long long51 = code.src.Distance.chebyshevDistance(longArray47, longArray50);
        long long52 = code.src.Distance.chebyshevDistance(longArray44, longArray50);
        long[] longArray55 = new long[] { 'a', 1L };
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray55, longArray61);
        long long64 = code.src.Distance.chebyshevDistance(longArray50, longArray61);
        long[] longArray67 = new long[] { 'a', 1L };
        long[] longArray70 = new long[] { 0, (short) -1 };
        long[] longArray73 = new long[] { (short) -1, (short) -1 };
        long long74 = code.src.Distance.chebyshevDistance(longArray70, longArray73);
        long long75 = code.src.Distance.chebyshevDistance(longArray67, longArray73);
        long long76 = code.src.Distance.chebyshevDistance(longArray50, longArray73);
        long long77 = code.src.Distance.chebyshevDistance(longArray40, longArray73);
        long[] longArray83 = new long[] { 0L, 'a', 1, 'a', (byte) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray73, longArray83);
        long long85 = code.src.Distance.chebyshevDistance(longArray31, longArray73);
        long[] longArray88 = new long[] { 0, (short) -1 };
        long[] longArray91 = new long[] { (short) -1, (short) -1 };
        long long92 = code.src.Distance.chebyshevDistance(longArray88, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray73, longArray88);
        java.lang.Class<?> wildcardClass94 = longArray73.getClass();
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
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 98L + "'", long52 == 98L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 98L + "'", long63 == 98L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 98L + "'", long75 == 98L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[0, 97, 1, 97, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double4 = code.src.Distance.euclideanDistance(8.694706299426858E61d, 1.1236897439702315E248d, 5.720993474013094E251d, 1.9997892004239E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double4 = code.src.Distance.euclideanDistance(3.7841059251973525E61d, 9.324540899918096E30d, 4.182530750552227E256d, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double4 = code.src.Distance.squaredDistance(1.4331582329756537E128d, 0.0d, 3.0568118497974055E15d, 1.2634745840023956E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.053942520745898E256d + "'", double4 == 2.053942520745898E256d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double4 = code.src.Distance.euclideanDistance(7.771738451246113E125d, 2.7065537201582164E49d, (double) (short) 100, 8.694706299452896E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.771738451246113E125d + "'", double4 == 7.771738451246113E125d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double4 = code.src.Distance.euclideanDistance(7.559791732617994E123d, 2.262179825118349E251d, 0.0d, 1.3179319637108076E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double4 = code.src.Distance.squaredDistance(7.568917694587279E125d, 9.59807360434958E15d, 2.0535092167513552E256d, 5.524950700000004E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double4 = code.src.Distance.euclideanDistance(7.623334020485509E123d, 3.0366107867949796E124d, 7.862701231474445E125d, 1.5338908798484704E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double4 = code.src.Distance.euclideanDistance(4.262266330560975E124d, 0.0d, 1.5119583495997528E124d, 4.485950827314113E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double4 = code.src.Distance.squaredDistance(3.3993126052584937E124d, 1.2857893850944086E250d, 1.0699880226301655E124d, 1.5737202213962112E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double4 = code.src.Distance.euclideanDistance(1.0421930753617213E126d, 1.5119583526749173E124d, 1.74402177078084E62d, 5.7150451504902E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 0.0d, 7.590793803572108E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.590793803572108E125d + "'", double4 == 7.590793803572108E125d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double4 = code.src.Distance.squaredDistance(1.177837421097331E252d, 1.077343123590583E252d, 2.888107199940184E15d, 1.239466100464527E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double4 = code.src.Distance.squaredDistance(2.125614474048533E128d, 3.165779550192911E124d, 7.559791544536665E125d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double4 = code.src.Distance.euclideanDistance(6.192735015311481E251d, 1.5338908798484704E249d, 0.0d, 2.742264228911255E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double4 = code.src.Distance.euclideanDistance(1.4251979253203356E128d, 4.172449883594742E250d, 1.3335864706024715E248d, 1.4328545305891465E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double4 = code.src.Distance.euclideanDistance(1.4990708455962547E124d, 3.0559985941685375E15d, 6.92256251604893E61d, 4.262266330560975E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.518199605235518E124d + "'", double4 == 4.518199605235518E124d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double4 = code.src.Distance.squaredDistance(4.471374129726301E62d, 0.0d, 7.39356285262388E246d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.736952180983727E256d, 5.714644157457502E251d, 3.424182432006193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double4 = code.src.Distance.squaredDistance(3.053611124543087E15d, 20084.432052190223d, 1.4330571085588943E128d, 7.56006994758633E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0536526821066443E256d + "'", double4 == 2.0536526821066443E256d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double4 = code.src.Distance.squaredDistance(4.689593133831153E251d, (double) 1L, 9.466542772834739E21d, 8.694706281798174E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double4 = code.src.Distance.euclideanDistance(9.59807360434958E15d, 2.262179825118349E251d, 7.474529365309457E125d, 2.5156683110561225E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double4 = code.src.Distance.squaredDistance((double) (short) -1, 3.006072569932526E128d, 3.7841059251973525E61d, 7.77326133854061E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.036472295700742E256d + "'", double4 == 9.036472295700742E256d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double4 = code.src.Distance.squaredDistance(3.0535834157458975E15d, 1.5971183631743827E254d, 1.5891491557236519E254d, 2.0454154726104665E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double4 = code.src.Distance.squaredDistance(5.52593680000932E7d, 8.341162879156251E30d, 0.0d, 3.681736809627178E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double4 = code.src.Distance.euclideanDistance(1.209524440947343E125d, 8.341163188864031E30d, 5.979842719542829E255d, 3.536773594809233E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double4 = code.src.Distance.euclideanDistance(5.948654328288417E248d, 1.2296171569516298E62d, 3.3127290822508215E124d, 5.310434588680901E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double4 = code.src.Distance.euclideanDistance(1.8648415840790313E31d, 2.6593879130842587E124d, 3.890146281899556E124d, 6.301988755686634E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double4 = code.src.Distance.squaredDistance(6.181401239083565E251d, 3.559657110785834E251d, 2.8519907324927616E87d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double4 = code.src.Distance.euclideanDistance(9.324540899933247E30d, 9.386961461524785E62d, 7.560644248248633E125d, 5.720993474013094E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double4 = code.src.Distance.euclideanDistance(6.301988755686634E251d, 1.0486765404643798E16d, 1.1142495781208175E62d, 6.151508697220018E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double4 = code.src.Distance.squaredDistance(5.722457520259434E251d, 3.0005186432380365E128d, 7.447258393539782E248d, 5.715045150481366E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double4 = code.src.Distance.euclideanDistance(4.792173836495848E123d, 8.917458244322077E62d, 2.12553893505374E128d, 1.1142495781208175E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1254910133153752E128d + "'", double4 == 2.1254910133153752E128d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double4 = code.src.Distance.euclideanDistance(2.0454154726104665E128d, 1.2637714837637312E127d, 4.080492135606123E124d, 3.644803753780143E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double4 = code.src.Distance.euclideanDistance(12313.553084145538d, 1.2296171124372597E62d, 0.0d, 8.859911358917301E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.859911358917301E125d + "'", double4 == 8.859911358917301E125d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double4 = code.src.Distance.euclideanDistance(5.484533507010109E251d, 7.406698157764146E250d, 5.717560488315264E251d, 2.0451720082100127E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double4 = code.src.Distance.euclideanDistance(7.32543304010228E98d, 9.12019899331142E125d, 7.559791763374577E123d, 1.5656099294436052E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double4 = code.src.Distance.euclideanDistance(2.4805194246531137E124d, 1.8914631202919207E124d, 8.961543206990963E43d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.119392465129366E124d + "'", double4 == 3.119392465129366E124d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double4 = code.src.Distance.euclideanDistance(4.70381733357983E251d, 6.301988755686634E251d, 5.791260368077024E24d, 2.129673436349805E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double4 = code.src.Distance.euclideanDistance(3.0535834157458975E15d, 7.661073336008042E123d, 8.350150916003777E100d, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.661073336008042E123d + "'", double4 == 7.661073336008042E123d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double4 = code.src.Distance.euclideanDistance((double) 100L, 1.2756882071026236E198d, 4.9778761674495435E218d, 6.449576703798581E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double4 = code.src.Distance.euclideanDistance(1.0691159266556964E124d, 7.876508236289523E125d, 1.917769450392853E125d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double4 = code.src.Distance.squaredDistance(8.694706299452407E61d, 5.545562436161672E251d, 8.866895281429006E62d, 5.5218522892182536E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double4 = code.src.Distance.squaredDistance(2.554335603593525E128d, 8.320193817483419E30d, 5.71504515055861E247d, 5.763138746578841E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }
}

