import java.util.ArrayList;

public class ProblemSet12 {

    public long factorial(int n) {
    if (n <= 0){return -1;}
    if (n <= 1) {return 1;}
        return n * factorial(n - 1);
    }

    public long fibonacci(int n) {
    if (n < 0){return -1;}
    if(n == 0){return 0;}
    if(n == 1 || n == 2){return 1;}

    return fibonacci(n-1) + fibonacci(n-2);
    }

    public long triangle(int rows) {
        if (rows < 0){return -1;}
        if (rows == 1){return 1;}

        return rows + triangle(rows-1);
    }

    public long sumDigits(int n) {
    if(n < 0){return -1;}
    if(n == 0){return 0;}
    return  n%10 + sumDigits(n/10);
    }

    public long powerN(int base, int exponent) {
    if(base < 1 || exponent < 1){return -1;}
    if(exponent == 1){return base;}

    return base * powerN(base,exponent-1);
    }

    public String changeXY(String text) {
    if(text == null){return null;}
    if (text.length() == 0) {return text;}
    char replace;
        if(text.charAt(0) == 'x'){ replace = 'y'; }
        else{ replace = text.charAt(0); }

        return replace + changeXY(text.substring(1));
    }

    public int array11(int[] data, int index) {
        if(data == null || index < 0 || index > data.length){return -1;}
        if(index > data.length-1){return 0;}

        int count = 0;
        if(data[index] == 11){count++;}

        return count + array11(data, index+1);
    }

    public int strCount(String text, String sub) {
        if (text == null || sub == null || sub.length() <= 0) {return -1;}
        if(text.length() < sub.length()){return 0;}

        int count = 0;
        if(text.substring(0,sub.length()).equals(sub)){
            count++;
            return count + strCount(text.substring(sub.length()), sub);
        } else{
            return count + strCount(text.substring(1), sub);
        }
    }

    public boolean strCopies(String text, String sub, int n) {//is it right?
        if (text == null || sub == null || sub.length() <= 0 || n < 0) {return false;}
        if(text.length() < sub.length()){return false;}

        int count = 0;
        if(text.substring(0,sub.length()).equals(sub)){
            count++;}

        return (count + strCount(text.substring(1), sub)) >= n;

    }

    public int strDist(String text, String sub) {
            if(text == null || sub == null || sub.equals("")){ return -1; }
            return meanwhile(text, sub, 0) - text.indexOf(sub) + sub.length() - 1;

        }
    private int meanwhile(String text, String sub, int index){
        int newIndex = text.indexOf(sub, index);
        if(newIndex >= 0){ return meanwhile(text, sub, newIndex+1); }
        return index;
    }
}
