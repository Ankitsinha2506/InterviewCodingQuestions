package Pattern;

public class righttriangle {
    public static void main(String[] args){
        // Right triangle
        int num=1;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + num );
                num++;
            }
            System.out.println();
        }

        for (int i = 1; i <= 4 ; i++) {
            for (int j = 4; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
