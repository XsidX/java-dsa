public class Main {
    public static void main(String[] args) {
        System.out.println("Power of a number, recursive solution");
        Main main = new Main();
        var result = main.power(4, 0);
        System.out.println(result);
    }

    public int power(int base, int exp){
        if(exp<0){
            return -1;
        }
        if(exp==0){
            return 1;
        }
        return base * power(base, exp -1);
    }
}