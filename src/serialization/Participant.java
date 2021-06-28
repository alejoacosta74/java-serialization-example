package serialization;

import java.io.Serializable;

public class Participant implements Serializable {
    private final String firstName;
    private final String lastName;
    private int age;
    
    public Participant (String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }

    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
}