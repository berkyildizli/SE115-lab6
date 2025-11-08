import java.util.Random;

public class sc2 {
    public static void main(String[] args) {
        sc2();
    }

    public static void sc2() {
        Random rand = new Random();
        int number = rand.nextInt(10,21);

        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            int num = rand.nextInt(1,100);
            arr[i] = num;
            System.out.println(arr[i]);
        }

        System.out.println();

        int[] arrRev = new int[number];
        for (int i = number - 1; i >= 0; i--) {
            arrRev[i] = arr[i];
            System.out.println(arrRev[i]);
 }
}
}