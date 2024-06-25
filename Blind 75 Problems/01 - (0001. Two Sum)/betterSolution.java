class betterSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];
            boolean is_present = hashMap.containsKey(difference);
            if(is_present){
                arr[0] = hashMap.get(difference);
                arr[1] = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return arr;
    }
}
