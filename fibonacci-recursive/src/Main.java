public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci, recursive solution");
        Main recursion = new Main();
        int rec = recursion.fibonacci(4);
        System.out.println(rec);
    }
        public int fibonacci(int n) {
            if(n<0) {
                return -1;
            }
            if (n==0 || n==1) {
                return n;
            }
            return fibonacci(n-1) + fibonacci(n-2);
        }
}