/*
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit;
otherwise, it should return false.

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of
10(inclusive) - 1000(inclusive), otherwise return false.
*/

public class LastDigitChecker {
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }

        int oneDigit = num1 % 10;
        int secondDigit = num2 % 10;
        int thirdDigit = num3 % 10;

        return (oneDigit == secondDigit) || (oneDigit == thirdDigit) || (secondDigit == thirdDigit);
    }

}