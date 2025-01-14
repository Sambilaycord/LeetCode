class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int pivot = 0;
        
        for(int i = 0; i < nums.length; i++){
            pivot = i;
            
            if(pivot == 0){
                sumLeft = 0;
            } 
            
            for(int k = 0; k < i; k++){
                sumLeft += nums[k];
            }
            
            for(int j = i+1; j < nums.length; j++){
                sumRight += nums[j];
            }
            
            if(sumLeft == sumRight){
                return pivot;
            } else{
                sumLeft = 0;
                sumRight = 0;
            }
        }
            return -1;
           
    }
}