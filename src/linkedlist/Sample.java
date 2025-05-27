package src.linkedlist;

//Kth Largest Element in an Array
//Given an integer array arr[] of size n elements and a positive integer K, the task is to return the kth largest element in the given array (not the Kth distinct element).
//Examples:
//
//Input:  [1, 23, 12, 9, 30, 2, 50], K = 3
//Output: 23
//
//Input:  [12, 3, 5, 7, 19], K = 2
//Output: 12

public class Sample {

    public static void main(String[] args) {
        int[] arr = {1,23,12,9,30,2,50};
        int k = 3;
        System.out.println(findKthLargest(arr, k));

        int[] arr1 = {12,3,5,7,19};
        int k1 = 2;
        System.out.println(findKthLargest(arr1, k1));
    }

    public static int findKthLargest(int[] arr, int k){
        if(arr == null || arr.length < k || k <= 0){
            throw new IllegalArgumentException("Invalid input");
        }
        int n = arr.length;
        return quickSelect(arr, 0, n-1, n-k);//kth largest = (n-k)th smallest

    }

    private static int quickSelect(int[] arr, int left, int right, int targetIndex){
        while(left <= right){
            int pivotIndex = partition(arr, left, right);
            if(pivotIndex == targetIndex){
                return arr[pivotIndex];
            }else if(pivotIndex < targetIndex){
                left = pivotIndex + 1;
            }else{
                right = pivotIndex - 1;
            }
        }
        throw new RuntimeException("Unexpected condition");
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                swap(arr, i++, j);
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
//select emp_id, dept_id, ROW_NUMBER() OVER (PARTITION BY dept_id ORDER BY salary desc) as rank_in_dept
