public class Main {
    public static void main(String[] args) {
        // 1. Book
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James", 500);
        b1.display();
        b2.display();
        System.out.println("....................");

        // 2. Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        c1.display();
        c2.display();

        System.out.println("....................");

        // 3. Person
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person(p1); // copy constructor
        p1.display();
        p2.display();

        System.out.println("....................");

        // 4. HotelBooking
        HotelBooking h1 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1); // copy constructor
        h1.display();
        h2.display();

        System.out.println("....................");

        // 5. Library Book
        LibraryBook lb = new LibraryBook("C++", "Bjarne", 300, true);
        lb.display();
        lb.borrowBook();
        lb.borrowBook(); // second time (not available)
        System.out.println("....................");

        // 6. Car Rental
        CarRental cr = new CarRental("Neha", "Honda City", 5);
        cr.display();
        System.out.println("....................");
    }
}

// All other classes (Book, Circle, Person, HotelBooking, LibraryBook, CarRental) paste here
