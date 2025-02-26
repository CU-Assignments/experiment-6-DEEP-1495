import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 82),
            new Student("Bob", 68),
            new Student("Charlie", 90),
            new Student("David", 74),
            new Student("Eve", 78)
        );

        System.out.println("Students scoring above 75% sorted by marks:");
        students.stream()
                .filter(s -> s.getMarks() > 75) 
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed()) 
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
