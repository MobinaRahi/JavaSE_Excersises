package javase10;

import javase10.entity.Person;
import javase10.entity.Role;
import javase10.repository.PersonDateBase;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
        Person person1 =
                Person
                        .builder()
                        .id(1)
                        .name("mobina")
                        .family("Rahi")
                        .birthDate(LocalDate.of(2003,2,10))
                        .role(Role.admin)
                        .status(true)
                        .build();
        Person person2 =
                Person
                        .builder()
                        .id(2)
                        .name("Zeynab")
                        .family("Eshaghi")
                        .birthDate(LocalDate.of(2004,2,10))
                        .role(Role.admin)
                        .status(true)
                        .build();

        PersonDateBase personDateBase = new PersonDateBase();
              //test1 passed:)
//            personDateBase.save(person1);
//            personDateBase.save(person2);
            //test2 passed:)
//            personDateBase.edit(person2);
            //test2 passed:)
//            personDateBase.delete(1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
