package src;

public class Pal {
    public static void main(String[] args){
        superDigit("148",3);
    }


    public static int superDigit(String n, int k) {
        // Write your code here
        int sum=0;
        int num[] = new int[]{Integer.parseInt(n)};
        for(int i=0;i<k-1;i++){
            sum = sum + num[i];
        }
        return sum;
    }

}

