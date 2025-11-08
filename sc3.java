import java.util.Random;
import java.util.Scanner;

public class sc3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr_weather = {4,4,4,4,3,3,3,2,2,1};
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int guess = rand.nextInt(0,10);
            int weather = arr_weather[guess];

            switch (weather) {
                case 1 :
                    arr[i] = weather;
                    System.out.print("Stormy ");
                    break;
                case 2 :
                    arr[i] = weather;
                    System.out.print("Rainy ");
                    break;
                case 3 :
                    arr[i] = weather;
                    System.out.print("Cloudy ");
                    break;
                case 4 :
                    arr[i] = weather;
                    System.out.print("Sunny ");
                    break;
            }
        }

        System.out.println();
        System.out.println("Enter the number of the day you want to learn: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (arr[input]) {
            case 1 :
                System.out.print("Stormy ");
                break;
            case 2 :
                System.out.print("Rainy ");
                break;
            case 3 :
                System.out.print("Cloudy ");
                break;
            case 4 :
                System.out.print("Sunny ");
                break;
 }
}
}