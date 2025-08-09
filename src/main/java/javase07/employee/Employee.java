package javase07.employee;

import javase07.Person;

public class Employee extends Person {

    public Employee(String name, String family, String address, int nationalId) {
        super(name, family, address, nationalId);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
