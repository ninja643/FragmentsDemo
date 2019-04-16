package rs.ac.ni.pmf.marko.fragmentsdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Student {
    int id;
    String firstName;
    String lastName;
    String email;
    String phone;
}
