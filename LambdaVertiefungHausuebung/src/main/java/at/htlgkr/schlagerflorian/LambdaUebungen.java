package at.htlgkr.schlagerflorian;

import at.htlgkr.schlagerflorian.interfaces.StringIsEmpty;
import at.htlgkr.schlagerflorian.interfaces.SumConverter;

import java.util.List;

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

    
}