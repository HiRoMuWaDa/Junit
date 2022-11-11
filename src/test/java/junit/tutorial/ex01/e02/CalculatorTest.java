package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator testDivide = new Calculator();
	
	@Test
	void testDivide1() {
		System.out.println("test1");
		assertThrows(IllegalArgumentException.class, () -> testDivide.divide(1, 0), "yが0ではありません");
	}
	
	@Test
	void testDivide2() {
		System.out.println("test2");
		int result = testDivide.divide(100, 2);
		assertEquals(50, result, "test2 エラー");
	}

}
