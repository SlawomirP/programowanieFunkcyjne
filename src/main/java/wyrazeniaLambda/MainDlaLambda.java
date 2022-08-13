package wyrazeniaLambda;

public class MainDlaLambda {
    public static void main(String[] args) {

// utworzenie instancji interfejsu
//        Operacje operacje = new Operacje() { //usuwamy wywolanie konstruktora
//            @Override // to usuwamy
//            public int dodaj(int a, int b) { // usuwamy tez public i int i nazwe metody
//                return a+b; //klamry zastapujemy strzałka i usuwamy tez return
//            }
//        };

    Operacje operacje = (a,b) -> a+b;

        System.out.println(operacje.dodaj(2,3));

    }
}
