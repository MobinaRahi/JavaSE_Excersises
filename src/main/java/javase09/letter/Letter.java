package javase09.letter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString
public class Letter implements LetterFlow {
    private String type;
    private Employee Sender;
    private Employee Receiver;



    @Override
    public void send() {
        System.out.printf("Employee -> %-10s  send this letter \n", Sender.getName());
    }

    @Override
    public void receive() {
        System.out.printf("Employee -> %-10s  receive this letter \n", Receiver.getName());

    }

}
