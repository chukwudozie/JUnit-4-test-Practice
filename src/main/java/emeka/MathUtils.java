package emeka;

public class MathUtils {
    public static void main(String[] args) {
        int a = 2; int b = 3;
        System.out.println(new MathUtils().add(a, b));
        System.out.println(new MathUtils().multiply(a, b));
    }
    public int add(int a, int b){
        return  a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}

