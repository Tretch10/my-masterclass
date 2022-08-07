package masterclass;

public class Students {
    private String name;
    private int id;
    private String department;
    private double grade;

    public Students(String name, int id, String department, double grade){
        this.name = name;
        this.id = id;
        this.department = department;
        this.grade = grade;
    }
    // create method to calculate the grade
    public double calculateGrade(double grade){
        return grade;
    }
    // create method to calculate the average
    public double calculateAverage(double grade){
        return grade;
    }
    // create method to calculate the final grade
    public static void main(String[] args) {
        // create an object of the class
        Students student = new Students("John", 123, "Computer Science", 9.0);
        // create an object of the class

    }
}
