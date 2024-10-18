package at.htlgkr.schlagerflorian;

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

    //5. Write a Java program to implement a lambda expression to sort a list of strings according to their length (descending).
    @Test
    void sortListPerLengthTest() {
        System.out.println("sortListPerLengthTest");
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Parameter");
        list.add("Hi");
        list.add(" ");

        List<String> expResult = new ArrayList<>();
        expResult.add("Parameter");
        expResult.add("Hello");
        expResult.add("Hi");
        expResult.add(" ");

        LambdaUebungen instance = new LambdaUebungen();
        List<String> result = instance.sortListPerLength(list);
        for (int i = 0; i < expResult.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }

    //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
    @Test
    void findAverageTest() {
        System.out.println("findAverageTest");
        List<Double> list = new ArrayList<>();
        list.add(3.5);
        list.add(7.5);
        list.add(4.5);
        list.add(6.5);
        list.add(5.5);

        double expResult = 5.5;

        LambdaUebungen instance = new LambdaUebungen();
        double result = instance.findAverage(list);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: " + result);
        assertEquals(expResult, result);
    }

    //7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
    @Test
    void removeDuplicatesTest() {
        System.out.println("removeDuplicatesTest");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(7);

        List<Integer> expResult = new ArrayList<>();
        expResult.add(3);
        expResult.add(7);
        expResult.add(1);
        expResult.add(4);

        LambdaUebungen instance = new LambdaUebungen();
        List<Integer> result = instance.removeDuplicates(list);
        for (int i = 0; i < expResult.size(); i++){
            System.out.println("Expected: " + expResult.get(i));
            System.out.println("Result: "  + result.get(i));
        }
        assertEquals(expResult, result);
    }

    //8. Write a Java program to implement a lambda expression to calculate the factorial of a given number.
    @Test
    void calculateFactorialTest() {
        System.out.println("calculateFactorialTest");
        int number = 5;

        int expResult = 120;

        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.calculateFactorial(number);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }

    //9. Write a Java program to implement a lambda expression to check if a number is prime.
    @Test
    void isPrimeWithPrimeNumberTest() {
        System.out.println("isPrimeWithPrimeNumberTest");
        int number = 1;

        boolean expResult = true;

        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isPrime(number);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
    @Test
    void isPrimeWithNotPrimeNumberTest() {
        System.out.println("isPrimeWithNotPrimeNumberTest");
        int number = 15;

        boolean expResult = false;

        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isPrime(number);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
    @Test
    void isPrimeWithNumberZeroTest() {
        System.out.println("isPrimeWithNumberZeroTest");
        int number = 0;

        boolean expResult = false;

        LambdaUebungen instance = new LambdaUebungen();
        boolean result = instance.isPrime(number);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }

    //10. Write a Java program to implement a lambda expression to concatenate two strings.
    @Test
    void concatenateStringsWithNormalStringsTest() {
        System.out.println("concatenateStringsWithNormalStringsTest");
        String string1 = "hEllo";
        String string2 = "worLd";

        String expResult = "hElloworLd";

        LambdaUebungen instance = new LambdaUebungen();
        String result = instance.concatenateStrings(string1, string2);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
    @Test
    void concatenateStringsWithOneEmptyStringTest() {
        System.out.println("concatenateStringsWithOneEmptyStringTest");
        String string1 = "hello";
        String string2 = "";

        String expResult = "hello";

        LambdaUebungen instance = new LambdaUebungen();
        String result = instance.concatenateStrings(string1, string2);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }

    //11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
    @Test
    void getMinimumValueTest() {
        System.out.println("getMinimumValueTest");
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(1);

        int expResult = 1;

        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.getMinimumValue(list);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
    @Test
    void getMaximumValueTest() {
        System.out.println("getMaximumValueTest");
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(1);

        int expResult = 7;

        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.getMaximumValue(list);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }

    //12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers
    @Test
    void sumListTest() {
        System.out.println("sumListTest");
        List<Integer> list = new ArrayList<>();
        list.add(48);
        list.add(11);
        list.add(24);

        int expResult = 83;

        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.sumList(list);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
    @Test
    void multiplyListTest() {
        System.out.println("multiplyListTest");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);

        int expResult = 40;

        LambdaUebungen instance = new LambdaUebungen();
        int result = instance.multiplyList(list);
        System.out.println("Expected: " + expResult);
        System.out.println("Result: "  + result);
        assertEquals(expResult, result);
    }
}