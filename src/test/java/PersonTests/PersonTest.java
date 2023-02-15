package PersonTests;
import org.example.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testConstructor(){
        /**
         * Test sencillo para comprobar que el constructor funciona bien
         */
        String name = "Nacho";
        int age = 22;
        String gender = "Male";
        Person persona = new Person(name,age,gender);

        assertEquals(name, persona.name());
        assertEquals(age, persona.age());
        assertEquals(gender, persona.gender());
    }

    @Test
    public void testEdadMediaDeCadaGenero(){
        /**
         * Lista de personas, 2 hombres y 2 mujeres, cuyas edades medias deberian ser 30 y 40 respectivamente
         */
        List<Person> personas = new ArrayList<>(Arrays.asList(
                new Person("Nacho",20,"Male"),
                new Person("Miguel,",40,"Male"),
                new Person("Celia",30,"Female"),
                new Person("Alicia",50,"Female")
        ));
        double [] expected = new double[]{30,40};

        Person person = new Person("",0,"");
        assertArrayEquals(expected,person.averageAgePerGender(personas));

    }
    @Test
    public void testLaListaDeHombresEsVacia(){
        /**
         * Comprueba que se lanza una excepcion cuando pasas una lista que no tiene hombres, para evitar
         * dividir por 0 al hacer la media de edad de hombres, aunque tambien se podria poner un simple if
         * en person.averageAgePerGender.
         */
        List<Person> personas = new ArrayList<>(Arrays.asList(
                new Person("Alicia",20,"Female"),
                new Person("Celia", 40,"Female")
        ));
        Person person = new Person("",0,"");
        assertThrows(RuntimeException.class, () -> person.averageAgePerGender(personas));
    }
    @Test
    public void testLaListaDeMujeresEsVacia(){
        /**
         * Comprueba que se lanza una excepcion cuando pasas una lista que no tiene hombres, para evitar
         * dividir por 0 al hacer la media de edad de mujeres, aunque tambien se podria poner un simple if
         * en person.averageAgePerGender.
         */
        List<Person> personas = new ArrayList<>(Arrays.asList(
                new Person("Antonio",20,"Male"),
                new Person("Carlos", 40,"Male")
        ));
        Person person = new Person("",0,"");
        assertThrows(RuntimeException.class, () -> person.averageAgePerGender(personas));
    }

}
