package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

	@ParameterizedTest
	@CsvSource({
		"5, 100, 105",
		"5, 3000 ,3150",
		"10, 50, 55",
		"5, 50, 52",
		"3, 50 ,51"
	})
	void testConsumptionTax1(int tax, int price, int expected) {
		ConsumptionTax conTax = new ConsumptionTax(tax);
		int result = conTax.apply(price);
		assertEquals(expected, result, "testError");
	}

}
