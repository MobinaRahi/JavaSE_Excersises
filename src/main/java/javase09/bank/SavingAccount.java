package javase09.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class SavingAccount extends Account {
    private int profit;

    @Override
    public void pay() {
        System.out.println(this.getCustomer().getName()+"paid");
    }

    @Override
    public void receipt() {
        System.out.println(this.getCustomer().getName()+"receipted");
    }
}
