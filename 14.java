import java.util.*;

class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null){
            return "";
        }

        Arrays.sort(strs);
        StringBuilder strBuilder = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                strBuilder.append(strs[0].charAt(i));
            }
            else break;
        }
        return strBuilder.toString();
    }
}
