package src;

import java.util.Arrays;

public class SortedList {
    public static void main(String[] args){
        int[] a={1,1,2,3,3};
        for(int i=0;i<a.length-1;i++) {
            if(a[i] == a[i + 1]){
                Arrays.stream(a).skip(a[i+1]);
                System.out.println(a[i]);
            }
            if (a[i] != a[i + 1]) {
                System.out.println(a[i+1]);
            }
        }
    }
}
