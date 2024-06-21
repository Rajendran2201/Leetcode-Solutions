So for this problem, my inital thought would be to 

- Create an Array list
- Initialise a for loop with low and traverse till high 
- Check if the number is odd or even
- If odd, add into the array list
- return the size of the array list if the traversal is over 


```
class Solution {
    public int countOdds(int low, int high) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=low; i<high+1; i++){
            if(i%2 != 0){
                arr.add(i);
            }
        }
        return arr.size();
    }
}

```



