package InstanceVsClass;

class Course {
    String courseName;
    int duration;  // in months
    double fee;
    static String instituteName = "ABC Institute"; // shared among all

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Python Programming", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy"); // updating for all courses

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

