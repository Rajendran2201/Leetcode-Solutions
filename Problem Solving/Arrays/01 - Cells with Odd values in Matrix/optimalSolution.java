class optimalSolution {
    public int oddCells(int m, int n, int[][] indices) {
        // initilize two matrices, one with size m and other with size n
        int[] row = new int[m];
        int[] col = new int[n];
        // take each co-ordinate from indices and increment corresponding array element
        for(int i=0; i<indices.length; i++){
            int x = indices[i][0];
            int y = indices[i][1];
            row[x]++;
            col[y]++;
        }
        // check odd numbers by adding two arrays leements 
        int oddCount = 0;
        for(int i=0; i<row.length; i++){
            for(int j=0; j<col.length; j++){
                if( ((row[i]+col[j]) % 2) != 0){
                    oddCount++;
                }
            }
        }


    return oddCount;
    }
}
