import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        double double4 = code.src.Distance.euclideanDistance(2.0234598189585263E246d, 6.17830490479184E248d, 7.635389630576875E125d, 1.8648415840790313E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double4 = code.src.Distance.squaredDistance(1.3415049736556993E127d, 5.501575976011727E124d, 1.917769450392853E125d, 2.1256144767371883E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.533383854812086E256d + "'", double4 == 4.533383854812086E256d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double4 = code.src.Distance.euclideanDistance(3.0559985941685375E15d, 7.5597917633235E123d, 9.324540899917549E30d, 3.833637407942809E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.5597917633235E123d + "'", double4 == 7.5597917633235E123d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double4 = code.src.Distance.squaredDistance(2.553460170097694E124d, 5.52593790000923E7d, 1.2126872764393267E249d, 2.6593879130842587E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double4 = code.src.Distance.squaredDistance(1.918367176323824E125d, 2.8519907324927616E87d, 8.27605827574068E123d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.048095142025898E256d + "'", double4 == 2.048095142025898E256d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double4 = code.src.Distance.euclideanDistance(3.7142566826117396E249d, 0.0d, 2.125690131439817E128d, 2.8896627685601946E50d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double4 = code.src.Distance.euclideanDistance(1.2296171124372597E62d, 2.742264228911255E125d, 1.4300949526255977E64d, 1.4417436355488089E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4390013713198977E128d + "'", double4 == 1.4390013713198977E128d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double4 = code.src.Distance.euclideanDistance(4.849373849148842E124d, 2.053509149446454E256d, 6.520158840275344E248d, 8.05047120619714E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double4 = code.src.Distance.euclideanDistance(5.791260368077024E24d, 3.681736809627178E250d, 1.887468026859852E249d, 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double4 = code.src.Distance.euclideanDistance(5.715045104064755E247d, 5.310434588680901E251d, 1552637.0d, 2.1256287435569485E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double4 = code.src.Distance.squaredDistance(2.6593879130842587E124d, 6.957500350144719E61d, 3.0239723409974164E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3292180507676446E247d + "'", double4 == 1.3292180507676446E247d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) 10, 6.106325777130968E125d, 1.4223699416343344E126d, 1.2074554820296805E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5479045176720047E126d + "'", double4 == 1.5479045176720047E126d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double4 = code.src.Distance.euclideanDistance(8.694705670079996E61d, 1.4331582329756537E128d, 5.719666280792153E251d, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double4 = code.src.Distance.squaredDistance(5.527131618909466E7d, 7.608198465098248E125d, 6.301988755686634E251d, 3.119392465129366E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double4 = code.src.Distance.euclideanDistance(1.433007028500352E128d, 1.3335864706024715E248d, 8.694705670079989E61d, 2.0530721058298435E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        long[] longArray2 = new long[] { 'a', 1L };
        long[] longArray5 = new long[] { 0, (short) -1 };
        long[] longArray8 = new long[] { (short) -1, (short) -1 };
        long long9 = code.src.Distance.chebyshevDistance(longArray5, longArray8);
        long long10 = code.src.Distance.chebyshevDistance(longArray2, longArray8);
        long[] longArray13 = new long[] { 0, (short) -1 };
        long[] longArray16 = new long[] { (short) -1, (short) -1 };
        long long17 = code.src.Distance.chebyshevDistance(longArray13, longArray16);
        long long18 = code.src.Distance.chebyshevDistance(longArray8, longArray16);
        java.lang.Class<?> wildcardClass19 = longArray8.getClass();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double4 = code.src.Distance.squaredDistance(1.1649654526156026E205d, (double) (-1.0f), 4.485515365493677E256d, 2.117752378578906E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double4 = code.src.Distance.euclideanDistance(2.1254910133153752E128d, 2.244907423513874E31d, 5.728851506743641E251d, 5.57426963143218E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double4 = code.src.Distance.squaredDistance(1.1248441811882996E99d, 1.3142885088073338E127d, 1.8474736870780683E51d, 1.5737202213962112E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.723220116172223E254d + "'", double4 == 1.723220116172223E254d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.560261194608789E125d, 1.4253988300352539E128d, 8.013384602956264E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4253989020574886E128d + "'", double4 == 1.4253989020574886E128d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double4 = code.src.Distance.euclideanDistance(9.324540562451319E30d, 1.515435523161302E124d, 9.324546353624267E30d, 1.1236897439702315E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double4 = code.src.Distance.squaredDistance(6.385337334710284E62d, 4.792979223186968E123d, 6.458990228650728E249d, 5.9798424948214894E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double4 = code.src.Distance.squaredDistance(6.385337334710284E62d, 4.5182406995808964E256d, 8.824228056978371E247d, 9.351743915519625E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double4 = code.src.Distance.squaredDistance(1.5891483284062439E254d, 0.0d, 4.476410859359017E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double4 = code.src.Distance.squaredDistance(7.559791732617994E123d, 9.344073313646239E30d, 8.790684697775343E244d, 5.528905595074321E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double4 = code.src.Distance.squaredDistance(3.681736809627178E250d, 1.5134476182871558E249d, 8.859911358917301E125d, 3.326166438578114E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double4 = code.src.Distance.euclideanDistance(1.3101817078026575E64d, 1.602837247029983E254d, 1.0699880226301655E124d, 2.0530721058298435E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double4 = code.src.Distance.squaredDistance(6.181401239083565E251d, 8.991400839772017E43d, 0.0d, 9.012004300008916E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double4 = code.src.Distance.squaredDistance(104.0d, 5.763159931203444E251d, 4.794486294195585E251d, 1.1142495781208175E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        long[] longArray84 = new long[] { 0, (short) -1 };
        long[] longArray87 = new long[] { (short) -1, (short) -1 };
        long long88 = code.src.Distance.chebyshevDistance(longArray84, longArray87);
        long[] longArray95 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long96 = code.src.Distance.chebyshevDistance(longArray87, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray61, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray61);
        java.lang.Class<?> wildcardClass99 = longArray61.getClass();
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
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1L + "'", long88 == 1L);
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 11L + "'", long96 == 11L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 97L + "'", long97 == 97L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double4 = code.src.Distance.squaredDistance(6.047401286148532E124d, 2.125628747841743E128d, 5.763159931203444E251d, 8.320193817483419E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double4 = code.src.Distance.euclideanDistance(5.791260371133755E24d, 8.961543206990963E43d, 1811816.0d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7388170690697642E62d + "'", double4 == 1.7388170690697642E62d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double4 = code.src.Distance.squaredDistance(5.715045150548505E247d, 6.385337334710284E62d, 5.525994208076646E7d, 4.518236951771165E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double4 = code.src.Distance.euclideanDistance(1552637.0d, 6.53596076341459E175d, 1.1341134428019932E16d, 6.924240949293447E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double4 = code.src.Distance.squaredDistance(1.2387871038033346E124d, 7.850374433297587E251d, 1.1801491380487327E249d, 2.0786247129419894E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        long long46 = code.src.Distance.chebyshevDistance(longArray20, longArray43);
        long long47 = code.src.Distance.chebyshevDistance(longArray3, longArray20);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = code.src.Distance.chebyshevDistance(longArray0, longArray3);
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
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double4 = code.src.Distance.euclideanDistance(1552636.4832506673d, 5.6508057255525505E124d, 20737.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.6508057255525505E124d + "'", double4 == 5.6508057255525505E124d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double4 = code.src.Distance.euclideanDistance((double) (-1.0f), 1.5479045176720047E126d, 1.229617155703251E62d, 3.326166438578114E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double4 = code.src.Distance.euclideanDistance(4.5185585268423626E256d, 1.4579746669762032E64d, 1.4579746669762032E64d, 2.0786247129419894E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double4 = code.src.Distance.squaredDistance(1.457948741083528E64d, 1.7703709657756777E62d, 4.485950827314113E256d, 8.94428757683438E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double4 = code.src.Distance.euclideanDistance(1.836507598757228E249d, 7.864877677880983E125d, 1.2038504689988316E124d, 3.646248963761934E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double4 = code.src.Distance.euclideanDistance(1.4251979253203356E128d, 0.0d, 5.545562436161672E251d, 1.3142885088073338E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double4 = code.src.Distance.squaredDistance(2.1256144753928608E128d, 7.565603634330283E123d, 8.790684697775343E244d, 1.5119582431985447E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double4 = code.src.Distance.squaredDistance(4.840680371280547E123d, 0.0d, 0.0d, 2.9064639308329233E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double4 = code.src.Distance.squaredDistance(6.421433279489652E251d, 7.849802928787181E251d, 8.951751003550235E62d, 1.143009030111722E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        long[] longArray32 = new long[] { 0, (short) -1 };
        long[] longArray35 = new long[] { (short) -1, (short) -1 };
        long long36 = code.src.Distance.chebyshevDistance(longArray32, longArray35);
        long[] longArray43 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long44 = code.src.Distance.chebyshevDistance(longArray35, longArray43);
        long[] longArray47 = new long[] { 'a', 1L };
        long[] longArray50 = new long[] { 0, (short) -1 };
        long[] longArray53 = new long[] { (short) -1, (short) -1 };
        long long54 = code.src.Distance.chebyshevDistance(longArray50, longArray53);
        long long55 = code.src.Distance.chebyshevDistance(longArray47, longArray53);
        long[] longArray58 = new long[] { 'a', 1L };
        long[] longArray61 = new long[] { 0, (short) -1 };
        long[] longArray64 = new long[] { (short) -1, (short) -1 };
        long long65 = code.src.Distance.chebyshevDistance(longArray61, longArray64);
        long long66 = code.src.Distance.chebyshevDistance(longArray58, longArray64);
        long[] longArray69 = new long[] { 'a', 1L };
        long[] longArray72 = new long[] { 0, (short) -1 };
        long[] longArray75 = new long[] { (short) -1, (short) -1 };
        long long76 = code.src.Distance.chebyshevDistance(longArray72, longArray75);
        long long77 = code.src.Distance.chebyshevDistance(longArray69, longArray75);
        long long78 = code.src.Distance.chebyshevDistance(longArray64, longArray75);
        long[] longArray81 = new long[] { 'a', 1L };
        long[] longArray84 = new long[] { 0, (short) -1 };
        long[] longArray87 = new long[] { (short) -1, (short) -1 };
        long long88 = code.src.Distance.chebyshevDistance(longArray84, longArray87);
        long long89 = code.src.Distance.chebyshevDistance(longArray81, longArray87);
        long long90 = code.src.Distance.chebyshevDistance(longArray75, longArray87);
        long long91 = code.src.Distance.chebyshevDistance(longArray47, longArray87);
        long long92 = code.src.Distance.chebyshevDistance(longArray43, longArray87);
        long long93 = code.src.Distance.chebyshevDistance(longArray20, longArray87);
        long long94 = code.src.Distance.chebyshevDistance(longArray5, longArray87);
        java.lang.Class<?> wildcardClass95 = longArray87.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 11L + "'", long44 == 11L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 98L + "'", long55 == 98L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 98L + "'", long66 == 98L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 98L + "'", long77 == 98L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1L + "'", long88 == 1L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 98L + "'", long89 == 98L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 11L + "'", long92 == 11L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.5377172753851527E248d, 8.694706281769265E61d, 1.3142885088073338E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double4 = code.src.Distance.squaredDistance(2.0480917725743317E256d, 3.596149286247409E250d, 7.865071652244784E247d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double4 = code.src.Distance.squaredDistance(2.2840367152798036E31d, 7.590729215407016E125d, 7.559791763367894E123d, 1.4579746669762032E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.762488506678416E251d + "'", double4 == 5.762488506678416E251d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double4 = code.src.Distance.squaredDistance(8.976783674294438E123d, 4.792173836495848E123d, 4.630067801207703E249d, 5.463413916504991E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double4 = code.src.Distance.squaredDistance(2.2965057953353264E247d, 4.484875136976614E256d, 7.559791763367894E123d, 4.3184582665404395E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double4 = code.src.Distance.squaredDistance(2.0504686747931686E246d, 5.6044914253382785E125d, (-1.0d), 1.0670318622827465E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double4 = code.src.Distance.euclideanDistance(6.192735015311481E251d, 1.024464211209343E25d, 6.92256251604893E61d, 4.181639060777985E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double4 = code.src.Distance.squaredDistance(2.0451720082100127E128d, 8.991400839772017E43d, 0.0d, 4.518033412506453E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double4 = code.src.Distance.squaredDistance(1.2038504689988316E124d, 1.8649081799905601E31d, 4.557896970053384E248d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 9.778776737535161E212d, 4.794956959071923E255d, 3.4290270810282753E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double4 = code.src.Distance.squaredDistance(1.2038504689988316E124d, 0.0d, 6.073378130472233E251d, 1.0670548273407037E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double4 = code.src.Distance.euclideanDistance(8.694705670079989E61d, 7.732944131972951E127d, 4.9778761674495435E218d, 4.3190021108187545E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double4 = code.src.Distance.squaredDistance(1.0329723434258763E126d, 2.2965057957235622E247d, 7.568917694587279E125d, 4.518199605235518E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double4 = code.src.Distance.euclideanDistance(1.1309348446938204E126d, 4.877950885822437E248d, 7.406698157764146E250d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double4 = code.src.Distance.squaredDistance(9.284544414987072E30d, 7.656605268811053E125d, 6.42143426575965E251d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double4 = code.src.Distance.squaredDistance(5.715044985152495E251d, 5.528905595074321E7d, 4.717807507424959E124d, 3.644803753780143E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double4 = code.src.Distance.euclideanDistance(6.922552879173873E61d, 0.0d, 1.1341134428019932E16d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.922552879173873E61d + "'", double4 == 6.922552879173873E61d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double4 = code.src.Distance.euclideanDistance(9922.0d, 7.656605268811053E125d, 1346.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.656605268811053E125d + "'", double4 == 7.656605268811053E125d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double4 = code.src.Distance.euclideanDistance(5.829917481072086E251d, 1.0063874635772352E61d, 3.0568077560623055E15d, 7.701874509023016E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double4 = code.src.Distance.squaredDistance(1.102865396833695E32d, 7.560644248248633E125d, 2.12553893505374E128d, 7.623334020485509E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.517971780836028E256d + "'", double4 == 4.517971780836028E256d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double4 = code.src.Distance.squaredDistance(7.43091669258797E123d, 8.694706281769278E61d, (double) ' ', 9.368838995853397E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4299366702240583E248d + "'", double4 == 1.4299366702240583E248d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double4 = code.src.Distance.squaredDistance(1.5479045176720047E126d, 1.069116001870466E124d, 2.286018050924408E248d, 8.779875994255162E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double4 = code.src.Distance.euclideanDistance(1.951229426380269E125d, 2.7065537201582164E49d, 2.1256901295443705E128d, 9.324546353624267E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.12373890011799E128d + "'", double4 == 2.12373890011799E128d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double4 = code.src.Distance.squaredDistance(1.4330571085588943E128d, 4.471374129726301E62d, 3.5776180632559095E250d, 8.69470629945289E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
        long long61 = code.src.Distance.chebyshevDistance(longArray17, longArray57);
        long long62 = code.src.Distance.chebyshevDistance(longArray13, longArray57);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
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
        long long92 = code.src.Distance.chebyshevDistance(longArray78, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray68, longArray78);
        long long94 = code.src.Distance.chebyshevDistance(longArray57, longArray78);
        java.lang.Class<?> wildcardClass95 = longArray57.getClass();
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
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
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
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double4 = code.src.Distance.squaredDistance(2.2965057953353264E247d, 3.80522029780604E250d, 4.085911751455954E251d, 5.068357262307933E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        long long31 = code.src.Distance.chebyshevDistance(longArray6, longArray16);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = code.src.Distance.chebyshevDistance(longArray0, longArray6);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double4 = code.src.Distance.euclideanDistance(7.849802928787181E251d, (double) (byte) -1, 1.3142885088073338E127d, 6.188205857868469E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double4 = code.src.Distance.euclideanDistance(8.961543206990963E43d, 12313.553084145538d, 1.143009020812949E248d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
            long long80 = code.src.Distance.chebyshevDistance(longArray0, longArray74);
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double4 = code.src.Distance.euclideanDistance(2.4805194246531137E124d, 2.1256144767371883E128d, 7.701874509023016E125d, 5.57426963143218E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double4 = code.src.Distance.euclideanDistance(6.53596076341459E175d, 5.791260371133832E24d, 5.71504510406472E247d, 2.742264228911255E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double4 = code.src.Distance.squaredDistance(2.0530721058298435E256d, 1.2093895208085425E64d, 8.868523920159873E123d, 9.036472295700742E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double4 = code.src.Distance.euclideanDistance(1.5737202213962112E124d, 1.4291186487223539E128d, 1.4390013713198977E128d, 2.286018050924408E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double4 = code.src.Distance.squaredDistance(7.559791763374587E123d, 4.080492135606123E124d, (double) (byte) 0, 1.4990708455962547E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.235240391572074E248d + "'", double4 == 7.235240391572074E248d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double4 = code.src.Distance.euclideanDistance(5.714644157457502E251d, 1.6830116762241088E124d, 9.951221440466418E248d, 7.380601634026061E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double4 = code.src.Distance.euclideanDistance(1.4330571085588943E128d, 0.0d, 1.887468026859852E249d, 5.394413031427706E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.5665408678303301E62d, 7.559791763329309E123d, 6.42143426575965E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double4 = code.src.Distance.euclideanDistance(9.324540890451003E30d, 2.7065537201582164E49d, 100.0d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0691159266556964E124d + "'", double4 == 1.0691159266556964E124d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double4 = code.src.Distance.euclideanDistance(7.590729215407016E125d, 1.9997892004239E64d, 7.65996356070261E125d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.923434529559351E123d + "'", double4 == 6.923434529559351E123d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double4 = code.src.Distance.euclideanDistance(1.0691160040444007E124d, 5.726018993608619E251d, 3.2973523484734863E250d, 8.94428757683438E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double4 = code.src.Distance.euclideanDistance(4.1519250136110354E256d, 5.603244642552161E251d, 2.12373890011799E128d, 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double4 = code.src.Distance.euclideanDistance(1.8474736870780683E51d, 1.7874479094208446E62d, 1.9395881659392382E249d, 12313.553084145538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double4 = code.src.Distance.euclideanDistance(1.7874479094211152E62d, 1.7169939815538626E256d, 1.158095138919963E126d, 1.1142495781208175E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double4 = code.src.Distance.euclideanDistance((double) 0, 0.0d, 5.604659899440947E124d, 1.2496907143570294E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.604659899440947E124d + "'", double4 == 5.604659899440947E124d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double4 = code.src.Distance.euclideanDistance(8.694866271304194E61d, 4.1827267651555864E256d, 1.2652744319531763E198d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double4 = code.src.Distance.squaredDistance(9.344073313646239E30d, 7433.0d, 1.433007028500352E128d, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0535093708374117E256d + "'", double4 == 2.0535093708374117E256d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double4 = code.src.Distance.squaredDistance(0.0d, 5.792131737449658E251d, 7.677886613131662E20d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray41, longArray81);
        long[] longArray88 = new long[] { 0, (short) -1 };
        long[] longArray91 = new long[] { (short) -1, (short) -1 };
        long long92 = code.src.Distance.chebyshevDistance(longArray88, longArray91);
        long[] longArray95 = new long[] { 100L, 1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray91, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray81, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray23, longArray95);
        java.lang.Class<?> wildcardClass99 = longArray23.getClass();
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
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 98L + "'", long85 == 98L);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 101L + "'", long96 == 101L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 101L + "'", long97 == 101L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 101L + "'", long98 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long[] longArray24 = new long[] { 0, (short) -1 };
        long[] longArray27 = new long[] { (short) -1, (short) -1 };
        long long28 = code.src.Distance.chebyshevDistance(longArray24, longArray27);
        long long29 = code.src.Distance.chebyshevDistance(longArray20, longArray24);
        long long30 = code.src.Distance.chebyshevDistance(longArray13, longArray20);
        java.lang.Class<?> wildcardClass31 = longArray13.getClass();
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
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11L + "'", long30 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double4 = code.src.Distance.squaredDistance(8.426822856338381E123d, 6.924240949293447E125d, 1.956152822910355E125d, 1.203713755180189E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.979659311150055E251d + "'", double4 == 4.979659311150055E251d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double4 = code.src.Distance.squaredDistance(1.2126872764393267E249d, 1.0699880226301655E124d, 2.0539425682826672E256d, 1552636.4832506673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double4 = code.src.Distance.euclideanDistance(9.862699982330608E244d, 6.820197224490154E125d, 0.0d, 4.840681090214691E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double4 = code.src.Distance.squaredDistance(9.324540899918096E30d, 1.30972997559812E124d, 0.0d, 1.077343123590583E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double4 = code.src.Distance.squaredDistance(7.65996356070261E125d, 1.2387871038033346E124d, 6.923658324661806E125d, 5.527131720196977E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.574913355065987E249d + "'", double4 == 5.574913355065987E249d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double4 = code.src.Distance.squaredDistance(2.1256483132637286E128d, 2.1256145316270446E128d, 8.030925665076586E87d, 4.1829248331382305E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double4 = code.src.Distance.squaredDistance(1.1548101448300805E124d, 5.53979513351125E119d, 3.4131590244458324E102d, 6.923434529559351E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8128492217045236E248d + "'", double4 == 1.8128492217045236E248d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double4 = code.src.Distance.squaredDistance(5.979842719542829E255d, (double) (byte) 1, 8.694706281769284E61d, 8.133851138224599E174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double4 = code.src.Distance.euclideanDistance(8.694706299424537E61d, 3.0580621176685875E15d, 4.533383854812086E256d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double4 = code.src.Distance.euclideanDistance(7.732824116021177E127d, (double) 100L, 1.1801491380487327E249d, 8.694706299452896E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.3186892203577162E31d, 6.047401286148532E124d, 1.2074554820296805E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.657106231571092E249d + "'", double4 == 3.657106231571092E249d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double4 = code.src.Distance.euclideanDistance(3.728721449645412E251d, 2.0480917725743317E256d, 2.884474619048523E15d, 6.047401286148532E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.719110673110582E123d, 1.0691159266556964E124d, 1.4561688805466475E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4329715861471609E125d + "'", double4 == 1.4329715861471609E125d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double4 = code.src.Distance.euclideanDistance(1.380250332732779E124d, 1.0861664063319225E252d, (double) (short) 100, 5.726018993608619E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double4 = code.src.Distance.euclideanDistance(5.71504515055861E247d, (double) (short) -1, 4.630067801207703E249d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double4 = code.src.Distance.squaredDistance(4.347362196294934E62d, 2.166084616081951E249d, 5.525929037215044E7d, 1.1929678834484718E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double4 = code.src.Distance.squaredDistance(2.4389908525564578E124d, 1.8914631202919207E124d, 3.0005186432380365E128d, 4.717807507424959E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.00164862028326E256d + "'", double4 == 9.00164862028326E256d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double4 = code.src.Distance.squaredDistance(2.406501954865E12d, 1.8128492217045236E248d, 3.4131592097982255E102d, 1.598827773271099E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray59, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray45, longArray59);
        java.lang.Class<?> wildcardClass71 = longArray59.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double4 = code.src.Distance.squaredDistance(2.05329249062104E256d, 4.302581716460107E251d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double4 = code.src.Distance.euclideanDistance(1.1929678955220982E32d, 8.991400839772116E43d, 1.0922306970231484E16d, 1.2637714837637312E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2637714837637312E127d + "'", double4 == 1.2637714837637312E127d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double4 = code.src.Distance.squaredDistance(3.165779550192911E124d, 4.4848752944105095E256d, 3.377784400566722E241d, 2.0535093708374117E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double4 = code.src.Distance.euclideanDistance(2.0147440391085077E256d, 3.311955036268193E63d, 5.715045150490167E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double4 = code.src.Distance.euclideanDistance(2.406503766581682E12d, 6.924240949293447E125d, 1.7307558713743367E254d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double4 = code.src.Distance.squaredDistance(2.884474619048523E15d, 1.2093895208085425E64d, 7.447258393539782E248d, 7.862183193182798E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 9.344073313646239E30d, 5.6044914253382785E125d, 6.520180893902484E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double4 = code.src.Distance.squaredDistance(4.302581716460107E251d, 5.786405680011157E251d, 7.393566762337766E246d, 5.497143053457335E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double4 = code.src.Distance.euclideanDistance(100.0d, 7.677886613131662E20d, 9.324540899933302E30d, 1.736952180983727E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray71, longArray82);
        long long86 = code.src.Distance.chebyshevDistance(longArray42, longArray71);
        long[] longArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long88 = code.src.Distance.chebyshevDistance(longArray42, longArray87);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
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
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double double4 = code.src.Distance.euclideanDistance(2.0850307160336277E31d, 7.39356285262388E246d, 1811717.0d, 3.053584521181947E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double4 = code.src.Distance.euclideanDistance(3.598765218630986E247d, 8.694866271304194E61d, 2.0535093708374117E256d, 2.0483124887933698E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 0.0d, 4.557896970053384E248d, 4.533383854812086E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double4 = code.src.Distance.euclideanDistance(5.7150451504902E247d, 7.393566762337766E246d, 5.250078299133718E247d, 5.545562436161672E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double4 = code.src.Distance.squaredDistance(9.284544414987072E30d, 8.722498761879103E62d, 2.1256144753928608E128d, 2.5156683110561225E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double4 = code.src.Distance.euclideanDistance(5.715044819684806E251d, 2.125628747841743E128d, 8.793716013138559E63d, 1.0861664063319225E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double4 = code.src.Distance.squaredDistance(7.786532742293105E125d, 5.714644157457502E251d, 5.976212418396983E251d, 5.717560488315264E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double4 = code.src.Distance.euclideanDistance(9.778776737535161E212d, 3.0559985941685375E15d, 3.321083216563934E61d, 1.2346234984976643E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        long long61 = code.src.Distance.chebyshevDistance(longArray17, longArray57);
        long long62 = code.src.Distance.chebyshevDistance(longArray13, longArray57);
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
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
        long long92 = code.src.Distance.chebyshevDistance(longArray78, longArray89);
        long long93 = code.src.Distance.chebyshevDistance(longArray68, longArray78);
        long long94 = code.src.Distance.chebyshevDistance(longArray57, longArray78);
        java.lang.Class<?> wildcardClass95 = longArray78.getClass();
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
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
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
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double4 = code.src.Distance.squaredDistance(5.741400496898164E251d, 6.182207065542976E251d, 7.814857737225062E7d, 2.1256287435569485E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        long[] longArray84 = new long[] { 0, (short) -1 };
        long[] longArray87 = new long[] { (short) -1, (short) -1 };
        long long88 = code.src.Distance.chebyshevDistance(longArray84, longArray87);
        long[] longArray95 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long96 = code.src.Distance.chebyshevDistance(longArray87, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray61, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray61);
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
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1L + "'", long88 == 1L);
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 11L + "'", long96 == 11L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 97L + "'", long97 == 97L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 98L + "'", long98 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double4 = code.src.Distance.euclideanDistance(Double.POSITIVE_INFINITY, 3.353869668626517E49d, 5.869204465969338E247d, 6.152976616081415E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double4 = code.src.Distance.euclideanDistance(8.426822856338381E123d, 2.3432186456900772E247d, 1.433158224335312E128d, 7.559791732623826E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double4 = code.src.Distance.euclideanDistance(2.5619922088623362E128d, 1.1309348446938204E126d, 2.0535092167513552E256d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 9.977005894109556E248d, 4.8513343941294685E255d, 6.556084846280365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 6.922562533439975E61d, 7.732944131972951E127d, 8.08452890614697E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.732944131972951E127d + "'", double4 == 7.732944131972951E127d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double4 = code.src.Distance.euclideanDistance(104.0d, 4.182726770879422E256d, 1.956152822910355E125d, 3.650997547418172E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double4 = code.src.Distance.euclideanDistance(4.2522853448307394E125d, (double) 3L, 6.820197224490154E125d, 6.42143426575965E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double4 = code.src.Distance.squaredDistance(1.4253988300352539E128d, 4.485940704933021E256d, 4.302581716460107E251d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double4 = code.src.Distance.squaredDistance(104.0d, 4.1811108493051547E256d, 7.562847533034203E125d, 1.574966483660244E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double4 = code.src.Distance.euclideanDistance(4.51823713706406E256d, 1.4579486012297467E64d, 4.484932138384625E256d, 1.224365486934459E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double4 = code.src.Distance.euclideanDistance(5.762488506678416E251d, 5.603244642552161E251d, 5.786405680011157E251d, 7.590729215407016E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double4 = code.src.Distance.squaredDistance(9.324540562451319E30d, 2.0481498109123508E256d, 1.433007028500352E128d, 2.769446841189903E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double4 = code.src.Distance.squaredDistance(1.453465767405697E125d, 1.9660977441160548E252d, 1225.0d, 3.053611124543088E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.3432193630265306E247d, (double) 0, 1.4330571085588943E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double4 = code.src.Distance.squaredDistance(6.192735015311481E251d, 5.715045150481383E247d, 6.520222954978057E248d, 1.4328545305891465E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double4 = code.src.Distance.squaredDistance(5.6508057255525505E124d, 3.119392465129366E124d, 1.109007633775659E257d, 1.462949373248983E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double4 = code.src.Distance.euclideanDistance(1.3292180507676446E247d, 3.477821790930845E62d, 9.144070917092657E248d, 3.1271035700045434E106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double4 = code.src.Distance.squaredDistance(2.262179825118349E251d, 6.587293214563927E247d, 4.92586451367552E248d, 1.2496907143570294E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double4 = code.src.Distance.squaredDistance(1.4251979253203356E128d, 8.694706173607399E62d, 1.0670548273407037E252d, 1.6830116762241088E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double4 = code.src.Distance.squaredDistance(1.6544106198611494E250d, 7.920443263990935E119d, (double) 100, 3.0918445022754607E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double4 = code.src.Distance.euclideanDistance(2.0535093708374117E256d, 2.1177523428484083E128d, 4.717807507424959E124d, 8.745511426145833E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double4 = code.src.Distance.euclideanDistance(3.536773594809233E124d, 7.39356285262388E246d, 4.753127358123107E124d, 3.053611124540608E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double4 = code.src.Distance.euclideanDistance(8.917458244322077E62d, 4.518236903714711E256d, 3.583333108359959E250d, 3.056811849797306E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double4 = code.src.Distance.euclideanDistance(9.144408719117394E248d, 1.0486765404656112E16d, 4.302581716460107E251d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double4 = code.src.Distance.squaredDistance(9.324540899917545E30d, 5.525928500007007E7d, 9.003112128419027E256d, 1.0063874635772352E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double4 = code.src.Distance.euclideanDistance(4.518033412506453E256d, 0.0d, 6.307309197813705E251d, 6.923824166576346E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double4 = code.src.Distance.squaredDistance(2.406503766581682E12d, 6.18529391824118E251d, 2.1254910133153752E128d, 9.977005894109556E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double4 = code.src.Distance.euclideanDistance(2.0535093708374117E256d, 7.559791653975984E125d, (double) 90L, 1.43186707723895E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double4 = code.src.Distance.euclideanDistance(104.0d, (double) (short) 100, 0.0d, 1.0190538431654038E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double4 = code.src.Distance.squaredDistance(3.353869680772834E49d, 4.546779423345663E248d, 7.568917694587279E125d, 2.8095584331559984E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double4 = code.src.Distance.euclideanDistance(8.69470629945289E61d, 4.518236899385757E256d, 5.52593790000923E7d, 2.117752378578906E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double4 = code.src.Distance.squaredDistance(0.0d, 3.657106231571092E249d, 6.458990228650728E249d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double4 = code.src.Distance.squaredDistance(4.92586451367552E248d, 1.5737202213962112E124d, 5.394413031427706E251d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double4 = code.src.Distance.euclideanDistance(2.05329249062104E256d, 5.463413916504991E251d, 8.067055176895368E247d, 6.923658324661806E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        long long54 = code.src.Distance.chebyshevDistance(longArray23, longArray44);
        long[] longArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long56 = code.src.Distance.chebyshevDistance(longArray44, longArray55);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 11L + "'", long53 == 11L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double4 = code.src.Distance.euclideanDistance(6.151508697220018E30d, 0.0d, 8.426822856338381E123d, 2.1167681432297242E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1167681449070773E128d + "'", double4 == 2.1167681449070773E128d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double4 = code.src.Distance.squaredDistance(4.181639060777985E256d, 7.701874509023016E125d, 2.12553893505374E128d, 5.463413916504991E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double4 = code.src.Distance.squaredDistance(2.553460170097694E124d, 7.814857737225062E7d, 3.3993126052584937E124d, 1.3675232181739833E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double4 = code.src.Distance.euclideanDistance(7.559791732623826E123d, 8.133851138224599E174d, 4.5182371393605655E256d, 2.1167681432297242E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double4 = code.src.Distance.squaredDistance(20737.0d, 7.865071652244784E247d, 5.864222144890665E251d, 9.32387494085701E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double4 = code.src.Distance.squaredDistance(2.1167681449070773E128d, 3.0234847996883654E124d, 2.8519907324927616E87d, 3.54371002001072E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double4 = code.src.Distance.euclideanDistance(4.485515365493677E256d, 2.1254910133153752E128d, 1.3335864706024715E248d, 3.4806291687247766E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double4 = code.src.Distance.euclideanDistance(1.0d, 1.462949373248983E250d, 3.068933012127493E239d, 7.32543304010228E98d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double4 = code.src.Distance.squaredDistance(0.0d, 9.79709836214289E7d, (double) 0L, 8.694706299426858E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763329309E123d + "'", double4 == 7.559791763329309E123d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double4 = code.src.Distance.squaredDistance(3.201844896665003E124d, 1.1801491380487327E249d, 3.772588879245304E249d, 5.574913355065987E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double4 = code.src.Distance.squaredDistance(7.562847533034203E125d, (double) 97L, 1.515435523161302E124d, 7.821589175633897E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.492742669460755E251d + "'", double4 == 5.492742669460755E251d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double4 = code.src.Distance.euclideanDistance(8.69470629942351E61d, 0.0d, 140.71602609511115d, 2.561992209977688E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.561992209977688E128d + "'", double4 == 2.561992209977688E128d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double4 = code.src.Distance.squaredDistance(2.7676045845140174E123d, 9.012004300008916E249d, 6.540287573520957E256d, 7.562847533034203E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double4 = code.src.Distance.squaredDistance(3.0005186432380365E128d, 2.0451715735252107E128d, 1.1473791318585206E252d, 7.565603634330283E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double4 = code.src.Distance.euclideanDistance(1.7874479094211152E62d, 8.694706281769284E61d, 8.133851138224599E174d, 3.536773594809233E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double4 = code.src.Distance.squaredDistance(3.54371002001072E251d, 7.406698157764146E250d, 6.540349417685828E256d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double4 = code.src.Distance.euclideanDistance(2.719111392042953E123d, 4.1827840536706536E256d, 1.2296171569516298E62d, 144.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double4 = code.src.Distance.euclideanDistance(6.385337334710284E62d, 2.554335603593525E128d, 1.2400472875600966E124d, 4.654121416639182E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5538701944624236E128d + "'", double4 == 2.5538701944624236E128d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        long long46 = code.src.Distance.chebyshevDistance(longArray20, longArray43);
        long long47 = code.src.Distance.chebyshevDistance(longArray3, longArray20);
        long[] longArray50 = new long[] { 0, (short) -1 };
        long[] longArray53 = new long[] { (short) -1, (short) -1 };
        long long54 = code.src.Distance.chebyshevDistance(longArray50, longArray53);
        long[] longArray61 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long62 = code.src.Distance.chebyshevDistance(longArray53, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray20, longArray61);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = code.src.Distance.chebyshevDistance(longArray0, longArray61);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 11L + "'", long63 == 11L);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 99.41369581878968d, 6.858438111975517E125d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.858438111975517E125d + "'", double4 == 6.858438111975517E125d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double4 = code.src.Distance.euclideanDistance(3.353869668626517E49d, 2.0450959756078844E128d, 4.689593133831153E251d, 4.518236951771165E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double4 = code.src.Distance.squaredDistance(3.7454893307807313E251d, 6.073378130472233E251d, 5.52593790000923E7d, 1.0695270443395895E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double4 = code.src.Distance.squaredDistance(1.2094207749824497E64d, 7.562847533034203E125d, 1.918367176323824E125d, 6.922562516048925E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.087679543111817E251d + "'", double4 == 6.087679543111817E251d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double4 = code.src.Distance.squaredDistance(1.0861664063319225E252d, 2.60716228554408E250d, 3.201844896665003E124d, 5.185424875331702E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double4 = code.src.Distance.squaredDistance(7.608574040480504E125d, 1.4561688805466475E125d, 1.453465767405697E125d, 8.42249655260944E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.641507908782172E251d + "'", double4 == 8.641507908782172E251d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double4 = code.src.Distance.squaredDistance(1.158095138919963E126d, 1.4330571085588943E128d, 1.2296178404951322E62d, 2.5573985948136816E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2642778961487031E256d + "'", double4 == 1.2642778961487031E256d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double4 = code.src.Distance.euclideanDistance(7.413179166381833E250d, 5.715044985152495E251d, 8.0133847820028E125d, 4.507895615716358E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double4 = code.src.Distance.squaredDistance(0.0d, 3.5776180632559095E250d, 1.4255337706659871E125d, 5.728851506743641E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double4 = code.src.Distance.squaredDistance(0.0d, 0.0d, 9.797098384561698E7d, 1.2496907143570294E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5617268815501826E62d + "'", double4 == 1.5617268815501826E62d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double4 = code.src.Distance.squaredDistance(4.717807507424959E124d, 8.694715983872712E61d, 5.786405680011157E251d, 7.1990513445280965E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double4 = code.src.Distance.squaredDistance(2.1256144753928608E128d, 6.804460155815231E124d, 1.231235105847726E124d, 1.2632922663800816E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5335011029982485E256d + "'", double4 == 4.5335011029982485E256d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double4 = code.src.Distance.euclideanDistance(6.92256251604893E61d, 3.583333108359959E250d, 1.887468026859852E249d, 7.611134977058946E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double4 = code.src.Distance.squaredDistance(0.0d, (double) 11L, 8.341163188864031E30d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.957500334326037E61d + "'", double4 == 6.957500334326037E61d);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double4 = code.src.Distance.euclideanDistance(9.137715554420027E30d, 1.4331252154618285E128d, 1225.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4331252154618285E128d + "'", double4 == 1.4331252154618285E128d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double4 = code.src.Distance.squaredDistance(8.116214151045995E123d, 6.556084846280365E12d, 1.33937091808876E127d, 1.511958349599839E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7917432767295218E254d + "'", double4 == 1.7917432767295218E254d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double4 = code.src.Distance.euclideanDistance(5.497143053457335E251d, 1.951229426380269E125d, 6.301988755686634E251d, 7.611134977058946E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double4 = code.src.Distance.squaredDistance(3.1962305404177685E128d, 8.866898431039124E62d, 2.1256145316270446E128d, 1.1918576465896191E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double4 = code.src.Distance.squaredDistance(7.710680125905936E10d, 5.715045150558624E247d, 2.7065537201582164E49d, 1.6205790789034482E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) 100, 1.4534136470864304E252d, 2.286018050924669E248d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double4 = code.src.Distance.euclideanDistance(1.024464211209343E25d, 6.922562533439975E61d, 1.3436331804825283E127d, 4.347362196294934E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3436331804825283E127d + "'", double4 == 1.3436331804825283E127d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double4 = code.src.Distance.squaredDistance(7.43091669258797E123d, 2.406501954865E12d, 3.0522370255297355E15d, 7.710680125905936E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.5218522892182536E247d + "'", double4 == 5.5218522892182536E247d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double4 = code.src.Distance.squaredDistance(2.7191106511481887E123d, 8.42249655260944E125d, 1.836507598757228E249d, 3.054769716678889E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double4 = code.src.Distance.euclideanDistance(2.125614498247224E128d, 8.722498761879103E62d, 1811717.0d, 5.525994208076646E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.125614498247224E128d + "'", double4 == 2.125614498247224E128d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double4 = code.src.Distance.squaredDistance(7.559791544536665E125d, 7.560169524654381E125d, 6.181392456316606E251d, 2.3432186456900772E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double4 = code.src.Distance.squaredDistance(1.8128492217045236E248d, 2.035085750794639E128d, 2.0480917725743317E256d, 1.8914631202919207E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double4 = code.src.Distance.euclideanDistance(5.89483325311893E41d, 4.5185585268423626E256d, 4.546779423345663E248d, 1.1090019187308395E257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double4 = code.src.Distance.squaredDistance(5.829917481072086E251d, 1.5665408678303301E62d, 1.695194259018638E248d, 6.923658324661806E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double4 = code.src.Distance.euclideanDistance(3.598765218630986E247d, 5.714207540805018E247d, 8.050471177320619E123d, 8.341162879156251E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.715851632357578E251d, 1.9997892004239E64d, 2.8325283023066844E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double4 = code.src.Distance.euclideanDistance(103.39245620450265d, 1.1341134428019932E16d, 3.646248963761934E250d, 6.556084846280365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double4 = code.src.Distance.euclideanDistance(7.590729215407016E125d, 3.0522370255297355E15d, 1.1929678955220982E32d, 1.5119583526749173E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.592234862162515E125d + "'", double4 == 7.592234862162515E125d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double4 = code.src.Distance.squaredDistance(1124.0d, 1.1210148155066758E127d, 9.324540890466497E30d, 2.5619922088623362E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.001964575767696E256d + "'", double4 == 6.001964575767696E256d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double4 = code.src.Distance.euclideanDistance(2.2496883671214544E99d, 0.0d, 1.239466100464527E124d, 4.792187178455498E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.328881783205065E124d + "'", double4 == 1.328881783205065E124d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double4 = code.src.Distance.euclideanDistance(3.119392465129366E124d, 1.039575455679478E8d, 2.125614474048533E128d, 3.3662285038614664E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1253025614605642E128d + "'", double4 == 2.1253025614605642E128d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double4 = code.src.Distance.euclideanDistance(1.889947887669239E125d, 1.0699880226301655E124d, 1.351489046187395E257d, 9.862699982330608E244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        long[] longArray48 = new long[] { 0, (short) -1 };
        long[] longArray51 = new long[] { (short) -1, (short) -1 };
        long long52 = code.src.Distance.chebyshevDistance(longArray48, longArray51);
        long[] longArray55 = new long[] { 'a', 1L };
        long[] longArray58 = new long[] { 0, (short) -1 };
        long[] longArray61 = new long[] { (short) -1, (short) -1 };
        long long62 = code.src.Distance.chebyshevDistance(longArray58, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray55, longArray61);
        long[] longArray66 = new long[] { 'a', 1L };
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray66, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray61, longArray72);
        long[] longArray78 = new long[] { 'a', 1L };
        long[] longArray81 = new long[] { 0, (short) -1 };
        long[] longArray84 = new long[] { (short) -1, (short) -1 };
        long long85 = code.src.Distance.chebyshevDistance(longArray81, longArray84);
        long long86 = code.src.Distance.chebyshevDistance(longArray78, longArray84);
        long long87 = code.src.Distance.chebyshevDistance(longArray61, longArray84);
        long long88 = code.src.Distance.chebyshevDistance(longArray51, longArray84);
        long[] longArray91 = new long[] { 0, (short) -1 };
        long[] longArray94 = new long[] { (short) -1, (short) -1 };
        long long95 = code.src.Distance.chebyshevDistance(longArray91, longArray94);
        long long96 = code.src.Distance.chebyshevDistance(longArray84, longArray91);
        long long97 = code.src.Distance.chebyshevDistance(longArray43, longArray91);
        long long98 = code.src.Distance.chebyshevDistance(longArray31, longArray43);
        java.lang.Class<?> wildcardClass99 = longArray31.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 98L + "'", long63 == 98L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 98L + "'", long86 == 98L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1L + "'", long95 == 1L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1L + "'", long96 == 1L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1L + "'", long97 == 1L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double4 = code.src.Distance.squaredDistance(1.0670548273407037E252d, 5.78903989294274E251d, 5.250078299133718E247d, 4.70381733357983E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double4 = code.src.Distance.squaredDistance(2.0454154726104665E128d, 3.0568077560623055E15d, 5.6508057255525505E124d, 1.515435523161302E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.181413148783048E256d + "'", double4 == 4.181413148783048E256d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double4 = code.src.Distance.squaredDistance(4.262266330560975E124d, 4.557896970053384E248d, 3.0580621176685875E15d, 1.8434127311838973E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double4 = code.src.Distance.squaredDistance(3.405628084680828E124d, (double) 11L, 3.052698722606791E15d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1598302651166806E249d + "'", double4 == 1.1598302651166806E249d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double4 = code.src.Distance.euclideanDistance(4.517971780836028E256d, 4.655892762958032E251d, 1.574966483660244E62d, 2.0234598189585263E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double4 = code.src.Distance.squaredDistance(2.1253025614605642E128d, 8.866898431036233E62d, 2.2840367152798036E31d, 2.7191106511481887E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5169109784901915E256d + "'", double4 == 4.5169109784901915E256d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double4 = code.src.Distance.euclideanDistance(2.2496883671214544E99d, 0.0d, 1.158095138919963E126d, 3.068933012127493E239d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double4 = code.src.Distance.euclideanDistance(1.453465767405697E125d, 1.2055760644133702E126d, 1.2496907143570294E31d, 1.069116001870466E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2036924699110032E126d + "'", double4 == 1.2036924699110032E126d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double4 = code.src.Distance.squaredDistance(1.515435523161302E124d, 8.694706299426871E61d, 5.797197117558862E24d, 7.561664719340081E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.72017387759611E251d + "'", double4 == 5.72017387759611E251d);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double4 = code.src.Distance.squaredDistance(2.9064639308329233E248d, 9.144408719117394E248d, 1.733538700870257E254d, 2.1256287435569485E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        long[] longArray85 = new long[] { 0, (short) -1 };
        long[] longArray88 = new long[] { (short) -1, (short) -1 };
        long long89 = code.src.Distance.chebyshevDistance(longArray85, longArray88);
        long[] longArray92 = new long[] { 100L, 1 };
        long long93 = code.src.Distance.chebyshevDistance(longArray88, longArray92);
        long long94 = code.src.Distance.chebyshevDistance(longArray78, longArray92);
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
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 1L + "'", long89 == 1L);
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 101L + "'", long93 == 101L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 101L + "'", long94 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double4 = code.src.Distance.euclideanDistance(5.6508057255525505E124d, 3.0568118497974055E15d, 5.527131720196977E7d, 4.877950885822437E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.9798424948214894E255d, 2.010262836799118E256d, 9.466542772834739E21d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double4 = code.src.Distance.squaredDistance(2.125614474048533E128d, 7.43091669258797E123d, 1.8914631202919207E124d, 6.18368725714255E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double4 = code.src.Distance.squaredDistance((double) '4', 5.869204465969338E247d, 4.51823713706406E256d, 1.0486765404643798E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double4 = code.src.Distance.squaredDistance(5.310434588680901E251d, 4.5323471056617066E256d, 1.1416037601853007E32d, 1.511958352664876E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        long[] longArray85 = new long[] { 'a', 1L };
        long[] longArray88 = new long[] { 0, (short) -1 };
        long[] longArray91 = new long[] { (short) -1, (short) -1 };
        long long92 = code.src.Distance.chebyshevDistance(longArray88, longArray91);
        long long93 = code.src.Distance.chebyshevDistance(longArray85, longArray91);
        long long94 = code.src.Distance.chebyshevDistance(longArray78, longArray85);
        java.lang.Class<?> wildcardClass95 = longArray78.getClass();
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
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 98L + "'", long93 == 98L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.4510644048118655E256d, 9.324540899917549E30d, 9.351743915519625E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        java.lang.Class<?> wildcardClass87 = longArray81.getClass();
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
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double4 = code.src.Distance.squaredDistance(7.560261194608789E125d, 3.7841059251973525E61d, 2.244907423513874E31d, 2.12373890011799E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.510324073423701E256d + "'", double4 == 4.510324073423701E256d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double4 = code.src.Distance.squaredDistance(1.5737202213962112E124d, 1.723220116172223E254d, 1552637.0d, 3.477882519775504E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double4 = code.src.Distance.squaredDistance(7.559791544504537E125d, 8.319893191678016E125d, 3.477882519775504E62d, 5.574913355065987E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double4 = code.src.Distance.squaredDistance(10.04987562112089d, 7.877914654122638E125d, 5.952906869765997E125d, 1.433007028500352E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.031028428232339E256d + "'", double4 == 2.031028428232339E256d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double4 = code.src.Distance.euclideanDistance(8.745511426145833E61d, 1.0861664063319225E252d, 5.7150451504902E247d, 1.039575455679478E8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double4 = code.src.Distance.squaredDistance(100.40866620345955d, 1.4329715861471609E125d, 9.144070917092657E248d, 7.592234862162515E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double4 = code.src.Distance.squaredDistance(1.1090019187308395E257d, 6.540287573520957E256d, 5.501575976011727E124d, 7.611134977058946E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double4 = code.src.Distance.squaredDistance(1.2038504689988316E124d, 3.890201679850891E124d, 8.116214151045995E123d, 6.17830490479184E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double4 = code.src.Distance.euclideanDistance(3.0535834157458975E15d, 4.794486294195585E251d, 1.1236897439702315E248d, 1.5338908798484704E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double4 = code.src.Distance.euclideanDistance(4.8513343941294685E255d, 1.4331582329756537E128d, 2.2710600277457865E249d, 5.715045150484065E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double4 = code.src.Distance.squaredDistance(2.5156683110561225E248d, 2.4805194246531137E124d, (double) 10, 3.644803753780143E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double4 = code.src.Distance.squaredDistance(1.887468026859852E249d, 7.814857737225062E7d, 1.239466100464527E124d, 5.715045150481383E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double4 = code.src.Distance.euclideanDistance(2.244898434111624E124d, 0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.244898434111624E124d + "'", double4 == 2.244898434111624E124d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double4 = code.src.Distance.squaredDistance(3.7454893307807313E251d, 1.1473791318585206E252d, 4.183411062201243E256d, 8.779875994255162E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double4 = code.src.Distance.euclideanDistance(8.320193827934524E30d, 4.518033412506453E256d, 2.125614498247224E128d, 1.1430090254554903E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double4 = code.src.Distance.squaredDistance(2.1256141238277748E128d, 2.2965057953353264E247d, 1.429206919930926E126d, 9.144408719117394E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double4 = code.src.Distance.euclideanDistance(5.71561648966755E251d, 8.94428757683438E62d, 2.0147440391085077E256d, 6.191637431199285E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.862183193182798E125d, 5.869790192858356E251d, 1.069116001870466E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double4 = code.src.Distance.squaredDistance(9.79709836214289E7d, (double) 100L, 1.0832910257177886E252d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double4 = code.src.Distance.euclideanDistance(7.380601634026061E248d, 1.2296171569516298E62d, 4.502871341583352E256d, 6.192723950656815E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double4 = code.src.Distance.euclideanDistance(2.125614532971372E128d, 3.3607494419832777E49d, 5.525928500007007E7d, 1.9395881659392382E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double4 = code.src.Distance.squaredDistance(2.0350857491762078E128d, 8.320193817483419E30d, 3.681736809627178E250d, 5.3119477457783107E253d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        java.lang.Class<?> wildcardClass99 = longArray31.getClass();
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
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.5377172753851527E248d, 2.4389908525564578E124d, 8.319893191678016E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double4 = code.src.Distance.squaredDistance(2.2194288710556866E124d, 5.86750417512918E251d, 1.3335864706024715E248d, 4.3184582665404395E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double4 = code.src.Distance.euclideanDistance(7.561664719340081E125d, 1.3179319637108076E128d, 4.182530750552227E256d, 6.17830490479184E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double4 = code.src.Distance.euclideanDistance(1.4331582268127545E128d, 1.891459241752112E125d, 5.373609040983584E61d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4331593771920369E128d + "'", double4 == 1.4331593771920369E128d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double4 = code.src.Distance.squaredDistance(1225.0d, 1.1236897439702315E248d, 5.52593680000932E7d, 4.630067801207703E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double4 = code.src.Distance.squaredDistance(7.608198465098248E125d, 625.0d, 7.891149462745871E255d, 3.4131592097982255E102d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double4 = code.src.Distance.squaredDistance(6.152976616081415E248d, 1.1309348446938204E126d, 2.244907423513874E31d, 4.181413148783048E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double4 = code.src.Distance.squaredDistance(5.715851632357578E251d, 2.1254910133153752E128d, 3.439988407880217E251d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double4 = code.src.Distance.euclideanDistance(7.559791763325273E123d, 4.717807507424959E124d, 2.5619922088623362E128d, 6.261457075442417E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.5619166543842657E128d + "'", double4 == 2.5619166543842657E128d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double4 = code.src.Distance.euclideanDistance(7.413179166381833E250d, 1.2634745840023956E64d, 6.804460155815231E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double4 = code.src.Distance.squaredDistance(1.0670548273407037E252d, 7.235240391572074E248d, 2.575569517141002E250d, 1.457948741083528E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double4 = code.src.Distance.euclideanDistance(1.4330571085588943E128d, 2.575569517141002E250d, 1.0699880226301655E124d, 6.117725723239335E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double4 = code.src.Distance.euclideanDistance(3.02286459429887E15d, 6.117725723239335E125d, 7.425749067574235E250d, 1552637.0032203277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double4 = code.src.Distance.euclideanDistance(1.1248441811882996E99d, 6.520222954978057E248d, 4.1827873952477334E256d, 1.3335864706024715E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double4 = code.src.Distance.squaredDistance(6.042358993280212E21d, 1.0486765404656112E16d, 12313.549023578462d, 2.884474619048523E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.6510102203732055E43d + "'", double4 == 3.6510102203732055E43d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double4 = code.src.Distance.squaredDistance(1.723220116172223E254d, 4.7921872029386884E123d, 1.2857893850944086E250d, 1.598827773271099E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double4 = code.src.Distance.euclideanDistance(2.8325283023066844E248d, 3.2831858166490743E124d, 0.0d, 3.8265338665801504E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double4 = code.src.Distance.squaredDistance(1.0207804596239174E249d, 7.610605585266955E125d, 1.457948741083528E64d, 3.405628084680828E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double4 = code.src.Distance.squaredDistance(9.324540899982978E30d, 5.618790528635277E251d, 5.791260381620597E24d, 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double4 = code.src.Distance.squaredDistance(1.5119583526749173E124d, 2.9106355825640894E256d, 1.2756882071026236E198d, 2.0234598189585263E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double4 = code.src.Distance.euclideanDistance(3.7426568024784246E251d, 3.4806291687247766E248d, 8.694706299426858E61d, 2.3432186456900772E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double4 = code.src.Distance.squaredDistance(6.20393819963367E251d, 0.0d, 7.562847533034203E125d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double4 = code.src.Distance.squaredDistance(1.3292180507676446E247d, 2.053942520745898E256d, 1.5617254340936532E62d, 3.0234847996883654E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double4 = code.src.Distance.squaredDistance(122.0d, 6.556084846139649E12d, 7.710680125905936E10d, 1.733538700870257E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double4 = code.src.Distance.squaredDistance(6.17830490479184E248d, 1.0922306970231484E16d, 1.1548101448300805E124d, 4.8513343941294685E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double4 = code.src.Distance.squaredDistance(9.368838995853397E123d, 8.69470629942351E61d, 4.792187178860569E123d, 9.003112128419027E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double4 = code.src.Distance.euclideanDistance(2.4805194246531137E124d, 2.4389863314950092E124d, 2.1125627370202318E250d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double4 = code.src.Distance.euclideanDistance(5.715045104055938E247d, 1.891459241752112E125d, 8.899687221465109E59d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double4 = code.src.Distance.euclideanDistance(3.0580621176685875E15d, 7.559791763329331E123d, 1.097417397239037E249d, 2.5619922088623362E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double4 = code.src.Distance.squaredDistance(9.466542772840854E21d, 7.863642449363113E125d, 4.302581716460107E251d, 4.080492135606123E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double4 = code.src.Distance.euclideanDistance(1.8649081799905601E31d, 1.5617254340936532E62d, 2.1092217904410153E248d, 3.646248963761934E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double4 = code.src.Distance.squaredDistance(5.603244642552161E251d, 5.216823716746154E62d, 1.462949373248983E250d, 4.518199605235518E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double4 = code.src.Distance.euclideanDistance(7.40859570957669E125d, 3.023916486461334E124d, 8.320188026225052E30d, 4.877950885822437E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double4 = code.src.Distance.euclideanDistance(5.990295667767534E256d, 2.0536526763911784E256d, 3.4131590244458324E102d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray73);
        java.lang.Class<?> wildcardClass95 = longArray73.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double4 = code.src.Distance.squaredDistance(5.726018993608619E251d, 3.890305409973818E124d, 3.54371002001072E251d, 4.979659311150055E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        java.lang.Class<?> wildcardClass87 = longArray65.getClass();
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
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double4 = code.src.Distance.squaredDistance(7.786532742293105E125d, 1.429206919930926E126d, 7.710682094138496E10d, 7.559791544504537E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0595365456818555E252d + "'", double4 == 1.0595365456818555E252d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double4 = code.src.Distance.euclideanDistance(1.0190538431654038E252d, 2.9064639308329233E248d, 4.8406811122263884E123d, 6.307309197813705E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double4 = code.src.Distance.squaredDistance(1.1958657793748695E32d, 8.694706281769265E61d, 1.4510644048118655E256d, 5.948654328288416E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        long[] longArray66 = new long[] { 'a', 1L };
        long[] longArray69 = new long[] { 0, (short) -1 };
        long[] longArray72 = new long[] { (short) -1, (short) -1 };
        long long73 = code.src.Distance.chebyshevDistance(longArray69, longArray72);
        long long74 = code.src.Distance.chebyshevDistance(longArray66, longArray72);
        long long75 = code.src.Distance.chebyshevDistance(longArray61, longArray72);
        long[] longArray78 = new long[] { 'a', 1L };
        long[] longArray81 = new long[] { 0, (short) -1 };
        long[] longArray84 = new long[] { (short) -1, (short) -1 };
        long long85 = code.src.Distance.chebyshevDistance(longArray81, longArray84);
        long long86 = code.src.Distance.chebyshevDistance(longArray78, longArray84);
        long long87 = code.src.Distance.chebyshevDistance(longArray61, longArray84);
        long long88 = code.src.Distance.chebyshevDistance(longArray44, longArray61);
        long long89 = code.src.Distance.chebyshevDistance(longArray38, longArray44);
        long long90 = code.src.Distance.chebyshevDistance(longArray2, longArray44);
        java.lang.Class<?> wildcardClass91 = longArray44.getClass();
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
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 98L + "'", long86 == 98L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 98L + "'", long88 == 98L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 98L + "'", long89 == 98L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 97L + "'", long90 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double4 = code.src.Distance.euclideanDistance((double) 10L, 1.143009030111722E248d, 9.144408719117394E248d, 7.393566762337766E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double4 = code.src.Distance.euclideanDistance(6.191637431199285E31d, 3.439988407880217E251d, 2.3848836126517604E124d, 6.151502905962372E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.166084616081951E249d, 1.223220513063486E125d, 9.324540562451319E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double4 = code.src.Distance.euclideanDistance((double) 0L, 1.0d, 5.721223146643194E251d, 8.824228056978371E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double4 = code.src.Distance.euclideanDistance(5.262553411785863E62d, 8.868523920159873E123d, 4.183411062201243E256d, 1.209524440947343E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double4 = code.src.Distance.euclideanDistance((double) (-1.0f), 9.144408719117394E248d, 5.722457520259434E251d, 1.4331582268127545E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double4 = code.src.Distance.squaredDistance(6.520222954978057E248d, 6.520158840275344E248d, 0.0d, 5.715044985152495E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double4 = code.src.Distance.euclideanDistance(100.0d, 3.05361112455053E15d, 1.4255337706659871E125d, 2.3498127622806567E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4255337706659871E125d + "'", double4 == 1.4255337706659871E125d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double4 = code.src.Distance.squaredDistance(5.71561648966755E251d, 6.804460155815231E124d, 7.710682094138496E10d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
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
        long[] longArray72 = new long[] { 'a', 1L };
        long[] longArray75 = new long[] { 0, (short) -1 };
        long[] longArray78 = new long[] { (short) -1, (short) -1 };
        long long79 = code.src.Distance.chebyshevDistance(longArray75, longArray78);
        long long80 = code.src.Distance.chebyshevDistance(longArray72, longArray78);
        long long81 = code.src.Distance.chebyshevDistance(longArray54, longArray72);
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray72);
        long[] longArray85 = new long[] { 0, (short) -1 };
        long[] longArray88 = new long[] { (short) -1, (short) -1 };
        long long89 = code.src.Distance.chebyshevDistance(longArray85, longArray88);
        long[] longArray92 = new long[] { 0, (short) -1 };
        long[] longArray95 = new long[] { (short) -1, (short) -1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray92, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray88, longArray92);
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray92);
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
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 98L + "'", long80 == 98L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 98L + "'", long81 == 98L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 98L + "'", long82 == 98L);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 1L + "'", long89 == 1L);
        org.junit.Assert.assertNotNull(longArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray92), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1L + "'", long96 == 1L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 1L + "'", long97 == 1L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 1L + "'", long98 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double4 = code.src.Distance.squaredDistance(1.1929678955220982E32d, 7.40859570957669E125d, 5.948654328288416E248d, 4.1996701178995654E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        long long23 = code.src.Distance.chebyshevDistance(longArray3, longArray20);
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
        long long59 = code.src.Distance.chebyshevDistance(longArray20, longArray55);
        long[] longArray62 = new long[] { 'a', 1L };
        long[] longArray65 = new long[] { 0, (short) -1 };
        long[] longArray68 = new long[] { (short) -1, (short) -1 };
        long long69 = code.src.Distance.chebyshevDistance(longArray65, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray62, longArray68);
        long[] longArray73 = new long[] { 'a', 1L };
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long long81 = code.src.Distance.chebyshevDistance(longArray73, longArray79);
        long long82 = code.src.Distance.chebyshevDistance(longArray62, longArray79);
        long long83 = code.src.Distance.chebyshevDistance(longArray20, longArray79);
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long[] longArray93 = new long[] { 100L, 1 };
        long long94 = code.src.Distance.chebyshevDistance(longArray89, longArray93);
        long long95 = code.src.Distance.chebyshevDistance(longArray79, longArray93);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray93);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 98L + "'", long23 == 98L);
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
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
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
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 101L + "'", long94 == 101L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 101L + "'", long95 == 101L);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double4 = code.src.Distance.euclideanDistance(5.64433727473721E251d, 8.982275443054642E123d, 5.068357262307933E248d, 7.56006994758633E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double4 = code.src.Distance.squaredDistance(7.559791732623792E123d, 6.142140408070548E124d, 1.8649081799851445E31d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.829739330285951E249d + "'", double4 == 3.829739330285951E249d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double4 = code.src.Distance.squaredDistance(9.351743915519625E30d, 2.125614532971372E128d, 7.862701231474445E125d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.517977586546562E256d + "'", double4 == 4.517977586546562E256d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double4 = code.src.Distance.euclideanDistance(1.1294636811790911E99d, (double) 11L, (double) (short) 0, 7.559791763374587E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763374587E123d + "'", double4 == 7.559791763374587E123d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double4 = code.src.Distance.squaredDistance(9.036472295700742E256d, 9.862699982330608E244d, 1.7703709657756777E62d, 8.341162879156255E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double4 = code.src.Distance.squaredDistance(4.518236899385757E256d, 5.952906869765997E125d, 2.125614498247224E128d, 5.763138746578841E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double4 = code.src.Distance.squaredDistance(3.681736809627178E250d, 7.559791653975984E125d, 2.553460170097694E124d, 1552637.0032203277d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double4 = code.src.Distance.euclideanDistance(7.701874509023016E125d, 4.51823713706406E256d, 1.0699880226301655E124d, 4.793704459665872E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double4 = code.src.Distance.squaredDistance(1.239466100464527E124d, 3.053611124543088E15d, 1.511958352664876E124d, 8.694706299426858E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.425202750921865E246d + "'", double4 == 7.425202750921865E246d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.51823713706406E256d, 0.0d, 2.4805194246531137E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double4 = code.src.Distance.squaredDistance(8.991400839766758E43d, 1.3415036402150548E127d, 1.1210148155066758E127d, 3.598765218630986E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double4 = code.src.Distance.squaredDistance(8.350150916003777E100d, 1.4223699416343344E126d, 2.0317618246658705E256d, 4.517977586546562E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 0, (short) -1 };
        long[] longArray12 = new long[] { (short) -1, (short) -1 };
        long long13 = code.src.Distance.chebyshevDistance(longArray9, longArray12);
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
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
        long long60 = code.src.Distance.chebyshevDistance(longArray46, longArray57);
        long[] longArray63 = new long[] { 'a', 1L };
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long long71 = code.src.Distance.chebyshevDistance(longArray63, longArray69);
        long long72 = code.src.Distance.chebyshevDistance(longArray57, longArray69);
        long[] longArray75 = new long[] { 'a', 1L };
        long[] longArray78 = new long[] { 0, (short) -1 };
        long[] longArray81 = new long[] { (short) -1, (short) -1 };
        long long82 = code.src.Distance.chebyshevDistance(longArray78, longArray81);
        long long83 = code.src.Distance.chebyshevDistance(longArray75, longArray81);
        long long84 = code.src.Distance.chebyshevDistance(longArray57, longArray75);
        long long85 = code.src.Distance.chebyshevDistance(longArray34, longArray75);
        long[] longArray88 = new long[] { 'a', 1L };
        long[] longArray91 = new long[] { 0, (short) -1 };
        long[] longArray94 = new long[] { (short) -1, (short) -1 };
        long long95 = code.src.Distance.chebyshevDistance(longArray91, longArray94);
        long long96 = code.src.Distance.chebyshevDistance(longArray88, longArray94);
        long long97 = code.src.Distance.chebyshevDistance(longArray34, longArray88);
        long long98 = code.src.Distance.chebyshevDistance(longArray9, longArray88);
        java.lang.Class<?> wildcardClass99 = longArray88.getClass();
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
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
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 98L + "'", long97 == 98L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 97L + "'", long98 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 100, 0.0d, 2.884474619048523E15d, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6661357026280876E31d + "'", double4 == 1.6661357026280876E31d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double4 = code.src.Distance.squaredDistance(7.764261239969174E251d, 8.133851138224599E174d, 5.948654328288416E248d, 1.889947887669239E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double4 = code.src.Distance.euclideanDistance(9.324540890452801E30d, 3.583333528970715E250d, 1.078209334929007E252d, 2.125690131439817E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double4 = code.src.Distance.euclideanDistance(1.177837421097331E252d, 3.583333528970715E250d, 1.1430090254554903E248d, 2.251301237575268E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double4 = code.src.Distance.squaredDistance(1.3436331804825283E127d, 6.188205857868469E251d, 1.0486765404643746E16d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double4 = code.src.Distance.squaredDistance(2.296505818800933E247d, 4.794956959071923E255d, 6.001964575767696E256d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double4 = code.src.Distance.squaredDistance(5.791260381620597E24d, 0.0d, 5.545562436161672E251d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double4 = code.src.Distance.euclideanDistance(5.715045104055938E247d, 3.165779550192911E124d, 4.753127358123107E124d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double4 = code.src.Distance.squaredDistance((double) (short) -1, 1.0595365456818555E252d, 1.1929678834484718E32d, 1.209524440947343E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double4 = code.src.Distance.euclideanDistance(5.719666280792153E251d, 8.6947061736074E62d, 4.518236951771165E256d, 1.6432333679662337E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double4 = code.src.Distance.squaredDistance(3.053584521181947E15d, 5.791260381620597E24d, 7.623334020485509E123d, 3.650997547418172E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.811522158789176E247d + "'", double4 == 5.811522158789176E247d);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double4 = code.src.Distance.squaredDistance(1.082419432581764E249d, 4.765564004129822E124d, 1.5119583495997528E124d, 1.3179319637108076E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double4 = code.src.Distance.squaredDistance(3.583333528970715E250d, 8.94428757683438E62d, 6.957499817661427E61d, 122.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double4 = code.src.Distance.squaredDistance(8.859911358917301E125d, 1.8648415840790313E31d, 0.0d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double4 = code.src.Distance.euclideanDistance(3.321083216563934E61d, 1.3415049736556993E127d, 2.5619166543842657E128d, 1.7996320167102433E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double4 = code.src.Distance.euclideanDistance(1.2632922663800816E127d, 3.6801326231966413E250d, 5.715045150484065E247d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double4 = code.src.Distance.squaredDistance(3.311955036268193E63d, 1.0922306970231484E16d, 7.865071652244784E247d, 5.9798424948214894E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 7.559791763329331E123d, 4.630067801207703E249d, 3.1254847552549246E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double4 = code.src.Distance.squaredDistance(3.890305409973818E124d, 8.694866271304194E61d, 6.957499817664781E61d, 4.5182371542091934E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double4 = code.src.Distance.squaredDistance(3.650997547418172E43d, 2.053509149446454E256d, 7.850374433297587E251d, 1.0207804596239174E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double4 = code.src.Distance.squaredDistance(7.559791763329331E123d, 2.0246776224200723E128d, 7.559791763329309E123d, 5.979842719542829E255d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double4 = code.src.Distance.euclideanDistance(1.7307558713743367E254d, 5.250078299133718E247d, 6.117725723239335E125d, 3.053533391929702E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double4 = code.src.Distance.squaredDistance(6.922562516048925E61d, 0.0d, 4.65150901809432E251d, 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        long long83 = code.src.Distance.chebyshevDistance(longArray20, longArray80);
        long[] longArray86 = new long[] { 0, (short) -1 };
        long[] longArray89 = new long[] { (short) -1, (short) -1 };
        long long90 = code.src.Distance.chebyshevDistance(longArray86, longArray89);
        long[] longArray93 = new long[] { 100L, 1 };
        long long94 = code.src.Distance.chebyshevDistance(longArray89, longArray93);
        long long95 = code.src.Distance.chebyshevDistance(longArray80, longArray93);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray80);
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
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 101L + "'", long94 == 101L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 101L + "'", long95 == 101L);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) 10, 144.0d, 1.231115082248268E64d, 3.583333108359959E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double4 = code.src.Distance.euclideanDistance(1.0670318622827465E252d, 1.0207804596239174E249d, 4.1519250136110354E256d, 5.039568979476821E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double4 = code.src.Distance.squaredDistance(1.3393750148468128E127d, 1.2642778961487031E256d, 1.1958657793748695E32d, 9.715913234165533E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double4 = code.src.Distance.squaredDistance(0.0d, 8.806176891199752E248d, 2.9341949718018628E128d, 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double4 = code.src.Distance.squaredDistance(2.3432193417162093E247d, 1.7307558713743367E254d, 9.003112128419027E256d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double4 = code.src.Distance.squaredDistance(3.746054054544959E251d, 1.1248441754132943E99d, 4.792173836495848E123d, 3.053533391929702E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
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
        long long57 = code.src.Distance.chebyshevDistance(longArray45, longArray55);
        long long58 = code.src.Distance.chebyshevDistance(longArray2, longArray45);
        java.lang.Class<?> wildcardClass59 = longArray45.getClass();
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double4 = code.src.Distance.euclideanDistance(8.866895281429006E62d, 5.792131737449658E251d, 1.3436331804825283E127d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double4 = code.src.Distance.euclideanDistance(1.039575455679478E8d, 3.053611124543088E15d, 0.0d, 2.125614498247224E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.125614498247224E128d + "'", double4 == 2.125614498247224E128d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 9.466542772834739E21d, 4.92586451367552E248d, 2.8896627685601946E50d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double4 = code.src.Distance.squaredDistance(7.559943432502878E125d, 4.262266330560975E124d, 7.592234862162515E125d, 7.520013101166239E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double4 = code.src.Distance.euclideanDistance(3.0059284446479725E128d, 3.377784400566722E241d, 4.518199605235518E124d, 3.7426568024784246E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double4 = code.src.Distance.squaredDistance(1.1048109600916608E249d, 2.1254910133153752E128d, 5.715045150548505E247d, 3.80522029780604E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double4 = code.src.Distance.squaredDistance(1.1047365604210307E126d, 5.3119477457783107E253d, (double) (byte) 100, 8.99140083977295E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double4 = code.src.Distance.euclideanDistance(6.063099723657831E251d, 3.477821790930845E62d, 7.891149462745871E255d, 3.583333108359959E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double4 = code.src.Distance.euclideanDistance(1.4990708455962547E124d, (double) (short) 10, 1.1929678834484718E32d, 1.328881783205065E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.003282354999151E124d + "'", double4 == 2.003282354999151E124d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double4 = code.src.Distance.euclideanDistance(4.51823713706406E256d, 7.56145520935968E125d, 4.717807507424959E124d, 1.7874479094211152E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double4 = code.src.Distance.squaredDistance(2.4065001431929946E12d, 9.012004300008916E249d, 7.850374433297587E251d, 3.0054630325063084E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double4 = code.src.Distance.euclideanDistance(3.4290270810282753E248d, 3.646248963761934E250d, 5.715045150481366E247d, 8.868523920159873E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double4 = code.src.Distance.euclideanDistance(1.9660977441160548E252d, 3.0234847996883654E124d, 3.890146281899556E124d, 5.71504515055861E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double4 = code.src.Distance.euclideanDistance(7.56145520935968E125d, 8.99140083977295E43d, 1.574966483660244E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.56145520935968E125d + "'", double4 == 7.56145520935968E125d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double4 = code.src.Distance.euclideanDistance(1.0861664063319225E252d, 7.732944131972951E127d, 3.728721449645412E251d, 1.3335864706024715E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double4 = code.src.Distance.squaredDistance(7.393562733187527E246d, 6.556084846280549E12d, 1.0207804596239174E249d, 2.003282354999151E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double4 = code.src.Distance.squaredDistance(1.1649654526156026E205d, 0.0d, 6.924240949293447E125d, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double4 = code.src.Distance.euclideanDistance(2.7464291874496756E125d, 7.559791763374587E123d, 7.56006994758633E123d, 7.814857737225062E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.671898174954098E125d + "'", double4 == 2.671898174954098E125d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double4 = code.src.Distance.euclideanDistance(6.421433279489652E251d, 5.528905595074321E7d, 4.3190021108187545E15d, 1.8649081799851445E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double4 = code.src.Distance.squaredDistance(6.587293214563927E247d, 0.0d, 1.2642778961487031E256d, 9.324540562451319E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double4 = code.src.Distance.squaredDistance(1.0807149657353284E16d, 3.05680775507396E15d, 7.5597917633235E123d, 2.125628747841743E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.518297579366302E256d + "'", double4 == 4.518297579366302E256d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double4 = code.src.Distance.squaredDistance(1.5617254340933177E62d, 7.65996356070261E125d, 5.524950700000004E7d, 7.560169524654381E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.958849630795155E247d + "'", double4 == 9.958849630795155E247d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.840680371280547E123d, 3.311955036268193E63d, 1.7389572568057607E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.840680371280547E123d + "'", double4 == 4.840680371280547E123d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double4 = code.src.Distance.euclideanDistance(2.244907423513874E31d, 4.3190021108187545E15d, 4.8406811122263884E123d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.8406811122263884E123d + "'", double4 == 4.8406811122263884E123d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double4 = code.src.Distance.euclideanDistance(2.719110673110582E123d, 7.559791763325273E123d, 2.5156683110561225E248d, 1.7703709657756777E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double4 = code.src.Distance.euclideanDistance(4.557896970053384E248d, 5.715044985152495E251d, 2.5573985948136816E128d, 1.7703709657756777E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.035085750794639E128d, 2.7234837376481807E125d, 4.70381733357983E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double4 = code.src.Distance.euclideanDistance(7.1990513445280965E124d, 8.030925665076586E87d, 4.557896970053384E248d, 4.182726770879422E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 6.587293214563927E247d, 1.5479045176720047E126d, 3.353869680772834E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double4 = code.src.Distance.euclideanDistance(1.2632922663800816E127d, 7.862183193182798E125d, 8.824228056978371E247d, 1.5988706255405772E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double4 = code.src.Distance.euclideanDistance(9.324546092905923E30d, 3.7454893307807313E251d, 8.320193817483419E30d, 1.077343123590583E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double4 = code.src.Distance.squaredDistance(1.7917432767295218E254d, 1.0807149657353284E16d, 1.3415049736556993E127d, 2.9486787165792413E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double4 = code.src.Distance.euclideanDistance(3.4131592097982255E102d, 4.48487495250148E256d, 4.485940704933021E256d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double4 = code.src.Distance.squaredDistance(7.560169524654381E125d, 7.393562733187527E246d, 3.646248963761934E250d, 4.792979223186968E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double4 = code.src.Distance.squaredDistance(1552637.0d, 6.152976616081415E248d, 1.733538700870257E254d, 1.33937091808876E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double4 = code.src.Distance.euclideanDistance(3.8265338665801504E250d, 6.106325777130968E125d, 7.1990513445280965E124d, 5.721223146643194E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double4 = code.src.Distance.euclideanDistance(9.324540562451319E30d, 7.560261194608789E125d, 4.182924775801714E256d, 9.59807360434958E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double4 = code.src.Distance.euclideanDistance(1.102865396833695E32d, 5.525928500007007E7d, 7.56006994758633E123d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double4 = code.src.Distance.euclideanDistance(7.393566762337766E246d, 2.2964930079195337E247d, 5.185424875331702E249d, 1.2756882071026236E198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double4 = code.src.Distance.squaredDistance((double) '4', 2.0454154726104665E128d, 6.182207065542976E251d, 3.053533391929702E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double4 = code.src.Distance.euclideanDistance(9.32387494085701E30d, 2.9064639308329233E248d, 1811707.0012909174d, 1.0408126756135268E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double4 = code.src.Distance.squaredDistance(2.5573985948136816E128d, 5.717560488315264E251d, 1.1438880985737782E248d, 6.957499817661427E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 8.694706299452407E61d, 1.2094207749824497E64d, 9.324540899982978E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2094520283486993E64d + "'", double4 == 1.2094520283486993E64d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double4 = code.src.Distance.squaredDistance(8.793716013138559E63d, 4.557896970053384E248d, 2.8519907324927616E87d, 7.732824116021177E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double4 = code.src.Distance.euclideanDistance(4.080492135606123E124d, 1.0595365456818555E252d, 1.2634745840023956E64d, 5.280231960268402E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.285850535203458E248d, 1.2046853507841718E252d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double4 = code.src.Distance.euclideanDistance(2.244907423513874E31d, 7.590729215407016E125d, 1.1918576465896191E249d, 6.188205857868469E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double4 = code.src.Distance.squaredDistance((double) 90L, 5.715045104064755E247d, 1.2296171124372597E62d, 9.324540890451006E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double4 = code.src.Distance.squaredDistance(1.0408126756135268E126d, 1.8933354688488568E125d, 9.466542772834739E21d, 7.76081660665762E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4275643747432048E252d + "'", double4 == 1.4275643747432048E252d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double4 = code.src.Distance.squaredDistance(5.7150451504902E247d, 1.5891491557236519E254d, 2.55346448847492E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double4 = code.src.Distance.euclideanDistance(3.631389561388303E250d, 9.003112128419027E256d, 8.620276499386763E61d, 3.353869565834853E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double4 = code.src.Distance.squaredDistance(6.17830490479184E248d, 2.1256145316270446E128d, 1.0695270443395895E124d, 4.675240277191704E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double4 = code.src.Distance.squaredDistance(1.2094520283486993E64d, 3.0568118497973945E15d, 1.1248441811882996E99d, 4.717807507424959E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.225770767711531E249d + "'", double4 == 2.225770767711531E249d);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double4 = code.src.Distance.squaredDistance(7.413179166381833E250d, 6.188205857868469E251d, 1.45794860122975E64d, 4.792187178860569E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double4 = code.src.Distance.euclideanDistance(5.720993474013094E251d, 2.728966543133093E124d, (double) 100.0f, 3.746054054544959E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double4 = code.src.Distance.squaredDistance(6.192723950656815E251d, 4.792979223186968E123d, 9.324540890451003E30d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double4 = code.src.Distance.euclideanDistance(3.439988407880217E251d, 3.4806291687247766E248d, 4.630067801207703E249d, 6.421433279489652E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray13 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray13);
        long[] longArray17 = new long[] { 0, (short) -1 };
        long[] longArray20 = new long[] { (short) -1, (short) -1 };
        long long21 = code.src.Distance.chebyshevDistance(longArray17, longArray20);
        long[] longArray24 = new long[] { 0, (short) -1 };
        long[] longArray27 = new long[] { (short) -1, (short) -1 };
        long long28 = code.src.Distance.chebyshevDistance(longArray24, longArray27);
        long long29 = code.src.Distance.chebyshevDistance(longArray20, longArray24);
        long long30 = code.src.Distance.chebyshevDistance(longArray13, longArray20);
        long[] longArray33 = new long[] { 'a', 1L };
        long[] longArray36 = new long[] { 0, (short) -1 };
        long[] longArray39 = new long[] { (short) -1, (short) -1 };
        long long40 = code.src.Distance.chebyshevDistance(longArray36, longArray39);
        long long41 = code.src.Distance.chebyshevDistance(longArray33, longArray39);
        long[] longArray44 = new long[] { 0, (short) -1 };
        long[] longArray47 = new long[] { (short) -1, (short) -1 };
        long long48 = code.src.Distance.chebyshevDistance(longArray44, longArray47);
        long long49 = code.src.Distance.chebyshevDistance(longArray39, longArray47);
        long long50 = code.src.Distance.chebyshevDistance(longArray20, longArray47);
        java.lang.Class<?> wildcardClass51 = longArray47.getClass();
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
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11L + "'", long30 == 11L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 98L + "'", long41 == 98L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.979842719542829E255d, 4.1827873952477334E256d, 1.2093895208085425E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double4 = code.src.Distance.euclideanDistance(8.694706281769284E61d, 7.814857737225062E7d, 1.1341134428019932E16d, 3.053611069269292E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694706281769284E61d + "'", double4 == 8.694706281769284E61d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double4 = code.src.Distance.squaredDistance(2.1256144767371883E128d, 7433.0d, 1.4534136470864304E252d, 5.525928500007007E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double4 = code.src.Distance.euclideanDistance(2.0234598189585263E246d, 101.0d, 7.661073336008042E123d, 3.0559985941685375E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double4 = code.src.Distance.euclideanDistance(6.458990228650728E249d, 2.553460170097694E124d, 2.0536526763911784E256d, 5.5259489E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double4 = code.src.Distance.squaredDistance(6.587293214563927E247d, 1.143009030111722E248d, 1.1245688124397413E248d, 1.2387871038033346E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double4 = code.src.Distance.squaredDistance(4.1829248331382305E256d, 1.4510644048118655E256d, 5.525929037215044E7d, 3.194777076918012E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double4 = code.src.Distance.squaredDistance(5.574913355065987E249d, (double) 101L, 0.0d, 7.834135227050253E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double4 = code.src.Distance.euclideanDistance(1.5988706255405772E125d, 1.3415036402150548E127d, 1.0379514071432164E126d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3443741988905585E127d + "'", double4 == 1.3443741988905585E127d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double4 = code.src.Distance.squaredDistance(5.719393272657122E251d, 2.125614532971372E128d, 5.604659899440947E124d, 8.811504548015154E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 0, (short) -1 };
        long[] longArray12 = new long[] { (short) -1, (short) -1 };
        long long13 = code.src.Distance.chebyshevDistance(longArray9, longArray12);
        long long14 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
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
        long long49 = code.src.Distance.chebyshevDistance(longArray34, longArray46);
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
        long long85 = code.src.Distance.chebyshevDistance(longArray34, longArray81);
        long long86 = code.src.Distance.chebyshevDistance(longArray9, longArray81);
        java.lang.Class<?> wildcardClass87 = longArray81.getClass();
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
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        long[] longArray54 = new long[] { 'a', 1L };
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
        long long62 = code.src.Distance.chebyshevDistance(longArray54, longArray60);
        long[] longArray65 = new long[] { 'a', 1L };
        long[] longArray68 = new long[] { 0, (short) -1 };
        long[] longArray71 = new long[] { (short) -1, (short) -1 };
        long long72 = code.src.Distance.chebyshevDistance(longArray68, longArray71);
        long long73 = code.src.Distance.chebyshevDistance(longArray65, longArray71);
        long long74 = code.src.Distance.chebyshevDistance(longArray60, longArray71);
        long[] longArray77 = new long[] { 'a', 1L };
        long[] longArray80 = new long[] { 0, (short) -1 };
        long[] longArray83 = new long[] { (short) -1, (short) -1 };
        long long84 = code.src.Distance.chebyshevDistance(longArray80, longArray83);
        long long85 = code.src.Distance.chebyshevDistance(longArray77, longArray83);
        long long86 = code.src.Distance.chebyshevDistance(longArray71, longArray83);
        long long87 = code.src.Distance.chebyshevDistance(longArray6, longArray71);
        long[] longArray90 = new long[] { (byte) -1, 97L };
        long long91 = code.src.Distance.chebyshevDistance(longArray6, longArray90);
        // The following exception was thrown during execution in test generation
        try {
            long long92 = code.src.Distance.chebyshevDistance(longArray0, longArray90);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 98L + "'", long62 == 98L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 98L + "'", long73 == 98L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 98L + "'", long85 == 98L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[-1, 97]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 98L + "'", long91 == 98L);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double4 = code.src.Distance.euclideanDistance(2.9486787165792413E31d, 5.3119477457783107E253d, 2.117752378578906E128d, 6.047401286148532E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double4 = code.src.Distance.euclideanDistance(2.2965057957235622E247d, 8.991400839766758E43d, 0.0d, 20084.432052190223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double4 = code.src.Distance.euclideanDistance(7.559791763329331E123d, 5.78903989294274E251d, 1.4764533763248394E125d, 2.125614532971372E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double4 = code.src.Distance.squaredDistance(6.923434529559351E123d, 2.5993022064039992E249d, 1.4579746669762032E64d, 2.05329249062104E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        long[] longArray76 = new long[] { 0, (short) -1 };
        long[] longArray79 = new long[] { (short) -1, (short) -1 };
        long long80 = code.src.Distance.chebyshevDistance(longArray76, longArray79);
        long[] longArray87 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long88 = code.src.Distance.chebyshevDistance(longArray79, longArray87);
        long long89 = code.src.Distance.chebyshevDistance(longArray71, longArray87);
        long long90 = code.src.Distance.chebyshevDistance(longArray5, longArray87);
        java.lang.Class<?> wildcardClass91 = longArray5.getClass();
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
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 11L + "'", long88 == 11L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 11L + "'", long90 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double4 = code.src.Distance.euclideanDistance(3.829739330285951E249d, 3.0559985941685375E15d, 7.863642449363113E125d, 3.321083216563934E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double4 = code.src.Distance.euclideanDistance(1.328881783205065E124d, 2.031028428232339E256d, 4.630067801207703E249d, 9.284544414987068E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        double double4 = code.src.Distance.squaredDistance(3.772588879245304E249d, 9.368838995853397E123d, 4.92586451367552E248d, 2.225770767711531E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double4 = code.src.Distance.squaredDistance(1.0408126756135268E126d, 2.031028428232339E256d, 1.2126872764393267E249d, 9.79709836214289E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double4 = code.src.Distance.squaredDistance(1.4561688805466475E125d, 2.031028428232339E256d, 1.2074554820296805E32d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double4 = code.src.Distance.euclideanDistance(7.5597917633235E123d, 8.27605827574068E123d, 2.0480917725743317E256d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double4 = code.src.Distance.squaredDistance(6.142140408070548E124d, 9.351743906023566E30d, 2.554335603593525E128d, 12313.549023578462d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.521492935459065E256d + "'", double4 == 6.521492935459065E256d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double4 = code.src.Distance.euclideanDistance(2.12562792029767E128d, 9.374059300997487E248d, 1.3186892203577162E31d, 1.1090019187308395E257d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double4 = code.src.Distance.squaredDistance(5.823190847653043E249d, 2.0535092167513552E256d, 3.068933012127493E239d, 6.53596076341459E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
        long[] longArray79 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray49, longArray79);
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
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double4 = code.src.Distance.euclideanDistance(5.717560488315264E251d, 5.525929237201556E7d, 1.2093895208085425E64d, 4.5169109784901915E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double4 = code.src.Distance.squaredDistance(7.559791763374577E123d, 3.311955036268193E63d, 0.0d, 20084.432052190223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.71504515055861E247d + "'", double4 == 5.71504515055861E247d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double4 = code.src.Distance.squaredDistance(1.131035907806524E126d, 7.559791653975984E125d, 4.518236903714711E256d, 9.036472295700742E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double4 = code.src.Distance.squaredDistance(2.053509149446454E256d, (double) (byte) 0, 8.013384602956264E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double4 = code.src.Distance.squaredDistance(9.324540899933299E30d, 7.920443263990935E119d, 7.862183193182798E125d, 1.3415037258095196E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8058134263110627E254d + "'", double4 == 1.8058134263110627E254d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double4 = code.src.Distance.squaredDistance(5.829917481072086E251d, 7.849802928787181E251d, 6.957500350144719E61d, 1.0695270443395895E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double4 = code.src.Distance.euclideanDistance(6.192735015311481E251d, 8.694715983872712E61d, 5.7150451504902E247d, 7.876508236289523E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double4 = code.src.Distance.euclideanDistance(1.891459241752112E125d, 7.560644248248633E125d, 1.8434127311838973E250d, 4.518236903714711E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double4 = code.src.Distance.euclideanDistance(4.485950827314113E256d, 7.732824116021177E127d, 5.5218522892182536E247d, 1.4534136470864304E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double4 = code.src.Distance.euclideanDistance(1.0807149657353284E16d, 2.3848836126517604E124d, 1.102865396833695E32d, 3.052698722606791E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.3848836126517604E124d + "'", double4 == 2.3848836126517604E124d);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double4 = code.src.Distance.euclideanDistance((double) 0.0f, 5.741400496898164E251d, 5.990295667767534E256d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double4 = code.src.Distance.euclideanDistance(4.172449883594742E250d, 8.982275443054642E123d, 0.0d, 6.922552879173873E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double4 = code.src.Distance.squaredDistance(2.2840367152798036E31d, 0.0d, 4.1827873952477334E256d, 3.006072569932526E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double4 = code.src.Distance.squaredDistance(1.2642778961487031E256d, 4.1827873952477334E256d, 3.0059284446479725E128d, 2.125614498247224E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        long[] longArray32 = new long[] { 'a', 1L };
        long[] longArray35 = new long[] { 0, (short) -1 };
        long[] longArray38 = new long[] { (short) -1, (short) -1 };
        long long39 = code.src.Distance.chebyshevDistance(longArray35, longArray38);
        long long40 = code.src.Distance.chebyshevDistance(longArray32, longArray38);
        long long41 = code.src.Distance.chebyshevDistance(longArray27, longArray38);
        long[] longArray44 = new long[] { 'a', 1L };
        long[] longArray47 = new long[] { 0, (short) -1 };
        long[] longArray50 = new long[] { (short) -1, (short) -1 };
        long long51 = code.src.Distance.chebyshevDistance(longArray47, longArray50);
        long long52 = code.src.Distance.chebyshevDistance(longArray44, longArray50);
        long long53 = code.src.Distance.chebyshevDistance(longArray38, longArray50);
        long long54 = code.src.Distance.chebyshevDistance(longArray16, longArray50);
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
        long[] longArray68 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long69 = code.src.Distance.chebyshevDistance(longArray60, longArray68);
        long long70 = code.src.Distance.chebyshevDistance(longArray50, longArray68);
        long long71 = code.src.Distance.chebyshevDistance(longArray6, longArray50);
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray0, longArray6);
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
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 98L + "'", long52 == 98L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 11L + "'", long70 == 11L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double4 = code.src.Distance.euclideanDistance(7.862183193182798E125d, 0.0d, 4.1996701178995654E256d, 8.067055176895368E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        long[] longArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long36 = code.src.Distance.chebyshevDistance(longArray31, longArray35);
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
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double4 = code.src.Distance.euclideanDistance((double) (-1.0f), 1.0408126756135268E126d, 6.804460155815231E124d, 3.424182432006193E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0430345600789057E126d + "'", double4 == 1.0430345600789057E126d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        double double4 = code.src.Distance.euclideanDistance((double) 100L, 6.520158840275344E248d, 1.4253988300352539E128d, 4.1519250136110354E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.262179825118349E251d, 9.59807360434958E15d, 2.2965057953353264E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double4 = code.src.Distance.squaredDistance(9.344073313646239E30d, 1.4300949526255977E64d, 1.3292180507676446E247d, 1.891459241764387E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double4 = code.src.Distance.squaredDistance(5.948654328288416E248d, 1.1294636811790911E99d, 7.559791763373738E123d, 3.1404935889650543E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double4 = code.src.Distance.squaredDistance(5.715043495807318E247d, 2.0483124887933698E256d, 0.0d, 1.6432333679662337E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double4 = code.src.Distance.squaredDistance(1.1245688124397413E248d, 1.45794860122975E64d, 8.991400839772017E43d, 3.80522029780604E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double4 = code.src.Distance.euclideanDistance(1.2756882071026236E198d, 1.0d, 3.0239723409974164E124d, 7.677886613131662E20d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double4 = code.src.Distance.euclideanDistance(5.715043495807318E247d, 2.0452199803289235E128d, 1.4255337706659871E125d, 9.32454089993304E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double4 = code.src.Distance.squaredDistance(7.559791763329331E123d, 4.1824175494475645E256d, 4.507895615716358E256d, 4.8406811122263884E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1.097417397239037E249d, 2.0698339792640068E256d, 1.733538700870257E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double4 = code.src.Distance.euclideanDistance(3.7454893307807313E251d, 7.786532742293105E125d, 6.385337334710284E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double4 = code.src.Distance.squaredDistance(4.484875220721362E256d, 7.592234862162515E125d, 3.353869680772834E49d, 1.2652744319531763E198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double4 = code.src.Distance.euclideanDistance(5.116365001163083E256d, 7.520013101166239E250d, 7.39356285262388E246d, 2.118121211849783E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double4 = code.src.Distance.squaredDistance(1.4251979253203356E128d, 2.406503766581682E12d, 5.719666280792153E251d, 10105.000049480455d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double4 = code.src.Distance.euclideanDistance(5.715045150490167E247d, 6.858438111975517E125d, 7.877914654122638E125d, 3.353869680772834E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double4 = code.src.Distance.euclideanDistance(122.0d, 1.45794860122975E64d, 1.8474736870780683E51d, 3.728721449645412E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double4 = code.src.Distance.euclideanDistance(10205.0d, 1.1473791318585206E252d, 5.791260371133755E24d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double4 = code.src.Distance.squaredDistance(12329.400413486055d, 4.629561777660613E248d, 4.518236903714711E256d, 4.840681090214691E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double4 = code.src.Distance.euclideanDistance(6.804460155815231E124d, 1.0861664063319225E252d, 8.068127213490246E247d, 6.535960763432593E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double4 = code.src.Distance.squaredDistance(1.5941288904220582E249d, 2.0350857491762078E128d, 8.99140083977295E43d, 7.608198465098248E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double4 = code.src.Distance.squaredDistance(2.1256483132637286E128d, 0.0d, 4.1824175494475645E256d, 1.6205790789034482E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double4 = code.src.Distance.squaredDistance(7.559791544504537E125d, 5.116365001163083E256d, 4.753127358123107E124d, 8.6947061736074E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
        long[] longArray64 = new long[] { 0, (short) -1 };
        long[] longArray67 = new long[] { (short) -1, (short) -1 };
        long long68 = code.src.Distance.chebyshevDistance(longArray64, longArray67);
        long long69 = code.src.Distance.chebyshevDistance(longArray59, longArray67);
        long long70 = code.src.Distance.chebyshevDistance(longArray45, longArray59);
        long[] longArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray45, longArray71);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double4 = code.src.Distance.squaredDistance((-1.0d), 2.9106355825640894E256d, 5.763159931203444E251d, 7.590793803572108E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double4 = code.src.Distance.euclideanDistance(7.863642449363113E125d, 1.7703709657756777E62d, 1.2074554820296805E32d, 4.182924767946505E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double4 = code.src.Distance.euclideanDistance(3.646248963761934E250d, 7.65996356070261E125d, 7.559791732623792E123d, 3.681736809627178E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double4 = code.src.Distance.euclideanDistance(1.2634745840023956E64d, 8.868523920159873E123d, 1.1245688124397413E248d, 5.811522158789176E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double4 = code.src.Distance.squaredDistance(8.694706281769278E61d, 0.0d, 9.778776737535161E212d, 8.320193817483419E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double4 = code.src.Distance.squaredDistance(9.715913234165533E248d, 7.559791544536665E125d, 1.0421930753617213E126d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        long long34 = code.src.Distance.chebyshevDistance(longArray2, longArray25);
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
        long long74 = code.src.Distance.chebyshevDistance(longArray25, longArray58);
        java.lang.Class<?> wildcardClass75 = longArray25.getClass();
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
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 98L + "'", long74 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double4 = code.src.Distance.squaredDistance(2.1256901295443705E128d, 6.20393819963367E251d, 9.374059300997487E248d, 5.952906869765997E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }
}

