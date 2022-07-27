package java8;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    int age;
    String name;
    int weight;
    Boolean sex;
    String specialty;

    public String userSex(boolean sex) {
        if (sex)
            return "Male";
        else
            return "Female";
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s, Weight: %s, Sex: %s, Specialty: %s", name, age,
                weight, userSex(sex), specialty);
    }
}
