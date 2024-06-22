class Solution {
    public int helper(int n, int product, int sum){
        while(n == 0){
            return product -
        }

        int digit = n % 10;
        product *= digit;
        sum += digit;

        return helper(n/10, product, sum);
    }
    public int subtractProductAndSum(int n) {
        return helper(n, 1, 0);
    }
}
