package javase09.letter;

public class Main {
    public static void main(String[] args) {
        Organisation organisation = new Organisation();
        organisation.setTitle("My Organisation");
        Department department1 = new Department();
        department1.setDepartmentName("IT");
        Department department2 = new Department();
        department2.setDepartmentName("Art");
        organisation.addDepartment(department1, department2);
        Employee employee1 = new Employee();
        employee1.setName("mobina");
        Employee employee2 = new Employee();
        employee2.setName("zeynab");
        Employee employee3 = new Employee();
        employee3.setName("hakimeh");
        Employee employee4 = new Employee();
        employee4.setName("zahra");
        department1.addEmployee(employee1, employee2);
        department2.addEmployee(employee3, employee4);
        Letter letter1 = new Letter();
        letter1.setType("send");
        Letter letter2 = new Letter();
        letter2.setType("send");
        Letter letter3 = new Letter();
        letter3.setType("receive");
        Letter letter4 = new Letter();
        letter4.setType("receive");
        employee1.addSender(letter1);
        employee2.addReceiver(letter2);
        employee3.addSender(letter3);
        employee4.addReceiver(letter4);

        for (Department department : organisation.getDepartmentsList()) {
            for (Employee employee : department.getEmployeesList()) {
                if (employee.getSendersList() != null) {
                    for (Letter sendLetter : employee.getSendersList()) {
                        sendLetter.send();
                    }
                }

            }
        }
        for (Department department : organisation.getDepartmentsList()) {
            for (Employee employee : department.getEmployeesList()) {
                if (employee.getReceiversList() != null) {
                    for (Letter reciveLetter : employee.getReceiversList()) {
                        reciveLetter.receive();
                    }
                }

            }


        }
    }
}
