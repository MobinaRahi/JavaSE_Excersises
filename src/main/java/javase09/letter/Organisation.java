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
public class Organisation {
    private String title;
    private ArrayList<Department> departmentsList;

    public void addDepartment(Department ... departments) {
        if (departmentsList == null) {
            departmentsList = new ArrayList<>();
        }
        for (Department department : departments) {
            departmentsList.add(department);
            department.setOrganisation(this);
        }
    }

}
