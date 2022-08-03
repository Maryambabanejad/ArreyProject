import java.util.Random;
public class Array3Class {
    public static void main(String[] args) {
        Static int[] ReaderArray ( int n){
            Random rand = new Random();
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = rand.nextInt(40);
            }

        }
    }
}
