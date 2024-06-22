class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // A sequence is said to be in AP if the difference between the numbers is same
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 1; i--) {
            if ((arr[i] - arr[i - 1]) != (arr[i - 1] - arr[i - 2])) {
                return false;
            }
        }
        return true;
    }
}
