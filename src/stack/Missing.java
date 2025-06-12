package src.stack;

import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int[] nums={0,1};
        Arrays.sort(nums);
        int result=0;
        //System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            if(nums[i+1]!=nums[i]+1){
                result= nums[i]+1;
                System.out.println(result);
            }
        }

    }
}
