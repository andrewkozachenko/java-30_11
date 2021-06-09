package com.kozachenko.lesson.lesson27.forTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;


class DoubleMockCalculatorTest {

    @Test
    public void testPlus(){
        Calc calc = Mockito.mock(Calc.class);
        Mockito.when(calc.plus(2.0,2.0)).thenReturn(4.0);
        DoubleMockCalculator doubleMockCalculator = new DoubleMockCalculator(calc);

        assertEquals(4.0, doubleMockCalculator.plus(2.0,2.0));
    }
}