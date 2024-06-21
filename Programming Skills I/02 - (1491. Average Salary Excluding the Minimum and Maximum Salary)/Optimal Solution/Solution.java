/*

- find the sum of the array
- find the maximum and minimum element from the array
- subtract the maximum and minimum salary from the sum
- divide the sum by (length-2)

In this approach, there is no need to sort the array therefore, the time complexity drops from O(nlogn) to O(n)

 */

class Solution {
    public double average(int[] salary) {
       int max = salary[0], min = salary[0], sum = 0, n = salary.length;
       for (int i : salary){
        sum += i;
        if(i>max){max = i;}
        if(i<min){min = i;}
       }
       sum -= max;
       sum -= min;

       return sum / (n-2);
    }
}
