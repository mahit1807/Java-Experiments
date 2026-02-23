public class book {
    public String title;
    public double price;
    public String ISBN;
    public String genre;
    public String author;

    public book(){
        title = "Ready Player One";
        price = 458;
        ISBN = "ABR4212";
        genre = "Fiction";
        author = "Ernest Cline";
    }

    public book(String title, double price, String genre ){ // throw exception handling for genre
        this.title = title;
        this.price = price;
        this.genre = genre;
    }

    public book(String title, double price, String ISBN, String genre, String author){
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.genre = genre;
        this.author = author;
    }

    public book(book b){
        this.title = b.title;
        this.price = b.price;
        this.ISBN = b.ISBN;
        this.genre = b.genre;
        this.author = b.author;
    }   
    
}
