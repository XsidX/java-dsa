public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial, recursive solution");
        Main recursion = new Main();
        int rec = recursion.factorial(-3);
        System.out.println(rec);
    }

    public int factorial(int n) {
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}