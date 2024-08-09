import java.util.*;

class singleNumber {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> singleOne = new HashMap<>();

        for (int e : nums) {
            if (singleOne.containsKey(e)) {
                singleOne.put(e, singleOne.get(e) + 1);
            } else {
                singleOne.put(e, 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (singleOne.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return -1;
    }
}
