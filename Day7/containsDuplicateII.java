// LeetCode -> 219. Contains Duplicate II

// https://leetcode.com/problems/contains-duplicate-ii/description/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashSet<Integer> set = new HashSet<Integer>();
      for(int i = 0; i < nums.length ; i++){
        if(set.contains(nums[i]))   
            return true;
        set.add(nums[i]);

        if(set.size() > k)
            set.remove(nums[i-k]);
      }
        return false;
    }
}