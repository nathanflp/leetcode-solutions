import java.util.*;

class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet numsSet = new HashSet<>();

        for (int e : nums) {
            numsSet.add(e);
        }

        return numsSet.size() < nums.length;
    }
}
