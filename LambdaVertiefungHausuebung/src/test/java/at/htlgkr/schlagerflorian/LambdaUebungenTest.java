package at.htlgkr.schlagerflorian;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LambdaUebungenTest {

    //1. Write a Java program to implement a lambda expression to find the sum of two integers
    @Test
    void sumTestTwoPositiveNumbers() {
        System.out.println("sumTestTwoPositiveNumbers");
        int number1 = 12;
        int number2 = 34;
        int expResult = 46;
        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.sum(number1, number2);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }

    @Test
    void sumTestTwoNegativeNumbers() {
        System.out.println("sumTestTwoNegativeNumbers");
        int number1 = -4;
        int number2 = -3;
        int expResult = -7;
        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.sum(number1, number2);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }

    @Test
    void sumTestOnePositiveOneNegativeNumber() {
        System.out.println("sumTestOnePositiveOneNegativeNumber");
        int number1 = -4;
        int number2 = 15;
        int expResult = 11;
        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.sum(number1, number2);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }


    //2. Write a Java program to implement a lambda expression to check if a given string is empty.
    @Test
    void isStringEmptyTestWithValueInIt() {
        System.out.println("isStringEmptyTestWithValueInIt");
        String s = "Test";
        boolean expResult = false;
        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isStringEmpty(s);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }

    @Test
    void isStringEmptyTestWithEmptyString() {
        System.out.println("isStringEmptyTestWithEmptyString");
        String s = "";
        boolean expResult = true;
        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isStringEmpty(s);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }

    @Test
    void isStringEmptyTestWithEmptyStringButBlank() {
        System.out.println("isStringEmptyTestWithEmptyStringButBlank");
        String s = " ";
        boolean expResult = false;
        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isStringEmpty(s);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        System.out.println();
        assertEquals(expResult, result);
    }
}