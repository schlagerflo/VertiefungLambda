package at.htlgkr.schlagerflorian;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    //3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
    @Test
    void toUpperCaseTest() {
        System.out.println("toUpperCaseTest");
        List<String> list = new ArrayList<>();
        list.add("Florian");
        list.add("Tobias");
        list.add("Lukas");

        List<String> expResult = new ArrayList<>();
        expResult.add("FLORIAN");
        expResult.add("TOBIAS");
        expResult.add("LUKAS");

        LambdaUebungen instance = new LambdaUebungen();
        List<String> result = instance.toUpperCase(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }
    @Test
    void toLowerCaseTest() {
        System.out.println("toLowerCaseTest");
        List<String> list = new ArrayList<>();
        list.add("FLORIAN");
        list.add("TOBIAS");
        list.add("LUKAS");

        List<String> expResult = new ArrayList<>();
        expResult.add("florian");
        expResult.add("tobias");
        expResult.add("lukas");

        LambdaUebungen instance = new LambdaUebungen();
        List<String> result = instance.toLowerCase(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }

    //4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
    @Test
    void filterOutEvenTest() {
        System.out.println("filterOutEvenTest");
        List<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(10);
        list.add(3);

        List<Integer> expResult = new ArrayList<>();
        expResult.add(3);

        LambdaUebungen instance = new LambdaUebungen();
        List<Integer> result = instance.filterOutEven(list);
        for (int i = 0; i < expResult.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }
    @Test
    void filterOutOddTest() {
        System.out.println("filterOutOddTest");
        List<Integer> list = new ArrayList<>();
        list.add(38);
        list.add(17);
        list.add(-12);

        List<Integer> expResult = new ArrayList<>();
        expResult.add(38);

        LambdaUebungen instance = new LambdaUebungen();
        List<Integer> result = instance.filterOutOdd(list);
        for (int i = 0; i < expResult.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }
}