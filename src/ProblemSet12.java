import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {
        int n = 3;
        int exponent = 3;
     /*   ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);

        ArrayList<Integer> inner = new ArrayList<Integer>();
        inner.add(2);
        inner.add(4);
*/
        System.out.println(factorial(n));
        //(Arrays.toString(
    }

    public static long factorial(int n) {
    if (n <= 0){return -1;}
    if (n <= 1) {return 1;}
        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {
    if (n < 0){return -1;}
    if(n == 0){return 0;}
    ArrayList<Long> fib = new ArrayList<Long>();
    fib.add(0L); fib.add(1L);

    while(fib.size() < n){
     long next = fib.get(fib.size()-1) + fib.get(fib.size()-2);
     fib.add(next);}

    return fib.get(fib.size()-1);
    }

    public static long triangle(int rows) {
        if (rows < 0){return -1;}
        long sum = 0;
        long triCount = rows;
        while(triCount > 0){
            sum += triCount;
            triCount --;
        }
        return sum;
    }

    public static long sumDigits(int n) {
    if(n < 0){return -1;}
    ArrayList<Long> digits = new ArrayList<Long>();
    long number = n;
    while(number > 0){
    digits.add(number%10);
    number /= 10; }

    int sum = 0;
    for(int i = 0; i < digits.size(); i++){
    sum += digits.get(i);}

    return sum;}

    public static long powerN(int base, int exponent) {
    if(base < 1 || exponent < 1){return -1;}
    long product = 1;
    while(exponent > 0){
    product *= base;
    exponent--;
    }
    return product;
    }
/*
    public static String changeXY(String text) {

    }

    public static int array11(int[] data, int index) {

    }

    public static int strCount(String text, String sub) {

    }

    public static boolean strCopies(String text, String sub, int n) {

    }

    public static int strDist(String text, String sub) {

    }*/
}
