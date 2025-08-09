package javase07.customer;

import java.util.ArrayList;

public class WholesaleCustomer extends Customer {
    private int bankNumber;

    private static final ArrayList<WholesaleCustomer> WholesaleCustomers = new ArrayList<>();

    public WholesaleCustomer(String name, String family, String address, int nationalId, String phone, int bankNumber) {
        super(name, family, address, nationalId, phone);
        this.bankNumber = bankNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public void save() {
        WholesaleCustomers.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " , BankNumber : " + bankNumber;
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست مشتریان عمده : "+"\n");
        for (WholesaleCustomer WholesaleCustomer : WholesaleCustomers) {
            System.out.printf("Name : %-10s , Family : %-10s , Adress : %-10s , nationalId : %-10d , Phone : %-11s , BankNumber : %-5d %n", WholesaleCustomer.getName(), WholesaleCustomer.getFamily(), WholesaleCustomer.getAddress(), WholesaleCustomer.getNationalId(),WholesaleCustomer.getPhone(), WholesaleCustomer.getBankNumber());
        }
    }

}
