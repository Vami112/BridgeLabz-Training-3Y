package AccessModi;

// Base Class
class Student {
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                           ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Ravi", 8.5, "Computer Science");
        pg.display();

        pg.setCGPA(9.0); // modifying private CGPA using public method
        pg.display();
    }
}

