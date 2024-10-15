package at.htlgkr.schlagerflorian;

import at.htlgkr.schlagerflorian.interfaces.IntIsEvenIsOdd;
import at.htlgkr.schlagerflorian.interfaces.ListToUpperLowerCase;
import at.htlgkr.schlagerflorian.interfaces.StringIsEmpty;
import at.htlgkr.schlagerflorian.interfaces.SumConverter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LambdaUebungen {
    public static void main(String[] args) {

    }

    //1. Write a Java program to implement a lambda expression to find the sum of two integers
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
}