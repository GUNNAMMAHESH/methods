package com.practise.basics;

public class TwoPointers {
	  public static void TargetSet(String[] args) {
	        int[] nums = { -3, 2, 3, 3, 6, 8, 15 };
	        int target = 11;

	        int[] result = twoSum(nums, target);

	        if (result != null) {
	            System.out.println("Indices of the two elements whose sum is equal to the target:");
	            System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
	        } else {
	            System.out.println("No such elements found.");
	        }
	    }

	    static int[] twoSum(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length - 1;
	        int[] result = new int[2];

	        while (start < end) {
	            int sum = nums[start] + nums[end];
	            if (sum == target) {
	                result[0] = start + 1;
	                result[1] = end + 1;
	                return result;
	            } else if (sum < target) {
	                start++;
	            } else {
	                end--;
	            }
	        }

	        // If no such elements found
	        return null;
	    }

}
