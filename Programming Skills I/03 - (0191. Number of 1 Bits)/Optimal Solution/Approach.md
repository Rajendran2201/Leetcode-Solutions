## Approach

- have a counter variable named hamming_weight
- while loop traverses until the number is greater than 0
    - n & 1 signifies that the least significant bit (LSB) of the number is done AND operation with 1 and add to the counter
      - If the least significant bit is 1, n & 1 will be 1.
      - If the least significant bit is 0, n & 1 will be 0.
    - Then, the LSB has to be ommitted, for that we are using a right shift operation


## Code


```
class Solution {
    public int hammingWeight(int n) {
        int hamming_weight = 0;
        while(n > 0){
            hamming_weight += (n&1);
            n >>>= 1;
        }
        return hamming_weight;
    }
}

```

Time Complexity: O(n)

Space Complexity: O(1)
