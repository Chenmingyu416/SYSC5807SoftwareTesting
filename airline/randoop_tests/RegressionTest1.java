import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        // The following exception was thrown during execution in test generation
        try {
            com.Bug bug3 = new com.Bug("hi!", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: bug found");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }
}
