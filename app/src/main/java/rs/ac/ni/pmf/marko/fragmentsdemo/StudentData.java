package rs.ac.ni.pmf.marko.fragmentsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> students = Arrays.asList(
            Student.builder().id(1).firstName("Mita").lastName("Mitic").email("mita@mail.com").phone("060 111 22 33").build(),
            Student.builder().id(2).firstName("Pera").lastName("Mitic").email("pera@mail.com").phone("061 111 22 33").build(),
            Student.builder().id(3).firstName("Žika").lastName("Mitic").email("zika@mail.com").phone("062 111 22 33").build(),
            Student.builder().id(4).firstName("Tasa").lastName("Mitic").email("tasa@mail.com").phone("063 111 22 33").build(),
            Student.builder().id(5).firstName("Djoka").lastName("Mitic").email("djoka@mail.com").phone("064 111 22 33").build()
    );

    public static List<String> studentNames = new ArrayList<>();

    static {
        for (final Student student : students) {
            studentNames.add(student.getFirstName() + " " + student.getLastName());
        }
    }
}
