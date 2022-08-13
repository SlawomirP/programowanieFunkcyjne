package referencje;

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



    }
}
