public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of digits of a positive integer, recursive solution");
        Main main = new Main();
        var result  = main.sumOfDigits(242);
        System.out.println(result);
    }

    public int sumOfDigits(int n) {
        if(n<=0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}