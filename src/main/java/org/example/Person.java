package org.example;

import java.util.List;

/**
 * Clase que representa a una persona con nombre, edad y género.
 *
 * @author Ignacio Jose Garcia Garcia
 */
public class Person {
    private final String name;
    private final int age;
    private final String gender;// Male o Female

    /**
     * Constructor que crea una persona con un nombre, edad y género dados.
     *
     * @param name el nombre de la persona
     * @param age la edad de la persona
     * @param gender el género de la persona ("Male" o "Female")
     */
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * @return el nombre de la persona
     */
    public String name(){
        return name;
    }

    /**
     * @return la edad de la persona
     */
    public int age(){
        return age;
    }

    /**
     * @return el genero de la persona
     */
    public String gender(){
        return gender;
    }
    /**
     * Calcula la edad media de las personas en la lista, separadas por género, y devuelve el resultado en
     * un array de dos elementos (el primer elemento es la edad media de los hombres y el segundo es la
     * edad media de las mujeres).
     *
     */
    public double[] averageAgePerGender(List<Person> persons){
        double sumaEdadHombres = 0;
        double sumaEdadMujeres = 0;
        double numeroDeHombres = 0;
        double numeroDeMujeres = 0;
        double mediaEdadHombres = 0;
        double mediaEdadMujeres = 0;

        /**
         * suma todas las edades de hombre y mujeres por separado, y por cada hombre o mujer, suma 1
         * al contador de hombres o mujeres respectivamente.
         */
        for( Person persona : persons ){
            if(persona.gender.equals("Male")){
                sumaEdadHombres += persona.age;
                numeroDeHombres += 1;
            }else{
                sumaEdadMujeres += persona.age;
                numeroDeMujeres += 1;
            }
        }

        /**
         * si el numero de hombres o mujeres es 0, salta la excepcion.
         */
        if(numeroDeHombres<=0){
            throw new RuntimeException("Numero de hombres negativo");
        }else if(numeroDeMujeres<=0){
            throw new RuntimeException("Numero de mujeres negativo");
        }

        /**
         * se calcula finalmente la media.
         */
        mediaEdadHombres = sumaEdadHombres/numeroDeHombres;
        mediaEdadMujeres = sumaEdadMujeres/numeroDeMujeres;

        return new double[] {mediaEdadHombres,mediaEdadMujeres};
    }
}
