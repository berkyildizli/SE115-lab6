import java.util.Random;
import java.util.Scanner;
public class lab7sc2 {

    class BankAccount{
        private int accountID;
        private int balance;

        public BankAccount(int a, int b){
            accountID = a;
            balance = b;
        }
        public BankAccount() {
            Random r = new Random(System.currentTimeMillis());
            accountID = r.nextInt(100000,999999);
            balance = 0;
        }
        public void deposit(){
            Scanner sc = new Scanner(System.in);
            int dpMoney = sc.nextInt();
            while(dpMoney <= 0) {
                System.out.println("please enter a number greater than 0");
                dpMoney = sc.nextInt();
            }
            balance +=dpMoney;
        }
        public void withdraw(){
            Scanner sc = new Scanner(System.in);
            int wdMoney = sc.nextInt();
            if(wdMoney - balance <0){
                System.out.println("Your account doesnt have enough money. Do you want to go into a debt (please answer yes or no");
                wdMoney = sc.nextInt();
 }
}
    }
}
