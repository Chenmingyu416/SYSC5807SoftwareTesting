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
        code.src.Complex complex2 = code.src.Complex.polar((double) (byte) -1, (double) 100);
        complex2.real = 214103.03051482156d;
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        code.src.Complex complex2 = code.src.Complex.polar(28.09571990514327d, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        code.src.Complex complex2 = new code.src.Complex(276650.8031134174d, 1438.2276704763435d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        code.src.Complex complex2 = code.src.Complex.polar(437.56491210010614d, 28.09571990514327d);
        code.src.Complex complex5 = code.src.Complex.polar(5225.935322982863d, 42.5836761798258d);
        complex5.imaginary = 327.11773840932915d;
        code.src.Complex complex8 = complex2.add(complex5);
        java.lang.Class<?> wildcardClass9 = complex5.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        code.src.Complex complex2 = new code.src.Complex((double) (byte) 100, (double) 'a');
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        double double10 = complex8.imaginary;
        java.lang.String str11 = complex8.toString();
        code.src.Complex complex12 = complex2.sub(complex8);
        complex2.real = 1051.4948429356753d;
        double double15 = complex2.abs();
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        java.lang.String str23 = complex18.toString();
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        code.src.Complex complex31 = complex18.add(complex30);
        code.src.Complex complex34 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex37 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex38 = complex34.multiply(complex37);
        java.lang.String str39 = complex34.toString();
        code.src.Complex complex42 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex45 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex46 = complex42.multiply(complex45);
        code.src.Complex complex47 = complex34.add(complex46);
        code.src.Complex complex48 = complex31.add(complex47);
        code.src.Complex complex49 = new code.src.Complex();
        code.src.Complex complex50 = complex48.add(complex49);
        double double51 = complex48.imaginary;
        code.src.Complex complex52 = complex2.add(complex48);
        java.lang.String str53 = complex52.toString();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 43.756491210010616d + "'", double10 == 43.756491210010616d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str11, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1055.9594711542297d + "'", double15 == 1055.9594711542297d);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10.0,0.0)" + "'", str23, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(10.0,0.0)" + "'", str39, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 875.1298242002123d + "'", double51 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(1633.4092410385406,972.1298242002123)" + "'", str53, "(1633.4092410385406,972.1298242002123)");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        java.lang.String str23 = complex18.toString();
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        code.src.Complex complex31 = complex18.add(complex30);
        code.src.Complex complex32 = complex15.add(complex31);
        java.lang.String str33 = complex15.toString();
        code.src.Complex complex36 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex36.imaginary = (short) 0;
        java.lang.String str39 = complex36.toString();
        code.src.Complex complex40 = complex15.sub(complex36);
        double double41 = complex36.abs();
        code.src.Complex complex44 = new code.src.Complex((double) ' ', (-213613.9212426372d));
        complex44.imaginary = 100.0f;
        code.src.Complex complex47 = complex36.sub(complex44);
        double double48 = complex47.real;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10.0,0.0)" + "'", str23, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str33, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(-0.0,0.0)" + "'", str39, "(-0.0,0.0)");
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-32.0d) + "'", double48 == (-32.0d));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        code.src.Complex complex2 = new code.src.Complex(290.95719905143267d, 97.0d);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        double double36 = complex18.real;
        code.src.Complex complex39 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double40 = complex39.abs();
        double double41 = complex39.real;
        code.src.Complex complex44 = new code.src.Complex(10.0d, 875.1298242002123d);
        code.src.Complex complex45 = complex39.multiply(complex44);
        complex44.real = 0.0d;
        code.src.Complex complex48 = complex18.sub(complex44);
        code.src.Complex complex49 = complex2.add(complex48);
        double double50 = complex49.abs();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 290.95719905143267d + "'", double36 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 52.0d + "'", double40 == 52.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 28.09571990514327d + "'", double41 == 28.09571990514327d);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 674.2468584080856d + "'", double50 == 674.2468584080856d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        code.src.Complex complex0 = new code.src.Complex();
        code.src.Complex complex3 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex6 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex7 = complex3.multiply(complex6);
        java.lang.String str8 = complex3.toString();
        code.src.Complex complex11 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex14 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex15 = complex11.multiply(complex14);
        code.src.Complex complex16 = complex3.add(complex15);
        code.src.Complex complex19 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex22 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex23 = complex19.multiply(complex22);
        java.lang.String str24 = complex19.toString();
        code.src.Complex complex27 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex30 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex31 = complex27.multiply(complex30);
        code.src.Complex complex32 = complex19.add(complex31);
        code.src.Complex complex33 = complex16.add(complex32);
        double double34 = complex33.real;
        code.src.Complex complex35 = complex0.multiply(complex33);
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        java.lang.String str43 = complex38.toString();
        code.src.Complex complex46 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex49 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex50 = complex46.multiply(complex49);
        code.src.Complex complex51 = complex38.add(complex50);
        code.src.Complex complex54 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex57 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex58 = complex54.multiply(complex57);
        java.lang.String str59 = complex54.toString();
        code.src.Complex complex62 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex65 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex66 = complex62.multiply(complex65);
        code.src.Complex complex67 = complex54.add(complex66);
        code.src.Complex complex68 = complex51.add(complex67);
        java.lang.String str69 = complex51.toString();
        double double70 = complex51.abs();
        code.src.Complex complex71 = complex0.multiply(complex51);
        double double72 = complex51.imaginary;
        complex51.real = 1;
        complex51.real = 67383.44940348352d;
        code.src.Complex complex79 = new code.src.Complex((double) (byte) 100, (double) 'a');
        code.src.Complex complex82 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex85 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex86 = complex82.multiply(complex85);
        double double87 = complex85.imaginary;
        java.lang.String str88 = complex85.toString();
        code.src.Complex complex89 = complex79.sub(complex85);
        java.lang.String str90 = complex79.toString();
        code.src.Complex complex91 = complex51.sub(complex79);
        code.src.Complex complex94 = code.src.Complex.polar(354618.7620473047d, (-90.0d));
        code.src.Complex complex95 = complex91.add(complex94);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(10.0,0.0)" + "'", str8, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(10.0,0.0)" + "'", str24, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 581.9143981028653d + "'", double34 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(10.0,0.0)" + "'", str43, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(10.0,0.0)" + "'", str59, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str69, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 525.4704025737593d + "'", double70 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 437.56491210010614d + "'", double72 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 43.756491210010616d + "'", double87 == 43.756491210010616d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str88, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "(100.0,97.0)" + "'", str90, "(100.0,97.0)");
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertNotNull(complex95);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        code.src.Complex complex2 = new code.src.Complex((double) (byte) 1, (double) (-1.0f));
        complex2.imaginary = (byte) 1;
        complex2.imaginary = 811.5511719071119d;
        double double7 = complex2.abs();
        code.src.Complex complex8 = new code.src.Complex();
        complex8.real = 1L;
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        java.lang.String str18 = complex13.toString();
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        code.src.Complex complex26 = complex13.add(complex25);
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        java.lang.String str34 = complex29.toString();
        code.src.Complex complex37 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex40 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex41 = complex37.multiply(complex40);
        code.src.Complex complex42 = complex29.add(complex41);
        code.src.Complex complex43 = complex26.add(complex42);
        code.src.Complex complex44 = complex8.add(complex43);
        double double45 = complex44.real;
        code.src.Complex complex48 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex51 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex52 = complex48.multiply(complex51);
        code.src.Complex complex53 = complex44.sub(complex51);
        code.src.Complex complex56 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex57 = complex51.add(complex56);
        code.src.Complex complex60 = new code.src.Complex((double) 10L, (double) '#');
        code.src.Complex complex61 = complex56.add(complex60);
        complex56.real = 43.756491210010616d;
        complex56.imaginary = 100.0d;
        complex56.imaginary = (-317.11773840932915d);
        code.src.Complex complex70 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex73 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex74 = complex70.multiply(complex73);
        java.lang.String str75 = complex70.toString();
        code.src.Complex complex78 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex81 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex82 = complex78.multiply(complex81);
        code.src.Complex complex83 = complex70.add(complex82);
        code.src.Complex complex84 = complex56.multiply(complex82);
        complex82.imaginary = (-1.0d);
        code.src.Complex complex87 = complex2.sub(complex82);
        complex2.real = 478.9437931522631d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 811.5517880109727d + "'", double7 == 811.5517880109727d);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(10.0,0.0)" + "'", str18, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(10.0,0.0)" + "'", str34, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 582.9143981028653d + "'", double45 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(10.0,0.0)" + "'", str75, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex87);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        code.src.Complex complex2 = code.src.Complex.polar(483.75822480116756d, 517.6532504767864d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        code.src.Complex complex2 = new code.src.Complex(291.13071236105446d, 109.15415943981125d);
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        code.src.Complex complex2 = code.src.Complex.polar(141.42842712835352d, 834.4460041012325d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        code.src.Complex complex2 = code.src.Complex.polar((-1120.0d), 112.71202242884297d);
        java.lang.String str3 = complex2.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1037.8824954794172,420.9512151988844)" + "'", str3, "(-1037.8824954794172,420.9512151988844)");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        code.src.Complex complex2 = new code.src.Complex(907.1298242002123d, (-35.0d));
        code.src.Complex complex5 = code.src.Complex.polar(10.0d, (double) '4');
        double double6 = complex5.imaginary;
        code.src.Complex complex9 = new code.src.Complex((double) (short) 0, (double) ' ');
        code.src.Complex complex10 = new code.src.Complex();
        complex10.real = 1L;
        code.src.Complex complex15 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex18 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex19 = complex15.multiply(complex18);
        java.lang.String str20 = complex15.toString();
        code.src.Complex complex23 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex26 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex27 = complex23.multiply(complex26);
        code.src.Complex complex28 = complex15.add(complex27);
        code.src.Complex complex31 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex34 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex35 = complex31.multiply(complex34);
        java.lang.String str36 = complex31.toString();
        code.src.Complex complex39 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex42 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex43 = complex39.multiply(complex42);
        code.src.Complex complex44 = complex31.add(complex43);
        code.src.Complex complex45 = complex28.add(complex44);
        code.src.Complex complex46 = complex10.add(complex45);
        code.src.Complex complex47 = complex9.add(complex45);
        code.src.Complex complex50 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex53 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex54 = complex50.multiply(complex53);
        double double55 = complex53.imaginary;
        java.lang.String str56 = complex53.toString();
        code.src.Complex complex59 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double60 = complex59.abs();
        double double61 = complex59.real;
        code.src.Complex complex62 = complex53.sub(complex59);
        code.src.Complex complex63 = complex45.sub(complex53);
        double double64 = complex45.real;
        code.src.Complex complex65 = complex5.multiply(complex45);
        code.src.Complex complex66 = complex2.add(complex45);
        complex2.real = (-43.756491210010616d);
        code.src.Complex complex71 = new code.src.Complex(663.590879631022d, 43.756491210010616d);
        complex71.imaginary = '#';
        code.src.Complex complex76 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex79 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex80 = complex76.multiply(complex79);
        java.lang.String str81 = complex76.toString();
        code.src.Complex complex84 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex87 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex88 = complex84.multiply(complex87);
        code.src.Complex complex89 = complex76.add(complex88);
        double double90 = complex76.abs();
        code.src.Complex complex91 = complex71.add(complex76);
        code.src.Complex complex92 = complex2.add(complex71);
        double double93 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.866275920404853d + "'", double6 == 9.866275920404853d);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(10.0,0.0)" + "'", str20, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(10.0,0.0)" + "'", str36, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 43.756491210010616d + "'", double55 == 43.756491210010616d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str56, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 28.09571990514327d + "'", double61 == 28.09571990514327d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 581.9143981028653d + "'", double64 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "(10.0,0.0)" + "'", str81, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complex92);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-35.0d) + "'", double93 == (-35.0d));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        code.src.Complex complex2 = new code.src.Complex(36.41428291206625d, 276080.4779057942d);
        complex2.real = 307.6491606976328d;
        double double5 = complex2.real;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 307.6491606976328d + "'", double5 == 307.6491606976328d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        code.src.Complex complex0 = new code.src.Complex();
        complex0.real = 1L;
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex0.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex36.sub(complex43);
        code.src.Complex complex48 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex49 = complex43.add(complex48);
        double double50 = complex43.real;
        code.src.Complex complex53 = new code.src.Complex((double) 10L, 0.0d);
        double double54 = complex53.real;
        double double55 = complex53.imaginary;
        code.src.Complex complex56 = complex43.multiply(complex53);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 582.9143981028653d + "'", double37 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 28.09571990514327d + "'", double50 == 28.09571990514327d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        code.src.Complex complex2 = code.src.Complex.polar(904.2902405342309d, 939.1298242002123d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex2.add(complex18);
        code.src.Complex complex39 = code.src.Complex.polar((double) 100.0f, (double) 10.0f);
        double double40 = complex39.imaginary;
        double double41 = complex39.imaginary;
        code.src.Complex complex42 = complex18.sub(complex39);
        code.src.Complex complex45 = code.src.Complex.polar((double) ' ', 100.00499987500625d);
        code.src.Complex complex46 = complex18.multiply(complex45);
        java.lang.Class<?> wildcardClass47 = complex18.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-54.40211108893698d) + "'", double40 == (-54.40211108893698d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-54.40211108893698d) + "'", double41 == (-54.40211108893698d));
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        code.src.Complex complex2 = code.src.Complex.polar((double) (byte) 10, 10.0d);
        code.src.Complex complex5 = code.src.Complex.polar((-317.11773840932915d), (double) (-1.0f));
        code.src.Complex complex6 = new code.src.Complex();
        complex6.real = 1L;
        code.src.Complex complex11 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex14 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex15 = complex11.multiply(complex14);
        java.lang.String str16 = complex11.toString();
        code.src.Complex complex19 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex22 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex23 = complex19.multiply(complex22);
        code.src.Complex complex24 = complex11.add(complex23);
        code.src.Complex complex27 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex30 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex31 = complex27.multiply(complex30);
        java.lang.String str32 = complex27.toString();
        code.src.Complex complex35 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex38 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex39 = complex35.multiply(complex38);
        code.src.Complex complex40 = complex27.add(complex39);
        code.src.Complex complex41 = complex24.add(complex40);
        code.src.Complex complex42 = complex6.add(complex41);
        double double43 = complex42.real;
        code.src.Complex complex46 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex49 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex50 = complex46.multiply(complex49);
        code.src.Complex complex51 = complex42.sub(complex49);
        double double52 = complex42.imaginary;
        code.src.Complex complex53 = complex5.sub(complex42);
        double double54 = complex42.imaginary;
        double double55 = complex42.imaginary;
        double double56 = complex42.imaginary;
        code.src.Complex complex57 = complex2.add(complex42);
        double double58 = complex57.abs();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(10.0,0.0)" + "'", str16, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(10.0,0.0)" + "'", str32, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 582.9143981028653d + "'", double43 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 875.1298242002123d + "'", double52 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 875.1298242002123d + "'", double54 == 875.1298242002123d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 875.1298242002123d + "'", double55 == 875.1298242002123d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 875.1298242002123d + "'", double56 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1042.3231193976783d + "'", double58 == 1042.3231193976783d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        code.src.Complex complex2 = code.src.Complex.polar(663.590879631022d, (double) (byte) 100);
        code.src.Complex complex3 = new code.src.Complex();
        code.src.Complex complex6 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex9 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex10 = complex6.multiply(complex9);
        java.lang.String str11 = complex6.toString();
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        code.src.Complex complex19 = complex6.add(complex18);
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        java.lang.String str27 = complex22.toString();
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        code.src.Complex complex35 = complex22.add(complex34);
        code.src.Complex complex36 = complex19.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex38 = complex3.multiply(complex36);
        code.src.Complex complex41 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex44 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex45 = complex41.multiply(complex44);
        java.lang.String str46 = complex41.toString();
        code.src.Complex complex49 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex52 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex53 = complex49.multiply(complex52);
        code.src.Complex complex54 = complex41.add(complex53);
        code.src.Complex complex57 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex60 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex61 = complex57.multiply(complex60);
        java.lang.String str62 = complex57.toString();
        code.src.Complex complex65 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex68 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex69 = complex65.multiply(complex68);
        code.src.Complex complex70 = complex57.add(complex69);
        code.src.Complex complex71 = complex54.add(complex70);
        java.lang.String str72 = complex54.toString();
        double double73 = complex54.abs();
        code.src.Complex complex74 = complex3.multiply(complex54);
        code.src.Complex complex77 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex77.imaginary = (short) 0;
        complex77.real = 525.4704025737593d;
        double double82 = complex77.real;
        code.src.Complex complex83 = complex54.add(complex77);
        code.src.Complex complex84 = complex2.multiply(complex77);
        complex2.imaginary = 279.95719905143267d;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(10.0,0.0)" + "'", str11, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(10.0,0.0)" + "'", str27, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 581.9143981028653d + "'", double37 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(10.0,0.0)" + "'", str46, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(10.0,0.0)" + "'", str62, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str72, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 525.4704025737593d + "'", double73 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 525.4704025737593d + "'", double82 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        code.src.Complex complex2 = new code.src.Complex(27.594203913205885d, 430.3716436914759d);
        complex2.imaginary = 213613.92147670433d;
        code.src.Complex complex7 = code.src.Complex.polar(214489.24976920983d, (-36073.24762350389d));
        code.src.Complex complex8 = complex2.sub(complex7);
        double double9 = complex7.abs();
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 214489.24976920983d + "'", double9 == 214489.24976920983d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        double double16 = complex15.real;
        code.src.Complex complex19 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex22 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex23 = complex19.multiply(complex22);
        double double24 = complex23.imaginary;
        code.src.Complex complex25 = complex15.sub(complex23);
        code.src.Complex complex28 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex31 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex32 = complex28.multiply(complex31);
        code.src.Complex complex35 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex38 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex39 = complex35.multiply(complex38);
        java.lang.String str40 = complex35.toString();
        code.src.Complex complex43 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex46 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex47 = complex43.multiply(complex46);
        code.src.Complex complex48 = complex35.add(complex47);
        code.src.Complex complex51 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex54 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex55 = complex51.multiply(complex54);
        java.lang.String str56 = complex51.toString();
        code.src.Complex complex59 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex62 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex63 = complex59.multiply(complex62);
        code.src.Complex complex64 = complex51.add(complex63);
        code.src.Complex complex65 = complex48.add(complex64);
        code.src.Complex complex68 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex71 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex72 = complex68.multiply(complex71);
        code.src.Complex complex73 = complex48.sub(complex68);
        code.src.Complex complex74 = complex31.add(complex73);
        code.src.Complex complex75 = complex25.add(complex31);
        java.lang.String str76 = complex31.toString();
        double double77 = complex31.imaginary;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 290.95719905143267d + "'", double16 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 437.56491210010614d + "'", double24 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(10.0,0.0)" + "'", str40, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(10.0,0.0)" + "'", str56, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str76, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 43.756491210010616d + "'", double77 == 43.756491210010616d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        code.src.Complex complex2 = new code.src.Complex((double) 100, (double) 10.0f);
        complex2.imaginary = 100L;
        code.src.Complex complex7 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex10 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex11 = complex7.multiply(complex10);
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        java.lang.String str19 = complex14.toString();
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        code.src.Complex complex27 = complex14.add(complex26);
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        java.lang.String str35 = complex30.toString();
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        code.src.Complex complex43 = complex30.add(complex42);
        code.src.Complex complex44 = complex27.add(complex43);
        code.src.Complex complex47 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex50 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex51 = complex47.multiply(complex50);
        code.src.Complex complex52 = complex27.sub(complex47);
        code.src.Complex complex53 = complex10.add(complex52);
        code.src.Complex complex54 = complex2.multiply(complex52);
        code.src.Complex complex57 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex60 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex61 = complex57.multiply(complex60);
        double double62 = complex61.imaginary;
        java.lang.String str63 = complex61.toString();
        java.lang.String str64 = complex61.toString();
        code.src.Complex complex65 = complex52.sub(complex61);
        complex52.real = (-213613.9212426372d);
        double double68 = complex52.abs();
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(10.0,0.0)" + "'", str19, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(10.0,0.0)" + "'", str35, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 437.56491210010614d + "'", double62 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str63, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str64, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 213614.36939426127d + "'", double68 == 213614.36939426127d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        code.src.Complex complex2 = code.src.Complex.polar(0.0d, (double) (short) -1);
        complex2.imaginary = (short) 100;
        code.src.Complex complex7 = new code.src.Complex((double) (short) 10, (-317.11773840932915d));
        code.src.Complex complex10 = code.src.Complex.polar(28.09571990514327d, (double) 0);
        code.src.Complex complex11 = new code.src.Complex();
        complex11.real = 1L;
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        java.lang.String str21 = complex16.toString();
        code.src.Complex complex24 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex27 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex28 = complex24.multiply(complex27);
        code.src.Complex complex29 = complex16.add(complex28);
        code.src.Complex complex32 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex35 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex36 = complex32.multiply(complex35);
        java.lang.String str37 = complex32.toString();
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex32.add(complex44);
        code.src.Complex complex46 = complex29.add(complex45);
        code.src.Complex complex47 = complex11.add(complex46);
        double double48 = complex47.real;
        code.src.Complex complex49 = complex10.add(complex47);
        code.src.Complex complex50 = complex7.multiply(complex49);
        double double51 = complex7.imaginary;
        code.src.Complex complex54 = code.src.Complex.polar(1.4142135623730951d, 213623.9212426372d);
        code.src.Complex complex55 = complex7.add(complex54);
        code.src.Complex complex56 = complex2.multiply(complex7);
        complex56.imaginary = 5.733935704569432d;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(10.0,0.0)" + "'", str21, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(10.0,0.0)" + "'", str37, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 582.9143981028653d + "'", double48 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-317.11773840932915d) + "'", double51 == (-317.11773840932915d));
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        double double7 = complex6.imaginary;
        java.lang.String str8 = complex6.toString();
        java.lang.String str9 = complex6.toString();
        code.src.Complex complex12 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex15 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex16 = complex12.multiply(complex15);
        java.lang.String str17 = complex12.toString();
        code.src.Complex complex20 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex23 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex24 = complex20.multiply(complex23);
        code.src.Complex complex25 = complex12.add(complex24);
        code.src.Complex complex28 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex31 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex32 = complex28.multiply(complex31);
        java.lang.String str33 = complex28.toString();
        code.src.Complex complex36 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex39 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex40 = complex36.multiply(complex39);
        code.src.Complex complex41 = complex28.add(complex40);
        code.src.Complex complex42 = complex25.add(complex41);
        java.lang.String str43 = complex25.toString();
        code.src.Complex complex46 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex46.imaginary = (short) 0;
        java.lang.String str49 = complex46.toString();
        code.src.Complex complex50 = complex25.sub(complex46);
        code.src.Complex complex51 = complex6.sub(complex46);
        code.src.Complex complex54 = code.src.Complex.polar(28.09571990514327d, (-213613.9212426372d));
        complex54.real = 1;
        code.src.Complex complex57 = complex51.multiply(complex54);
        java.lang.String str58 = complex57.toString();
        double double59 = complex57.abs();
        double double60 = complex57.imaginary;
        java.lang.String str61 = complex57.toString();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 437.56491210010614d + "'", double7 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str8, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str9, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(10.0,0.0)" + "'", str17, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(10.0,0.0)" + "'", str33, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str43, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(-0.0,0.0)" + "'", str49, "(-0.0,0.0)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(-11654.411539903023,8101.177047836208)" + "'", str58, "(-11654.411539903023,8101.177047836208)");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 14193.462505738793d + "'", double59 == 14193.462505738793d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 8101.177047836208d + "'", double60 == 8101.177047836208d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(-11654.411539903023,8101.177047836208)" + "'", str61, "(-11654.411539903023,8101.177047836208)");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        code.src.Complex complex2 = new code.src.Complex((-62.41366882039954d), 0.0d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        complex2.imaginary = (-1.0f);
        double double18 = complex2.real;
        double double19 = complex2.real;
        complex2.imaginary = 141.4213562373095d;
        code.src.Complex complex24 = new code.src.Complex((double) (byte) 1, (double) (-1.0f));
        complex24.imaginary = (byte) 1;
        code.src.Complex complex27 = complex2.multiply(complex24);
        double double28 = complex2.abs();
        code.src.Complex complex31 = code.src.Complex.polar((double) (short) 10, (double) (-1));
        code.src.Complex complex34 = new code.src.Complex(87.48639198643185d, (-35.0d));
        code.src.Complex complex35 = complex31.multiply(complex34);
        code.src.Complex complex36 = complex2.multiply(complex31);
        double double37 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 141.77446878757826d + "'", double28 == 141.77446878757826d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 141.4213562373095d + "'", double37 == 141.4213562373095d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        code.src.Complex complex2 = code.src.Complex.polar(52.0d, (-317.11773840932915d));
        complex2.imaginary = 865.1298242002123d;
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        code.src.Complex complex2 = code.src.Complex.polar((double) (-1), (double) (short) 10);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex13.real = 10;
        code.src.Complex complex16 = complex5.multiply(complex13);
        code.src.Complex complex19 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex20 = new code.src.Complex();
        complex20.real = 1L;
        code.src.Complex complex25 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex28 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex29 = complex25.multiply(complex28);
        java.lang.String str30 = complex25.toString();
        code.src.Complex complex33 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex36 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex37 = complex33.multiply(complex36);
        code.src.Complex complex38 = complex25.add(complex37);
        code.src.Complex complex41 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex44 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex45 = complex41.multiply(complex44);
        java.lang.String str46 = complex41.toString();
        code.src.Complex complex49 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex52 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex53 = complex49.multiply(complex52);
        code.src.Complex complex54 = complex41.add(complex53);
        code.src.Complex complex55 = complex38.add(complex54);
        code.src.Complex complex56 = complex20.add(complex55);
        double double57 = complex56.real;
        code.src.Complex complex60 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex63 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex64 = complex60.multiply(complex63);
        code.src.Complex complex65 = complex56.sub(complex63);
        double double66 = complex56.imaginary;
        code.src.Complex complex67 = complex19.sub(complex56);
        code.src.Complex complex68 = complex13.add(complex19);
        code.src.Complex complex69 = complex2.multiply(complex68);
        complex2.imaginary = 0.0d;
        java.lang.String str72 = complex2.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(10.0,0.0)" + "'", str30, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(10.0,0.0)" + "'", str46, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 582.9143981028653d + "'", double57 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 875.1298242002123d + "'", double66 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(0.8390715290764524,0.0)" + "'", str72, "(0.8390715290764524,0.0)");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        code.src.Complex complex9 = new code.src.Complex((double) 100, (double) 10.0f);
        complex9.real = (byte) 1;
        complex9.imaginary = (short) 100;
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        java.lang.String str21 = complex16.toString();
        code.src.Complex complex24 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex27 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex28 = complex24.multiply(complex27);
        code.src.Complex complex29 = complex16.add(complex28);
        double double30 = complex29.real;
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex29.multiply(complex33);
        code.src.Complex complex35 = complex9.multiply(complex29);
        code.src.Complex complex36 = complex2.sub(complex29);
        java.lang.String str37 = complex2.toString();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(10.0,0.0)" + "'", str21, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 290.95719905143267d + "'", double30 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(10.0,0.0)" + "'", str37, "(10.0,0.0)");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        java.lang.String str23 = complex18.toString();
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        code.src.Complex complex31 = complex18.add(complex30);
        code.src.Complex complex32 = complex15.add(complex31);
        double double33 = complex32.real;
        code.src.Complex complex36 = code.src.Complex.polar((double) (byte) 100, 582.9143981028653d);
        code.src.Complex complex37 = complex32.sub(complex36);
        complex37.real = 'a';
        code.src.Complex complex42 = code.src.Complex.polar((-317.11773840932915d), (double) (-1.0f));
        code.src.Complex complex43 = new code.src.Complex();
        complex43.real = 1L;
        code.src.Complex complex48 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex51 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex52 = complex48.multiply(complex51);
        java.lang.String str53 = complex48.toString();
        code.src.Complex complex56 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex59 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex60 = complex56.multiply(complex59);
        code.src.Complex complex61 = complex48.add(complex60);
        code.src.Complex complex64 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex67 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex68 = complex64.multiply(complex67);
        java.lang.String str69 = complex64.toString();
        code.src.Complex complex72 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex75 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex76 = complex72.multiply(complex75);
        code.src.Complex complex77 = complex64.add(complex76);
        code.src.Complex complex78 = complex61.add(complex77);
        code.src.Complex complex79 = complex43.add(complex78);
        double double80 = complex79.real;
        code.src.Complex complex83 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex86 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex87 = complex83.multiply(complex86);
        code.src.Complex complex88 = complex79.sub(complex86);
        double double89 = complex79.imaginary;
        code.src.Complex complex90 = complex42.sub(complex79);
        code.src.Complex complex93 = new code.src.Complex(290.95719905143267d, (-213613.9212426372d));
        code.src.Complex complex94 = complex79.sub(complex93);
        code.src.Complex complex95 = complex37.multiply(complex94);
        double double96 = complex94.imaginary;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10.0,0.0)" + "'", str23, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 581.9143981028653d + "'", double33 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(10.0,0.0)" + "'", str53, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(10.0,0.0)" + "'", str69, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 582.9143981028653d + "'", double80 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 875.1298242002123d + "'", double89 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertNotNull(complex95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 214489.05106683742d + "'", double96 == 214489.05106683742d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex10.real = 10;
        code.src.Complex complex13 = complex2.multiply(complex10);
        code.src.Complex complex16 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex17 = new code.src.Complex();
        complex17.real = 1L;
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        java.lang.String str27 = complex22.toString();
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        code.src.Complex complex35 = complex22.add(complex34);
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        java.lang.String str43 = complex38.toString();
        code.src.Complex complex46 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex49 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex50 = complex46.multiply(complex49);
        code.src.Complex complex51 = complex38.add(complex50);
        code.src.Complex complex52 = complex35.add(complex51);
        code.src.Complex complex53 = complex17.add(complex52);
        double double54 = complex53.real;
        code.src.Complex complex57 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex60 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex61 = complex57.multiply(complex60);
        code.src.Complex complex62 = complex53.sub(complex60);
        double double63 = complex53.imaginary;
        code.src.Complex complex64 = complex16.sub(complex53);
        code.src.Complex complex65 = complex10.add(complex16);
        code.src.Complex complex68 = code.src.Complex.polar((double) 100, 0.0d);
        code.src.Complex complex69 = complex16.add(complex68);
        complex68.real = 12.036599186399485d;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(10.0,0.0)" + "'", str27, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(10.0,0.0)" + "'", str43, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 582.9143981028653d + "'", double54 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 875.1298242002123d + "'", double63 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        code.src.Complex complex2 = code.src.Complex.polar((double) (short) -1, (-317.11773840932915d));
        code.src.Complex complex5 = code.src.Complex.polar(1077.733215908709d, 291.95719905143267d);
        code.src.Complex complex6 = complex2.sub(complex5);
        double double7 = complex5.real;
        double double8 = complex5.real;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1053.8497775511216d) + "'", double7 == (-1053.8497775511216d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1053.8497775511216d) + "'", double8 == (-1053.8497775511216d));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        code.src.Complex complex2 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        double double3 = complex2.abs();
        code.src.Complex complex6 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str7 = complex6.toString();
        code.src.Complex complex8 = complex2.multiply(complex6);
        code.src.Complex complex11 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex14 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex15 = complex11.multiply(complex14);
        double double16 = complex14.imaginary;
        double double17 = complex14.imaginary;
        code.src.Complex complex20 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex23 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex24 = complex20.multiply(complex23);
        code.src.Complex complex27 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex30 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex31 = complex27.multiply(complex30);
        java.lang.String str32 = complex27.toString();
        code.src.Complex complex35 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex38 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex39 = complex35.multiply(complex38);
        code.src.Complex complex40 = complex27.add(complex39);
        code.src.Complex complex43 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex46 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex47 = complex43.multiply(complex46);
        java.lang.String str48 = complex43.toString();
        code.src.Complex complex51 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex54 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex55 = complex51.multiply(complex54);
        code.src.Complex complex56 = complex43.add(complex55);
        code.src.Complex complex57 = complex40.add(complex56);
        code.src.Complex complex60 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex63 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex64 = complex60.multiply(complex63);
        code.src.Complex complex65 = complex40.sub(complex60);
        code.src.Complex complex66 = complex23.add(complex65);
        double double67 = complex66.abs();
        double double68 = complex66.imaginary;
        complex66.imaginary = 1L;
        code.src.Complex complex71 = complex14.sub(complex66);
        double double72 = complex71.real;
        code.src.Complex complex73 = complex2.multiply(complex71);
        code.src.Complex complex76 = new code.src.Complex(525.4704025737593d, (double) 10L);
        code.src.Complex complex79 = code.src.Complex.polar(907.1298242002123d, (-389.10687533685115d));
        code.src.Complex complex80 = complex76.add(complex79);
        double double81 = complex79.real;
        code.src.Complex complex82 = complex71.add(complex79);
        code.src.Complex complex85 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex88 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex89 = complex85.multiply(complex88);
        java.lang.String str90 = complex85.toString();
        double double91 = complex85.real;
        code.src.Complex complex94 = new code.src.Complex((double) (byte) 1, (double) (-1.0f));
        complex94.imaginary = (byte) 1;
        code.src.Complex complex97 = complex85.multiply(complex94);
        code.src.Complex complex98 = complex79.add(complex85);
        double double99 = complex79.real;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100.0,10.0)" + "'", str7, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 43.756491210010616d + "'", double16 == 43.756491210010616d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 43.756491210010616d + "'", double17 == 43.756491210010616d);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(10.0,0.0)" + "'", str32, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(10.0,0.0)" + "'", str48, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 572.0d + "'", double67 == 572.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 481.32140331011675d + "'", double68 == 481.32140331011675d);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-280.95719905143267d) + "'", double72 == (-280.95719905143267d));
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 816.5801168455955d + "'", double81 == 816.5801168455955d);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "(10.0,0.0)" + "'", str90, "(10.0,0.0)");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertNotNull(complex97);
        org.junit.Assert.assertNotNull(complex98);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 816.5801168455955d + "'", double99 == 816.5801168455955d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        code.src.Complex complex2 = code.src.Complex.polar(0.0d, (-8062.246137461803d));
        complex2.real = 522.8336537091443d;
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        code.src.Complex complex0 = new code.src.Complex();
        complex0.real = 1L;
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex0.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex36.sub(complex43);
        double double46 = complex36.imaginary;
        double double47 = complex36.real;
        double double48 = complex36.abs();
        code.src.Complex complex51 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex54 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex55 = complex51.multiply(complex54);
        double double56 = complex55.imaginary;
        java.lang.String str57 = complex55.toString();
        code.src.Complex complex58 = complex36.multiply(complex55);
        complex58.real = 87.48639198643185d;
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 582.9143981028653d + "'", double37 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 875.1298242002123d + "'", double46 == 875.1298242002123d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 582.9143981028653d + "'", double47 == 582.9143981028653d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1051.4948429356753d + "'", double48 == 1051.4948429356753d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 437.56491210010614d + "'", double56 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str57, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        code.src.Complex complex2 = new code.src.Complex((-906.2883532154044d), (-28.09571990514327d));
        java.lang.String str3 = complex2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-906.2883532154044,-28.09571990514327)" + "'", str3, "(-906.2883532154044,-28.09571990514327)");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        code.src.Complex complex2 = code.src.Complex.polar((double) (short) 0, (double) (byte) 10);
        code.src.Complex complex3 = new code.src.Complex();
        code.src.Complex complex6 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex9 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex10 = complex6.multiply(complex9);
        java.lang.String str11 = complex6.toString();
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        code.src.Complex complex19 = complex6.add(complex18);
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        java.lang.String str27 = complex22.toString();
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        code.src.Complex complex35 = complex22.add(complex34);
        code.src.Complex complex36 = complex19.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex38 = complex3.multiply(complex36);
        double double39 = complex36.abs();
        code.src.Complex complex40 = complex2.sub(complex36);
        code.src.Complex complex43 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex43.imaginary = (short) 0;
        complex43.imaginary = 100.0f;
        code.src.Complex complex50 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str51 = complex50.toString();
        code.src.Complex complex54 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex55 = complex50.sub(complex54);
        code.src.Complex complex56 = complex43.multiply(complex55);
        java.lang.String str57 = complex55.toString();
        double double58 = complex55.real;
        code.src.Complex complex59 = complex2.add(complex55);
        complex2.imaginary = 0.0d;
        java.lang.String str62 = complex2.toString();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(10.0,0.0)" + "'", str11, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(10.0,0.0)" + "'", str27, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 581.9143981028653d + "'", double37 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1050.9408051475186d + "'", double39 == 1050.9408051475186d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(100.0,10.0)" + "'", str51, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(589.1068753368511,327.11773840932915)" + "'", str57, "(589.1068753368511,327.11773840932915)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 589.1068753368511d + "'", double58 == 589.1068753368511d);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(-0.0,0.0)" + "'", str62, "(-0.0,0.0)");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        code.src.Complex complex2 = code.src.Complex.polar((double) (short) 1, 10.0d);
        code.src.Complex complex5 = code.src.Complex.polar(214489.24976920983d, (-36073.24762350389d));
        complex5.imaginary = 36.41428291206625d;
        code.src.Complex complex8 = complex2.multiply(complex5);
        double double9 = complex8.real;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-16159.621402809891d) + "'", double9 == (-16159.621402809891d));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        code.src.Complex complex0 = new code.src.Complex();
        complex0.real = 1L;
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex0.add(complex35);
        code.src.Complex complex39 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex42 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex43 = complex39.multiply(complex42);
        java.lang.String str44 = complex39.toString();
        code.src.Complex complex47 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex50 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex51 = complex47.multiply(complex50);
        code.src.Complex complex52 = complex39.add(complex51);
        code.src.Complex complex55 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex58 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex59 = complex55.multiply(complex58);
        java.lang.String str60 = complex55.toString();
        code.src.Complex complex63 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex66 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex67 = complex63.multiply(complex66);
        code.src.Complex complex68 = complex55.add(complex67);
        code.src.Complex complex69 = complex52.add(complex68);
        code.src.Complex complex72 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex75 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex76 = complex72.multiply(complex75);
        code.src.Complex complex77 = complex52.sub(complex72);
        java.lang.String str78 = complex52.toString();
        code.src.Complex complex79 = complex35.multiply(complex52);
        complex79.real = ' ';
        complex79.imaginary = 1077.733215908709d;
        complex79.real = 834.4460041012325d;
        code.src.Complex complex88 = new code.src.Complex(213613.9236394847d, (double) 10L);
        code.src.Complex complex89 = complex79.sub(complex88);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(10.0,0.0)" + "'", str44, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(10.0,0.0)" + "'", str60, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str78, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex89);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        code.src.Complex complex0 = new code.src.Complex();
        code.src.Complex complex3 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex6 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex7 = complex3.multiply(complex6);
        java.lang.String str8 = complex3.toString();
        code.src.Complex complex11 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex14 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex15 = complex11.multiply(complex14);
        code.src.Complex complex16 = complex3.add(complex15);
        code.src.Complex complex19 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex22 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex23 = complex19.multiply(complex22);
        java.lang.String str24 = complex19.toString();
        code.src.Complex complex27 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex30 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex31 = complex27.multiply(complex30);
        code.src.Complex complex32 = complex19.add(complex31);
        code.src.Complex complex33 = complex16.add(complex32);
        double double34 = complex33.real;
        code.src.Complex complex35 = complex0.multiply(complex33);
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        java.lang.String str43 = complex38.toString();
        code.src.Complex complex46 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex49 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex50 = complex46.multiply(complex49);
        code.src.Complex complex51 = complex38.add(complex50);
        code.src.Complex complex54 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex57 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex58 = complex54.multiply(complex57);
        java.lang.String str59 = complex54.toString();
        code.src.Complex complex62 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex65 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex66 = complex62.multiply(complex65);
        code.src.Complex complex67 = complex54.add(complex66);
        code.src.Complex complex68 = complex51.add(complex67);
        java.lang.String str69 = complex51.toString();
        double double70 = complex51.abs();
        code.src.Complex complex71 = complex0.multiply(complex51);
        code.src.Complex complex74 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex74.imaginary = (short) 0;
        complex74.real = 525.4704025737593d;
        double double79 = complex74.real;
        code.src.Complex complex80 = complex51.add(complex74);
        code.src.Complex complex83 = code.src.Complex.polar((double) (short) 1, 10.0d);
        code.src.Complex complex84 = complex74.multiply(complex83);
        code.src.Complex complex87 = new code.src.Complex(100.0d, (double) (byte) 10);
        code.src.Complex complex90 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex93 = new code.src.Complex((double) 100.0f, 100.0d);
        code.src.Complex complex94 = complex90.add(complex93);
        code.src.Complex complex95 = complex87.sub(complex94);
        double double96 = complex95.real;
        code.src.Complex complex97 = complex84.add(complex95);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(10.0,0.0)" + "'", str8, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(10.0,0.0)" + "'", str24, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 581.9143981028653d + "'", double34 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(10.0,0.0)" + "'", str43, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(10.0,0.0)" + "'", str59, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str69, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 525.4704025737593d + "'", double70 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 525.4704025737593d + "'", double79 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertNotNull(complex95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 489.10687533685115d + "'", double96 == 489.10687533685115d);
        org.junit.Assert.assertNotNull(complex97);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        code.src.Complex complex2 = code.src.Complex.polar(479.1017211050818d, 276650.8031134174d);
        complex2.imaginary = 432.1247009912124d;
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        code.src.Complex complex2 = code.src.Complex.polar(674.2468584080856d, 90.00555538409837d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        code.src.Complex complex2 = code.src.Complex.polar(0.0d, (double) (short) -1);
        complex2.imaginary = (short) 100;
        double double5 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        code.src.Complex complex2 = code.src.Complex.polar((double) 100L, (double) (byte) 1);
        java.lang.String str3 = complex2.toString();
        double double4 = complex2.real;
        double double5 = complex2.abs();
        complex2.real = 0.0d;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(54.03023058681398,84.14709848078965)" + "'", str3, "(54.03023058681398,84.14709848078965)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 54.03023058681398d + "'", double4 == 54.03023058681398d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        code.src.Complex complex2 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double3 = complex2.abs();
        double double4 = complex2.real;
        code.src.Complex complex7 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex10 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex11 = complex7.multiply(complex10);
        java.lang.String str12 = complex7.toString();
        code.src.Complex complex15 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex18 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex19 = complex15.multiply(complex18);
        code.src.Complex complex20 = complex7.add(complex19);
        code.src.Complex complex23 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex26 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex27 = complex23.multiply(complex26);
        java.lang.String str28 = complex23.toString();
        code.src.Complex complex31 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex34 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex35 = complex31.multiply(complex34);
        code.src.Complex complex36 = complex23.add(complex35);
        code.src.Complex complex37 = complex20.add(complex36);
        java.lang.String str38 = complex20.toString();
        double double39 = complex20.abs();
        double double40 = complex20.real;
        code.src.Complex complex41 = complex2.sub(complex20);
        double double42 = complex2.real;
        double double43 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 28.09571990514327d + "'", double4 == 28.09571990514327d);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(10.0,0.0)" + "'", str12, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(10.0,0.0)" + "'", str28, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str38, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 525.4704025737593d + "'", double39 == 525.4704025737593d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 290.95719905143267d + "'", double40 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 28.09571990514327d + "'", double42 == 28.09571990514327d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 43.756491210010616d + "'", double43 == 43.756491210010616d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        java.lang.String str23 = complex18.toString();
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        code.src.Complex complex31 = complex18.add(complex30);
        code.src.Complex complex32 = complex15.add(complex31);
        complex15.real = (-437.56491210010614d);
        java.lang.String str35 = complex15.toString();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10.0,0.0)" + "'", str23, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(-437.56491210010614,437.56491210010614)" + "'", str35, "(-437.56491210010614,437.56491210010614)");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        code.src.Complex complex2 = code.src.Complex.polar(0.0d, 317.11773840932915d);
        double double3 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        code.src.Complex complex9 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex12 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex13 = complex9.multiply(complex12);
        java.lang.String str14 = complex9.toString();
        code.src.Complex complex17 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex20 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex21 = complex17.multiply(complex20);
        code.src.Complex complex22 = complex9.add(complex21);
        code.src.Complex complex25 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex28 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex29 = complex25.multiply(complex28);
        java.lang.String str30 = complex25.toString();
        code.src.Complex complex33 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex36 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex37 = complex33.multiply(complex36);
        code.src.Complex complex38 = complex25.add(complex37);
        code.src.Complex complex39 = complex22.add(complex38);
        code.src.Complex complex42 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex45 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex46 = complex42.multiply(complex45);
        code.src.Complex complex47 = complex22.sub(complex42);
        code.src.Complex complex48 = complex5.add(complex47);
        double double49 = complex48.abs();
        code.src.Complex complex50 = new code.src.Complex();
        complex50.real = 1L;
        code.src.Complex complex55 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex58 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex59 = complex55.multiply(complex58);
        java.lang.String str60 = complex55.toString();
        code.src.Complex complex63 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex66 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex67 = complex63.multiply(complex66);
        code.src.Complex complex68 = complex55.add(complex67);
        code.src.Complex complex71 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex74 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex75 = complex71.multiply(complex74);
        java.lang.String str76 = complex71.toString();
        code.src.Complex complex79 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex82 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex83 = complex79.multiply(complex82);
        code.src.Complex complex84 = complex71.add(complex83);
        code.src.Complex complex85 = complex68.add(complex84);
        code.src.Complex complex86 = complex50.add(complex85);
        code.src.Complex complex87 = complex48.sub(complex85);
        complex87.real = 1051.4948429356753d;
        double double90 = complex87.abs();
        double double91 = complex87.real;
        double double92 = complex87.abs();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(10.0,0.0)" + "'", str14, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(10.0,0.0)" + "'", str30, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 572.0d + "'", double49 == 572.0d);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(10.0,0.0)" + "'", str60, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(10.0,0.0)" + "'", str76, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 1122.8207680143216d + "'", double90 == 1122.8207680143216d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1051.4948429356753d + "'", double91 == 1051.4948429356753d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1122.8207680143216d + "'", double92 == 1122.8207680143216d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        code.src.Complex complex2 = code.src.Complex.polar(43.756491210010616d, 35.0d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        code.src.Complex complex2 = new code.src.Complex(445.65251212240173d, 3.946455324461428d);
        complex2.imaginary = (-36073.24762350389d);
        complex2.imaginary = 0.9999999999999999d;
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        double double8 = complex2.real;
        code.src.Complex complex11 = new code.src.Complex(28.09571990514327d, 907.1298242002123d);
        code.src.Complex complex12 = complex2.multiply(complex11);
        complex11.real = (byte) 100;
        code.src.Complex complex17 = code.src.Complex.polar(214489.24976920983d, (-36073.24762350389d));
        code.src.Complex complex18 = complex11.sub(complex17);
        java.lang.String str19 = complex11.toString();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(100.0,907.1298242002123)" + "'", str19, "(100.0,907.1298242002123)");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        double double7 = complex6.imaginary;
        java.lang.String str8 = complex6.toString();
        double double9 = complex6.real;
        code.src.Complex complex12 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double13 = complex12.abs();
        java.lang.String str14 = complex12.toString();
        code.src.Complex complex15 = complex6.sub(complex12);
        code.src.Complex complex18 = code.src.Complex.polar((double) 1L, (double) 100);
        code.src.Complex complex19 = complex6.add(complex18);
        code.src.Complex complex22 = new code.src.Complex((double) 100, (double) 10.0f);
        complex22.real = (byte) 1;
        complex22.imaginary = (short) 100;
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        java.lang.String str34 = complex29.toString();
        code.src.Complex complex37 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex40 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex41 = complex37.multiply(complex40);
        code.src.Complex complex42 = complex29.add(complex41);
        double double43 = complex42.real;
        code.src.Complex complex46 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex47 = complex42.multiply(complex46);
        code.src.Complex complex48 = complex22.multiply(complex42);
        code.src.Complex complex51 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str52 = complex51.toString();
        code.src.Complex complex55 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex56 = complex51.sub(complex55);
        complex51.imaginary = (-1.0f);
        code.src.Complex complex59 = complex22.sub(complex51);
        double double60 = complex22.abs();
        java.lang.String str61 = complex22.toString();
        code.src.Complex complex62 = complex6.add(complex22);
        code.src.Complex complex65 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex65.imaginary = (short) 0;
        complex65.imaginary = 100.0f;
        code.src.Complex complex72 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str73 = complex72.toString();
        code.src.Complex complex76 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex77 = complex72.sub(complex76);
        code.src.Complex complex78 = complex65.multiply(complex77);
        java.lang.String str79 = complex77.toString();
        complex77.real = 582.9143981028653d;
        code.src.Complex complex82 = complex62.add(complex77);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 437.56491210010614d + "'", double7 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str8, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 280.95719905143267d + "'", double9 == 280.95719905143267d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str14, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(10.0,0.0)" + "'", str34, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 290.95719905143267d + "'", double43 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(100.0,10.0)" + "'", str52, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.00499987500625d + "'", double60 == 100.00499987500625d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(1.0,100.0)" + "'", str61, "(1.0,100.0)");
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(100.0,10.0)" + "'", str73, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(589.1068753368511,327.11773840932915)" + "'", str79, "(589.1068753368511,327.11773840932915)");
        org.junit.Assert.assertNotNull(complex82);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        code.src.Complex complex2 = new code.src.Complex(0.0d, 282.35849053254026d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        code.src.Complex complex2 = new code.src.Complex((double) (short) 10, (-317.11773840932915d));
        code.src.Complex complex5 = code.src.Complex.polar(28.09571990514327d, (double) 0);
        code.src.Complex complex6 = new code.src.Complex();
        complex6.real = 1L;
        code.src.Complex complex11 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex14 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex15 = complex11.multiply(complex14);
        java.lang.String str16 = complex11.toString();
        code.src.Complex complex19 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex22 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex23 = complex19.multiply(complex22);
        code.src.Complex complex24 = complex11.add(complex23);
        code.src.Complex complex27 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex30 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex31 = complex27.multiply(complex30);
        java.lang.String str32 = complex27.toString();
        code.src.Complex complex35 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex38 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex39 = complex35.multiply(complex38);
        code.src.Complex complex40 = complex27.add(complex39);
        code.src.Complex complex41 = complex24.add(complex40);
        code.src.Complex complex42 = complex6.add(complex41);
        double double43 = complex42.real;
        code.src.Complex complex44 = complex5.add(complex42);
        code.src.Complex complex45 = complex2.multiply(complex44);
        double double46 = complex2.imaginary;
        complex2.imaginary = (byte) 0;
        double double49 = complex2.abs();
        code.src.Complex complex52 = new code.src.Complex(437.56491210010614d, (-393.80842089009553d));
        code.src.Complex complex53 = complex2.sub(complex52);
        code.src.Complex complex56 = new code.src.Complex((-906.2883532154044d), (double) 10);
        complex56.real = 101.9803902718557d;
        code.src.Complex complex59 = complex2.add(complex56);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(10.0,0.0)" + "'", str16, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(10.0,0.0)" + "'", str32, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 582.9143981028653d + "'", double43 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-317.11773840932915d) + "'", double46 == (-317.11773840932915d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex59);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        code.src.Complex complex2 = new code.src.Complex(52.00000000000001d, 30.29973903975837d);
        code.src.Complex complex5 = new code.src.Complex((double) (byte) -1, 581.9143981028653d);
        double double6 = complex5.real;
        code.src.Complex complex7 = complex2.add(complex5);
        code.src.Complex complex10 = new code.src.Complex((double) 100L, (double) 10);
        complex10.imaginary = '#';
        complex10.real = 5225.935322982863d;
        code.src.Complex complex15 = complex7.sub(complex10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        code.src.Complex complex2 = code.src.Complex.polar((double) (byte) 100, 582.9143981028653d);
        complex2.real = 875.1298242002123d;
        complex2.imaginary = (-317.11773840932915d);
        complex2.real = 875.1298242002123d;
        double double9 = complex2.imaginary;
        double double10 = complex2.real;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-317.11773840932915d) + "'", double9 == (-317.11773840932915d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 875.1298242002123d + "'", double10 == 875.1298242002123d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        java.lang.String str23 = complex18.toString();
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        code.src.Complex complex31 = complex18.add(complex30);
        code.src.Complex complex32 = complex15.add(complex31);
        code.src.Complex complex35 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex38 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex39 = complex35.multiply(complex38);
        code.src.Complex complex40 = complex15.sub(complex35);
        complex35.imaginary = 52.0d;
        complex35.imaginary = 290.9589175121722d;
        double double45 = complex35.abs();
        code.src.Complex complex46 = new code.src.Complex();
        complex46.real = 1L;
        double double49 = complex46.abs();
        code.src.Complex complex50 = complex35.add(complex46);
        complex50.imaginary = 572.0d;
        complex50.imaginary = (-198.14967628541848d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10.0,0.0)" + "'", str23, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 291.13071236105446d + "'", double45 == 291.13071236105446d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(complex50);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        code.src.Complex complex2 = new code.src.Complex((double) (short) 100, 43.756491210010616d);
        code.src.Complex complex3 = new code.src.Complex();
        complex3.real = 1L;
        code.src.Complex complex8 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex11 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex12 = complex8.multiply(complex11);
        java.lang.String str13 = complex8.toString();
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        code.src.Complex complex21 = complex8.add(complex20);
        code.src.Complex complex24 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex27 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex28 = complex24.multiply(complex27);
        java.lang.String str29 = complex24.toString();
        code.src.Complex complex32 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex35 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex36 = complex32.multiply(complex35);
        code.src.Complex complex37 = complex24.add(complex36);
        code.src.Complex complex38 = complex21.add(complex37);
        code.src.Complex complex39 = complex3.add(complex38);
        double double40 = complex39.real;
        code.src.Complex complex43 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex46 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex47 = complex43.multiply(complex46);
        code.src.Complex complex48 = complex39.sub(complex46);
        code.src.Complex complex49 = complex2.add(complex46);
        java.lang.String str50 = complex46.toString();
        complex46.real = 1018.3729221500101d;
        code.src.Complex complex55 = new code.src.Complex((double) 100, (double) 10.0f);
        complex55.real = (byte) 1;
        complex55.imaginary = (short) 100;
        code.src.Complex complex62 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex65 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex66 = complex62.multiply(complex65);
        java.lang.String str67 = complex62.toString();
        code.src.Complex complex70 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex73 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex74 = complex70.multiply(complex73);
        code.src.Complex complex75 = complex62.add(complex74);
        double double76 = complex75.real;
        code.src.Complex complex79 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex80 = complex75.multiply(complex79);
        code.src.Complex complex81 = complex55.multiply(complex75);
        code.src.Complex complex84 = code.src.Complex.polar((double) ' ', (double) (byte) 100);
        code.src.Complex complex85 = complex75.multiply(complex84);
        java.lang.String str86 = complex85.toString();
        double double87 = complex85.abs();
        code.src.Complex complex88 = complex46.sub(complex85);
        double double89 = complex46.imaginary;
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(10.0,0.0)" + "'", str13, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(10.0,0.0)" + "'", str29, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 582.9143981028653d + "'", double40 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str50, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(10.0,0.0)" + "'", str67, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 290.95719905143267d + "'", double76 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "(15118.903072407044,7359.672093492629)" + "'", str86, "(15118.903072407044,7359.672093492629)");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 16815.052882360298d + "'", double87 == 16815.052882360298d);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 43.756491210010616d + "'", double89 == 43.756491210010616d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        code.src.Complex complex2 = code.src.Complex.polar(3624.868782803608d, (-101.0d));
        complex2.real = 5225.935322982863d;
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        code.src.Complex complex2 = new code.src.Complex((double) 100, (double) 10.0f);
        complex2.imaginary = 100L;
        code.src.Complex complex7 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex10 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex11 = complex7.multiply(complex10);
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        java.lang.String str19 = complex14.toString();
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        code.src.Complex complex27 = complex14.add(complex26);
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        java.lang.String str35 = complex30.toString();
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        code.src.Complex complex43 = complex30.add(complex42);
        code.src.Complex complex44 = complex27.add(complex43);
        code.src.Complex complex47 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex50 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex51 = complex47.multiply(complex50);
        code.src.Complex complex52 = complex27.sub(complex47);
        code.src.Complex complex53 = complex10.add(complex52);
        code.src.Complex complex54 = complex2.multiply(complex52);
        code.src.Complex complex57 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex60 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex61 = complex57.multiply(complex60);
        double double62 = complex61.imaginary;
        java.lang.String str63 = complex61.toString();
        java.lang.String str64 = complex61.toString();
        code.src.Complex complex65 = complex52.sub(complex61);
        code.src.Complex complex68 = code.src.Complex.polar((double) (byte) 10, (double) (short) 0);
        code.src.Complex complex69 = complex52.sub(complex68);
        code.src.Complex complex72 = new code.src.Complex(10.0d, (double) 10L);
        complex72.real = 290.95719905143267d;
        complex72.imaginary = (-489.10687533685115d);
        code.src.Complex complex77 = complex68.sub(complex72);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(10.0,0.0)" + "'", str19, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(10.0,0.0)" + "'", str35, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 437.56491210010614d + "'", double62 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str63, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str64, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex77);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        code.src.Complex complex2 = new code.src.Complex(517.6532504767864d, (-6.660172805893699E7d));
        code.src.Complex complex5 = new code.src.Complex((double) (byte) 1, (double) (-1.0f));
        complex5.imaginary = (byte) 1;
        complex5.imaginary = 811.5511719071119d;
        double double10 = complex5.abs();
        code.src.Complex complex11 = new code.src.Complex();
        complex11.real = 1L;
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        java.lang.String str21 = complex16.toString();
        code.src.Complex complex24 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex27 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex28 = complex24.multiply(complex27);
        code.src.Complex complex29 = complex16.add(complex28);
        code.src.Complex complex32 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex35 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex36 = complex32.multiply(complex35);
        java.lang.String str37 = complex32.toString();
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex32.add(complex44);
        code.src.Complex complex46 = complex29.add(complex45);
        code.src.Complex complex47 = complex11.add(complex46);
        double double48 = complex47.real;
        code.src.Complex complex51 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex54 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex55 = complex51.multiply(complex54);
        code.src.Complex complex56 = complex47.sub(complex54);
        code.src.Complex complex59 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex60 = complex54.add(complex59);
        code.src.Complex complex63 = new code.src.Complex((double) 10L, (double) '#');
        code.src.Complex complex64 = complex59.add(complex63);
        complex59.real = 43.756491210010616d;
        complex59.imaginary = 100.0d;
        complex59.imaginary = (-317.11773840932915d);
        code.src.Complex complex73 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex76 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex77 = complex73.multiply(complex76);
        java.lang.String str78 = complex73.toString();
        code.src.Complex complex81 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex84 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex85 = complex81.multiply(complex84);
        code.src.Complex complex86 = complex73.add(complex85);
        code.src.Complex complex87 = complex59.multiply(complex85);
        complex85.imaginary = (-1.0d);
        code.src.Complex complex90 = complex5.sub(complex85);
        code.src.Complex complex91 = complex2.sub(complex85);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 811.5517880109727d + "'", double10 == 811.5517880109727d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(10.0,0.0)" + "'", str21, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(10.0,0.0)" + "'", str37, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 582.9143981028653d + "'", double48 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(10.0,0.0)" + "'", str78, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex91);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        code.src.Complex complex0 = new code.src.Complex();
        complex0.real = 1L;
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex0.add(complex35);
        code.src.Complex complex39 = code.src.Complex.polar((double) (short) -1, (double) (byte) 0);
        code.src.Complex complex42 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex45 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex46 = complex42.multiply(complex45);
        java.lang.String str47 = complex42.toString();
        code.src.Complex complex50 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex53 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex54 = complex50.multiply(complex53);
        code.src.Complex complex55 = complex42.add(complex54);
        double double56 = complex55.real;
        code.src.Complex complex59 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex62 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex63 = complex59.multiply(complex62);
        double double64 = complex63.imaginary;
        code.src.Complex complex65 = complex55.sub(complex63);
        double double66 = complex55.imaginary;
        code.src.Complex complex67 = complex39.multiply(complex55);
        code.src.Complex complex68 = complex0.multiply(complex67);
        code.src.Complex complex71 = new code.src.Complex((double) 10L, (double) '#');
        double double72 = complex71.imaginary;
        code.src.Complex complex73 = complex68.add(complex71);
        code.src.Complex complex76 = new code.src.Complex((double) (short) -1, 1050.9408051475186d);
        complex76.real = 0.0d;
        code.src.Complex complex79 = complex68.sub(complex76);
        java.lang.Class<?> wildcardClass80 = complex79.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(10.0,0.0)" + "'", str47, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 290.95719905143267d + "'", double56 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 437.56491210010614d + "'", double64 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 437.56491210010614d + "'", double66 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 35.0d + "'", double72 == 35.0d);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        code.src.Complex complex2 = new code.src.Complex((double) 100.0f, (double) 100.0f);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        code.src.Complex complex12 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex15 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex16 = complex12.multiply(complex15);
        java.lang.String str17 = complex12.toString();
        code.src.Complex complex20 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex23 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex24 = complex20.multiply(complex23);
        code.src.Complex complex25 = complex12.add(complex24);
        code.src.Complex complex28 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex31 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex32 = complex28.multiply(complex31);
        java.lang.String str33 = complex28.toString();
        code.src.Complex complex36 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex39 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex40 = complex36.multiply(complex39);
        code.src.Complex complex41 = complex28.add(complex40);
        code.src.Complex complex42 = complex25.add(complex41);
        code.src.Complex complex45 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex48 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex49 = complex45.multiply(complex48);
        code.src.Complex complex50 = complex25.sub(complex45);
        code.src.Complex complex51 = complex8.add(complex50);
        double double52 = complex51.abs();
        code.src.Complex complex53 = new code.src.Complex();
        complex53.real = 1L;
        code.src.Complex complex58 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex61 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex62 = complex58.multiply(complex61);
        java.lang.String str63 = complex58.toString();
        code.src.Complex complex66 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex69 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex70 = complex66.multiply(complex69);
        code.src.Complex complex71 = complex58.add(complex70);
        code.src.Complex complex74 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex77 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex78 = complex74.multiply(complex77);
        java.lang.String str79 = complex74.toString();
        code.src.Complex complex82 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex85 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex86 = complex82.multiply(complex85);
        code.src.Complex complex87 = complex74.add(complex86);
        code.src.Complex complex88 = complex71.add(complex87);
        code.src.Complex complex89 = complex53.add(complex88);
        code.src.Complex complex90 = complex51.sub(complex88);
        complex90.real = 1051.4948429356753d;
        code.src.Complex complex93 = complex2.multiply(complex90);
        java.lang.Class<?> wildcardClass94 = complex90.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(10.0,0.0)" + "'", str17, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(10.0,0.0)" + "'", str33, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 572.0d + "'", double52 == 572.0d);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(10.0,0.0)" + "'", str63, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(10.0,0.0)" + "'", str79, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        code.src.Complex complex2 = code.src.Complex.polar(572.0d, 525.4704025737593d);
        code.src.Complex complex5 = code.src.Complex.polar(141.4213562373095d, (-272.8614791462894d));
        code.src.Complex complex8 = code.src.Complex.polar(100.00499987500625d, 8.414709848078965d);
        code.src.Complex complex9 = complex5.multiply(complex8);
        code.src.Complex complex10 = complex2.multiply(complex9);
        code.src.Complex complex13 = new code.src.Complex((double) 10, (double) 10);
        code.src.Complex complex14 = complex2.multiply(complex13);
        code.src.Complex complex17 = new code.src.Complex((double) (short) 0, (double) ' ');
        code.src.Complex complex18 = new code.src.Complex();
        complex18.real = 1L;
        code.src.Complex complex23 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex26 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex27 = complex23.multiply(complex26);
        java.lang.String str28 = complex23.toString();
        code.src.Complex complex31 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex34 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex35 = complex31.multiply(complex34);
        code.src.Complex complex36 = complex23.add(complex35);
        code.src.Complex complex39 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex42 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex43 = complex39.multiply(complex42);
        java.lang.String str44 = complex39.toString();
        code.src.Complex complex47 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex50 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex51 = complex47.multiply(complex50);
        code.src.Complex complex52 = complex39.add(complex51);
        code.src.Complex complex53 = complex36.add(complex52);
        code.src.Complex complex54 = complex18.add(complex53);
        code.src.Complex complex55 = complex17.add(complex53);
        code.src.Complex complex58 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex61 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex62 = complex58.multiply(complex61);
        java.lang.String str63 = complex58.toString();
        code.src.Complex complex66 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex69 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex70 = complex66.multiply(complex69);
        code.src.Complex complex71 = complex58.add(complex70);
        code.src.Complex complex74 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex77 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex78 = complex74.multiply(complex77);
        java.lang.String str79 = complex74.toString();
        code.src.Complex complex82 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex85 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex86 = complex82.multiply(complex85);
        code.src.Complex complex87 = complex74.add(complex86);
        code.src.Complex complex88 = complex71.add(complex87);
        code.src.Complex complex89 = new code.src.Complex();
        code.src.Complex complex90 = complex88.add(complex89);
        code.src.Complex complex91 = complex55.add(complex89);
        code.src.Complex complex94 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str95 = complex94.toString();
        java.lang.String str96 = complex94.toString();
        code.src.Complex complex97 = complex55.sub(complex94);
        double double98 = complex94.imaginary;
        code.src.Complex complex99 = complex14.add(complex94);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(10.0,0.0)" + "'", str28, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(10.0,0.0)" + "'", str44, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(10.0,0.0)" + "'", str63, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(10.0,0.0)" + "'", str79, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(100.0,10.0)" + "'", str95, "(100.0,10.0)");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "(100.0,10.0)" + "'", str96, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex97);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 10.0d + "'", double98 == 10.0d);
        org.junit.Assert.assertNotNull(complex99);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        code.src.Complex complex2 = new code.src.Complex(100.0d, (double) 100);
        code.src.Complex complex5 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex5.imaginary = (short) 0;
        complex5.imaginary = 100.0f;
        code.src.Complex complex12 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex15 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex16 = complex12.multiply(complex15);
        java.lang.String str17 = complex12.toString();
        code.src.Complex complex20 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex23 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex24 = complex20.multiply(complex23);
        code.src.Complex complex25 = complex12.add(complex24);
        code.src.Complex complex28 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex31 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex32 = complex28.multiply(complex31);
        java.lang.String str33 = complex28.toString();
        code.src.Complex complex36 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex39 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex40 = complex36.multiply(complex39);
        code.src.Complex complex41 = complex28.add(complex40);
        code.src.Complex complex42 = complex25.add(complex41);
        java.lang.String str43 = complex25.toString();
        code.src.Complex complex46 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex46.imaginary = (short) 0;
        java.lang.String str49 = complex46.toString();
        code.src.Complex complex50 = complex25.sub(complex46);
        code.src.Complex complex51 = complex5.add(complex50);
        complex51.imaginary = 0;
        complex51.real = 10.0f;
        complex51.imaginary = 481.32140331011675d;
        code.src.Complex complex58 = complex2.multiply(complex51);
        java.lang.String str59 = complex58.toString();
        code.src.Complex complex62 = new code.src.Complex(288.4361024143587d, 352.8614791462894d);
        code.src.Complex complex63 = complex58.add(complex62);
        double double64 = complex58.real;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(10.0,0.0)" + "'", str17, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(10.0,0.0)" + "'", str33, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str43, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(-0.0,0.0)" + "'", str49, "(-0.0,0.0)");
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(-47132.14033101167,49132.14033101167)" + "'", str59, "(-47132.14033101167,49132.14033101167)");
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-47132.14033101167d) + "'", double64 == (-47132.14033101167d));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        code.src.Complex complex2 = code.src.Complex.polar(572.0d, (-393.80842089009553d));
        complex2.imaginary = 528.7686600293723d;
        double double5 = complex2.imaginary;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 528.7686600293723d + "'", double5 == 528.7686600293723d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        code.src.Complex complex2 = new code.src.Complex((double) 100, (double) 10.0f);
        complex2.imaginary = 100L;
        code.src.Complex complex7 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex10 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex11 = complex7.multiply(complex10);
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        java.lang.String str19 = complex14.toString();
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        code.src.Complex complex27 = complex14.add(complex26);
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        java.lang.String str35 = complex30.toString();
        code.src.Complex complex38 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex41 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex42 = complex38.multiply(complex41);
        code.src.Complex complex43 = complex30.add(complex42);
        code.src.Complex complex44 = complex27.add(complex43);
        code.src.Complex complex47 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex50 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex51 = complex47.multiply(complex50);
        code.src.Complex complex52 = complex27.sub(complex47);
        code.src.Complex complex53 = complex10.add(complex52);
        code.src.Complex complex54 = complex2.multiply(complex52);
        code.src.Complex complex57 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double58 = complex57.abs();
        double double59 = complex57.real;
        code.src.Complex complex62 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex65 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex66 = complex62.multiply(complex65);
        java.lang.String str67 = complex62.toString();
        code.src.Complex complex70 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex73 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex74 = complex70.multiply(complex73);
        code.src.Complex complex75 = complex62.add(complex74);
        code.src.Complex complex78 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex81 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex82 = complex78.multiply(complex81);
        java.lang.String str83 = complex78.toString();
        code.src.Complex complex86 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex89 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex90 = complex86.multiply(complex89);
        code.src.Complex complex91 = complex78.add(complex90);
        code.src.Complex complex92 = complex75.add(complex91);
        java.lang.String str93 = complex75.toString();
        double double94 = complex75.abs();
        double double95 = complex75.real;
        code.src.Complex complex96 = complex57.sub(complex75);
        code.src.Complex complex97 = complex2.add(complex57);
        complex2.imaginary = 148.66068747318505d;
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(10.0,0.0)" + "'", str19, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(10.0,0.0)" + "'", str35, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 52.0d + "'", double58 == 52.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 28.09571990514327d + "'", double59 == 28.09571990514327d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(10.0,0.0)" + "'", str67, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "(10.0,0.0)" + "'", str83, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex91);
        org.junit.Assert.assertNotNull(complex92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str93, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 525.4704025737593d + "'", double94 == 525.4704025737593d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 290.95719905143267d + "'", double95 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex96);
        org.junit.Assert.assertNotNull(complex97);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        code.src.Complex complex2 = new code.src.Complex(28.09571990514327d, 907.1298242002123d);
        code.src.Complex complex5 = code.src.Complex.polar((double) (byte) 10, (double) (short) 0);
        code.src.Complex complex6 = complex2.multiply(complex5);
        complex5.real = (-906.2883532154044d);
        code.src.Complex complex11 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double12 = complex11.real;
        java.lang.String str13 = complex11.toString();
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        java.lang.String str21 = complex16.toString();
        code.src.Complex complex24 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex24.real = 10;
        code.src.Complex complex27 = complex16.multiply(complex24);
        code.src.Complex complex30 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex31 = new code.src.Complex();
        complex31.real = 1L;
        code.src.Complex complex36 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex39 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex40 = complex36.multiply(complex39);
        java.lang.String str41 = complex36.toString();
        code.src.Complex complex44 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex47 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex48 = complex44.multiply(complex47);
        code.src.Complex complex49 = complex36.add(complex48);
        code.src.Complex complex52 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex55 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex56 = complex52.multiply(complex55);
        java.lang.String str57 = complex52.toString();
        code.src.Complex complex60 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex63 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex64 = complex60.multiply(complex63);
        code.src.Complex complex65 = complex52.add(complex64);
        code.src.Complex complex66 = complex49.add(complex65);
        code.src.Complex complex67 = complex31.add(complex66);
        double double68 = complex67.real;
        code.src.Complex complex71 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex74 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex75 = complex71.multiply(complex74);
        code.src.Complex complex76 = complex67.sub(complex74);
        double double77 = complex67.imaginary;
        code.src.Complex complex78 = complex30.sub(complex67);
        code.src.Complex complex79 = complex24.add(complex30);
        code.src.Complex complex82 = code.src.Complex.polar((double) 100, 0.0d);
        code.src.Complex complex83 = complex30.add(complex82);
        complex83.real = 279.7722729260128d;
        code.src.Complex complex86 = complex11.multiply(complex83);
        code.src.Complex complex87 = complex5.sub(complex11);
        double double88 = complex5.real;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 28.09571990514327d + "'", double12 == 28.09571990514327d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str13, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(10.0,0.0)" + "'", str21, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(10.0,0.0)" + "'", str41, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(10.0,0.0)" + "'", str57, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 582.9143981028653d + "'", double68 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 875.1298242002123d + "'", double77 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex82);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-906.2883532154044d) + "'", double88 == (-906.2883532154044d));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        code.src.Complex complex2 = new code.src.Complex(0.0d, (double) 'a');
        code.src.Complex complex5 = new code.src.Complex((-0.0d), 0.0d);
        code.src.Complex complex8 = new code.src.Complex((double) 10L, (double) '#');
        double double9 = complex8.imaginary;
        double double10 = complex8.abs();
        code.src.Complex complex13 = new code.src.Complex(100.0d, 0.0d);
        code.src.Complex complex16 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex19 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex20 = complex16.multiply(complex19);
        java.lang.String str21 = complex16.toString();
        code.src.Complex complex24 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex27 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex28 = complex24.multiply(complex27);
        code.src.Complex complex29 = complex16.add(complex28);
        code.src.Complex complex32 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex35 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex36 = complex32.multiply(complex35);
        java.lang.String str37 = complex32.toString();
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex32.add(complex44);
        code.src.Complex complex48 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex51 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex52 = complex48.multiply(complex51);
        java.lang.String str53 = complex48.toString();
        code.src.Complex complex56 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex59 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex60 = complex56.multiply(complex59);
        code.src.Complex complex61 = complex48.add(complex60);
        code.src.Complex complex62 = complex45.add(complex61);
        java.lang.String str63 = complex45.toString();
        double double64 = complex45.abs();
        code.src.Complex complex65 = complex29.multiply(complex45);
        code.src.Complex complex66 = complex13.add(complex65);
        code.src.Complex complex67 = complex8.multiply(complex66);
        double double68 = complex66.real;
        code.src.Complex complex69 = complex5.add(complex66);
        code.src.Complex complex72 = code.src.Complex.polar((-317.11773840932915d), (double) 10L);
        code.src.Complex complex75 = new code.src.Complex((double) (short) 0, (double) ' ');
        code.src.Complex complex78 = new code.src.Complex((double) 10L, (double) '#');
        double double79 = complex78.imaginary;
        code.src.Complex complex80 = complex75.multiply(complex78);
        code.src.Complex complex83 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex86 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex87 = complex83.multiply(complex86);
        double double88 = complex87.imaginary;
        code.src.Complex complex89 = complex80.multiply(complex87);
        code.src.Complex complex90 = complex72.sub(complex87);
        complex87.real = 213613.9236394847d;
        code.src.Complex complex93 = complex66.add(complex87);
        code.src.Complex complex94 = complex2.add(complex93);
        java.lang.String str95 = complex2.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 36.40054944640259d + "'", double10 == 36.40054944640259d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(10.0,0.0)" + "'", str21, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(10.0,0.0)" + "'", str37, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(10.0,0.0)" + "'", str53, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str63, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 525.4704025737593d + "'", double64 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-106706.9606213186d) + "'", double68 == (-106706.9606213186d));
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 35.0d + "'", double79 == 35.0d);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 437.56491210010614d + "'", double88 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex89);
        org.junit.Assert.assertNotNull(complex90);
        org.junit.Assert.assertNotNull(complex93);
        org.junit.Assert.assertNotNull(complex94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(0.0,97.0)" + "'", str95, "(0.0,97.0)");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        code.src.Complex complex2 = code.src.Complex.polar((-438.56491210010614d), 589.1068753368511d);
        code.src.Complex complex5 = new code.src.Complex((double) 100, (double) 10.0f);
        complex5.real = (byte) 1;
        complex5.imaginary = (short) 100;
        code.src.Complex complex12 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex15 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex16 = complex12.multiply(complex15);
        java.lang.String str17 = complex12.toString();
        code.src.Complex complex20 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex23 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex24 = complex20.multiply(complex23);
        code.src.Complex complex25 = complex12.add(complex24);
        double double26 = complex25.real;
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex25.multiply(complex29);
        code.src.Complex complex31 = complex5.multiply(complex25);
        code.src.Complex complex34 = new code.src.Complex((double) 100, (double) 10.0f);
        java.lang.String str35 = complex34.toString();
        code.src.Complex complex38 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex39 = complex34.sub(complex38);
        complex34.imaginary = (-1.0f);
        code.src.Complex complex42 = complex5.sub(complex34);
        code.src.Complex complex45 = code.src.Complex.polar(28.09571990514327d, (double) 10L);
        code.src.Complex complex46 = complex42.add(complex45);
        complex42.real = 1.4142135623730951d;
        code.src.Complex complex49 = complex2.multiply(complex42);
        double double50 = complex42.real;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(10.0,0.0)" + "'", str17, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 290.95719905143267d + "'", double26 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(100.0,10.0)" + "'", str35, "(100.0,10.0)");
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.4142135623730951d + "'", double50 == 1.4142135623730951d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        code.src.Complex complex2 = new code.src.Complex(0.0d, 58910.68753368511d);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        double double36 = complex18.real;
        double double37 = complex18.real;
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        java.lang.String str45 = complex40.toString();
        code.src.Complex complex48 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex51 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex52 = complex48.multiply(complex51);
        code.src.Complex complex53 = complex40.add(complex52);
        code.src.Complex complex56 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex59 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex60 = complex56.multiply(complex59);
        java.lang.String str61 = complex56.toString();
        code.src.Complex complex64 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex67 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex68 = complex64.multiply(complex67);
        code.src.Complex complex69 = complex56.add(complex68);
        code.src.Complex complex70 = complex53.add(complex69);
        code.src.Complex complex71 = complex18.sub(complex53);
        double double72 = complex53.abs();
        double double73 = complex53.abs();
        code.src.Complex complex76 = code.src.Complex.polar((double) (short) 1, 10.0d);
        code.src.Complex complex77 = complex53.multiply(complex76);
        code.src.Complex complex78 = complex2.multiply(complex53);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 290.95719905143267d + "'", double36 == 290.95719905143267d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 290.95719905143267d + "'", double37 == 290.95719905143267d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(10.0,0.0)" + "'", str45, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(10.0,0.0)" + "'", str61, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 525.4704025737593d + "'", double72 == 525.4704025737593d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 525.4704025737593d + "'", double73 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, (double) '#');
        double double3 = complex2.imaginary;
        double double4 = complex2.abs();
        code.src.Complex complex7 = new code.src.Complex(100.0d, 0.0d);
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        java.lang.String str15 = complex10.toString();
        code.src.Complex complex18 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex21 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex22 = complex18.multiply(complex21);
        code.src.Complex complex23 = complex10.add(complex22);
        code.src.Complex complex26 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex29 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex30 = complex26.multiply(complex29);
        java.lang.String str31 = complex26.toString();
        code.src.Complex complex34 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex37 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex38 = complex34.multiply(complex37);
        code.src.Complex complex39 = complex26.add(complex38);
        code.src.Complex complex42 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex45 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex46 = complex42.multiply(complex45);
        java.lang.String str47 = complex42.toString();
        code.src.Complex complex50 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex53 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex54 = complex50.multiply(complex53);
        code.src.Complex complex55 = complex42.add(complex54);
        code.src.Complex complex56 = complex39.add(complex55);
        java.lang.String str57 = complex39.toString();
        double double58 = complex39.abs();
        code.src.Complex complex59 = complex23.multiply(complex39);
        code.src.Complex complex60 = complex7.add(complex59);
        code.src.Complex complex61 = complex2.multiply(complex60);
        java.lang.String str62 = complex2.toString();
        complex2.imaginary = 1489.0442223030777d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 36.40054944640259d + "'", double4 == 36.40054944640259d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(10.0,0.0)" + "'", str15, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(10.0,0.0)" + "'", str31, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(10.0,0.0)" + "'", str47, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str57, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 525.4704025737593d + "'", double58 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(10.0,35.0)" + "'", str62, "(10.0,35.0)");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        code.src.Complex complex2 = code.src.Complex.polar((double) (byte) -1, 100.4987562112089d);
        code.src.Complex complex5 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex8 = new code.src.Complex(290.95719905143267d, (-213613.9212426372d));
        code.src.Complex complex9 = complex5.add(complex8);
        complex9.real = 1018.3729221500101d;
        double double12 = complex9.real;
        code.src.Complex complex13 = complex2.sub(complex9);
        code.src.Complex complex16 = new code.src.Complex((double) '4', (double) 100L);
        code.src.Complex complex19 = code.src.Complex.polar(240.82414161407507d, 10.0d);
        code.src.Complex complex20 = complex16.multiply(complex19);
        double double21 = complex19.imaginary;
        code.src.Complex complex22 = complex13.multiply(complex19);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1018.3729221500101d + "'", double12 == 1018.3729221500101d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-131.01341704986802d) + "'", double21 == (-131.01341704986802d));
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        double double7 = complex6.imaginary;
        java.lang.String str8 = complex6.toString();
        double double9 = complex6.real;
        code.src.Complex complex12 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double13 = complex12.abs();
        java.lang.String str14 = complex12.toString();
        code.src.Complex complex15 = complex6.sub(complex12);
        code.src.Complex complex18 = new code.src.Complex((double) 100L, (double) 10);
        complex18.imaginary = '#';
        code.src.Complex complex23 = code.src.Complex.polar((-317.11773840932915d), (double) 10L);
        code.src.Complex complex26 = new code.src.Complex((double) (short) 0, (double) ' ');
        code.src.Complex complex29 = new code.src.Complex((double) 10L, (double) '#');
        double double30 = complex29.imaginary;
        code.src.Complex complex31 = complex26.multiply(complex29);
        code.src.Complex complex34 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex37 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex38 = complex34.multiply(complex37);
        double double39 = complex38.imaginary;
        code.src.Complex complex40 = complex31.multiply(complex38);
        code.src.Complex complex41 = complex23.sub(complex38);
        code.src.Complex complex42 = complex18.multiply(complex23);
        code.src.Complex complex43 = complex12.add(complex23);
        double double44 = complex43.imaginary;
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 437.56491210010614d + "'", double7 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str8, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 280.95719905143267d + "'", double9 == 280.95719905143267d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(28.09571990514327,43.756491210010616)" + "'", str14, "(28.09571990514327,43.756491210010616)");
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 437.56491210010614d + "'", double39 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 216.27523554217842d + "'", double44 == 216.27523554217842d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        code.src.Complex complex2 = code.src.Complex.polar((double) (-1), (double) (short) 10);
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex13.real = 10;
        code.src.Complex complex16 = complex5.multiply(complex13);
        code.src.Complex complex19 = code.src.Complex.polar(582.9143981028653d, (double) (byte) 10);
        code.src.Complex complex20 = new code.src.Complex();
        complex20.real = 1L;
        code.src.Complex complex25 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex28 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex29 = complex25.multiply(complex28);
        java.lang.String str30 = complex25.toString();
        code.src.Complex complex33 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex36 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex37 = complex33.multiply(complex36);
        code.src.Complex complex38 = complex25.add(complex37);
        code.src.Complex complex41 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex44 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex45 = complex41.multiply(complex44);
        java.lang.String str46 = complex41.toString();
        code.src.Complex complex49 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex52 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex53 = complex49.multiply(complex52);
        code.src.Complex complex54 = complex41.add(complex53);
        code.src.Complex complex55 = complex38.add(complex54);
        code.src.Complex complex56 = complex20.add(complex55);
        double double57 = complex56.real;
        code.src.Complex complex60 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex63 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex64 = complex60.multiply(complex63);
        code.src.Complex complex65 = complex56.sub(complex63);
        double double66 = complex56.imaginary;
        code.src.Complex complex67 = complex19.sub(complex56);
        code.src.Complex complex68 = complex13.add(complex19);
        code.src.Complex complex69 = complex2.multiply(complex68);
        complex69.imaginary = 0.0d;
        complex69.real = (-545.7908951722745d);
        java.lang.Class<?> wildcardClass74 = complex69.getClass();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(10.0,0.0)" + "'", str30, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(10.0,0.0)" + "'", str46, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 582.9143981028653d + "'", double57 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 875.1298242002123d + "'", double66 == 875.1298242002123d);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        code.src.Complex complex2 = code.src.Complex.polar(489.10687533685115d, 1136.0754242392372d);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        code.src.Complex complex2 = code.src.Complex.polar(9.013372407959515d, (double) 10.0f);
        code.src.Complex complex3 = new code.src.Complex();
        code.src.Complex complex6 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex9 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex10 = complex6.multiply(complex9);
        java.lang.String str11 = complex6.toString();
        code.src.Complex complex14 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex17 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex18 = complex14.multiply(complex17);
        code.src.Complex complex19 = complex6.add(complex18);
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        java.lang.String str27 = complex22.toString();
        code.src.Complex complex30 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex33 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex34 = complex30.multiply(complex33);
        code.src.Complex complex35 = complex22.add(complex34);
        code.src.Complex complex36 = complex19.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex38 = complex3.multiply(complex36);
        code.src.Complex complex41 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex44 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex45 = complex41.multiply(complex44);
        java.lang.String str46 = complex41.toString();
        code.src.Complex complex49 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex52 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex53 = complex49.multiply(complex52);
        code.src.Complex complex54 = complex41.add(complex53);
        code.src.Complex complex57 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex60 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex61 = complex57.multiply(complex60);
        java.lang.String str62 = complex57.toString();
        code.src.Complex complex65 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex68 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex69 = complex65.multiply(complex68);
        code.src.Complex complex70 = complex57.add(complex69);
        code.src.Complex complex71 = complex54.add(complex70);
        java.lang.String str72 = complex54.toString();
        double double73 = complex54.abs();
        code.src.Complex complex74 = complex3.multiply(complex54);
        code.src.Complex complex77 = code.src.Complex.polar((double) (byte) 0, (double) 'a');
        complex77.imaginary = (short) 0;
        complex77.real = 525.4704025737593d;
        double double82 = complex77.real;
        code.src.Complex complex83 = complex54.add(complex77);
        code.src.Complex complex86 = code.src.Complex.polar((double) (short) 1, 10.0d);
        code.src.Complex complex87 = complex77.multiply(complex86);
        code.src.Complex complex88 = complex2.sub(complex87);
        complex88.real = 22801.876198575297d;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(10.0,0.0)" + "'", str11, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(10.0,0.0)" + "'", str27, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 581.9143981028653d + "'", double37 == 581.9143981028653d);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(10.0,0.0)" + "'", str46, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(10.0,0.0)" + "'", str62, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(290.95719905143267,437.56491210010614)" + "'", str72, "(290.95719905143267,437.56491210010614)");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 525.4704025737593d + "'", double73 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 525.4704025737593d + "'", double82 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        code.src.Complex complex2 = new code.src.Complex(352.8614791462894d, 214489.84591642267d);
        double double3 = complex2.imaginary;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 214489.84591642267d + "'", double3 == 214489.84591642267d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        code.src.Complex complex2 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex5 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex6 = complex2.multiply(complex5);
        java.lang.String str7 = complex2.toString();
        code.src.Complex complex10 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex13 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex14 = complex10.multiply(complex13);
        code.src.Complex complex15 = complex2.add(complex14);
        double double16 = complex15.abs();
        code.src.Complex complex19 = code.src.Complex.polar(141.4213562373095d, (double) 10.0f);
        code.src.Complex complex22 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex25 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex26 = complex22.multiply(complex25);
        double double27 = complex26.imaginary;
        complex26.imaginary = 572.0d;
        complex26.real = (byte) 0;
        code.src.Complex complex32 = complex19.sub(complex26);
        code.src.Complex complex33 = complex15.add(complex26);
        double double34 = complex26.real;
        java.lang.Class<?> wildcardClass35 = complex26.getClass();
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(10.0,0.0)" + "'", str7, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 525.4704025737593d + "'", double16 == 525.4704025737593d);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 437.56491210010614d + "'", double27 == 437.56491210010614d);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        code.src.Complex complex0 = new code.src.Complex();
        complex0.real = 1L;
        code.src.Complex complex5 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex8 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex9 = complex5.multiply(complex8);
        java.lang.String str10 = complex5.toString();
        code.src.Complex complex13 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex16 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex17 = complex13.multiply(complex16);
        code.src.Complex complex18 = complex5.add(complex17);
        code.src.Complex complex21 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex24 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex25 = complex21.multiply(complex24);
        java.lang.String str26 = complex21.toString();
        code.src.Complex complex29 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex32 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex33 = complex29.multiply(complex32);
        code.src.Complex complex34 = complex21.add(complex33);
        code.src.Complex complex35 = complex18.add(complex34);
        code.src.Complex complex36 = complex0.add(complex35);
        double double37 = complex36.real;
        code.src.Complex complex40 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex43 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex44 = complex40.multiply(complex43);
        code.src.Complex complex45 = complex36.sub(complex43);
        double double46 = complex36.imaginary;
        double double47 = complex36.real;
        double double48 = complex36.abs();
        code.src.Complex complex51 = new code.src.Complex((double) 10L, 0.0d);
        code.src.Complex complex54 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        code.src.Complex complex55 = complex51.multiply(complex54);
        double double56 = complex55.imaginary;
        java.lang.String str57 = complex55.toString();
        code.src.Complex complex58 = complex36.multiply(complex55);
        code.src.Complex complex61 = new code.src.Complex(213613.9236394847d, 290.95719905143267d);
        code.src.Complex complex62 = complex36.sub(complex61);
        java.lang.Class<?> wildcardClass63 = complex61.getClass();
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10.0,0.0)" + "'", str10, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10.0,0.0)" + "'", str26, "(10.0,0.0)");
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 582.9143981028653d + "'", double37 == 582.9143981028653d);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 875.1298242002123d + "'", double46 == 875.1298242002123d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 582.9143981028653d + "'", double47 == 582.9143981028653d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1051.4948429356753d + "'", double48 == 1051.4948429356753d);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 437.56491210010614d + "'", double56 == 437.56491210010614d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(280.95719905143267,437.56491210010614)" + "'", str57, "(280.95719905143267,437.56491210010614)");
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        code.src.Complex complex2 = code.src.Complex.polar((double) '4', (double) (byte) 1);
        double double3 = complex2.abs();
        double double4 = complex2.real;
        code.src.Complex complex7 = code.src.Complex.polar(445.65251212240173d, 525.4704025737593d);
        code.src.Complex complex8 = complex2.multiply(complex7);
        complex8.real = 906.2883532154044d;
        double double11 = complex8.imaginary;
        complex8.imaginary = 0.0d;
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 28.09571990514327d + "'", double4 == 28.09571990514327d);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-22432.531388878706d) + "'", double11 == (-22432.531388878706d));
    }
}

