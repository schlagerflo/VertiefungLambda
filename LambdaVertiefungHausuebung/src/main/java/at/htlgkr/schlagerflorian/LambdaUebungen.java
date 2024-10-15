package at.htlgkr.schlagerflorian;

import at.htlgkr.schlagerflorian.interfaces.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LambdaUebungen {
    public static void main(String[] args) {

    }

    //1. Write a Java program to implement a lambda expression to find the sum of two integers.
    public int sum (int number1, int number2){
        SumConverter sum = (int numberOne, int numberTwo) -> (numberOne + numberTwo);
        return sum.sumConverter(number1, number2);
    }

    //2. Write a Java program to implement a lambda expression to check if a given string is empty.
    public boolean isStringEmpty (String s){
        StringIsEmpty isEmpty = (String string1) -> (string1.isEmpty());
        return isEmpty.isStringEmpty(s);
    }

    //3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
    public List<String> toUpperCase (List<String> list){
        ListToUpperLowerCase toUpperCase = list1 -> list1.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        return toUpperCase.toUpperLowerCase(list);
    }
    public List<String> toLowerCase (List<String> list){
        ListToUpperLowerCase toLowerCase = list1 -> list1.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        return toLowerCase.toUpperLowerCase(list);
    }

    //4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
    public List<Integer> filterOutEven (List<Integer> list){
        IntIsEvenIsOdd filterOutEven = list1 -> list1.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        return filterOutEven.isEvenIsOdd(list);
    }
    public List<Integer> filterOutOdd (List<Integer> list){
        IntIsEvenIsOdd filterOutOdd = list1 -> list1.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        return filterOutOdd.isEvenIsOdd(list);
    }

    //5. Write a Java program to implement a lambda expression to sort a list of strings according to their length (descending).
    public List<String> sortListPerLength (List<String> list){
        SortListPerLength sortListPerLength = list1 -> list1.stream()
                .sorted((o1, o2) -> o2.length() - o1.length())
                .collect(Collectors.toList());
        return sortListPerLength.sortList(list);
    }

    //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
    public double findAverage (List<Double> list){
        ListFindAverage listFindAverage = list1 -> list1.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        return listFindAverage.findAverage(list);
    }

    //7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
    public List<Integer> removeDuplicates (List<Integer> list){
        ListRemoveDuplicates removeDuplicates = list1 -> list1.stream()
                .distinct()
                .collect(Collectors.toList());
        return removeDuplicates.removeDuplicatesFromList(list);
    }

    //8. Write a Java program to implement a lambda expression to calculate the factorial of a given number.
    public int calculateFactorial (int number){
        FactorialCalculator calculator = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        };
        return calculator.calculateFactorial(number);
    }
}