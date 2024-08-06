import java.util.*;

class sortedSquares {
    public int[] sortedSquares(int[] nums) {

        int [] sortedSquare = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            sortedSquare[i] = nums[i] * nums[i];
        }

        Arrays.sort(sortedSquare);

        return sortedSquare;
    }
}
