class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + availability);
    }
}
