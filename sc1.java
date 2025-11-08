import java.util.Scanner;

public class sc1 {
    public static void main(String[] args) {
        System.out.println("Enter a number for greater array: ");

        Scanner sc = new Scanner(System.in);
        int big = sc.nextInt();

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1001;
        }

        int[] larger = new int[big];
        for (int i = 0; i < arr.length; i++) {
            larger[i] = arr[i];
            System.out.println(larger[i]);
 }
}
}
