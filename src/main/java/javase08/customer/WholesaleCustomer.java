package javase08.customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter
@Getter
public class WholesaleCustomer extends Customer {

    private int bankNumber;

    private static final ArrayList<WholesaleCustomer> wholesaleCustomers = new ArrayList<>();


    @Override
    public void save() {
        wholesaleCustomers.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " , BankNumber : " + bankNumber;
    }

    public static void printAll() {
        System.out.println("-------------------------------------------");
        System.out.println("لیست مشتریان عمده : "+"\n");
        for (WholesaleCustomer WholesaleCustomer : wholesaleCustomers) {
            System.out.printf("Name : %-10s , Family : %-10s , Adress : %-10s , nationalId : %-10d , Phone : %-11s , BankNumber : %-5d %n", WholesaleCustomer.getName(), WholesaleCustomer.getFamily(), WholesaleCustomer.getAddress(), WholesaleCustomer.getNationalId(),WholesaleCustomer.getPhone(), WholesaleCustomer.getBankNumber());
        }
    }
}
