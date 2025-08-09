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
public class Cashier extends FinancialEmployee {
    private int credit;
    private static final ArrayList<Cashier> cashiers = new ArrayList<>();

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

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست کارمندان مالی / صندوق : " + "\n");
        for (Cashier cashier : cashiers) {
            System.out.printf("Name : %-10s , Family : %-10s , Address : %-10s , nationalId : %-10d  , category : %-10d , Credit:%-10d %n", cashier.getName(), cashier.getFamily(), cashier.getAddress(), cashier.getNationalId(), cashier.getCategory(), cashier.getCredit());

        }
    }
}
