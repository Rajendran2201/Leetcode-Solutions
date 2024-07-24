// 1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int max = 0;
        for(int element: candies){
            if(element > max){
                max = element;
            }
        }

        for(int element: candies){
            int luckyKid = element + extraCandies;
            if(luckyKid < max){
                results.add(false);
            }else{
                results.add(true);
            }
        }

        return results;
    }
}
