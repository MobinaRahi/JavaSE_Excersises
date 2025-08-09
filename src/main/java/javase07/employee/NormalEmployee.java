package javase07.employee;

import java.util.ArrayList;

public class NormalEmployee extends Employee {

    private static final ArrayList<NormalEmployee> normalEmployees = new ArrayList<>();

    public NormalEmployee(String name, String family, String address, int nationalId) {
        super(name, family, address, nationalId);
    }

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
