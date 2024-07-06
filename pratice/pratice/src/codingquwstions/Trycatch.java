package codingquwstions;

public class Trycatch {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = i + 1;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Exception Occured");
        } finally {
            i = i + 2;

        }
        System.out.println(i);
    }
}
