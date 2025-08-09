package javase08.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
@NoArgsConstructor
@SuperBuilder

public class NormalEmployee extends Employee {
    private static final ArrayList<NormalEmployee> normalEmployees = new ArrayList<>();

    @Override
    public void save() {
        normalEmployees.add(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان عادی : " + "\n");
        for (NormalEmployee normalEmployee : normalEmployees) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d %n", normalEmployee.getName(), normalEmployee.getFamily(), normalEmployee.getAddress(), normalEmployee.getNationalId());

        }
    }
}
