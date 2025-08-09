package javase07.employee;

import java.util.ArrayList;

public class AdministrativeEmployee extends Employee {

    private String accessLevel;

    private static final ArrayList<AdministrativeEmployee> administrativeEmployees = new ArrayList<>();

    public AdministrativeEmployee(String name, String family, String address, int nationalId, String accessLevel) {
        super(name, family, address, nationalId);
        this.accessLevel = accessLevel;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public void save() {
        administrativeEmployees.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " accessLevel : " + accessLevel;
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان اداری : " + "\n");
        for (AdministrativeEmployee adminEmployee : administrativeEmployees) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d  AccessLevel : %-10s %n", adminEmployee.getName(),adminEmployee.getFamily(), adminEmployee.getAddress(), adminEmployee.getNationalId(), adminEmployee.getAccessLevel());

        }

    }
}
