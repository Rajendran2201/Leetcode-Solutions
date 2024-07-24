class bruteForceSolution {
    public int oddCells(int m, int n, int[][] indices) {
       
       int[][] arr = new int[m][n];

       arr = initializeZeros(arr);
       
          for (int i=0; i<indices.length; i++){ 
                int row = indices[i][0];    
                int col = indices[i][1];    
            for(int j=0; j<n; j++){ 
                 arr[row][j] += 1;
            }
            for(int j=0; j<m; j++){
                arr[j][col] += 1;
            }
       }

        return findOddNumbers(arr);

    }

    public static int[][] initializeZeros(int[][] arr){
       for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            arr[i][j] = 0;
        }
       }
        return arr;
    }

    public static int findOddNumbers(int[][] arr){
        int oddNumbers = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] % 2 != 0){
                    oddNumbers += 1;
                }
            }
        }


        return oddNumbers;
    }




}




