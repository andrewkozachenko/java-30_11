package com.kozachenko.lesson.lesson27.forTest;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    public void testPlusHappyPass(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.plus(2,2));
    }

    @Test
    public void testPlusUnhappyPass(){
        Calculator calculator = new Calculator();
        assertNotEquals(5, calculator.plus(2,2));
    }

    @Test
    public void testMinusHappyPass(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.minus(2,2));
    }

    @Test
    public void testMinusUnhappyPass(){
        Calculator calculator = new Calculator();
        assertNotEquals(1, calculator.minus(2,2));
    }

    @Test
    public void testDivideHappyPass(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2,2));
        assertEquals(2.5, calculator.divide(10,4));
    }

    @Test
    public void testDivideHappyPassVersion2(){
        Calculator calculator = new Calculator();
        assertEquals(0.6666666666666666, calculator.divide(2,3));
    }

    @Test
    public void testDivideException(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(2.0,0);
        });
    }

    @Test
    public void testMultiplyHappyPass(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
        assertNotEquals(5, calculator.multiply(2,3));
    }

    @Test
    public void testMultiplyHappyPass2(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testMultiplyHappyPass3(){
        Calculator calculator = new Calculator();
        assertEquals(2.00000000000000, calculator.multiply(0.666666666666666666666, 3));
    }
/*--------------- Divide int Example ---------------*/

    @Test
    public void testDivideIntHappyPass(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divideInt(8,2));
        assertNotEquals(3, calculator.divideInt(8,2));
    }

    @Test
    public void testDivideIntThrowException(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divideInt(2,0);
        });
    }

    @Test
    public void testDivideIntFullPart(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divideInt(5,2));
        assertNotEquals(3, calculator.divideInt(8,2));
    }

    @Test
    public void testDivideIntMinus(){
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.divideInt(5,-2));
    }

    @Test
    public void testDivideIntMinus2(){
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.divideInt(-5,2));
    }

    @Test
    public void testDivideIntMinus3(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divideInt(-5,-2));
    }
}