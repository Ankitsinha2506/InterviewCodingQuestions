package codingquwstions;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static String CommonPrefix(List<String> strs){
        if (strs == null || strs.size() == 0){
            return "";
        }
        String r = strs.get(0);
        for(int i = 0; i < r.length(); i++){
            char Currentchar = r.charAt(i);

            for (int j = 1; j < strs.size(); j++){
                if (i >= strs.get(j).length() || strs.get(j).charAt(i) != Currentchar){
                    return r.substring(0,i);
                }
            }
        }
        return r;
    }
    public static void main(String[] args){
        List<String> strs = new ArrayList<>();
        strs.add("Flower");
        strs.add("Fli");
        strs.add("Flight");
        String res = CommonPrefix(strs);
        System.out.println(res);


    }
}
