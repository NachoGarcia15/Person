package PersonTests;
import org.example.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testConstructor(){
        String name = "Nacho";
        int age = 22;
        String gender = "Male";
        Person persona = new Person(name,age,gender);

        assertEquals(name, persona.name());
        assertEquals(age, persona.age());
        assertEquals(gender, persona.gender());
    }

}
