package com.example.slm_exam.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateFactorialServiceTest {

    private CalculateFactorialService factorialService;


    @BeforeEach
    public void setUp() {
        factorialService = new CalculateFactorialService();
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "0, 1", "5, 120", "-1, 0", "-5, 0", "10, 3628800"})
    void shouldCalculateFactorialValueOfInputCorrectly(int input, int expectedOutput) {
        int result = factorialService.calculateFactorialValue(input);

        assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    void shouldReturnZeroWhenNoFactorialWasCalculated() {
        int result = factorialService.getTotalFactorialValue();

        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldCorrectValueWhenFactorialWasCalculated() {
        factorialService.calculateFactorialValue(5);
        int result = factorialService.getTotalFactorialValue();

        assertThat(result).isEqualTo(120);
    }

    @Test
    void shouldCorrectValueWhenMutlipleFactorialsWereCalculated() {
        factorialService.calculateFactorialValue(5);
        factorialService.calculateFactorialValue(10);
        int result = factorialService.getTotalFactorialValue();

        assertThat(result).isEqualTo(120 + 3628800 );
    }
}
