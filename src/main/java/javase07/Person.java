package javase07;

public abstract class Person {
    private String name;
    private String family;
    private String address;
    private int nationalId;

    public Person(String name, String family, String adress, int nationalId) {
        this.name = name;
        this.family = family;
        this.address = adress;
        this.nationalId = nationalId;
    }
    public void save(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    @Override
    public String toString() {
        return "Person " +
                " name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", adress='" + address + '\'' +
                ", nationalId=" + nationalId
                ;
    }
}
