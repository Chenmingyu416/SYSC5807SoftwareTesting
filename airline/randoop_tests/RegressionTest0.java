import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.Bug bug3 = new com.Bug("", (int) (short) 1, 0);
        bug3.run();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (short) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.Bug bug3 = new com.Bug("", (int) 'a', (int) (short) 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }
}

