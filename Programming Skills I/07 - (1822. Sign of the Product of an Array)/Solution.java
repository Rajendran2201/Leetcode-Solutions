class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for (int i : nums) {
            product *= i;
        }
        if (product > 0) {
            return 1;
        } else if (product < 0) {
            return -1;
        }
        return 0;
    }
}
