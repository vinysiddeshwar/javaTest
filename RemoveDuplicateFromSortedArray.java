import java.util.Arrays;
import java.util.Scanner;
//Given an integer array nums sorted in non-decreasing order,
//remove the duplicates in-place such that each unique element appears only once.
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order
//they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class RemoveDuplicateFromSortedArray {

     //Time Complexity =O(N)
     //Space Complexity= O(1)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //taking inputs for array length
        System.out.println("enter the array length");
        int numOfElementsInArray = scan.nextInt();
        //creating array with given array length
        int[] nums = new int[numOfElementsInArray];
        System.out.println("enter the elements of array");
        //taking inputs for array elements
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scan.nextInt();
        }
        //sorting in ascending order
        int[] sortedArray = sortedArray(nums);
        //Sorting array as user might input elements in any order
        System.out.println("Sorted Array in asscening ordert:" + Arrays.toString(sortedArray));
        //removing the duplicates
        int k = removeDuplicates(sortedArray);
        System.out.println(k);


//        test case 1
//        int[] testArrayOne = {1,1,2};
//        int kForTestArrayOne = removeDuplicates(testArrayOne);
//        System.out.println(kForTestArrayOne);
//        int[] testArrayTwo = {0,0,1,1,1,2,2,3,3,4};
//        int kForTestArrayTwo = removeDuplicates(testArrayTwo);
//        System.out.println(kForTestArrayTwo);
    }

    //Function to remove Duplicates
     static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    // Function to sort array in ascending order
    static int[] sortedArray (int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                int temp;
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
