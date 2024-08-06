import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], +1);
            } else {
                numsMap.put(nums[i], 0);
            }
        }

        for(int i = 0; i<nums.length;i++){
            if(numsMap.get(nums[i]) == 0){
                sum += nums[i];
            }
        }
        
        return sum;
    }
}
