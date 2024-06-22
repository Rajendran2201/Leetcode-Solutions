/*

 - let a, b and c are the three sides of the triangle 
 - sum of any two sides should be greater than the third side to form a valid triangle
        - a+b > c
        - b+c > a
        - a+c > b
 - If no values satisfies these conditions, return 0

 INTUITION:

 - sort the array and traverse from reverse order
        - Why sort and reverse order?
        - let [1, 2, 3, 4, 5] be a sorted array let a = 3, b = 4, c = 5
        - there is no need to checl if b+c > a and a+c > b
        - Now we only need to check if a+b > c
 - We have reduced our algo from checking three conditions to one condition

 */

class Solution {
    public int largestPerimeter(int[] nums) {
        int[] arr = new int[3];
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int flag = 0;
        for (int i = nums.length-1; i>1; i--){
            if(flag == 1){
                break;  // since we need the maximum perimeter
            }
            if (nums[i-1] + nums[i-2] > nums[i]){
                arr[0] = nums[i-2];
                arr[1] = nums[i-1];
                arr[2] = nums[i];
                flag = 1;
            }
        } 
        if (arr.length<3){
            return 0;
        }
        int perimeter = 0;
        for (int i = 0; i<arr.length; i++){
            perimeter += arr[i];
        } 
        return perimeter;
     }
}
