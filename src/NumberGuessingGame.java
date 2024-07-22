import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static int nextNum;

    public static void guessNumber() {

        Random random = new Random();
        int randomNum = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int i = 1;
        while (i <= 10) {
            try {
                String num = scanner.nextLine();
                nextNum = Integer.parseInt(num);
                if (nextNum > randomNum) {
                    if ( i == 10){
                        System.out.println("You lost!!!");
                        break;
                    }
                    System.out.println("Enter a less value.");
                    i++;
                } else if (nextNum < randomNum) {
                    if ( i == 10){
                        System.out.println("You lost!!!");
                        break;
                    }
                    System.out.println("Enter a higher value.");
                    i++;
                } else {
                    System.out.println("Congratulations, you found the right number. You win!");
                    break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Value!!! Enter a number :  ");
            }

        }

    }
    public static void main(String[] args) {
        guessNumber();
    }

}




