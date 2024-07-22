import java.util.Scanner;

/*
In this challenge, you'll read 5 valid numbers from the console entered by the user and print the sum of those five numbers.
By valid numbers, I mean you need to check that the numbers entered are valid integers.
If they are not, print out the message "Invalid number" to the console, but continue looping until you do have 5 valid numbers.
Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count 1, 2, 3, etc.
As an example, the first message would look something like, "Enter number #1:", the next, "Enter number #2:", and so on.
 */

public class ReadingFiveNumber {
    public static String GetInputFromScanner(){
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        double sum = 0;
        while(i <= 5){
            System.out.println("Enter number #" + i + ":");
                String nextNum = scanner.nextLine();
                try{
                    //int number = Integer.parseInt(nextNum);
                    double number = Double.parseDouble(nextNum);
                    i++;
                    sum += number;
                }catch(NumberFormatException e){
                    System.out.println("Invalid Number");
                }
        }
        return "Sum Of five number = " + sum;
    }
    public static void main(String[] args) {
        System.out.println(GetInputFromScanner());
    }
}

