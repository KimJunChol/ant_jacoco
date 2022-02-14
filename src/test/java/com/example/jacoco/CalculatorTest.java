package com.example.jacoco;

//import static org.assertj.core.api.Assertions.assertThat;

//import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
//	@Test
	void integerAdd( ) {
		long result = calculator.add(2147483647, 1);
//		assertThat(result).isEqualTo(214783648L);
	}
}
