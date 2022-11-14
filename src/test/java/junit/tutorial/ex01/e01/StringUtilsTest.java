package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("TestStart");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("TestFinish");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("next");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("finished");
	}

	@Test
	void testToSnakeCase1() {
		String test = "aaa";
		String result = StringUtils.toSnakeCase(test);
		assertEquals("aaa", result, "case1");
	}
	
	@Test
	void testToSnakeCase2() {
		String test = "HelloWorld";
		String result = StringUtils.toSnakeCase(test);
		assertEquals("hello_world", result, "case2");
	}
	
	@Test
	void testToSnakeCase3() {
		String test = "practiceJunit";
		String result = StringUtils.toSnakeCase(test);
		assertEquals("practice_junit", result, "case3");
	}

}
