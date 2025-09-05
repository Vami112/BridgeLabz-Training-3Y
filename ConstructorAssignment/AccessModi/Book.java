package AccessModi;

// Base Class
class Book {
    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter & Setter for private variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass
class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + format);
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123-456", "Java Programming", "James Gosling", "PDF");
        eb.display();

        eb.setAuthor("Updated Author");
        eb.display();
    }
}

