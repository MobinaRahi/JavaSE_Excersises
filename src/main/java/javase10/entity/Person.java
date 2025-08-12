package javase10.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private String family;
    private LocalDate birthDate;
    private Role role;
    private boolean status;

    @Override
    public String toString() {
        Gson gson = new Gson();
        return  gson.toJson(this);
    }
}
