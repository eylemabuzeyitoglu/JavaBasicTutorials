/*
Write a method called inputThenPrintSumAndAverage that does not have any parameters.
The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
When the user enters something that is not an int then it needs to print a message in the format
"SUM = XX AVG = YY".XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
 */

/* NOT --1
Java'da Scanner sınıfının hasNextInt metodu, taranan girdinin bir
tamsayı olup olmadığını kontrol etmek için kullanılır.
 */

/* NOT--2
Gerçek bir girdiyle çalışırken
Scanner nesnesini doğru şekilde kapatmayı (scanner.close()) unutmamak önemlidir.
 */

import java.util.Scanner;
    public class InputCalculator {

        public static void inputThenPrintSumAndAverage() {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            long avg = 0;

            while (true) {
                boolean hasNextInt = scanner.hasNextInt();
                if (!hasNextInt) {
                    // break the loop on invalid input
                    break;
                }
                sum += scanner.nextInt();
                count++;
                // clear buffer e.g. remove line separator
                scanner.nextLine();
            }

            if (count > 0) {
                avg = Math.round((double) sum / count);
            }

            System.out.println("SUM = " + sum + " AVG = " + avg);
            scanner.close();
        }
    }

