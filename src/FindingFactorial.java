public class FindingFactorial {
    public static int factorial(int number){
        int fact = 1;
        for(int i = number;i>0;i--){
            fact =  fact * i;
        }
        return fact;
    }
}
