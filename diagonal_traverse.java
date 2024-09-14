class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int i = 0, j = 0;
        boolean up = true;
         
        
        int[] arr = new int[m * n];
        
        for(int index = 0; index < m * n; index++){
            arr[index] = mat[i][j];

            if(up){
                if(j == n - 1){
                    i++;
                    up = false;
                } else if (i == 0){
                    j++;
                    up = false;
                } else{
                    i--;
                    j++;
                }
            } else {
                if(i == m - 1){
                    j++;
                    up = true;
                } else if (j == 0){
                    i++;
                    up = true;
                } else{
                    i++;
                    j--;
                }
            }
        }
        
        return arr;
    }
}