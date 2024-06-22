class Solution {
    public int findProduct(int n){
        int product = 1;
        while(n>0){
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        return product;
        
    }
    public int findSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
        
    }
    public int subtractProductAndSum(int n) {
        int product = findProduct(n);
        int sum = findSum(n);
        return product-sum;
    }
}
