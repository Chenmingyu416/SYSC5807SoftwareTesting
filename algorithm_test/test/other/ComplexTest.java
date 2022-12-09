////package other;
//
//import code.src.Complex;
//import org.junit.Test;
//import org.junit.tools.configuration.base.MethodRef;
//import javax.annotation.processing.Generated;
//
//@Generated(value = "org.junit-tools-1.1.0")
//public class ComplexTest {
//
//	private Complex createTestSubject() {
//		return new Complex();
//	}
//
//	@MethodRef(name = "multiply", signature = "(QComplex;)QComplex;")
//	@Test
//	public void testMultiply() throws Exception {
//		Complex testSubject;
//		Complex x = null;
//		Complex result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.multiply(x);
//	}
//
//	@MethodRef(name = "add", signature = "(QComplex;)QComplex;")
//	@Test
//	public void testAdd() throws Exception {
//		Complex testSubject;
//		Complex x = null;
//		Complex result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.add(x);
//	}
//
//	@MethodRef(name = "sub", signature = "(QComplex;)QComplex;")
//	@Test
//	public void testSub() throws Exception {
//		Complex testSubject;
//		Complex x = null;
//		Complex result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.sub(x);
//	}
//
//	@MethodRef(name = "abs", signature = "()D")
//	@Test
//	public void testAbs() throws Exception {
//		Complex testSubject;
//		double result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.abs();
//	}
//
//	@MethodRef(name = "toString", signature = "()QString;")
//	@Test
//	public void testToString() throws Exception {
//		Complex testSubject;
//		String result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.toString();
//	}
//
//	@MethodRef(name = "polar", signature = "(DD)QComplex;")
//	@Test
//	public void testPolar() throws Exception {
//		double rho = 0.0;
//		double theta = 0.0;
//		Complex result;
//
//		// default test
//		result = Complex.polar(rho, theta);
//	}
//}