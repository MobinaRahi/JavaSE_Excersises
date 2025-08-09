package javase08;

import javase08.customer.RetailCustomer;
import javase08.customer.WholesaleCustomer;
import javase08.employee.AdministrativeEmployee;
import javase08.employee.Cashier;
import javase08.employee.FinancialEmployee;
import javase08.employee.NormalEmployee;

public class Main {
    public static void main(String[] args) {

        RetailCustomer retailCustomer =
                RetailCustomer
                .builder()
                .name("mobina")
                .family("rahi")
                .address("0000")
                .phone("0000")
                .nationalId(000)
                .build();
        retailCustomer.save();
        RetailCustomer.printAll();

        WholesaleCustomer wholesaleCustomer =
                WholesaleCustomer
                .builder()
                .name("mobina")
                .family("rahi")
                .address("0000")
                .phone("0000")
                .nationalId(000)
                .build();
        wholesaleCustomer.save();
        WholesaleCustomer.printAll();

        AdministrativeEmployee administrativeEmployee=
                AdministrativeEmployee
                        .builder()
                        .name("mobina")
                        .family("rahi")
                        .address("0000")
                        .nationalId(000)
                        .accessLevel("1234")
                        .build();
        administrativeEmployee.save();
        AdministrativeEmployee.printAll();

        FinancialEmployee financialEmployee =
                FinancialEmployee
                        .builder()
                        .name("mobina")
                        .family("rahi")
                        .address("0000")
                        .nationalId(000)
                        .category(0)
                        .build();
        financialEmployee.save();
        FinancialEmployee.printAll();

        NormalEmployee normalEmployee =
                NormalEmployee
                        .builder()
                        .name("mobina")
                        .family("rahi")
                        .address("0000")
                        .nationalId(000)
                        .build();
        normalEmployee.save();
        NormalEmployee.printAll();

        Cashier cashier =
                Cashier
                        .builder()
                        .name("mobina")
                        .family("rahi")
                        .address("0000")
                        .nationalId(000)
                        .build();
        cashier.save();
        Cashier.printAll();




    }
}
