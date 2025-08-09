package javase09.bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public abstract class Account implements Transaction {

    private int accountNumber;
    private Branch branch;
    private Customer customer;
}
