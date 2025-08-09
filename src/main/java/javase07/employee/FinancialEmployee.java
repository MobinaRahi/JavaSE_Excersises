package javase07.employee;

import java.util.ArrayList;

public class FinancialEmployee extends Employee {
    private int category;
    private static final ArrayList<FinancialEmployee> financialEmployees = new ArrayList<>();

    public FinancialEmployee(String name, String family, String address, int nationalId, int category) {
        super(name, family, address, nationalId);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

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