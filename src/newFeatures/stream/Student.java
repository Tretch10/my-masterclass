package newFeatures.stream;

public class Student {
    private int id;
    private String name;
    private String major;
    private double score;
    private String grade;

    public Student(int id, String name, String major, double score, String grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.score = score;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }
}
