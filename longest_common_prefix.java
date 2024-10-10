public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        
        if (strs.length == 0 || strs == null){
            return prefix;
        }
        
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length ; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)){
                    return prefix;
                }
            }
            
            prefix += strs[0].charAt(i); 
        }
        
        return prefix;
    }
}
