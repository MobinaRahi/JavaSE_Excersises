package javase08.employee;
import javase08.Person;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
public class Employee extends Person {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void save() {

    }
}
