import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayClass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int[] a = new int[15];
        a[0] =1;
        a[3] = 350;
        a[5] = 200;
        a[7] = rand.nextInt(151);
        a[9] = 650;
       a[12] = reader.nextInt();
       a[14] = 700;

//        System.out.println(a[0]);
//        System.out.println(a[7]);
//        System.out.println(a[9]);
//        System.out.println(a[3]);
//        System.out.println(a[5]);
//        System.out.println(a[14]);
        for (int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }







    }
}
