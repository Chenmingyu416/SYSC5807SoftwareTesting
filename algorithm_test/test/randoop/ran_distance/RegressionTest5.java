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
        double double4 = code.src.Distance.euclideanDistance(6.117725723239335E125d, 1.2634745840023956E64d, (double) 100, 1.0379514071432164E126d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2048272921205037E126d + "'", double4 == 1.2048272921205037E126d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double4 = code.src.Distance.euclideanDistance(2.5156683110561225E248d, 2.3432193417162093E247d, 8.068127213490246E247d, 9.324535099190634E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double4 = code.src.Distance.euclideanDistance(1.7388170690697642E62d, 3.05680775507396E15d, (double) 0.0f, 2.1256141238277748E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256141238277748E128d + "'", double4 == 2.1256141238277748E128d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double4 = code.src.Distance.squaredDistance(3.053611124550097E15d, 8.341163188864031E30d, 4.793704459665872E251d, 4.792187178455498E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double4 = code.src.Distance.squaredDistance(5.715045104064703E247d, 1.097417397239037E249d, 8.341163188864031E30d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double4 = code.src.Distance.squaredDistance(2.251301237575268E124d, 7.656605268811053E125d, 8.868523920159873E123d, (double) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.864222144890665E251d + "'", double4 == 5.864222144890665E251d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double4 = code.src.Distance.euclideanDistance(7.559791763323488E123d, 8.320188026225052E30d, 7.590793803572108E125d, 6.449576703798581E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double4 = code.src.Distance.euclideanDistance(3.4290270810282753E248d, (double) 3L, 7.764261239969174E251d, 2.0481498109123508E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double4 = code.src.Distance.squaredDistance(2.286018050924408E248d, 1.2400472875600966E124d, 5.763138746578841E251d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double4 = code.src.Distance.euclideanDistance(1.433158224335312E128d, 3.424182432006193E63d, 1.380250332732779E124d, 3.006072569932526E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.3301680419024496E128d + "'", double4 == 3.3301680419024496E128d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double4 = code.src.Distance.squaredDistance(3.321083216563934E61d, 9.324540890451006E30d, 5.948654328288417E248d, (double) 33L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double4 = code.src.Distance.euclideanDistance(1.5941288904220582E249d, 6.188205857868469E251d, 2.0480917725743317E256d, 6.151502905962372E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double4 = code.src.Distance.squaredDistance(7.559791732617994E123d, 1.0997224744491414E32d, 5.715044985152495E251d, 1811816.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double4 = code.src.Distance.squaredDistance(9.324540899917549E30d, 2.1256145316270446E128d, 6.261457075442417E31d, 4.792187178860569E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.518033412506453E256d + "'", double4 == 4.518033412506453E256d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double4 = code.src.Distance.squaredDistance(6.063099723657831E251d, 2.719111392042953E123d, 0.0d, 6.957500334326037E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 1, 7.561664719340081E125d, 0.0d, 5.463413916504991E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double4 = code.src.Distance.euclideanDistance(7.865071652244784E247d, 2.769446841189903E125d, 1.9993186607985635E125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double4 = code.src.Distance.euclideanDistance(9.324540890452801E30d, 5.728851506743641E251d, 1.1267866439017752E64d, 2.1256144753928608E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double4 = code.src.Distance.euclideanDistance(6.972502032003872E201d, 8.694705670079996E61d, 1.7683618323195464E53d, 6.922562533439975E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double4 = code.src.Distance.squaredDistance(6.142140408070548E124d, 8.341162879156255E30d, 3.7454893307807313E251d, 7.559791763373738E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double4 = code.src.Distance.euclideanDistance(5.788468388432333E251d, 1552637.0032203277d, 5.715045150481366E247d, 6.151508697220018E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double4 = code.src.Distance.squaredDistance(3.053611124540608E15d, 2.286018050924669E248d, 3.3127290822508215E124d, 5.525994208076646E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double4 = code.src.Distance.squaredDistance(9.284544414987072E30d, 2.1177523428484083E128d, 1.4561688805466475E125d, 3.006072569932526E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.891149462745871E255d + "'", double4 == 7.891149462745871E255d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double4 = code.src.Distance.euclideanDistance(20084.432052190223d, 4.717807507424959E124d, 4.51823713706406E256d, 5.525928500007007E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double4 = code.src.Distance.euclideanDistance(4.792979223186968E123d, 1.5665408678303301E62d, 3.7426568024784246E251d, 3.0366107867949796E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double4 = code.src.Distance.squaredDistance(9.79709836214289E7d, 3.053611124540608E15d, 8.694706299424537E61d, 3.0536111245430885E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763325273E123d + "'", double4 == 7.559791763325273E123d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double4 = code.src.Distance.euclideanDistance(1.0329723434258763E126d, 5.715044819684806E251d, 5.717877332771251E251d, (double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double4 = code.src.Distance.squaredDistance(2.2194288710556866E124d, 1.5737202213962112E124d, 8.859911358917301E125d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double4 = code.src.Distance.euclideanDistance(1.0486765404643798E16d, 2.406503766681E12d, 5.791260378563789E24d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.791260368077024E24d + "'", double4 == 5.791260368077024E24d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double4 = code.src.Distance.euclideanDistance((double) 100.0f, 0.0d, 9.32454089993304E30d, 1.5617268815501826E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5617268815501826E62d + "'", double4 == 1.5617268815501826E62d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double4 = code.src.Distance.squaredDistance(7.559791732617994E123d, 2.1586910533487628E249d, 2.0480917725743317E256d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double4 = code.src.Distance.euclideanDistance(4.31382490545285E15d, 3.053611124543097E15d, 9.351743906023566E30d, 2.285850535203458E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double4 = code.src.Distance.euclideanDistance(8.058264513507916E247d, 12313.553084145538d, 16122.636173942763d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double4 = code.src.Distance.squaredDistance((double) 33L, 8.350150916003777E100d, 1.889947887669239E125d, 2.4389863321241504E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.631389561388303E250d + "'", double4 == 3.631389561388303E250d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double4 = code.src.Distance.euclideanDistance(1552637.0032203277d, 5.525929037215044E7d, 3.0568077560623055E15d, 1.0691160040444007E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0691160040444007E124d + "'", double4 == 1.0691160040444007E124d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        long long51 = code.src.Distance.chebyshevDistance(longArray39, longArray46);
        long[] longArray55 = new long[] { (byte) 10, 100, (byte) 1 };
        long long56 = code.src.Distance.chebyshevDistance(longArray46, longArray55);
        long[] longArray59 = new long[] { 0, (short) -1 };
        long[] longArray62 = new long[] { (short) -1, (short) -1 };
        long long63 = code.src.Distance.chebyshevDistance(longArray59, longArray62);
        long long64 = code.src.Distance.chebyshevDistance(longArray55, longArray59);
        // The following exception was thrown during execution in test generation
        try {
            long long65 = code.src.Distance.chebyshevDistance(longArray0, longArray59);
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
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 101L + "'", long56 == 101L);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 101L + "'", long64 == 101L);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double4 = code.src.Distance.euclideanDistance(3.353869565834853E49d, 2.2496883671214544E99d, 9.144408719117394E248d, 7.559791544536665E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double4 = code.src.Distance.euclideanDistance(8.620276499386763E61d, 5.5259489E7d, 7.764261239969174E251d, 1.74402177078084E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double4 = code.src.Distance.euclideanDistance(2.4805194246531137E124d, 0.0d, 9.862699982330608E244d, 5.216823716746154E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double4 = code.src.Distance.squaredDistance(6.587293214563927E247d, 2.0850307160336277E31d, 6.556084846280549E12d, 7.562847533034203E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double4 = code.src.Distance.euclideanDistance(9.324540899933299E30d, 8.133851138224599E174d, 7.43091669258797E123d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double4 = code.src.Distance.squaredDistance(3.052698722606791E15d, 2.2710600277457865E249d, 9.797098384561698E7d, 20084.432052190223d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double4 = code.src.Distance.euclideanDistance(5.527131720196977E7d, 1.1048109600916608E249d, 1.5941288904220582E249d, 4.5182371542091934E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double4 = code.src.Distance.euclideanDistance(3.8265338665801504E250d, 3.650997547418172E43d, 9882.0d, 1.462949373248983E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double double4 = code.src.Distance.squaredDistance(0.0d, 2.24721340011667E248d, 99.41369581878968d, 7.677886613131662E20d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double4 = code.src.Distance.squaredDistance(7.393566762337766E246d, 1.4579746669762032E64d, 4.51823713706406E256d, 5.7150451504902E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double4 = code.src.Distance.euclideanDistance(1.0852821850087336E126d, 5.524950700000004E7d, 1.2634745840023956E64d, 2.8325283023066844E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double4 = code.src.Distance.squaredDistance(5.715616324151285E251d, 9.386961461524785E62d, 8.341162879156251E30d, 2.0850307160336277E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double4 = code.src.Distance.squaredDistance(5.715045150481383E247d, (double) (byte) -1, 2.1256901295443705E128d, 8.273174080969564E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double4 = code.src.Distance.squaredDistance(4.347353086803702E62d, 9.797098384561698E7d, 6.957500350144719E61d, 3.0559985941685375E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.333420484783642E125d + "'", double4 == 1.333420484783642E125d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double4 = code.src.Distance.squaredDistance(5.715851632357578E251d, 9.324540890466497E30d, 1.0063874635772352E61d, 1.0807149657353284E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double4 = code.src.Distance.euclideanDistance(7.559791763373738E123d, 8.694705670079996E61d, 0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763373738E123d + "'", double4 == 7.559791763373738E123d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double4 = code.src.Distance.squaredDistance(5.463413916504991E251d, 8.841771681470747E249d, 3.053611124550097E15d, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double4 = code.src.Distance.squaredDistance(5.52593790000923E7d, 1.589750982408489E254d, 1.0329723434258763E126d, 7.876508236289523E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double4 = code.src.Distance.euclideanDistance(7.814856790247367E7d, 2.4065001431929946E12d, 7.559791763323488E123d, 8.694866271304194E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763323488E123d + "'", double4 == 7.559791763323488E123d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double4 = code.src.Distance.squaredDistance((double) (-1L), 1.209524440947343E125d, 0.0d, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.462949373248983E250d + "'", double4 == 1.462949373248983E250d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double4 = code.src.Distance.euclideanDistance(4.518236899385757E256d, 2.1256144753928608E128d, 1.1142495781208175E62d, 1.0699880226301655E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double4 = code.src.Distance.euclideanDistance(2.1586910533487628E249d, 1.4990708455962547E124d, 2.719111392042953E123d, 7.561664719340081E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double4 = code.src.Distance.squaredDistance(3.890146281899556E124d, 3.053611124543087E15d, 0.0d, 3.0580621176685875E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5133238094576941E249d + "'", double4 == 1.5133238094576941E249d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        long long58 = code.src.Distance.chebyshevDistance(longArray13, longArray53);
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
        long long94 = code.src.Distance.chebyshevDistance(longArray13, longArray78);
        long long95 = code.src.Distance.chebyshevDistance(longArray6, longArray78);
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray0, longArray78);
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
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
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double4 = code.src.Distance.squaredDistance(1.0699880226301655E124d, 2.3432193417162093E247d, 0.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double4 = code.src.Distance.euclideanDistance(5.948654328288416E248d, 4.792187178455498E123d, 2.964908885240041E122d, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double4 = code.src.Distance.euclideanDistance(7.559791653975984E125d, 1.4319457653113712E123d, 1.5665408678303301E62d, 5.64433727473721E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double4 = code.src.Distance.squaredDistance(5.527200037395124E7d, 2.3432186456900772E247d, 2.1256144767371883E128d, 6.520180893902484E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double4 = code.src.Distance.euclideanDistance((double) 1.0f, 1225.0d, 1.5119583526749173E124d, 1.1929678955220982E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5119583526749173E124d + "'", double4 == 1.5119583526749173E124d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double4 = code.src.Distance.euclideanDistance(1.1958657793748695E32d, 6.957500334326037E61d, 6.192723950656815E251d, 5.524950700000004E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double4 = code.src.Distance.euclideanDistance(8.6947061736074E62d, 16122.636173942763d, 12313.549023578462d, 1.1503513373584828E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double4 = code.src.Distance.squaredDistance(5.721223146643194E251d, 1.7996320167102433E254d, 7.590793803572108E125d, 1.8649081799851445E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double4 = code.src.Distance.euclideanDistance(1.4579486012297467E64d, 1124.0d, 5.715044985152495E251d, 3.353869565834853E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double4 = code.src.Distance.squaredDistance(6.587293214563927E247d, 1.4300949526255977E64d, 4.8406811122263884E123d, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double4 = code.src.Distance.squaredDistance(1.4300949526255977E64d, 3.577618063209475E250d, 8.811504548015154E125d, 8.99140083977295E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double4 = code.src.Distance.euclideanDistance(3.321083216563934E61d, 1.43186707723895E64d, 8.69470629945289E61d, 9.144408719117394E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double4 = code.src.Distance.euclideanDistance(1.433007028500352E128d, 5.039568979476821E248d, 3.4290270810282753E248d, (double) 11L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double4 = code.src.Distance.euclideanDistance(5.715045104064755E247d, 9.324540899982978E30d, 3.353869668626517E49d, 2.8896627685601946E50d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double4 = code.src.Distance.squaredDistance(7.416985483562336E245d, 7433.0d, 6.556084846280365E12d, 2.1125627370202318E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double4 = code.src.Distance.squaredDistance(5.948654328288417E248d, 1.1929678834484718E32d, 1.8649081799851445E31d, 140.71602609511115d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double4 = code.src.Distance.squaredDistance(5.763138746578841E251d, 1.4291186487223539E128d, 4.792187178860569E123d, 5.528905595074321E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double4 = code.src.Distance.euclideanDistance(8.694706281769265E61d, 6.520158840275344E248d, 5.250078299133718E247d, 5.039568979476821E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double4 = code.src.Distance.euclideanDistance((double) ' ', 5.53979513351125E119d, 1.1438880985737782E248d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double4 = code.src.Distance.squaredDistance(100.40866620345955d, 0.0d, 1.5119582431985447E124d, 7.65996356070261E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.869790192858356E251d + "'", double4 == 5.869790192858356E251d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        long[] longArray50 = new long[] { 0, (short) -1 };
        long[] longArray53 = new long[] { (short) -1, (short) -1 };
        long long54 = code.src.Distance.chebyshevDistance(longArray50, longArray53);
        long[] longArray61 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long62 = code.src.Distance.chebyshevDistance(longArray53, longArray61);
        long long63 = code.src.Distance.chebyshevDistance(longArray43, longArray61);
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long long71 = code.src.Distance.chebyshevDistance(longArray61, longArray66);
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray0, longArray66);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 11L + "'", long62 == 11L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 11L + "'", long63 == 11L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 11L + "'", long71 == 11L);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double4 = code.src.Distance.squaredDistance(3.3127290822508215E124d, (double) 'a', 1.449255956357967E248d, 3.023916486461334E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double4 = code.src.Distance.squaredDistance(7.32543304010228E98d, 9.778776737535161E212d, 2.3498127622806567E12d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double4 = code.src.Distance.squaredDistance(4.9778761674495435E218d, 0.0d, 8.991400839766758E43d, 1.039575455679478E8d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double4 = code.src.Distance.squaredDistance(1.333420484783642E125d, 4.792187178455498E123d, 5.525994208076646E7d, 3.0366107867949796E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.8434127311838973E250d + "'", double4 == 1.8434127311838973E250d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double4 = code.src.Distance.squaredDistance(8.694706299426871E61d, 7.559791544504537E125d, 1.8663667958684514E31d, 5.525928500007007E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715044819636229E251d + "'", double4 == 5.715044819636229E251d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double4 = code.src.Distance.squaredDistance(1.143009020812949E248d, 2.2840367152798036E31d, 1.3101817078026575E64d, 8.951751003550235E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        long[] longArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long84 = code.src.Distance.chebyshevDistance(longArray49, longArray83);
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
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double4 = code.src.Distance.squaredDistance(7.863642449363113E125d, 1.0486765404656112E16d, (double) 100L, 3.1271035700045434E106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.18368725714255E251d + "'", double4 == 6.18368725714255E251d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray43, longArray54);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray43);
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
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        long[] longArray45 = new long[] { 'a', 1L };
        long[] longArray48 = new long[] { 0, (short) -1 };
        long[] longArray51 = new long[] { (short) -1, (short) -1 };
        long long52 = code.src.Distance.chebyshevDistance(longArray48, longArray51);
        long long53 = code.src.Distance.chebyshevDistance(longArray45, longArray51);
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
        long long88 = code.src.Distance.chebyshevDistance(longArray73, longArray85);
        long long89 = code.src.Distance.chebyshevDistance(longArray51, longArray85);
        long long90 = code.src.Distance.chebyshevDistance(longArray38, longArray51);
        long[] longArray91 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long92 = code.src.Distance.chebyshevDistance(longArray38, longArray91);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 98L + "'", long53 == 98L);
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
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double4 = code.src.Distance.euclideanDistance(8.320193817483419E30d, 4.471374129726301E62d, 7.56006994758633E123d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.56006994758633E123d + "'", double4 == 7.56006994758633E123d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double4 = code.src.Distance.euclideanDistance(5.714207540805018E247d, 5.463413916504991E251d, (double) (byte) 1, 8.859911358917301E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double4 = code.src.Distance.euclideanDistance(3.890201679850891E124d, 1.4319457653113712E123d, 8.811504548015154E125d, 9.79709836214289E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.42249655260944E125d + "'", double4 == 8.42249655260944E125d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double4 = code.src.Distance.euclideanDistance(1.5119583495997528E124d, 2.9064639308329233E248d, 7.559791763329309E123d, 3.0568118497974055E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        long long94 = code.src.Distance.chebyshevDistance(longArray13, longArray78);
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
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 11L + "'", long94 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double4 = code.src.Distance.squaredDistance(8.694706281769278E61d, 3.571903018105419E250d, 1.0d, 4.5182371393605655E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double4 = code.src.Distance.euclideanDistance(7.32543304010228E98d, 9.32454089993304E30d, 1.8933354688488568E125d, 5.5218522892182536E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.471374129726301E62d, 1.7996320167102433E254d, 2.7065537201582164E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double4 = code.src.Distance.euclideanDistance(9.324540899917549E30d, 10.0d, (double) 'a', 9.79709836214289E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.324540899917549E30d + "'", double4 == 9.324540899917549E30d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double4 = code.src.Distance.squaredDistance(1.0379514071432164E126d, 4.1811108493051547E256d, 4.9778761674495435E218d, 6.20393819963367E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double4 = code.src.Distance.squaredDistance(5.720993474013094E251d, 0.0d, 5.715045150490167E247d, 7.850374433297587E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double4 = code.src.Distance.squaredDistance(2.721524969160516E125d, 9.324540890451006E30d, 1.462949373248983E250d, 1.5133238094576941E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double4 = code.src.Distance.euclideanDistance(3.477821790930845E62d, 8.273174080969564E247d, 7.40859570957669E125d, 8.273174080969564E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.40859570957669E125d + "'", double4 == 7.40859570957669E125d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double4 = code.src.Distance.euclideanDistance((double) 1, 6.20393819963367E251d, 3.056811849797306E15d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double4 = code.src.Distance.squaredDistance(0.0d, 9.324546353624267E30d, 3.353869668626517E49d, 3.0535834157458975E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1248441754132943E99d + "'", double4 == 1.1248441754132943E99d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double4 = code.src.Distance.euclideanDistance(9.144408719117394E248d, 9.466542772840854E21d, 1811672.00533166d, 1.7874479094208446E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double4 = code.src.Distance.euclideanDistance(1.453465767405697E125d, 3.0580621176685875E15d, 3.053533391929702E15d, 1.2756882071026236E198d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double4 = code.src.Distance.euclideanDistance(1.0852821850087336E126d, (double) '#', 100.0d, 5.524950700000004E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0852821850087336E126d + "'", double4 == 1.0852821850087336E126d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double4 = code.src.Distance.squaredDistance(3.052698722606791E15d, 3.7454893307807313E251d, (double) (short) 100, 1.1438880985737782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double4 = code.src.Distance.squaredDistance(1.060042331216179E124d, 0.0d, 6.18529391824118E251d, 1.1801491380487327E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double4 = code.src.Distance.euclideanDistance(4.485950827314113E256d, 2.4389863321241504E124d, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double4 = code.src.Distance.euclideanDistance(5.731031078277051E251d, 100.40866620345955d, 0.0d, 7.447258393539782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double4 = code.src.Distance.euclideanDistance(5.525929037215044E7d, 0.0d, 8.320188026225052E30d, 3.1271035700045434E106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.1271035700045434E106d + "'", double4 == 3.1271035700045434E106d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double4 = code.src.Distance.euclideanDistance(8.917458244322077E62d, 5.497143053457335E251d, 1.1048109600916608E249d, 7.565603634330283E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double4 = code.src.Distance.euclideanDistance(1.7874479094211152E62d, 4.518033412506453E256d, (double) (short) 1, 4.5182354114743835E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double4 = code.src.Distance.squaredDistance(3.353869565834853E49d, 4.629561777660613E248d, 4.9778761674495435E218d, 5.52593790000923E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double4 = code.src.Distance.squaredDistance(4.557896970053384E248d, 4.31382490545285E15d, 5.791260371133832E24d, 7.416985483562336E245d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double4 = code.src.Distance.euclideanDistance(5.715045150484065E247d, 1.589750982408489E254d, 4.3184582665404395E15d, 7.862188778631282E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double4 = code.src.Distance.euclideanDistance(3.052698722606791E15d, 5.604659899440947E124d, 2.406501954865E12d, 5.714207540805018E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double4 = code.src.Distance.euclideanDistance(3.0522370255297355E15d, 1.4579746669762032E64d, 5.791260371133755E24d, 8.824228056978371E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double4 = code.src.Distance.squaredDistance(5.797197117558862E24d, 3.0366107867949796E124d, 3.023916486461334E124d, 6.151508697220018E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.836507598757228E249d + "'", double4 == 1.836507598757228E249d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray31, longArray89);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray89);
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double4 = code.src.Distance.euclideanDistance(3.0621788818790405E248d, 2.8325283023066844E248d, 1.5988706255405772E125d, 5.715045150481383E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double4 = code.src.Distance.squaredDistance(20.0d, 1.1294636811790911E99d, 1.2074554820296805E32d, 5.749414470161792E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double4 = code.src.Distance.squaredDistance(6.20393819963367E251d, 8.050471177320619E123d, 8.899687221465109E59d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double4 = code.src.Distance.squaredDistance(3.8265338665801504E250d, 1.1248441811882996E99d, 1.3186892203577162E31d, 8.94428757683438E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double4 = code.src.Distance.squaredDistance(4.792187178860569E123d, 1.4312682764476429E128d, 5.715616324151285E251d, 4.840681090214691E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double4 = code.src.Distance.euclideanDistance(3.05361112455053E15d, 8.866898431039124E62d, 9.137715554420027E30d, 5.527131618909466E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.866898431039124E62d + "'", double4 == 8.866898431039124E62d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double4 = code.src.Distance.euclideanDistance(1.1142495781208175E62d, 3.321083216563934E61d, 9.374059300997487E248d, 2.406503766581682E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double4 = code.src.Distance.euclideanDistance(8.779875994255162E124d, 1.5119583495997528E124d, 9.351743906023566E30d, 7.862188778636408E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.76081660665762E125d + "'", double4 == 7.76081660665762E125d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double4 = code.src.Distance.squaredDistance(6.972502032003872E201d, 3.0522370255297355E15d, 3.5776180632559095E250d, 5.829917481072086E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double4 = code.src.Distance.euclideanDistance(8.991400839772017E43d, 0.0d, (double) 0.0f, 4.765564004129822E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.765564004129822E124d + "'", double4 == 4.765564004129822E124d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        long long57 = code.src.Distance.chebyshevDistance(longArray31, longArray54);
        long[] longArray60 = new long[] { 0, (short) -1 };
        long[] longArray63 = new long[] { (short) -1, (short) -1 };
        long long64 = code.src.Distance.chebyshevDistance(longArray60, longArray63);
        long[] longArray71 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long72 = code.src.Distance.chebyshevDistance(longArray63, longArray71);
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
        long long95 = code.src.Distance.chebyshevDistance(longArray81, longArray92);
        long long96 = code.src.Distance.chebyshevDistance(longArray63, longArray81);
        long long97 = code.src.Distance.chebyshevDistance(longArray31, longArray81);
        long long98 = code.src.Distance.chebyshevDistance(longArray19, longArray31);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 11L + "'", long72 == 11L);
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
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double4 = code.src.Distance.euclideanDistance(140.71602609511115d, 2.721524969160516E125d, 0.0d, 2.3432193630265306E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        long[] longArray95 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long96 = code.src.Distance.chebyshevDistance(longArray54, longArray95);
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
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double4 = code.src.Distance.squaredDistance(3.2900143351994137E124d, 5.715045104064755E247d, (double) (-1.0f), 8.73117060907958E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double4 = code.src.Distance.squaredDistance((double) 'a', 1.209524440947343E125d, 9.324540899933299E30d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2857893850944086E250d + "'", double4 == 1.2857893850944086E250d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double4 = code.src.Distance.euclideanDistance(2.575569517141002E250d, (double) (short) -1, 7.710680125905936E10d, 3.0535834157458975E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 2.1256141238277748E128d, 2.053509149446454E256d, 1.143009030111722E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double4 = code.src.Distance.euclideanDistance(2.4389863321241504E124d, 4.347362196294934E62d, 0.0d, 99.41369581878968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.4389863321241504E124d + "'", double4 == 2.4389863321241504E124d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double4 = code.src.Distance.euclideanDistance(4.484932138384625E256d, 3.194965507832467E124d, 8.991400839766758E43d, 4.484932138384625E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double4 = code.src.Distance.euclideanDistance(1.3179319637108076E128d, 2.0451715735252107E128d, 3.068933012127493E239d, 3.3301680419024496E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double4 = code.src.Distance.euclideanDistance(2.7676045845140174E123d, 9.324540562451319E30d, 8.976783674294438E123d, 5.497143053457335E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double4 = code.src.Distance.euclideanDistance(5.527131618909466E7d, 1811672.00533166d, 0.0d, 7.849802928787181E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray31, longArray89);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray89);
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double4 = code.src.Distance.euclideanDistance(7.891149462745871E255d, 1.43186707723895E64d, 1.5649646924973942E62d, 5.948654328288417E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double4 = code.src.Distance.squaredDistance(5.948654328288417E248d, 3.477821790930845E62d, 4.484932138384625E256d, 2.964908885240041E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double4 = code.src.Distance.euclideanDistance(8.982275443054642E123d, 8.793716013138559E63d, 9.324540890466497E30d, 9.324540899982978E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.982275443054642E123d + "'", double4 == 8.982275443054642E123d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double4 = code.src.Distance.euclideanDistance(8.08452890614547E87d, 5.715045150481383E247d, 9.778776737535161E212d, 8.42249655260944E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double4 = code.src.Distance.euclideanDistance(6.151502905962372E30d, 7.656605268811053E125d, (double) 10.0f, 4.630067801207703E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double4 = code.src.Distance.squaredDistance(8.694706173607399E62d, 2.481557946718722E62d, 5.5218522892182536E247d, 5.715616324151285E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double4 = code.src.Distance.euclideanDistance(6.307309197813705E251d, 8.694706299452407E61d, 9.351743915519625E30d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double4 = code.src.Distance.squaredDistance(7.560644248248633E125d, 2.1125627370202318E250d, 5.528905595074321E7d, 5.763138746578841E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double4 = code.src.Distance.squaredDistance(9.284544414987072E30d, 8.69470629945289E61d, 4.51823713706406E256d, 7.559791763329331E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double4 = code.src.Distance.squaredDistance(1.0207804596239174E249d, 1.8933354688488568E125d, 8.694706281769265E61d, 1.74402177078084E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double4 = code.src.Distance.squaredDistance(3.0559985941685375E15d, 5.484533507010109E251d, 1.1248441754132943E99d, 9.351743915519625E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double4 = code.src.Distance.squaredDistance(1.231115082248268E64d, 7.559791763373738E123d, 625.0d, 5.715616324151285E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double4 = code.src.Distance.squaredDistance(8.6947061736074E62d, 5.525929237201556E7d, 7.568917694587279E125d, 2.0451715735252107E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.1827840536706536E256d + "'", double4 == 4.1827840536706536E256d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double4 = code.src.Distance.squaredDistance((double) 1.0f, 3.1404935889650543E122d, 7.814856790247367E7d, 9.862699982330608E244d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double4 = code.src.Distance.euclideanDistance(8.084528906135836E87d, 3.7454893307807313E251d, 1.4990708455962547E124d, 8.824228056978371E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double4 = code.src.Distance.euclideanDistance((double) 100, 9.324540890451003E30d, 4.753127358123107E124d, 5.603244642552161E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double4 = code.src.Distance.squaredDistance(2.0452199803289235E128d, 1225.0d, 8.694706281798174E61d, 8.868523920159873E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.182924775801714E256d + "'", double4 == 4.182924775801714E256d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double4 = code.src.Distance.euclideanDistance(7.862188778636408E125d, 8.991400839772116E43d, 7.565603634330283E123d, 2.8519907324927616E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.786532742293105E125d + "'", double4 == 7.786532742293105E125d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double4 = code.src.Distance.squaredDistance(7.862188778631282E125d, 5.52593790000923E7d, 8.811504548015154E125d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.012004300008916E249d + "'", double4 == 9.012004300008916E249d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double4 = code.src.Distance.squaredDistance(7.56006994758633E123d, 9.386961461524785E62d, 1.4579746669762032E64d, 1.5134476182871558E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double4 = code.src.Distance.euclideanDistance(1.2400472875600966E124d, 1.3101817078026575E64d, 7.661073336008042E123d, 4.518236903714711E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double4 = code.src.Distance.euclideanDistance(1.5988706255405772E125d, (double) ' ', 1552637.0d, 2.2496883671214544E99d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5988706255405772E125d + "'", double4 == 1.5988706255405772E125d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double4 = code.src.Distance.squaredDistance((double) (short) 0, 5.864222144890665E251d, 2.125614474048533E128d, 1.224365486934459E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double4 = code.src.Distance.euclideanDistance(1.589750982408489E254d, 3.5776180632559095E250d, 1.951229426380269E125d, 6.556084846280549E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double4 = code.src.Distance.euclideanDistance(8.341162879156251E30d, 0.0d, 6.072806626010396E251d, 2.1256144753928608E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double4 = code.src.Distance.euclideanDistance(5.52593790000923E7d, 2.3432193630265306E247d, 5.528905595074321E7d, 1.4330070531769372E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double4 = code.src.Distance.euclideanDistance(3.7426568024784246E251d, 2.1256144753928608E128d, 5.527200037395124E7d, 5.501575976011727E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double4 = code.src.Distance.euclideanDistance(9.324540899933247E30d, 1.2074554820296805E32d, 1.4579486012297467E64d, 6.192723950656815E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double4 = code.src.Distance.euclideanDistance(7.447258393539782E248d, 8.917458244322077E62d, 9.144408719117394E248d, 1.433158224335312E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        java.lang.Class<?> wildcardClass11 = longArray5.getClass();
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double4 = code.src.Distance.squaredDistance(9.324546353624267E30d, 4.484875220721362E256d, 2.0786247129419894E256d, 2.1177523428484083E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double4 = code.src.Distance.squaredDistance(4.5182371393605655E256d, 6.042358993280212E21d, 5.525929037215044E7d, 5.864222144890665E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        long[] longArray56 = new long[] { 100L, 1 };
        long long57 = code.src.Distance.chebyshevDistance(longArray52, longArray56);
        long long58 = code.src.Distance.chebyshevDistance(longArray42, longArray56);
        java.lang.Class<?> wildcardClass59 = longArray42.getClass();
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
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 101L + "'", long57 == 101L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 101L + "'", long58 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double4 = code.src.Distance.squaredDistance(9.482299742031001E21d, 1.2094207749824497E64d, 2.1092217904410153E248d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 5.463413916504991E251d, (double) (byte) 0, 7.559791732623814E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.143009030111722E248d, 1.0691160040444007E124d, 4.172449883594742E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        java.lang.Class<?> wildcardClass71 = longArray66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double4 = code.src.Distance.euclideanDistance(6.385337334710284E62d, 6.957499817664781E61d, 8.811504548015154E125d, 1.8474736870780683E51d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.811504548015154E125d + "'", double4 == 8.811504548015154E125d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double4 = code.src.Distance.euclideanDistance(3.0568118497974055E15d, 8.694706299426871E61d, 20737.0d, 5.952906869765997E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.952906869765997E125d + "'", double4 == 5.952906869765997E125d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double4 = code.src.Distance.squaredDistance(1.5665408678303301E62d, 1.738941196953288E62d, 1.5134476182871558E249d, 1.433158224335312E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double4 = code.src.Distance.euclideanDistance(8.058264513507916E247d, 3.0568077560623055E15d, 0.0d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double4 = code.src.Distance.squaredDistance(1.5617254340936532E62d, 1.1649654526156026E205d, 3.631389561388303E250d, 8.341162879156255E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double4 = code.src.Distance.euclideanDistance(1.2606142663028386E127d, 0.0d, 8.694706299423517E61d, 9.095699028095402E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2606145944433818E127d + "'", double4 == 1.2606145944433818E127d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double4 = code.src.Distance.squaredDistance(140.71602609511115d, 6.858438111975517E125d, 9.324540890451006E30d, 1811707.0012909174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.70381733357983E251d + "'", double4 == 4.70381733357983E251d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double4 = code.src.Distance.squaredDistance(1.0063874635772352E61d, 7.559791763374587E123d, 7.559791653975984E125d, 1.1958657793748695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.71561648966755E251d + "'", double4 == 5.71561648966755E251d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double4 = code.src.Distance.squaredDistance(1.2400472875600966E124d, 2.244907423513874E31d, 7.559791732623826E123d, 5.715045150548505E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double4 = code.src.Distance.euclideanDistance(6.120040302792729E125d, 7.559791763325273E123d, 2.55346448847492E124d, 3.1404935889650543E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.865141437237654E125d + "'", double4 == 5.865141437237654E125d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double4 = code.src.Distance.euclideanDistance(3.3607494419832777E49d, 5.791260381620597E24d, 8.067055176895368E247d, 1.2296178404951322E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        java.lang.Class<?> wildcardClass82 = longArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double4 = code.src.Distance.squaredDistance(5.865141437237654E125d, 3.052698722606791E15d, (double) '4', 5.791260371133832E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.439988407880217E251d + "'", double4 == 3.439988407880217E251d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double4 = code.src.Distance.euclideanDistance(6.192723950656815E251d, 3.3662285038614664E124d, 4.92586451367552E248d, 8.050471177320619E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double4 = code.src.Distance.squaredDistance(5.53979513351125E119d, 2.24721340011667E248d, 4.753127358123107E124d, 7.821589175633897E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double4 = code.src.Distance.euclideanDistance(5.728851506743641E251d, 0.0d, 4.182530750552227E256d, 6.520180893902484E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double4 = code.src.Distance.euclideanDistance(2.3432193630265306E247d, 1.4331582329756537E128d, 1.097417397239037E249d, 9.324540899933302E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double4 = code.src.Distance.euclideanDistance(7433.0d, Double.POSITIVE_INFINITY, (double) ' ', (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double4 = code.src.Distance.squaredDistance(6.120040302792729E125d, 0.0d, 5.53979513351125E119d, 7.559791763374587E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.746054054544959E251d + "'", double4 == 3.746054054544959E251d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double4 = code.src.Distance.euclideanDistance(2.8896627685601946E50d, 2.2965057953353264E247d, 0.0d, 7.559791763374577E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double double4 = code.src.Distance.euclideanDistance(1.3415037258095196E127d, 144.0d, 1.6830116762241088E124d, 7.413179166381833E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        long[] longArray57 = new long[] { 0, (short) -1 };
        long[] longArray60 = new long[] { (short) -1, (short) -1 };
        long long61 = code.src.Distance.chebyshevDistance(longArray57, longArray60);
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
        long long97 = code.src.Distance.chebyshevDistance(longArray60, longArray93);
        long long98 = code.src.Distance.chebyshevDistance(longArray23, longArray60);
        java.lang.Class<?> wildcardClass99 = longArray60.getClass();
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
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
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
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double4 = code.src.Distance.squaredDistance(5.715043495807318E247d, 9.386961461524785E62d, 5.604659899440947E124d, 7.559790668932122E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double4 = code.src.Distance.euclideanDistance(4.518033412506453E256d, 3.559657110785834E251d, 5.791260381620597E24d, 6.957500350144719E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double4 = code.src.Distance.euclideanDistance(8.694715983872712E61d, (double) 0, 2.7234837376481807E125d, 3.0580621176685875E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7234837376481807E125d + "'", double4 == 2.7234837376481807E125d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double4 = code.src.Distance.euclideanDistance(9.797098384561698E7d, 7.559943432502878E125d, 5.791260371133832E24d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559943432502878E125d + "'", double4 == 7.559943432502878E125d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double4 = code.src.Distance.euclideanDistance(8.899687221465109E59d, 1.380250332732779E124d, 2.4389908525564578E124d, 7.608574040480504E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.474529365309457E125d + "'", double4 == 7.474529365309457E125d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double4 = code.src.Distance.squaredDistance(7.393563040080829E246d, 3.0239723409974164E124d, 5.715043495807318E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double4 = code.src.Distance.euclideanDistance(9.284544414987072E30d, 9.466542772834739E21d, 1.5133238094576941E249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double4 = code.src.Distance.euclideanDistance((double) 10L, 1.5988706255405772E125d, 1.0670318622827465E252d, 1.4272033862877643E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double4 = code.src.Distance.squaredDistance(2.1256145316270446E128d, 1.2652744319531763E198d, (double) 10L, 7.559791763374577E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double4 = code.src.Distance.euclideanDistance(8.013384602956264E125d, 4.717807507424959E124d, 1.209524440947343E125d, 1552636.4832506673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.820197224490154E125d + "'", double4 == 6.820197224490154E125d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double4 = code.src.Distance.squaredDistance(6.922552879173873E61d, 7.786532742293105E125d, 2.8896627685601946E50d, 5.717560488315264E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double4 = code.src.Distance.euclideanDistance(1.8649081799905601E31d, (double) 100, 1.2606145944433818E127d, 9.324535099190634E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2606145944433818E127d + "'", double4 == 1.2606145944433818E127d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double4 = code.src.Distance.euclideanDistance(9.951221440466418E248d, 4.654121416639182E124d, 8.694706299426858E61d, 1.2632922663800816E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double4 = code.src.Distance.squaredDistance(1.0670548273407037E252d, 1.2046853507841718E252d, 4.182726770879422E256d, 6.923658324661806E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double4 = code.src.Distance.squaredDistance(0.0d, 9.79709836214289E7d, 1.5119582431985447E124d, 4.793704459665872E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 9.324546353624267E30d, 2.9486787165792413E31d, 8.859911358917301E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.859911358917301E125d + "'", double4 == 8.859911358917301E125d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double4 = code.src.Distance.squaredDistance(6.820197224490154E125d, 5.525994208076646E7d, 0.0d, 5.791260378563789E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.65150901809432E251d + "'", double4 == 4.65150901809432E251d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double4 = code.src.Distance.squaredDistance((double) 1L, 2.7234837376481807E125d, 4.8406811122263884E123d, 5.948676378854077E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double4 = code.src.Distance.squaredDistance(7.559791763323488E123d, 7.56006994758633E123d, 1.4312682764476429E128d, 6.261457075442417E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0483124887933698E256d + "'", double4 == 2.0483124887933698E256d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double4 = code.src.Distance.squaredDistance(1124.0d, 0.0d, 3.890146281899556E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5133238094576941E249d + "'", double4 == 1.5133238094576941E249d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double4 = code.src.Distance.euclideanDistance(1.1918576465896191E249d, 8.620276499386763E61d, 2.261894190902627E124d, 2.7234837376481807E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double4 = code.src.Distance.euclideanDistance(6.192723950656815E251d, 2.0483124887933698E256d, 2.8325283023066844E248d, 2.2965057957235622E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double4 = code.src.Distance.squaredDistance(4.92586451367552E248d, 8.722498761879103E62d, 1.1929678834484718E32d, 10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double4 = code.src.Distance.euclideanDistance(3.559657110785834E251d, 1.3415036402150548E127d, 2.0786247129419894E256d, 7.865071652244784E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double4 = code.src.Distance.squaredDistance((double) (short) 10, 7.590793803572108E125d, 1.0699880226301655E124d, 99.41369581878968d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.763159931203444E251d + "'", double4 == 5.763159931203444E251d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double4 = code.src.Distance.squaredDistance(1.0379514071432164E126d, 6.957500334326037E61d, 0.0d, 2.2964930079195337E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double4 = code.src.Distance.squaredDistance(8.694706173607399E62d, 7.849802928787181E251d, 5.763159931203444E251d, 1.457948741083528E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double4 = code.src.Distance.squaredDistance(8.694706281769278E61d, 8.824228056978371E247d, 7.77326133854061E10d, 1.5649646924973942E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double4 = code.src.Distance.euclideanDistance(4.753127358123107E124d, 4.347353086803702E62d, 0.0d, 8.841771681470747E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double4 = code.src.Distance.squaredDistance(99.41369581878968d, 7.559791763323488E123d, 8.341162879156255E30d, 7.393566762337766E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double4 = code.src.Distance.euclideanDistance(5.715045150481366E247d, 4.518033412506453E256d, 6.142140408070548E124d, 4.4848752944105095E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double4 = code.src.Distance.squaredDistance((-1.0d), 2.7065537201582164E49d, 5.7150451504902E247d, 6.20393819963367E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double4 = code.src.Distance.squaredDistance(2.010262836799118E256d, 9.862699982330608E244d, 3.006072569932526E128d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double4 = code.src.Distance.squaredDistance(7.590729215407016E125d, 6.520158840275344E248d, 4.5182371542091934E256d, 5.71561648966755E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double4 = code.src.Distance.euclideanDistance(0.0d, (double) (-1.0f), 5.250078299133718E247d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double4 = code.src.Distance.squaredDistance(8.69470629945289E61d, (double) (byte) 100, 6.17830490479184E248d, 140.71602609511115d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double4 = code.src.Distance.squaredDistance(1.1473791318585206E252d, 1.1438880985737782E248d, 9.324540562451319E30d, 6.922562533439975E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double4 = code.src.Distance.squaredDistance(5.791260371133755E24d, 1.203713755180189E124d, 5.039568979476821E248d, (double) 11L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        java.lang.Class<?> wildcardClass95 = longArray92.getClass();
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        long long85 = code.src.Distance.chebyshevDistance(longArray52, longArray70);
        long long86 = code.src.Distance.chebyshevDistance(longArray2, longArray70);
        java.lang.Class<?> wildcardClass87 = longArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 98L + "'", long86 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double4 = code.src.Distance.squaredDistance(3.0568118497974055E15d, 7.559791763329331E123d, 1.1801491380487327E249d, 3.0522370255297355E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double4 = code.src.Distance.euclideanDistance(8.824228056978371E247d, 3.477821790930845E62d, 5.715045104064755E247d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double4 = code.src.Distance.euclideanDistance(4.92586451367552E248d, 8.067055176895368E247d, 1.1248441811882996E99d, 3.053611124551322E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 6.922552879173873E61d, 3.631389561388303E250d, 1.5617268815501826E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double4 = code.src.Distance.euclideanDistance((double) 90L, 8.694705670079989E61d, 8.694705670079996E61d, 8.694706299423517E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.694705670080019E61d + "'", double4 == 8.694705670080019E61d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double4 = code.src.Distance.euclideanDistance(4.5182354114743835E256d, 1.1236897393274192E248d, 5.525929237201556E7d, 1.6830116762241088E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double4 = code.src.Distance.squaredDistance(1.2606142663028386E127d, 4.298224851119434E25d, 1.039575455679478E8d, 1.433158224335312E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0698339792640068E256d + "'", double4 == 2.0698339792640068E256d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double4 = code.src.Distance.euclideanDistance(4.629561777660613E248d, 3.194965507832467E124d, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double4 = code.src.Distance.squaredDistance(4.65150901809432E251d, 2.7030845353965203E124d, 1.1142495781208175E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double4 = code.src.Distance.squaredDistance((double) 90L, 8.73117060907958E61d, 0.0d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.623334020485509E123d + "'", double4 == 7.623334020485509E123d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double4 = code.src.Distance.squaredDistance(20084.432052190223d, 1.8649081799851445E31d, 5.791260371133832E24d, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.772588879245304E249d + "'", double4 == 3.772588879245304E249d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 0, (short) -1 };
        long[] longArray6 = new long[] { (short) -1, (short) -1 };
        long long7 = code.src.Distance.chebyshevDistance(longArray3, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = code.src.Distance.chebyshevDistance(longArray0, longArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double4 = code.src.Distance.squaredDistance(6.972502032003872E201d, 3.477882519775504E62d, 3.068933012127493E239d, 3.1404935889650543E122d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double4 = code.src.Distance.squaredDistance(3.0535834157458975E15d, 2.2965057957235622E247d, 1.30972997559812E124d, 8.068127213490246E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double4 = code.src.Distance.euclideanDistance(2.4389863321241504E124d, 7.559791763374577E123d, 7.876508236289523E125d, 5.497143053457335E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double4 = code.src.Distance.euclideanDistance(2.55346448847492E124d, 1.209524440947343E125d, 8.133851138224599E174d, 1552636.4832506673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double4 = code.src.Distance.euclideanDistance(4.557896970053384E248d, 7.559791544504537E125d, 8.917458244322077E62d, 5.719666280792153E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double4 = code.src.Distance.euclideanDistance(8.694706281769284E61d, 7.32543304010228E98d, 7.864154807481348E125d, 20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.864154807481348E125d + "'", double4 == 7.864154807481348E125d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double4 = code.src.Distance.squaredDistance((double) 1.0f, 2.719111392042953E123d, 1.1248441754132943E99d, 3.053611124550097E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.393566762337766E246d + "'", double4 == 7.393566762337766E246d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double4 = code.src.Distance.squaredDistance(7.5597917633235E123d, 3.0239723409974164E124d, 3.053611124543087E15d, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.715913234165533E248d + "'", double4 == 9.715913234165533E248d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double4 = code.src.Distance.euclideanDistance(5.719666280792153E251d, 6.556084846280549E12d, 7.416985483562336E245d, 8.866898431039124E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double4 = code.src.Distance.squaredDistance(3.890305409973818E124d, 2.1092217904410153E248d, 3.068933012127493E239d, 7.635389630576875E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double4 = code.src.Distance.squaredDistance(1.2637714837637312E127d, 8.694705670079996E61d, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5971183631743827E254d + "'", double4 == 1.5971183631743827E254d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double4 = code.src.Distance.squaredDistance(1.5119583526749173E124d, 1.5988706255405772E125d, 4.92586451367552E248d, 3.631389561388303E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double4 = code.src.Distance.euclideanDistance(1811672.00533166d, 2.5156683110561225E248d, 1.5377172753851527E248d, 8.99140083977295E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double4 = code.src.Distance.euclideanDistance(6.047401286148532E124d, 6.072806626010396E251d, 5.869204465969338E247d, 8.866898431039124E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double4 = code.src.Distance.squaredDistance(2.1256144767371883E128d, 9.778776737535161E212d, 4.8406811122263884E123d, 7.393563040080829E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double4 = code.src.Distance.euclideanDistance(3.772588879245304E249d, 8.05047120619714E123d, 7.677886613131662E20d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double4 = code.src.Distance.euclideanDistance(5.791260381620597E24d, 7.5597917633235E123d, 0.0d, 1.224365486934459E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.5597917633235E123d + "'", double4 == 7.5597917633235E123d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double4 = code.src.Distance.squaredDistance(3.326166438578114E248d, 6.957499817664781E61d, 3.194965507832467E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double4 = code.src.Distance.euclideanDistance(5.5259489E7d, 1.0997224744491414E32d, 8.694706299452896E61d, 8.694706299423517E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2296171569516298E62d + "'", double4 == 1.2296171569516298E62d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double4 = code.src.Distance.euclideanDistance(5.948654325219483E248d, 5.5259489E7d, 1.4579745280790234E64d, 1.0691159266556964E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double4 = code.src.Distance.squaredDistance(7.814856790247367E7d, 1.2074554820296805E32d, 4.485950827314113E256d, 7.559943432502878E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double4 = code.src.Distance.euclideanDistance(2.010262836799118E256d, 8.694706299452896E61d, 8.694706299424537E61d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double4 = code.src.Distance.euclideanDistance(5.763159931203444E251d, 5.731031078277051E251d, 6.957499817661427E61d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        long[] longArray25 = new long[] { 0, (short) -1 };
        long[] longArray28 = new long[] { (short) -1, (short) -1 };
        long long29 = code.src.Distance.chebyshevDistance(longArray25, longArray28);
        long[] longArray36 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long37 = code.src.Distance.chebyshevDistance(longArray28, longArray36);
        long long38 = code.src.Distance.chebyshevDistance(longArray2, longArray36);
        java.lang.Class<?> wildcardClass39 = longArray36.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double4 = code.src.Distance.squaredDistance(2.4805194246531137E124d, (double) (short) 100, 2.7191106511481887E123d, 6.92256251604893E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.877950885822437E248d + "'", double4 == 4.877950885822437E248d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double4 = code.src.Distance.squaredDistance(1.1341134428019932E16d, 1.8649081799851445E31d, 1.5617268815501826E62d, 1.4300949526255977E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0454154726104665E128d + "'", double4 == 2.0454154726104665E128d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double4 = code.src.Distance.euclideanDistance(3.5776180632559095E250d, 3.746054054544959E251d, 1.224365486934459E62d, 2.053509149446454E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double4 = code.src.Distance.squaredDistance(6.192735015311481E251d, 1.1416037601853007E32d, 4.793704459665872E251d, 1.917769450392853E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double4 = code.src.Distance.squaredDistance(2.0850307160336277E31d, 5.580834364125841E251d, 9.12019899331142E125d, 1.864891897920854E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double4 = code.src.Distance.euclideanDistance(3.7841059251973525E61d, 100.0d, 1.0670548273407037E252d, (double) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double4 = code.src.Distance.squaredDistance(2.742264228911255E125d, 1.3179319637108076E128d, 3.353869680772834E49d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.736952180983727E256d + "'", double4 == 1.736952180983727E256d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double4 = code.src.Distance.squaredDistance(1.511958349599839E124d, 2.125614474048533E128d, 1.060042331216179E124d, 3.1254847552549246E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double4 = code.src.Distance.euclideanDistance((double) '4', 2.769446841189903E125d, 2.8896627685601946E50d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.769446841189903E125d + "'", double4 == 2.769446841189903E125d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double4 = code.src.Distance.squaredDistance(5.604659899440947E124d, 1.5941288904220582E249d, 8.694706173607399E62d, 1.7389572568057607E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double4 = code.src.Distance.squaredDistance(8.866898431036233E62d, 1.143009020812949E248d, 6.449576703798581E175d, 5.715045104064703E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double4 = code.src.Distance.squaredDistance(1.2652744319531763E198d, (double) '4', 4.172449883594742E250d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double4 = code.src.Distance.squaredDistance(7.786590871947086E125d, 3.053611124543097E15d, 1.4272033862877643E128d, 9.324540899917549E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0147440391085077E256d + "'", double4 == 2.0147440391085077E256d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double4 = code.src.Distance.squaredDistance(4.5182371393605655E256d, 1.0486765404643798E16d, 5.715044819636229E251d, 8.030925665076586E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double4 = code.src.Distance.euclideanDistance(1.2756882071026236E198d, 8.859911358917301E125d, 4.484932138384625E256d, 278906.09975124226d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double4 = code.src.Distance.squaredDistance(1811672.00533166d, 3.353869668626517E49d, 7.56006994758633E123d, 1.891459241752112E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.583333528970715E250d + "'", double4 == 3.583333528970715E250d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double4 = code.src.Distance.squaredDistance(1.1473791318585206E252d, 3.7841059251973525E61d, 1.7583641551952374E124d, 8.694706299452407E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double4 = code.src.Distance.squaredDistance(1.0d, 2.1256901295443705E128d, 1.0670318622827465E252d, 7.862188778631282E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double4 = code.src.Distance.euclideanDistance(8.694706236541855E62d, 6.301988755686634E251d, 1.1248441754132943E99d, 1.891459241764387E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double4 = code.src.Distance.euclideanDistance(1.229617155703251E62d, 3.2900143351994137E124d, 3.7454893307807313E251d, 1.5119582431985447E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double4 = code.src.Distance.euclideanDistance(3.194965507832467E124d, 4.557896970053384E248d, 3.053611124543087E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double4 = code.src.Distance.euclideanDistance((double) 90L, 8.694706299424537E61d, 1.433158224335312E128d, 7.814856790247367E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.433158224335312E128d + "'", double4 == 1.433158224335312E128d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double4 = code.src.Distance.euclideanDistance((double) (short) 0, 6.151502905962372E30d, 7.876508236289523E125d, 7.406698157764146E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double4 = code.src.Distance.euclideanDistance(2.7234837376481807E125d, 8.793716013138559E63d, 6.191637431199285E31d, 8.6947061736074E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.7234837376481807E125d + "'", double4 == 2.7234837376481807E125d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double4 = code.src.Distance.squaredDistance(8.859911358917301E125d, 1.6830116762241088E124d, 1.4300949526255977E64d, 6.307309197813705E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double4 = code.src.Distance.euclideanDistance((double) 100.0f, 3.5776180632559095E250d, 4.4848752944105095E256d, 7.474529365309457E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double4 = code.src.Distance.squaredDistance(3.353869677235983E49d, 4.8406811122263884E123d, 4.1827840536706536E256d, 5.721223146643194E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double4 = code.src.Distance.squaredDistance(6.556084846280365E12d, 7.590729215407016E125d, 2.125614474048533E128d, 1.2637714837637312E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.5323471056617066E256d + "'", double4 == 4.5323471056617066E256d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374577E123d, 2.55346448847492E124d, 2.0450959756078844E128d, 3.7454893307807313E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double4 = code.src.Distance.squaredDistance(8.694706173607399E62d, (double) (-1.0f), 1.2606145944433818E127d, 12313.553084145538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5891491557236519E254d + "'", double4 == 1.5891491557236519E254d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double4 = code.src.Distance.euclideanDistance(1.8474736870780683E51d, 1.8914631202919207E124d, (double) (byte) 10, 1.1548101448300805E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.366529754618401E123d + "'", double4 == 7.366529754618401E123d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.877950885822437E248d, 9.324546092905923E30d, 8.694706299426871E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double4 = code.src.Distance.euclideanDistance(7.623334020485509E123d, 9.32454089993304E30d, 8.866898431039124E62d, 1.30972997559812E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.515435523161302E124d + "'", double4 == 1.515435523161302E124d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double4 = code.src.Distance.euclideanDistance(1.0670548273407037E252d, 6.556084846280549E12d, 7.710680125905936E10d, 7.850374433297587E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double4 = code.src.Distance.squaredDistance(1811717.0d, 1.918367176323824E125d, (double) (short) 100, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.6801326231966413E250d + "'", double4 == 3.6801326231966413E250d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double4 = code.src.Distance.euclideanDistance((double) (byte) -1, 10.04987562112089d, 8.841771681470747E249d, 3.0239723409974164E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double4 = code.src.Distance.squaredDistance(5.721223146643194E251d, 5.71561648966755E251d, 1.1801491380487327E249d, 1.5617268815501826E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double4 = code.src.Distance.euclideanDistance(1811707.0012909174d, 1.229617155703251E62d, 1.0852821850087336E126d, 4.546779423345663E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double4 = code.src.Distance.euclideanDistance(1.0486765404643798E16d, 1.574966483660244E62d, 3.052698722606791E15d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double4 = code.src.Distance.euclideanDistance(1.8649081799851445E31d, 2.9064639308329233E248d, 0.0d, 8.69470629942351E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        long[] longArray47 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long48 = code.src.Distance.chebyshevDistance(longArray19, longArray47);
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
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double4 = code.src.Distance.euclideanDistance(1.4561688805466475E125d, 2.4389908525564578E124d, 9.324540890451003E30d, (double) 98L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4764533763248394E125d + "'", double4 == 1.4764533763248394E125d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double4 = code.src.Distance.euclideanDistance(1.0063874635772352E61d, 1.2046853507841718E252d, 7.565603634330283E123d, 6.142140408070548E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double4 = code.src.Distance.squaredDistance(2.286018050924669E248d, 5.948654328288416E248d, 3.023916486461334E124d, 4.792187178860569E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double4 = code.src.Distance.euclideanDistance(7.661073336008042E123d, 3.201844896665003E124d, 1.5119583526749173E124d, 3.583333528970715E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double4 = code.src.Distance.squaredDistance(3.571903018105419E250d, 2.0450959756078844E128d, 7.559791763374587E123d, 8.793716013138559E63d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double4 = code.src.Distance.euclideanDistance(5.829917481072086E251d, 1.1929678955220982E32d, 0.0d, 1.4319457653113712E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double4 = code.src.Distance.squaredDistance(2.117752378578906E128d, 8.067055176895368E247d, 2.0483124887933698E256d, 5.525929037215044E7d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double4 = code.src.Distance.euclideanDistance(5.717877332771251E251d, 1.314288479667479E127d, 4.630067801207703E249d, (double) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double4 = code.src.Distance.euclideanDistance(20.0d, 7.850374433297587E251d, 1.2046853507841718E252d, 4.675240277191704E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double4 = code.src.Distance.squaredDistance(7.590729215407016E125d, 7.608198465098248E125d, 3.0621788818790405E248d, (double) 98L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double4 = code.src.Distance.squaredDistance(140.71602609511115d, 1.0695270443395895E124d, 99.41369581878968d, 4.65150901809432E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double4 = code.src.Distance.squaredDistance(7.559791763367894E123d, 8.694706299426858E61d, 8.991400839766758E43d, 3.053611069269292E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045150548505E247d + "'", double4 == 5.715045150548505E247d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double4 = code.src.Distance.euclideanDistance(3.353869668626517E49d, 5.525994208076646E7d, 1.5617254340936532E62d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.5617254340933177E62d + "'", double4 == 1.5617254340933177E62d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double4 = code.src.Distance.euclideanDistance(1.1267866439017752E64d, 0.0d, 4.347353086803702E62d, 4.518236903714711E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        java.lang.Class<?> wildcardClass86 = longArray82.getClass();
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
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        long[] longArray2 = new long[] { 0, (short) -1 };
        long[] longArray5 = new long[] { (short) -1, (short) -1 };
        long long6 = code.src.Distance.chebyshevDistance(longArray2, longArray5);
        long[] longArray9 = new long[] { 100L, 1 };
        long long10 = code.src.Distance.chebyshevDistance(longArray5, longArray9);
        long[] longArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = code.src.Distance.chebyshevDistance(longArray9, longArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 101L + "'", long10 == 101L);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double4 = code.src.Distance.squaredDistance(1.8663667958684514E31d, 1.2296178404951322E62d, 8.866898431039124E62d, 6.556084846280365E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0133847820028E125d + "'", double4 == 8.0133847820028E125d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double4 = code.src.Distance.euclideanDistance(8.341162879156255E30d, 104.0d, 7.862188778636408E125d, 7.76081660665762E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1047365604210307E126d + "'", double4 == 1.1047365604210307E126d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double4 = code.src.Distance.squaredDistance(1.102865396833695E32d, 7.862188778631282E125d, 217.94165335165133d, 12313.553084145538d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.181401239083565E251d + "'", double4 == 6.181401239083565E251d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double4 = code.src.Distance.euclideanDistance(5.78903989294274E251d, 9.144070917092657E248d, 2.3498127622806567E12d, 1.45794860122975E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double4 = code.src.Distance.squaredDistance(9.862699982330608E244d, 5.262553411785863E62d, 1.1341134428019932E16d, 8.899687221465109E59d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double4 = code.src.Distance.euclideanDistance(1.45794860122975E64d, 3.0369622360804536E124d, 8.73117060907958E61d, 1.4331582268127545E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4328545305891465E128d + "'", double4 == 1.4328545305891465E128d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double4 = code.src.Distance.euclideanDistance(7.559790668932122E123d, 8.42249655260944E125d, 3.377784400566722E241d, 7.416985483562336E245d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double4 = code.src.Distance.euclideanDistance(9.466542772834739E21d, 2.948678716579241E31d, 5.811870955696386E120d, 9.344073313646239E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.811870955696386E120d + "'", double4 == 5.811870955696386E120d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        long long82 = code.src.Distance.chebyshevDistance(longArray19, longArray79);
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double4 = code.src.Distance.euclideanDistance(12313.549023578462d, 2.719111392042953E123d, 9.79709836214289E7d, 7.77326133854061E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.719111392042953E123d + "'", double4 == 2.719111392042953E123d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double4 = code.src.Distance.euclideanDistance(9.012004300008916E249d, 5.811870955696386E120d, 6.072806626010396E251d, 9.324540562451319E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double4 = code.src.Distance.euclideanDistance(9.331617684325628E30d, 1811816.0d, 4.182924775801714E256d, 7.562847533034203E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double4 = code.src.Distance.squaredDistance(6.858438111975517E125d, (double) 98L, 7.559791763329331E123d, 7.862188778636408E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.078209334929007E252d + "'", double4 == 1.078209334929007E252d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double4 = code.src.Distance.squaredDistance(1.0691160040444007E124d, 3.439988407880217E251d, 3.053611069269292E15d, 6.449576703798581E175d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double4 = code.src.Distance.euclideanDistance(1.695194259018638E248d, 5.6508057255525505E124d, 9.324540899933299E30d, 8.05047120619714E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double4 = code.src.Distance.euclideanDistance(9.351743915519625E30d, 12313.553084145538d, 3.2973523484734863E250d, 3.02286459429887E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double4 = code.src.Distance.squaredDistance((double) (byte) 0, 2.0451715735252107E128d, 2.285850535203458E248d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double4 = code.src.Distance.euclideanDistance(1.5891491557236519E254d, 1.1341134428019932E16d, 9.79709836214289E7d, 9.324540890451003E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        java.lang.Class<?> wildcardClass31 = longArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double4 = code.src.Distance.squaredDistance(5.791260282386601E24d, 3.1254847552549246E249d, 8.116214151045995E123d, 5.262553411785863E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 0.0d, 9.715913234165533E248d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double4 = code.src.Distance.euclideanDistance(8.982275443054642E123d, 6.151508697220018E30d, 3.7454893307807313E251d, 1.7683618323195464E53d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double4 = code.src.Distance.euclideanDistance(5.714207540805018E247d, 2.2965057957235622E247d, 1.4990708455962547E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double4 = code.src.Distance.euclideanDistance(1552637.0032203277d, 4.840681090214691E123d, 9.374059300997487E248d, 3.353869680772834E49d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double4 = code.src.Distance.euclideanDistance(1.918367176323824E125d, 3.353869668626517E49d, 8.991400839766758E43d, 8.694706299452407E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.918367176323824E125d + "'", double4 == 1.918367176323824E125d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double4 = code.src.Distance.squaredDistance(2.125614474048533E128d, 2.4389863314950092E124d, 5.525928500007007E7d, 8.694866271304194E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.518236951771165E256d + "'", double4 == 4.518236951771165E256d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double4 = code.src.Distance.squaredDistance(7.568917694587279E125d, 2.1586910533487628E249d, 2.4389908525564578E124d, 3.006072569932526E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double4 = code.src.Distance.euclideanDistance((double) 1.0f, 1.2046853507841718E252d, 9882.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double4 = code.src.Distance.euclideanDistance(6.042358993280212E21d, 8.868523920159873E123d, 5.948654325219483E248d, 1811717.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double4 = code.src.Distance.squaredDistance(3.068933012127493E239d, 5.829917481072086E251d, 8.42249655260944E125d, 7.560169524654381E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double4 = code.src.Distance.euclideanDistance(8.320188026225052E30d, 7.65996356070261E125d, 3.5776180632559095E250d, 3.0568118497974055E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double4 = code.src.Distance.squaredDistance(5.715045104064703E247d, 9.012004300008916E249d, 8.084528906135836E87d, 5.869204465969338E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double4 = code.src.Distance.euclideanDistance(8.0133847820028E125d, 20084.432052190223d, 6.556084846280549E12d, 1.738941196953288E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0133847820028E125d + "'", double4 == 8.0133847820028E125d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double4 = code.src.Distance.euclideanDistance(5.5259389E7d, 4.518236903714711E256d, 3.772588879245304E249d, 1.2046853507841718E252d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double4 = code.src.Distance.squaredDistance(1.203713755180189E124d, 8.899687221465109E59d, 1.5617254340936532E62d, 5.715043495807318E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double4 = code.src.Distance.euclideanDistance(6.972502032003872E201d, 8.694706281798174E61d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        long[] longArray25 = new long[] { 0, (short) -1 };
        long[] longArray28 = new long[] { (short) -1, (short) -1 };
        long long29 = code.src.Distance.chebyshevDistance(longArray25, longArray28);
        long[] longArray36 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long37 = code.src.Distance.chebyshevDistance(longArray28, longArray36);
        long long38 = code.src.Distance.chebyshevDistance(longArray2, longArray36);
        java.lang.Class<?> wildcardClass39 = longArray2.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11L + "'", long37 == 11L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double4 = code.src.Distance.squaredDistance(4.877950885822437E248d, 1.0486765404656112E16d, 1.1047365604210307E126d, 7.40859570957669E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double4 = code.src.Distance.euclideanDistance(1.4253988300352539E128d, 7.891149462745871E255d, 1.6830116762241088E124d, 1.1958657793748695E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double4 = code.src.Distance.squaredDistance(3.321083216563934E61d, 3.053611069269292E15d, 4.753127358123107E124d, 7.565603634330283E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.316460326605626E249d + "'", double4 == 2.316460326605626E249d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double4 = code.src.Distance.squaredDistance(9.324540899933302E30d, 4.182726770879422E256d, 5.216823716746154E62d, 1.6830116762241088E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double4 = code.src.Distance.squaredDistance(1.449255956357967E248d, 1.2074554820296805E32d, 1.1048109600916608E249d, 2.3498127622806567E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double4 = code.src.Distance.euclideanDistance(1.836507598757228E249d, 1.7389572568057607E62d, 6.923658324661806E125d, 1.4319457653113712E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double4 = code.src.Distance.euclideanDistance(6.449576703798581E175d, 4.172449883594742E250d, 8.058264513507916E247d, 4.518236951771165E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double4 = code.src.Distance.euclideanDistance(8.084528906135836E87d, 3.598765218630986E247d, 8.866895281429006E62d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double4 = code.src.Distance.squaredDistance(3.0239723409974164E124d, 8.694706236541855E62d, 7.568917694587279E125d, 1.0486765404643798E16d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.280231960268402E251d + "'", double4 == 5.280231960268402E251d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double4 = code.src.Distance.euclideanDistance(1346.0d, 1.069116001870466E124d, (double) 90L, 6.188205857868469E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double4 = code.src.Distance.squaredDistance(1.917769450392853E125d, 1.380250332732779E124d, 2.948678716579241E31d, 7.559791763373738E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.681736809627178E250d + "'", double4 == 3.681736809627178E250d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double4 = code.src.Distance.euclideanDistance(3.053611124551322E15d, 5.262553411785863E62d, 6.17830490479184E248d, 7.661073336008042E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double4 = code.src.Distance.euclideanDistance(3.053533391929702E15d, 4.471374129726301E62d, 1.8648415840790313E31d, 1.602837247029983E254d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double4 = code.src.Distance.squaredDistance(4.792979223186968E123d, 2.8519907324927616E87d, 4.4848752944105095E256d, 5.948654328288416E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double4 = code.src.Distance.euclideanDistance(9.778776737535161E212d, 1.380250332732779E124d, 4.629561777660613E248d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double4 = code.src.Distance.euclideanDistance(8.976783674294438E123d, 4.471374129726301E62d, 5.952906869765997E125d, 8.991400839766758E43d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.863139033023053E125d + "'", double4 == 5.863139033023053E125d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double4 = code.src.Distance.squaredDistance(6.957499817664781E61d, 9.324540890451003E30d, 8.779875994255162E124d, 625.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.708622247449806E249d + "'", double4 == 7.708622247449806E249d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double4 = code.src.Distance.euclideanDistance(3.056811849797306E15d, 8.42249655260944E125d, 12329.400413486055d, 2.9486787165792413E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.42249655260944E125d + "'", double4 == 8.42249655260944E125d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double4 = code.src.Distance.squaredDistance(8.08452890614547E87d, 1.0486765404643798E16d, 8.116214151045995E123d, 4.347353086803702E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.587293214563927E247d + "'", double4 == 6.587293214563927E247d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double4 = code.src.Distance.squaredDistance(5.791260282386601E24d, (double) (byte) -1, 2.575569517141002E250d, 1.33937091808876E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double4 = code.src.Distance.squaredDistance(7.814857737225062E7d, (double) (short) 100, (double) (byte) 10, 8.084528906135836E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.53596076341459E175d + "'", double4 == 6.53596076341459E175d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double4 = code.src.Distance.squaredDistance(2.0234598189585263E246d, 2.286018050924408E248d, 1.433158224335312E128d, 1.314288479667479E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double4 = code.src.Distance.squaredDistance(8.694706299424537E61d, 8.69470629942351E61d, 8.341162879156255E30d, 7433.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.511958352664876E124d + "'", double4 == 1.511958352664876E124d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 4.557896970053384E248d, 5.715851632357578E251d, 5.715851632357578E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double4 = code.src.Distance.squaredDistance(2.742264228911255E125d, 5.604659899440947E124d, 0.0d, 5.797197117558862E24d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.834135227050253E250d + "'", double4 == 7.834135227050253E250d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray43, longArray54);
        long long94 = code.src.Distance.chebyshevDistance(longArray8, longArray43);
        java.lang.Class<?> wildcardClass95 = longArray43.getClass();
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
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double4 = code.src.Distance.squaredDistance(1.078209334929007E252d, 5.216823716746154E62d, 3.353869668626517E49d, 122.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double4 = code.src.Distance.squaredDistance(7.732944131972951E127d, 1.0063874635772352E61d, 8.94428757683438E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.9798424948214894E255d + "'", double4 == 5.9798424948214894E255d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        long[] longArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long72 = code.src.Distance.chebyshevDistance(longArray49, longArray71);
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
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double4 = code.src.Distance.squaredDistance(4.629561777660613E248d, 2.8896627685601946E50d, 4.172449883594742E250d, 4.518236899385757E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double4 = code.src.Distance.squaredDistance(2.4389863314950092E124d, 2.8325283023066844E248d, 5.527131618909466E7d, 2.0452199803289235E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double4 = code.src.Distance.squaredDistance(1.3415037258095196E127d, 9.368838995853397E123d, 3.0621788818790405E248d, 1552636.4832506673d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double4 = code.src.Distance.squaredDistance(3.631389561388303E250d, 5.948676378854077E248d, 2.2965057957235622E247d, 3.0522370255297355E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double4 = code.src.Distance.squaredDistance(8.341162879156251E30d, 1.2496907143570294E31d, 8.694706281769278E61d, 7.559791732623826E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045104064755E247d + "'", double4 == 5.715045104064755E247d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double4 = code.src.Distance.squaredDistance(5.52593790000923E7d, 5.262553411785863E62d, 3.772588879245304E249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double4 = code.src.Distance.squaredDistance(3.890201679850891E124d, 8.811504548015154E125d, 6.18368725714255E251d, 4.298224851119434E25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double4 = code.src.Distance.squaredDistance(5.7150451504902E247d, 8.899687221465109E59d, 2.2965057953353264E247d, 3.3662285038614664E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double4 = code.src.Distance.squaredDistance(20737.0d, (double) 0.0f, 3.439988407880217E251d, 7.393563040080829E246d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double4 = code.src.Distance.euclideanDistance(5.373609040983584E61d, 5.528905595074321E7d, 2.0698339792640068E256d, 3.772588879245304E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double4 = code.src.Distance.euclideanDistance(5.5218522892182536E247d, 8.961543206990963E43d, 5.525939237192507E7d, 9882.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        long long93 = code.src.Distance.chebyshevDistance(longArray55, longArray66);
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
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 98L + "'", long94 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double4 = code.src.Distance.euclideanDistance(2.286018050924669E248d, 1.078209334929007E252d, 1.231115082248268E64d, 1.4311155692585877E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double4 = code.src.Distance.squaredDistance((double) (short) 10, 4.9778761674495435E218d, 5.78903989294274E251d, 1.515435523161302E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double4 = code.src.Distance.euclideanDistance(1.2296178404951322E62d, 7.560169524654381E125d, 1.0807149657353284E16d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.560169524654381E125d + "'", double4 == 7.560169524654381E125d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double4 = code.src.Distance.euclideanDistance(1.1929678834484718E32d, 6.120040302792729E125d, 1.143009030111722E248d, 2.251301237575268E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double4 = code.src.Distance.squaredDistance(4.557896970053384E248d, 0.0d, 2.5156683110561225E248d, 3.477821790930845E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double4 = code.src.Distance.euclideanDistance(2.296505818800933E247d, 8.694706281769278E61d, 9.324540899982978E30d, 5.603244642552161E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double double4 = code.src.Distance.squaredDistance(5.525929037215044E7d, 5.952906869765997E125d, 8.08452890614697E87d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.54371002001072E251d + "'", double4 == 3.54371002001072E251d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double4 = code.src.Distance.euclideanDistance(6.117725723239335E125d, 1.0852821850087336E126d, 9.482299742031001E21d, 4.64617159966005E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2055760644133702E126d + "'", double4 == 1.2055760644133702E126d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374587E123d, 0.0d, 3.053611124551322E15d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.559791763374587E123d + "'", double4 == 7.559791763374587E123d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double4 = code.src.Distance.squaredDistance(1.4579746669762032E64d, 7.559791732617994E123d, 12329.400413486055d, 1.024464211209343E25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.715045104055938E247d + "'", double4 == 5.715045104055938E247d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double4 = code.src.Distance.euclideanDistance(1.7388170690697642E62d, 6.047401286148532E124d, 8.133851138224599E174d, 4.92586451367552E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double4 = code.src.Distance.euclideanDistance(1.1958657793748695E32d, 1.4272033862877643E128d, 1.864891897920854E31d, 9.324540899933247E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4272033862877643E128d + "'", double4 == 1.4272033862877643E128d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double4 = code.src.Distance.squaredDistance(2.7676045845140174E123d, 2.5573985948136816E128d, 2.884474619048523E15d, 6.922562533439975E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.540287573520957E256d + "'", double4 == 6.540287573520957E256d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double4 = code.src.Distance.euclideanDistance(4.484875220721362E256d, 3.05361112455053E15d, 1.5941288904220582E249d, 2.244907423513874E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double4 = code.src.Distance.squaredDistance(8.273174080969564E247d, 8.899687221465109E59d, 1.0997224744491414E32d, 6.17830490479184E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double4 = code.src.Distance.euclideanDistance(3.053611124543088E15d, 4.5182371393605655E256d, (double) 101L, 2.0454154726104665E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double4 = code.src.Distance.squaredDistance(3.054769716678889E15d, 0.0d, 4.92586451367552E248d, 8.694705670079996E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double4 = code.src.Distance.euclideanDistance(5.525929237201556E7d, 5.721223146643194E251d, 5.527131618909466E7d, 8.866898431039124E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double4 = code.src.Distance.euclideanDistance(3.311955036268193E63d, 1.2048272921205037E126d, 9.324535099190634E30d, 3.1271035700045434E106d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2048272921205037E126d + "'", double4 == 1.2048272921205037E126d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double4 = code.src.Distance.squaredDistance(1.2055760644133702E126d, 2.5156683110561225E248d, 10.04987562112089d, 9.324546092905923E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double double4 = code.src.Distance.euclideanDistance(3.54371002001072E251d, 1.33937091808876E127d, 7.559790668932122E123d, 1.314288479667479E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double4 = code.src.Distance.squaredDistance(4.518033412506453E256d, 4.630067801207703E249d, 1.433158224335312E128d, 5.715045104064703E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double4 = code.src.Distance.squaredDistance(5.715044985152495E251d, 4.5182371542091934E256d, 5.9798424948214894E255d, 7.447258393539782E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double4 = code.src.Distance.euclideanDistance(2.1177523428484083E128d, 6.063099723657831E251d, 0.0d, 1811816.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        long long49 = code.src.Distance.chebyshevDistance(longArray34, longArray46);
        long[] longArray52 = new long[] { 'a', 1L };
        long[] longArray55 = new long[] { 0, (short) -1 };
        long[] longArray58 = new long[] { (short) -1, (short) -1 };
        long long59 = code.src.Distance.chebyshevDistance(longArray55, longArray58);
        long long60 = code.src.Distance.chebyshevDistance(longArray52, longArray58);
        long long61 = code.src.Distance.chebyshevDistance(longArray34, longArray52);
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
        long long84 = code.src.Distance.chebyshevDistance(longArray64, longArray81);
        long long85 = code.src.Distance.chebyshevDistance(longArray34, longArray64);
        long long86 = code.src.Distance.chebyshevDistance(longArray5, longArray64);
        java.lang.Class<?> wildcardClass87 = longArray64.getClass();
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
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 98L + "'", long60 == 98L);
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
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 98L + "'", long84 == 98L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 98L + "'", long85 == 98L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 98L + "'", long86 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double4 = code.src.Distance.squaredDistance(5.71561648966755E251d, 2.2496883671214544E99d, 4.65150901809432E251d, 4.31382490545285E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.4579486012297467E64d, 1811816.0d, 3.0621788818790405E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double4 = code.src.Distance.euclideanDistance(3.477821790930845E62d, 3.053611124543087E15d, (double) 0, 2.244907423513874E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.477821790930845E62d + "'", double4 == 3.477821790930845E62d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double4 = code.src.Distance.euclideanDistance(1.33937091808876E127d, 4.1824175494475645E256d, 2.7030845353965203E124d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double4 = code.src.Distance.euclideanDistance(1.7583641551952374E124d, 7.608574040480504E125d, 3.353869677235983E49d, 8.6947061736074E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.610605585266955E125d + "'", double4 == 7.610605585266955E125d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double4 = code.src.Distance.squaredDistance(4.7921872029386884E123d, 2.0454154726104665E128d, 4.471374129726301E62d, 7.661073336008042E123d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.183411062201243E256d + "'", double4 == 4.183411062201243E256d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double4 = code.src.Distance.euclideanDistance(1.772143783377933E61d, 1.956152822910355E125d, 5.786405680011157E251d, 3.54371002001072E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double4 = code.src.Distance.euclideanDistance(1.2093895208085425E64d, 2.261894190902627E124d, 7.863642449363113E125d, 4.1811108493051547E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double4 = code.src.Distance.euclideanDistance(5.715044819636229E251d, 5.52593680000932E7d, 9.778776737535161E212d, 4.1811108493051547E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double4 = code.src.Distance.squaredDistance(1.1236897393274192E248d, 2.55346448847492E124d, 0.0d, 1.889947887669239E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double4 = code.src.Distance.squaredDistance(278906.09975124226d, 3.0535834157458975E15d, 2.5156683110561225E248d, 3.201844896665003E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double4 = code.src.Distance.euclideanDistance(8.694866271304194E61d, 7.590729215407016E125d, 9.324535099190634E30d, 8.133851138224599E174d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double4 = code.src.Distance.squaredDistance(1.143009030111722E248d, 5.715045150490167E247d, 8.0133847820028E125d, 2.1586910533487628E249d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double4 = code.src.Distance.euclideanDistance(9.951221440466418E248d, 8.69470629945289E61d, 1.864891897920854E31d, 2.888107199940184E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double4 = code.src.Distance.euclideanDistance(1.1801491380487327E249d, 9.32454089993304E30d, 4.347362196294934E62d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double4 = code.src.Distance.squaredDistance(3.05680775507396E15d, (double) 10, 1.951229426380269E125d, 2.0480917725743317E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double4 = code.src.Distance.euclideanDistance(4.792173836495848E123d, (double) 10.0f, 6.120040302792729E125d, 8.058264513507916E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
        long[] longArray89 = new long[] { 'a', 1L };
        long[] longArray92 = new long[] { 0, (short) -1 };
        long[] longArray95 = new long[] { (short) -1, (short) -1 };
        long long96 = code.src.Distance.chebyshevDistance(longArray92, longArray95);
        long long97 = code.src.Distance.chebyshevDistance(longArray89, longArray95);
        long long98 = code.src.Distance.chebyshevDistance(longArray71, longArray89);
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
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double4 = code.src.Distance.euclideanDistance(7.559791763374577E123d, 1.5649646924973942E62d, 2.1256901295443705E128d, 2.728966543133093E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.1256145491446317E128d + "'", double4 == 2.1256145491446317E128d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double4 = code.src.Distance.squaredDistance(6.540287573520957E256d, 1.1341134428019932E16d, 2.2965057957235622E247d, 2.721524969160516E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double4 = code.src.Distance.squaredDistance(3.571903018105419E250d, 0.0d, 1.231115082248268E64d, 4.182924775801714E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double4 = code.src.Distance.euclideanDistance(1.3335864706024715E248d, 1.9993186607985635E125d, 5.797197117558862E24d, 8.084528906135836E87d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double4 = code.src.Distance.squaredDistance(5.791260368077024E24d, 7.891149462745871E255d, 5.525994208076646E7d, 8.273174080969564E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double4 = code.src.Distance.squaredDistance(6.188205857868469E251d, 1.951229426380269E125d, 2.125614532971372E128d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double4 = code.src.Distance.euclideanDistance(1552636.4832506673d, 7.406698157764146E250d, 1.7874479094211152E62d, 9.374059300997487E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double4 = code.src.Distance.euclideanDistance(7.561664719340081E125d, 3.353869677235983E49d, 7.677886613131662E20d, 1.3415037258095196E127d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.3436331804825283E127d + "'", double4 == 1.3436331804825283E127d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double4 = code.src.Distance.euclideanDistance(7.608198465098248E125d, 3.05361112455053E15d, 2.010262836799118E256d, 2.742264228911255E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        long[] longArray66 = new long[] { 0, (short) -1 };
        long[] longArray69 = new long[] { (short) -1, (short) -1 };
        long long70 = code.src.Distance.chebyshevDistance(longArray66, longArray69);
        long[] longArray77 = new long[] { (byte) 0, (short) 10, 0, (byte) 1, ' ', 0L };
        long long78 = code.src.Distance.chebyshevDistance(longArray69, longArray77);
        long long79 = code.src.Distance.chebyshevDistance(longArray61, longArray77);
        // The following exception was thrown during execution in test generation
        try {
            long long80 = code.src.Distance.chebyshevDistance(longArray0, longArray61);
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
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[0, 10, 0, 1, 32, 0]");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 11L + "'", long78 == 11L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double4 = code.src.Distance.squaredDistance(0.0d, 1.1473791318585206E252d, 5.484533507010109E251d, 2.244898434111624E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double4 = code.src.Distance.euclideanDistance(8.350150916003777E100d, (double) (-1L), 1.0486765404656112E16d, 7.710682094138496E10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.350150916003777E100d + "'", double4 == 8.350150916003777E100d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double4 = code.src.Distance.squaredDistance(9.324540899918096E30d, 1.8474736870780683E51d, 1.891459241764387E125d, 4.484932138384625E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double4 = code.src.Distance.squaredDistance(7.560169524654381E125d, 6.922562533439975E61d, 2.728966543133093E124d, 1346.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.310434588680901E251d + "'", double4 == 5.310434588680901E251d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double4 = code.src.Distance.squaredDistance(8.694706299423517E61d, 8.991400839772017E43d, 2.728966543133093E124d, 1.7388170690697642E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.447258393539782E248d + "'", double4 == 7.447258393539782E248d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double4 = code.src.Distance.squaredDistance(3.1404935889650543E122d, 8.013384602956264E125d, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 6.42143426575965E251d + "'", double4 == 6.42143426575965E251d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double4 = code.src.Distance.euclideanDistance(2.406503766681E12d, 2.8519907324927616E87d, 5.719666280792153E251d, 2.0481498109123508E256d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double4 = code.src.Distance.euclideanDistance(1.4331582268127545E128d, 1.2496907143570294E31d, 10.04987562112089d, 2.9064639308329233E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double4 = code.src.Distance.squaredDistance(1.8474736870780683E51d, 104.0d, 1.574966483660244E62d, 1.143009030111722E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double4 = code.src.Distance.squaredDistance(1.0063874635772352E61d, 6.261457075442417E31d, (double) (short) 10, 3.746054054544959E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double4 = code.src.Distance.euclideanDistance(5.603244642552161E251d, 0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double4 = code.src.Distance.squaredDistance(8.42249655260944E125d, 5.715043495807318E247d, 3.7841059251973525E61d, 9.59807360434958E15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double4 = code.src.Distance.squaredDistance(0.0d, 9.59807360434958E15d, 3.3301680419024496E128d, 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1090019187308395E257d + "'", double4 == 1.1090019187308395E257d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double4 = code.src.Distance.squaredDistance(6.922552879173873E61d, 4.8406811122263884E123d, 5.373609040983584E61d, 2.3432193417162093E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double4 = code.src.Distance.euclideanDistance(4.9778761674495435E218d, 5.5218522892182536E247d, 7.608574040480504E125d, 1.1929678955220982E32d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double4 = code.src.Distance.squaredDistance(2.2194288710556866E124d, 1.462949373248983E250d, 1.2756882071026236E198d, 2.1256141238277748E128d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double4 = code.src.Distance.euclideanDistance(1.5377172753851527E248d, 9.137715554420027E30d, 1.6432333679662337E252d, 1.864891897920854E31d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double4 = code.src.Distance.squaredDistance(2.053509149446454E256d, 2.1177523428484083E128d, 1.5617254340936532E62d, 1.0695270443395895E124d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double4 = code.src.Distance.squaredDistance(5.501575976011727E124d, 7.876508236289523E125d, 1.7389572568057607E62d, 3.0918445022754607E248d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double4 = code.src.Distance.euclideanDistance(2.8519907324927616E87d, 2.1256141238277748E128d, 1.314288479667479E127d, 1.43186707723895E64d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.129673436349805E128d + "'", double4 == 2.129673436349805E128d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double4 = code.src.Distance.euclideanDistance(8.69470629945289E61d, 1.231115082248268E64d, 9.778776737535161E212d, 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double4 = code.src.Distance.squaredDistance(3.8265338665801504E250d, 4.92586451367552E248d, 7.76081660665762E125d, 5.715851632357578E251d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double4 = code.src.Distance.euclideanDistance(2.24721340011667E248d, 2.166084616081951E249d, 2.3432186456900772E247d, 9.324540890451003E30d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double4 = code.src.Distance.euclideanDistance(0.0d, 1346.0d, 5.720993474013094E251d, 6.957500350144719E61d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double4 = code.src.Distance.euclideanDistance(2.0850307160336277E31d, 1.4328545305891465E128d, 7.710682094138496E10d, 7.656605268811053E125d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4251979253203356E128d + "'", double4 == 1.4251979253203356E128d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double4 = code.src.Distance.squaredDistance(8.779875994255162E124d, 7.56006994758633E123d, 0.0d, 3.583333528970715E250d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double4 = code.src.Distance.euclideanDistance(4.717807507424959E124d, 6.922562533439975E61d, 3.890201679850891E124d, 2.406501954865E12d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.27605827574068E123d + "'", double4 == 8.27605827574068E123d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double4 = code.src.Distance.squaredDistance(1.4319457653113712E123d, 1.1548101448300805E124d, 4.1827267651555864E256d, (double) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double4 = code.src.Distance.euclideanDistance(5.948654328288416E248d, 7.864154807481348E125d, 7.821589175633897E62d, 9.386961461524785E62d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double4 = code.src.Distance.euclideanDistance(1.1142495781208175E62d, 0.0d, 7.677886613131662E20d, 5.715045150481383E247d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + Double.POSITIVE_INFINITY + "'", double4 == Double.POSITIVE_INFINITY);
    }
}

