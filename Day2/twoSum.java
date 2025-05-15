//  Leet Code -> 1. Two Sum

// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add 
// up to target.

// You may assume that each input would have exactly one 
// solution, and you may not use the same element twice.

// You can return the answer in any order. 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                return new int[] { i, map.get(b) };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}