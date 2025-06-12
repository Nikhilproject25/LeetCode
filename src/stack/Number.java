package src.stack;

public class Number {
    public static void main(String[] args) {
        int num=38;
        int n=0;
        while(num>9) {
            n = num / 10;
            n = n + (num % 10);
            num=n;
        }
        System.out.println(num);
    }

}
