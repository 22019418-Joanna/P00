import static org.junit.Assert.*;


public class CalculatorTest2 {

	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}

	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals (actual, expected);
	}
	
	public void testMultiple() {
		int a = 101;
		int b = 11;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 1111;
		assertEquals (actual, expected);
	}

	public void testDevide() {
		int a = 275;
		int b = 11;
		
		Calculator cal = new Calculator();
		int actual = cal.devide(a, b);
		
		int expected = 25;
		assertEquals (actual, expected);
	}
}
