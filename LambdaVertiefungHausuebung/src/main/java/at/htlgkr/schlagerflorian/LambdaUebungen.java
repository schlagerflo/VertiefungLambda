package at.htlgkr.schlagerflorian;

import at.htlgkr.schlagerflorian.interfaces.SumConverter;

public class Main {
    public static void main(String[] args) {

    }

    //1. Write a Java program to implement a lambda expression to find the sum of two integers
    public int sum (int number1, int number2){
        SumConverter sum = (int numberOne, int numberTwo) -> (numberOne + numberTwo);
        return sum.sumConverter(number1, number2);
    }

}