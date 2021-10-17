package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	@Test
	void empty_string_should_return_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_more_than_one_number_should_return_addition_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(10, stringCalculator.add("1,2,3,4"));
	}

	@Test
	void string_with_new_line_should_return_addition_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	@Test
	void string_support_different_delimiters_return_addition_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("//;\n1;2"));
	}
	
	@Test
	void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
		StringCalculator stringCalculator = new StringCalculator();
		Exception exception = assertThrows(RuntimeException.class, () -> stringCalculator.add("1,-2,3,4,-5,6"));
		assertTrue(exception.getMessage().contains("negatives not allowed"));
	}
}
