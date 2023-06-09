package hackerrank.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaPriorityQueueTest {
    @Test
    void testFromExcercise() {
        List<String> events = List.of("ENTER John 3.75 50",
                "ENTER Mark 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ashley 3.9 42",
                "ENTER Maria 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Dan 3.95 50",
                "SERVED");
        List<Student> expected = List.of(new Student(50, "Dan", 3.95),
                new Student(42, "Ashley", 3.9),
                new Student(35, "Shafaet", 3.7),
                new Student(46, "Maria", 3.6));

        List<Student> result = new Priorities().getStudents(events);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getId(), result.get(i).getId());
            assertEquals(expected.get(i).getName(), result.get(i).getName());
        }
    }

}