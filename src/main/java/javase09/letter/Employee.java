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
public class Employee {
    private String name;
    private Department department;
    private ArrayList<Letter> sendersList;
    private ArrayList<Letter> receiversList;

    public void addSender(Letter ... letters) {
        if (sendersList == null) {
            sendersList = new ArrayList<>();
        }
        for (Letter letter : letters) {
            sendersList.add(letter);
            letter.setSender(this);

        }

    }
    public void addReceiver(Letter ... letters) {
        if (receiversList == null) {
            receiversList = new ArrayList<>();
        }
        for (Letter letter : letters) {
            receiversList.add(letter);
            letter.setReceiver(this);

        }
    }
}
