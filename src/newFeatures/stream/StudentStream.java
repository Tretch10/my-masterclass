package newFeatures.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStream {

    public static void main(String[] args) {
         List<Student> filteredList = getStudents().stream().filter((student) -> student.getScore()>70).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
         System.out.println("==================");
        List<Student> sortedList = getStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("==================");
        List<Double> mappedList = getStudents().stream().map(student -> student.getScore() + 0.5).collect(Collectors.toList());
        //mappedList.forEach(System.out::println);
        System.out.println(mappedList);

    }


    public static List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Lauren", "Chemistry", 78, "C"));
        studentList.add(new Student(2, "Hart", "Biology", 85, "B"));
        studentList.add(new Student(3, "Alphaeus", "Kinesiology", 79, "C"));
        studentList.add(new Student(4, "Zubairu", "Engineering", 66, "D"));
        studentList.add(new Student(5, "Henry", "Computer Science", 81, "B"));
        studentList.add(new Student(6, "Steve", "Business", 90, "A"));
        return studentList;
    }
}
