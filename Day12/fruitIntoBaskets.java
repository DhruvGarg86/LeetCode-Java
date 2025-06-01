// LeetCode -> 904. Fruit Into Baskets

// https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            if (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0)
                    map.remove(fruits[l]);
                l++;
            }
            if (map.size() <= 2)
                maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}