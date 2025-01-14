class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        int counterR = 0, counterL = 0, counterD = 0, counterU = 0;
        boolean right = true, left = false, down = false, up = false;
        
        List<Integer> list = new ArrayList<>(m*n);
        
        for (int index = 0; index < m * n; index++) {
            list.add(matrix[i][j]);
            
            if (right) {
                if (j == n - 1 - counterR) {
                    i++;
                    counterR++;
                    right = false;
                    down = true;
                } else {
                    j++;
                }
            } 
            else if (down) {
                if (i == m - 1 - counterD) {
                    j--;
                    counterD++;
                    down = false;
                    left = true;
                } else {
                    i++;
                }
            } 
            else if (left) {
                if (j == 0 + counterL) {
                    i--;
                    counterL++;
                    left = false;
                    up = true;
                } else {
                    j--;
                }
            } 
            else if (up) {
                if (i == 1 + counterU) {
                    j++;
                    counterU++;
                    up = false;
                    right = true;
                } else {
                    i--;
                }
            }
        }
        
        return list;
    }
}