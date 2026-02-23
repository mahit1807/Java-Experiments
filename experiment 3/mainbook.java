import java.util.ArrayList;

public class mainbook {
    public static void main(String[] args) {
        ArrayList<book> alb = new ArrayList<>();

        // Create books using proper constructors
        book b1 = new book("Icon", 499, "ABCD1001", "Fiction", "Author A");
        book b2 = new book("Outlive", 370, "ABDK223", "Non-fiction", "Peter Attia");
        book b3 = new book(b2); // copy of b2
        b3.title = "Harry Potter";
        b3.author = "JK Rowling";
        b3.genre = "Fiction"; // make it Fiction explicitly
        book b4 = new book("Outlive", 370, "ABDK223", "Non-fiction", "Peter Attia");
        book b5 = new book("My Experiments with Truth", 549, "ABCD3101", "Fiction", "Mahatma Gandhi");
        book b6 = new book("Mein Kampf", 999, "NA67ZI", "Auto-biography", "Adolf Hitler");

        // Add all books to the list
        alb.add(b1);
        alb.add(b2);
        alb.add(b3);
        alb.add(b4);
        alb.add(b5);
        alb.add(b6);

        // Print Fiction books
        System.out.println("---- Fiction Books ----");
        int fictionCount = 0;
        for(book b : alb){
            if("Fiction".equalsIgnoreCase(b.genre)){
                System.out.println("------------------");
                System.out.println("Title: " + b.title);
                System.out.println("Price: " + b.price);
                System.out.println("Author: " + b.author);
                System.out.println("ISBN: " + b.ISBN);
                System.out.println("Genre: " + b.genre);
                System.out.println("------------------");
                fictionCount++;
            }
        }
        System.out.println("Total Fiction books: " + fictionCount);

        // Compute average price of all books
        double totalPrice = 0;
        for(book b : alb){
            totalPrice += b.price;
        }
        double averagePrice = totalPrice / alb.size();
        System.out.println("Average price of all books: " + averagePrice);

        // Print Non-fiction books
        System.out.println("\n---- Non-fiction Books ----");
        int nonFictionCount = 0;
        for(book b : alb){
            if("Non-fiction".equalsIgnoreCase(b.genre)){
                System.out.println("------------------");
                System.out.println("Title: " + b.title);
                System.out.println("Price: " + b.price);
                System.out.println("Author: " + b.author);
                System.out.println("ISBN: " + b.ISBN);
                System.out.println("Genre: " + b.genre);
                System.out.println("------------------");
                nonFictionCount++;
            }
        }
        System.out.println("Total Non-fiction books: " + nonFictionCount);
    }
}
