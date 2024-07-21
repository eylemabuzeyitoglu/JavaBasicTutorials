public class FindFibonacci {
        public static int fibonacciRecursive(int n) {
            if (n <= 1) {
                return n;
            }

            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }

        public static void main(String[] args) {
            int n = 10; // İlk 10 Fibonacci sayısını hesaplamak istiyoruz

            // Rekürsif yöntem kullanarak ve her bir Fibonacci sayısını ekrana yazdır
            System.out.println("Fibonacci dizisinin ilk " + n + " terimi:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciRecursive(i) + " ");
            }
        }

}