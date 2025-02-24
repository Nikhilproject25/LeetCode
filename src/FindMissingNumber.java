package src;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark each index corresponding to the value as visited
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Step 2: Collect all indices with positive values (indicating missing numbers)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Add 1 to index to get the missing number
            }
        }

        return result;
    }
    public static void main(String args[]){
        FindMissingNumber number = new FindMissingNumber();
        int [] pass ={4,3,2,7,8,2,3,1};
       List<Integer>result2= number.findDisappearedNumbers(pass);
       System.out.println(result2);
    }
}
