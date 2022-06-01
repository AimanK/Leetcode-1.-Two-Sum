import java.util.HashMap;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    /* 

      Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


    Given an array, ex: nums =  [2,7,11,15], target = 9;

    Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1]

    */

    int[] nums = {2,7,11,15};

    int target = 9;

   int[] ansarr = twoSum(nums, target);

   System.out.println(Arrays.toString(ansarr));

    /**
      SOLUTION: 
    - Initialze a new empty HashMap<Integer, Integer>
    - Create a for loop and iterate over the length of the integer array, adding each value to your HashMap
    - If an element in the integer array already exists in your Map, check if the complement to that number for target also exists in the Map. If it does, return an array of the key of the complement, and the index at that point in the loop. 
    - Else, if it doesn't add that value to the HashMap
    - If no solution found, at end of program, return an empty array.
    **/
    
  }


  static int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> tsMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++)
      {
        int complement = target - nums[i];
        if (tsMap.containsKey(complement))
        {
          return new int[] {tsMap.get(complement), i};
        }
        else
        {
          tsMap.put(nums[i], i);
        }
      }

    return new int[] {};

    
  }
}