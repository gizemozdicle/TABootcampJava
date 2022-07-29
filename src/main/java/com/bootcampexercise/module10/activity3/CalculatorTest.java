package com.bootcampexercise.module10.activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void setUp() throws Exception {
        calculator = new Calculator();

    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testCalculatorAddMethod() {
        int numberOne = 10;
        int numberTwo = 10;
        int result = 20;

        assertEquals(calculator.add(numberOne, numberTwo), result);
    }

    public void testCalculatorSubtractMethod() {
        int numberOne = 20;
        int numberTwo = 10;
        int result = 10;

        assertEquals(calculator.subtract(numberOne, numberTwo), result);
    }

    public void testCalculatorDivideMethod() {
        int numberOne = 20;
        int numberTwo = 10;
        int result = 2;

        assertEquals(calculator.divide(numberOne, numberTwo), result);
    }

    public void testCalculatorMultiplyMethod() {
        int numberOne = 2;
        int numberTwo = 3;
        int result = 6;

        assertEquals(calculator.multiply(numberOne, numberTwo), result);
    }


}
