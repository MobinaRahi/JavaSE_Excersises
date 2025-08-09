package javase07.employee;

import java.util.ArrayList;

public final class Cashier extends FinancialEmployee {

    private int credit;
    private static final ArrayList<Cashier> cashiers = new ArrayList<Cashier>();

    public Cashier(String name, String family, String address, int nationalId, int category , int credit) {
        super(name, family, address, nationalId, category);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public void save() {
        cashiers.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " credit= " + credit;
    }

    public static void printAll(){
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان مالی / صندوق : " + "\n");
        for (Cashier cashier : cashiers) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d  category : %-5d Credit:%10d %n",cashier.getName(),cashier.getFamily(),cashier.getAddress(),cashier.getNationalId(),cashier.getCategory(),cashier.getCredit());

        }
    }
}

