package praticeown;

public class revString {
    public static String reverseString(String str){
        String revStr = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
    public static void main(String[] args){
        String str = "Vipin";
        String result = reverseString(str);
        System.out.println(result);
    }
}
