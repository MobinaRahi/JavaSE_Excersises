package javase08.customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter

public class RetailCustomer extends Customer {

    private static final ArrayList<RetailCustomer> retailCustomers = new ArrayList<>();

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
        System.out.println("لیست مشتریان خرد : " + "\n");
        for (RetailCustomer retailCustomer : retailCustomers) {
            System.out.printf("Name : %-10s , Family : %-10s , Adress : %-10s , nationalId : %-10d , Phone : %-11s %n", retailCustomer.getName(), retailCustomer.getFamily(), retailCustomer.getAddress(), retailCustomer.getNationalId(), retailCustomer.getPhone());
        }
    }
}