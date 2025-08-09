package javase08.customer;

import javase08.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter

public class Customer extends Person {
    private String phone;

    @Override
    public String toString() {
        return super.toString() + " , phone : " +  getPhone();
    }


    @Override
    public void save() {

    }
}
