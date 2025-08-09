package javase07.customer;

import javase07.Person;

public class Customer extends Person {
    private String phone;

    public Customer(String name, String family, String adress, int nationalId , String phone) {
        super(name, family, adress, nationalId);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString() + " , phone : " +  getPhone();
    }
}
