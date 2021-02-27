import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {
        int rows = 0;
        //int end = 16;
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
        System.out.println(triangle(rows));
        //(Arrays.toString(
    }

    public static long factorial(int n) {
    if (n <= 0){return -1;}
    long product = 1;
    long factCount = n;
    while(factCount > 0){
      product *= factCount;
      factCount --;
    }
    return product;
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

    }
/*
    public static long powerN(int base, int exponent) {

    }

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
