package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void testCreateFizzBuzzList() {
		int test = 16;
		List<String> result = new ArrayList<>();
			result.add("1");
			result.add("2");
			result.add("Fizz");
			result.add("4");
			result.add("Buzz");
			result.add("Fizz");
			result.add("7");
			result.add("8");
			result.add("Fizz");
			result.add("Buzz");
			result.add("11");
			result.add("Fizz");
			result.add("13");
			result.add("14");
			result.add("FizzBuzz");
			result.add("16");
		
		FizzBuzz fizzBuzz = new FizzBuzz();
 		assertIterableEquals(result, fizzBuzz.createFizzBuzzList(test), "test2-2 FizzBuzz");
	}
}
