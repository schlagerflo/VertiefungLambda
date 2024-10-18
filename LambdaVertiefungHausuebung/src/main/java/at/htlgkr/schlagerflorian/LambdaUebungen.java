package at.htlgkr.schlagerflorian;

import at.htlgkr.schlagerflorian.interfaces.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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

    //9. Write a Java program to implement a lambda expression to check if a number is prime.
    public boolean isPrime (int number){
        CheckIfPrime ifPrime = number1 -> {
            if (number1 < 1){
                return false;
            }
            for (int i = 2; i < 10; i++){
                if (number1 % i == 0){
                    return false;
                }
            }
            return true;
        };
        return ifPrime.isPrime(number);
    }

    //10. Write a Java program to implement a lambda expression to concatenate two strings.
    public String concatenateStrings (String string1, String string2){
        ConcatenateTwoStrings concatenateTwoStrings = (s1, s2) -> s1 + s2;
        return concatenateTwoStrings.concatenate(string1, string2);
    }

    //11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
    public int getMinimumValue (List<Integer> list){
        GetMaximumMinimumValue getMinimumValue = list1 -> list1.stream()
                .min((x, y) -> x.compareTo(y))
                .get();
        return getMinimumValue.getMinimumMaximumValue(list);
    }
    public int getMaximumValue (List<Integer> list){
        GetMaximumMinimumValue getMaximumValue = list1 -> list1.stream()
                .max((x, y) -> x.compareTo(y))
                .get();
        return getMaximumValue.getMinimumMaximumValue(list);
    }

    //12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers
    public int sumList (List<Integer> list){
        MultiplyAndSumList sum = list1 -> list1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum.multiplyAndSum(list);
    }
    public int multiplyList (List<Integer> list){
        AtomicInteger factor = new AtomicInteger();
        MultiplyAndSumList multiply = list1 -> list1.stream()
                .reduce((a, b) -> a * b)
                .get();
        return multiply.multiplyAndSum(list);
    }

    //13. Write a Java program to implement a lambda expression to count words in a sentence.
    public int countWords (String sentence){
        CountWordsInSentence countWords = word -> {
            String[] words = sentence.split(" ");
            return words.length;
        };
        return countWords.count(sentence);
    }

    //14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
    public boolean checkPalindrome (String word){
        CheckIfPalindrome check = word1 -> {
            word1 = word1.toLowerCase();
            char[] lettersFor = new char[word1.length()];
            char[] lettersBack = new char[word1.length()];

            for (int i = 0; i < lettersFor.length; i++){
                lettersFor[i] = word1.charAt(i);
                lettersBack[word1.length() - i - 1] = word1.charAt(i);
            }

            for (int i = 0; i < lettersFor.length; i++)
            {
                if (lettersFor[i] != lettersBack[i])
                {
                    return false;
                }
            }
            return true;
        };
        return check.checkPalindrome(word);
    }

    //15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list
    public int sumEvenSquares (List<Integer> list){
        SumOfOddEvenSquares sumEvenSquares = list1 -> list1.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i * i)
                .sum();
        return sumEvenSquares.sum(list);
    }
    public int sumOddSquares (List<Integer> list){
        SumOfOddEvenSquares sumOddSquares = list1 -> list1.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(i -> i * i)
                .sum();
        return sumOddSquares.sum(list);
    }

    //16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
    public boolean containsWord (List<String> list, String word){
        CheckIfWordIsInList containsWord = (list1, word1) -> {
            word1 = word1.toLowerCase();
            list1.replaceAll(String::toLowerCase);
            return list1.contains(word1);
        };
        return containsWord.contains(list, word);
    }
}