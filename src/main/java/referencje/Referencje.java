package referencje;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Referencje {
    public static void main(String[] args) {
        //REFERENCJA DO METODY STATYCZNEJ
//tworzymy instancje interfejsu lambda, ma jeden parametr s
        //cialo metody tj metoda statyczna z klasy Custom...
//        StringFunction stringFunction = s -> CustomStringFunctions.addToUpperCase(s);

        // na obiekcie interfejsu wywolujemy z klasy custom metode addTo....
        //czyli ona sama juz na tym String function (String s) wywola metode
        // public static String addToUpperCase(String s)
        StringFunction stringFunction = CustomStringFunctions::addToUpperCase;
//nastepnie na tym obiekcie wywolujemy metode z interfejsu z podanym slowem
        System.out.println(stringFunction.function("ala ma kota i dwa psy"));

        //REFERENCJA DO INSTANCJI METODY - na interfejsie stringToInteger
        //tworzymy instancje interfejsu
//        StringToIntFunction stringToIntFunction = s -> s.length();

        //po lewej stronie to referencja do obiektu a po drugiej funkcja
        // czyli z interfejsu Integer strToInt (String s);
        StringToIntFunction stringToIntFunction = String::length;
        System.out.println(stringToIntFunction.strToInt("ala ma kota i dwa psy"));

        //REFERENCJA DO INSTANCJI DOWOLNEGO OBIEKTU OKREŚLONEGO TYPU
        //tworzymy zmienna finalna
        final List<Animal> animals =Arrays.asList(
                new Animal("Mruczek"),
                new Animal("Burek"),
                new Animal("Puszek")
        );

        //chcemy teraz wyswietlic zawartosc listy, standardowo forEachem
//        for(Animal animal: animals){
//            animal.printName();
//        }
        // z lambda
//        animals.forEach(animal -> animal.printName());

        //klasa z ktorej korzystamy w liscie i metoda w niej zawarte
        animals.forEach(Animal::printName);


        //REFERENCJA DO KONSTRUKTOROW, potrzebny jest do tego obiekt i
        // interfejs supplier
//        Supplier<Animal> animalFactory = () -> new Animal();
        Supplier<Animal> animalFactory = Animal::new;

        //animal juz z iminiem
//        Function<String, Animal> animalFactory2 = (name) -> new Animal(name);
        Function<String, Animal> animalFactory2 = Animal::new;



    }
}
