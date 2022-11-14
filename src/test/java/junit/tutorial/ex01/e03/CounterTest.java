package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
	
	/*
	//追加 Counte()の機能テスト
	@Test
	void testCounter() {
		Counter increment = new Counter();
		int result = increment.increment();
		increment.Counter(); 
		assertEquals(0, result, "testCounter1_Error");	
	
	}*/

	//
	@Test
	void testIncrement1() {
		Counter increment = new Counter();
		int result = increment.increment();
		assertEquals(1, result, "testCounter1_Error");	
	}
	
	@Test
	void testIncrement2() {
		Counter increment = new Counter();
		increment.increment();
		
		int result = increment.increment();
		
		assertEquals(2, result, "testCounter2_Error");	
	}

	@Test
	void testIncrement3() {
		Counter increment = new Counter();
		int exec = 50;
		for(int i=0; i<exec; i++) {
			increment.increment();
		}
		
		int result = increment.increment();
		assertEquals(51, result, "testCounter3_Error");	
	}
}
