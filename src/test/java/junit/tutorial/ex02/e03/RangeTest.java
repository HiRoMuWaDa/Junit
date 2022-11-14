package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RangeTest {

	// test1 min=0.0、max=10.5のRangeのとき	
	@Nested
	class rangeTest1 {
		
		@ParameterizedTest
		@MethodSource("testParameter")
		void testRange1(double value, boolean expeced, String test) {
			double min = 0.0;
			double max = 10.5;
			Range range = new Range(min, max);

			assertEquals(expeced, range.contains(value), test);
		}
		
		static Stream<Arguments> testParameter(){
			return Stream.of(
					Arguments.of(-0.1, false, "errorTest1"),
					Arguments.of(0.0, true, "errorTest2"),
					Arguments.of(10.5, true, "errorTest3"),
					Arguments.of(10.6, false, "errorTest4")
			);	
		}

	}
	
	// test1 min=-5.1、max=5.1のRangeのとき	
	@Nested
	class rangeTest2 {
		
		@ParameterizedTest
		@MethodSource("testParameter")
		void testRange1(double value, boolean expeced, String test) {
			double min = -5.1;
			double max = 5.1;
			Range range = new Range(min, max);

			assertEquals(expeced, range.contains(value), test);
		}
		
		static Stream<Arguments> testParameter(){
			return Stream.of(
					Arguments.of(-5.2, false, "errorTest1"),
					Arguments.of(-5.1, true, "errorTest2"),
					Arguments.of(5.1, true, "errorTest3"),
					Arguments.of(5.2, false, "errorTest4")
			);	
		}

	}

}
