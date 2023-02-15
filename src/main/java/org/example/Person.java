package org.example;

import java.util.List;

/**
 * Class representing a person with a name, age and gender
 *
 * @author Ignacio Jose Garcia Garcia
 */
public class Person {
    private final String name;
    private final int age;
    private final String gender;// Male, Female

    /**
     * Constructs a person with a name, age and gender.
     *
     * @param name the name of the person
     * @param age the age of the person
     * @param gender the gender of the person
     */
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String name(){
        return name;
    }
    public int age(){
        return age;
    }
    public String gender(){
        return gender;
    }
    /**
     * Computes the average age of male and female persons in a list and returns the result in
     * an array of two elements (the first element is the male mean age and the second one is the
     * female mean age)
     *
     * @param persons
     * @return
     */
    public double[] averageAgePerGender(List<Person> persons){
        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;
        int numeroDeHombres = 0;
        int numeroDeMujeres = 0;
        double mediaEdadHombres = 0;
        double mediaEdadMujeres = 0;

        for( Person persona : persons ){
            if(persona.gender.equals("Male")){
                sumaEdadHombres += persona.age;
                numeroDeHombres += 1;
            }else{
                sumaEdadMujeres += persona.age;
                numeroDeMujeres += 1;
            }
        }

        mediaEdadHombres = sumaEdadHombres/numeroDeHombres;
        mediaEdadMujeres = sumaEdadMujeres/numeroDeMujeres;

        return new double[] {mediaEdadHombres,mediaEdadMujeres};
    }
}
