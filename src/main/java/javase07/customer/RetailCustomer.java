package javase07.customer;

import java.util.ArrayList;

public class RetailCustomer extends Customer {

    private static final ArrayList<RetailCustomer> retailCustomers = new ArrayList<>();

    public RetailCustomer(String name, String family, String adress, int nationalId, String phone) {
        super(name, family, adress, nationalId, phone);
    }

    @Override
    public void save() {
        retailCustomers.add(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست مشتریان خرد : "+"\n");
        for (RetailCustomer retailCustomer : retailCustomers) {
            System.out.printf("Name : %-10s , Family : %-10s , Adress : %-10s , nationalId : %-10d , Phone : %-11s %n", retailCustomer.getName(), retailCustomer.getFamily(), retailCustomer.getAddress(), retailCustomer.getNationalId(), retailCustomer.getPhone());
        }

    }
}
