package javase08;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString
public abstract class Person {
    private String name;
    private String family;
    private String address;
    private int nationalId;

    public abstract void save();

}
