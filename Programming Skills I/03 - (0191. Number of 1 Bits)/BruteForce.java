/*

- Convert the given integer number into its equivalent binary number
- Using a for loop, traverse the charcter array of binary number 
- have a counter variable and ncrement it as soon as you encounter "1"
- return the counter

*/

class Solution {
    public String findBinary(int n){
        String binary_string = "";
        while (n>0){
            int rem = n%2;
            binary_string = rem + binary_string;
            n = n/2;
        }
        return binary_string;
    }
    public int hammingWeight(int n) {
        int hamming_weight = 0;
        String binary_number = findBinary(n);
        for(char i : binary_number.toCharArray()){
            if (i == '1'){
                hamming_weight += 1;
            }
        }
        return hamming_weight;
    }
}
