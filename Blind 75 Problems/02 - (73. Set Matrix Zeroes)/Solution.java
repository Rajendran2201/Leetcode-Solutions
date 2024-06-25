class Solution {
    public void setRowToZeros(int[][] matrix, int m){
        for(int i = 0; i<matrix[0].length; i++){  // the size of row is matrix[0].length
            matrix[m][i] = 0;
        }
    }
    public void setColumnToZeros(int[][] matrix, int n){
        for(int i = 0; i<matrix.length; i++){  // the size of column is matrix.length
            matrix[i][n] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {

       ArrayList<Integer> rows = new ArrayList<>();
       ArrayList<Integer> columns = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int i=0; i<rows.size(); i++){
            setRowToZeros(matrix, rows.get(i));
            setColumnToZeros(matrix, columns.get(i));
        }
    }
}
