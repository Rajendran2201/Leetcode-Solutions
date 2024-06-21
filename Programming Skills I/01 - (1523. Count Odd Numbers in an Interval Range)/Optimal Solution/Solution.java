class Solution {
    public int countOdds(int low, int high) {
        int noOfElements = (high-low) + 1;
        int odds = noOfElements / 2;
        if (low%2 !=0 && high%2 !=0){
            odds = odds + 1;
        }

        return odds;
    }
}
