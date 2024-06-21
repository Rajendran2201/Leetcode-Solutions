

- Now, instead of adding in a Arraylist and returning the size, I am gonna use a variable named count
- This is decrease the space complexity

```
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i=low; i<high+1; i++){
            if(i%2 != 0){
                count++;
            }
        }
        return count;
    }
}


```
