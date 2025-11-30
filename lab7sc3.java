class Book {
    String title;
    int pages;


    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }


    public void addPages(int count) {
        this.pages += count;
    }


    public void printBook() {
        System.out.println("Book Info -> Title: " + this.title + " | Pages: " + this.pages);
    }
}


public class lab7sc3 {
    public static void main(String[] args) {


        System.out.println("--- Part 1: References and Aliasing ---");


        Book b1 = new Book("Java Programming", 300);


        Book b2 = b1;


        System.out.println("Adding 20 pages via b2...");
        b2.addPages(20);


        System.out.print("b1: ");
        b1.printBook();
        System.out.print("b2: ");
        b2.printBook();


        System.out.println();


        System.out.println("--- Part 2: Reference vs Value Comparison ---");


        Book b3 = new Book("Java Programming", 320);


        System.out.println("b1 Reference: " + b1);
        System.out.println("b3 Reference: " + b3);


        boolean referenceCheck = (b1 == b3);
        System.out.println("Reference comparison (b1 == b3): " + referenceCheck);


        boolean valueCheck = (b1.pages == b3.pages) && (b1.title.equals(b3.title));
        System.out.println("Field value comparison: " + valueCheck);

    }
}