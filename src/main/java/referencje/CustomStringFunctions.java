package referencje;

public class CustomStringFunctions {
//przykladowa statyczna metoda zamianiajaca na duze litery slowo w parametrze
    public static String addToUpperCase(String s){
        //tworzymy obiekt string buildera gdzie zapiszemy przerobione slowo
        StringBuilder stringBuilder = new StringBuilder();
        //iterujemy przez slowo
        for (int i = 1; i < s.length(); i++) {
            //przypisujemy do zmiennej znak z pod indexu
            char character = s.charAt(i-1);
            //jezeli i i dzielone przez 2 da reszte
            if (i%2 == 1){
                //ten znak powiekszamy
                character = Character.toUpperCase(character);
            }
            //zapisanie znakow do stringBuildera
            stringBuilder.append(character);
        }
        //zwrot stringBuildera przerobionego na stringa
        return stringBuilder.toString();
    }
}
