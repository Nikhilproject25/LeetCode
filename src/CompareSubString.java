package src;

public class CompareSubString {

    public static void main(String[] args){
        String a="sadbutsad";
        String b="sad";

        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!=a.charAt(i)) {
                System.out.println("-1");
            }
        }


    }

}
