import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {
        int[] data = {11, 2, 3, 11};
        int index = 0;

        System.out.println(array11(data, index));
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
    if(n == 1 || n == 2){return 1;}

    return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long triangle(int rows) {
        if (rows < 0){return -1;}
        if (rows == 1){return 1;}

        return rows + triangle(rows-1);
    }

    public static long sumDigits(int n) {
    if(n < 0){return -1;}
    if(n == 0){return 0;}
    return  n%10 + sumDigits(n/10);
    }

    public static long powerN(int base, int exponent) {
    if(base < 1 || exponent < 1){return -1;}
    if(exponent == 1){return base;}

    return base * powerN(base,exponent-1);
    }

    public static String changeXY(String text) {
    if(text == null){return null;}
    if (text.length() == 0) {return text;}
    char replace;
        if(text.charAt(0) == 'x'){ replace = 'y'; }
        else{ replace = text.charAt(0); }

        return replace + changeXY(text.substring(1));
    }

    public static int array11(int[] data, int index) {
        if(data == null || index < 0 || index > data.length){return -1;}
        if(index > data.length-1){return 0;}

        int count = 0;
        if(data[index] == 11){count++;}

        return count + array11(data, index+1);
    }

    /*
    public static int strCount(String text, String sub) {
        if (text == null || sub == null) {return -1;}
        if (sub.length() <= 0 ) {return -1;}

    }

    public static boolean strCopies(String text, String sub, int n) {

    }

    public static int strDist(String text, String sub) {

    }*/
}
