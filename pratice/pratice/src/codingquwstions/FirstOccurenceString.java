package codingquwstions;

public class FirstOccurenceString {
    public static int FirstOccurence(String Fname,String text){
        int a= Fname.length();
        int b = text.length();

        if (text.equals("")){
            return 0;
        }
        for (int i = 0; i < a-b+1; i++){
            int temp = i;
            for (int j = 0; j < b; j++){
                if (Fname.charAt(temp) != text.charAt(j)){
                    break;
                }
                temp++;
            }
            if (temp - i == b ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        String Fname = "Lokesh";
        String text = "es";
        int result = FirstOccurence(Fname,text);
        System.out.println("First Occurence :" + result);
    }
}
