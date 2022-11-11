package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RangeTest {
	
	@Test 
	void test1() {
		// test1 min=0.0、max=10.5のRangeのとき
		Range range = new Range(0.0, 10.5);
		
		double tc1 = -0.1;
		double tc2 = 0.0;
		double tc3 = 10.5;
		double tc4 = 10.6;
		
		assertAll(
				() -> assertEquals(false, range.contains(tc1),"tc1"),
				() -> assertEquals(true, range.contains(tc2),"tc2"),
				() -> assertEquals(true, range.contains(tc3),"tc3"),
				() -> assertEquals(false, range.contains(tc4),"tc4")
			);
	}
		@Test
		void test2() {
		// test2 min=-5.1、max=5.1のRangeのとき
		Range range = new Range(-5.1, 5.1);
		
		double tc1 = -5.2;
		double tc2 = -5.1;
		double tc3 = 5.1;
		double tc4 = 5.2;
		
		assertAll(
				() -> assertEquals(false, range.contains(tc1),"tc1"),
				() -> assertEquals(true, range.contains(tc2),"tc2"),
				() -> assertEquals(true, range.contains(tc3),"tc3"),
				() -> assertEquals(false, range.contains(tc4),"tc4")
		);
	}

}
