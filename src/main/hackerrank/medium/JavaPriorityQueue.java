package hackerrank.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class JavaPriorityQueue {

}

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Priorities {

    private PriorityQueue<Student> studentsQueue = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa)
                    .reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId)
    );

    List<Student> getStudents(List<String> events) {
        for (String line : events) {
            if (line.startsWith("ENTER")) {
                String[] dividedLine = line.split(" ");
                this.studentsQueue.add(new Student(
                        Integer.parseInt(dividedLine[3]),
                        dividedLine[1],
                        Double.parseDouble(dividedLine[2])));
            } else {
                studentsQueue.poll();
            }
        }

        List<Student> result = new ArrayList<>();

        while (!studentsQueue.isEmpty()) {
            result.add(studentsQueue.poll());
        }
        return result;
    }
}
