import java.util.Random;

public class sc4 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rand = new Random();
        int peaks = 0;
        int peak = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = rand.nextInt(1,101);
            arr[i] = number;
            if (peak < arr[i]) {
                peak = arr[i];
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.println(i + ". " + arr[i] + " ");
                peaks += 1;
            }
        }
        System.out.println("Total number of peaks: " + peaks);
        System.out.println("Highest peak is : " + peak);
    }
}
