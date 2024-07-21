public class MultiplicationByAddition {
    public static int multiplicationWithAddition(int num1,int num2){
        int sum = 0;
        for(int i = num2;i>0;i--){
            sum = num1 + sum;
        }
        return sum;
    }
}
