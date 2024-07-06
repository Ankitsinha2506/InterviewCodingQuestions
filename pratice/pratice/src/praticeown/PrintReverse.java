package praticeown;

public class PrintReverse {
    public static String reverseString(String name){
        String reverseName = "";
        String[] part = name.split(" ");
         if (part.length == 3 ){
             reverseName = part[1] + " " + part[0] + " " + part[2];
         }
         return reverseName;
    }

    public static void main(String[] args){
        String name= "Vipin Kumar Yadav";
        String reverseName = reverseString(name);
        System.out.println(reverseName);
    }
}
