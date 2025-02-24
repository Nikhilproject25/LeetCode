package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            result.add(nums1[i]);

        }
        for(int j=0;j<n;j++){
            result.add(nums2[j]);
        }
        Collections.sort(result);
        System.out.println(result);
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Solution s = new Solution();
        s.merge(nums1,m,nums2,n);
    }
}
