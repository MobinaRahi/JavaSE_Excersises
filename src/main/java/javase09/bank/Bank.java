package javase09.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Bank {
private String title;
    private ArrayList<Branch> branchArrayList;

    public void addBranch(Branch ... branches) {
        if (this.branchArrayList == null) {
            this.branchArrayList = new ArrayList<>();
        }
        for (Branch branch : branches) {
            branchArrayList.add(branch);
            branch.setBank(this);
        }



    }





}
