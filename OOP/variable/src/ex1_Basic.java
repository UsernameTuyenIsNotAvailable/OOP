import java.util.Scanner;

public class ex1_Basic  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int my_number;
         
        System.out.print( " my_number = ");
        my_number = scanner.nextInt();

        //  1 lay so nguyen n tu ban phim
        // 2 check n sang hay le
        // tinh tong


        for (int i = 0; i < my_number; i++) {
            if (i % 2 != 0) {

                System.out.println(  i);
            } else {
                System.out.println( + i);
            }
        }


    }
};







