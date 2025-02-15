public class Book {
    protected String title;
    protected String author;
    protected double price;
    public Book(){
        title = "";
        author = "";
        price = 0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String s = "Title: " + title;
        s += ", Author: " + author;
        s += ",Price: " + price;
        return s;
    }
}
