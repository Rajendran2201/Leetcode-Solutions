class twoPointerApproach {
    public int searchFromBeginning(int[] nums, int element){
        for (int i = 0; i<nums.length; i++){
            if(element == nums[i]){
                return i;
            }
        }
        return -1;
    }
    public int searchFromEnding(int[] nums, int element){
         for (int i = nums.length-1; i>=0; i--){
            if(element == nums[i]){
                return i;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        // two pointer approach
        int[] ans = new int[2];

      // copying the array as after sorting, we can track the original index of the elements
        int[] dup = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dup[i] = nums[i];
        }

      // sorting the array
        int i=0, j=nums.length-1;
        Arrays.sort(nums);

      
        while(true){
            int sum = nums[i]+ nums[j];
            if(sum == target){
              // since duplicate elements may present, we need two functions; one from the starting and the other from the ending
                ans[0] = searchFromBeginning(dup, nums[i]);
                ans[1] = searchFromEnding(dup, nums[j]);
                break;
            }else if (sum > target){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
