package javase08.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter

public class AdministrativeEmployee extends Employee {
    private String accessLevel;

    private static final ArrayList<AdministrativeEmployee> administrativeEmployees = new ArrayList<>();

    @Override
    public void save() {
        administrativeEmployees.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", accessLevel : " + accessLevel;
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان اداری : " + "\n");
        for (AdministrativeEmployee adminEmployee : administrativeEmployees) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d  , AccessLevel : %-10s %n", adminEmployee.getName(), adminEmployee.getFamily(), adminEmployee.getAddress(), adminEmployee.getNationalId(), adminEmployee.getAccessLevel());
        }
    }
}
