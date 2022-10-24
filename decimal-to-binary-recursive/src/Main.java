public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        var result = main.decimalToBinary(10);
        System.out.println(result);
    }

    public int decimalToBinary(int n){
        if(n==0){
            return 0;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }
}