package src;

public class AddBinary {
    public static void main(String[] args){
        String s1 ="1010";
        String s2 ="1011";
        int a =Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        String s3 = String.valueOf(s1.charAt(s1.length()-1)+s2.charAt(s2.length()-1));

    }
}
