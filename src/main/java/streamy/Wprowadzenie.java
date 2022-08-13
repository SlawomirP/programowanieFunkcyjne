package streamy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wprowadzenie {
    public static void main(String[] args) {
        //tworzymy listę imion
        List<String> names = Arrays.asList("Ala", "Jacek");

        //stworzenie listy imion za pomoca streama
        //odfiltrowana gorna lista
        List <String> newNames = names.stream()
                //filtrujemy tylko imiona zakonczone na a
                .filter(name -> name.endsWith("a"))
                //stream jest zapisywany w newNames
                .collect(Collectors.toList());
        System.out.println(newNames);


    }
}
