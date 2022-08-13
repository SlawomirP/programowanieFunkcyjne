package forEach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> slowa = Arrays.asList("Ala", "ma", "kota", "i", "dwa psy");

//        slowa.forEach(slowo -> System.out.println(slowo));
        //z nawiasami, wiecej instrukcji
        slowa.forEach(slowo ->{
            String newSlowo = slowo.toUpperCase();
            System.out.print(newSlowo + " ");
        });


    }
}
