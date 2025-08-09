package javase07;

import javase07.customer.RetailCustomer;
import javase07.customer.WholesaleCustomer;
import javase07.employee.AdministrativeEmployee;
import javase07.employee.Cashier;
import javase07.employee.FinancialEmployee;
import javase07.employee.NormalEmployee;

public class Main {
    public static void main(String[] args) {
        RetailCustomer retailCustomer1=new RetailCustomer("mobina","rahi","0000",000,"0902");
        retailCustomer1.save();
        RetailCustomer.printAll();

        WholesaleCustomer wholesaleCustomer1=new WholesaleCustomer("mobina","rahi","0000",000,"0902",123);
        wholesaleCustomer1.save();
        WholesaleCustomer.printAll();

        AdministrativeEmployee adminEmployee1=new AdministrativeEmployee("mobina","rahi","0000",000,"1");
        adminEmployee1.save();
        AdministrativeEmployee.printAll();

        NormalEmployee normalEmployee1=new NormalEmployee("mobina","rahi","0000",1);
        normalEmployee1.save();
        NormalEmployee.printAll();

        FinancialEmployee financialEmployee1=new FinancialEmployee("m obina","rahi","0000",1,1);
        financialEmployee1.save();
        FinancialEmployee.printAll();

        Cashier cashier1=new Cashier("M obina ","rahi","0000",1,1,1);
        cashier1.save();
        Cashier.printAll();
    }
}
