import java.util.Scanner;

public class DecimalToBinary {
    private static int number;

    public static double binaryFromDecimal() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a decimal number.");
            String num = scanner.nextLine();
            number = Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid Value!!! Enter a number");
        }
        int i = 0;
        double sum = 0;
        while (number >= 2) {
            sum = sum + (number % 2) * Math.pow(10, i);
            number /= 2;
            i++;
        }
        sum = sum + (number % 2) * Math.pow(10, i);
        return sum;
    }

    public static void main(String[] args) {
        double num2 = binaryFromDecimal();
        System.out.println(num2);
    }
}
