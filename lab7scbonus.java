import java.util.Scanner;

class Product {
    private String name;
    private int stock;


    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }


    public void buyOne() {
        if (stock > 0) {
            stock--;
            System.out.println("Success! You bought a " + name + ".");
        } else {
            System.out.println("Out of stock!");
        }
    }


    public void printInfo() {
        System.out.println("Product Name: " + name + " | Remaining Stock: " + stock);
    }
}

public class lab7scbonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many products does the store have? ");
        int size = scanner.nextInt();
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for product #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();

            products[i] = new Product(name, stock);
        }
        System.out.println("\n--- SHOPPING STARTED ---");
        while (true) {
            System.out.print("\nEnter product name to buy (or 'Q' to quit): ");
            String inputName = scanner.next();


            if (inputName.equalsIgnoreCase("Q")) {
                break;
            }

            boolean found = false;


            for (Product p : products) {

                if (p.getName().equalsIgnoreCase(inputName)) {
                    p.buyOne();
                    found = true;
                    break;
                }
            }


            if (!found) {
                System.out.println("No such product!");
            }
        }


        System.out.println("\n--- FINAL INVENTORY ---");
        for (Product p : products) {
            p.printInfo();
        }

        scanner.close();
    }
}