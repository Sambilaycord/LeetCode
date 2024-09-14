class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int temp = 0;
        
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>(i+1);
            for(int j = 0; j <= i ; j++){
                if (j == 0 || j == i){
                    row.add(1);
                } else{
                    temp = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    row.add(temp);
                }
            }
            
            list.add(row);
        }
        
        return list;
    }
}