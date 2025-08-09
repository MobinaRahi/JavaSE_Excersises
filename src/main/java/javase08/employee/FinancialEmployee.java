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
public class FinancialEmployee extends Employee {
    private int category;
    private static final ArrayList<FinancialEmployee> financialEmployees = new ArrayList<>();

    @Override
    public void save() {
        financialEmployees.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " FinancialEmployee " + " category= " + category;
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان مالی : " + "\n");
        for (FinancialEmployee financialEmployee : financialEmployees) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d  category : %-5d %n", financialEmployee.getName(), financialEmployee.getFamily(), financialEmployee.getAddress(), financialEmployee.getNationalId(), financialEmployee.getCategory());

        }
    }
}
