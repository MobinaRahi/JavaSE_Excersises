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
public class Branch {
    private int id;
    private String address;
    private Bank bank;
    private ArrayList<Account> accountList;


    public void addAccount(Account... accounts) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        for (Account account : accounts) {
            accountList.add(account);
            account.setBranch(this);
        }


    }

}
