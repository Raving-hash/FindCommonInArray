import java.util.*;

class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        HashSet<Integer> col = new HashSet<>();
        for (int curr : nums) {
            if (col.contains(curr)) {
                return curr;
            }
            col.add(curr);
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int repeatNumber = solution.findRepeatNumber(new int[]{0, 2, 3, 4, 4, 2});
        System.out.println("repeatNumber = " + repeatNumber);
    }
}