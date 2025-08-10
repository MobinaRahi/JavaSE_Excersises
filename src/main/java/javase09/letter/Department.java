package javase09.letter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString
public class Department {
    private String departmentName;
    private Organisation organisation;
    private ArrayList<Employee> employeesList;

    public void addEmployee(Employee ... employees) {
        if (employeesList == null) {
            employeesList = new ArrayList<>();
        }
        for (Employee employee : employees) {
            employeesList.add(employee);
            employee.setDepartment(this);
        }

    }

}
