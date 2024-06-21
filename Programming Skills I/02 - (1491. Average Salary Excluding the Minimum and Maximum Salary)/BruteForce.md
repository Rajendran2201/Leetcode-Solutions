
- sort the array
- compute the sum of the salaries except the first and last index
- divide the sum by the (length-2) of the array
- return the average

```
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0, n = salary.length;
        for(int i=1; i<n-1; i++){
            sum += salary[i];
        }
        return sum / (n-2);
    }
}
```
