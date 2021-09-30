/**
 * Java 1 HW 7
 *
 * @author Mironova Anastasiia
 * @version 30.09.2021
 */


public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Persik", 8), new Cat("Barsik", 15), new Cat("Kotik", 25)};


        Plate plate = new Plate(40, 50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(10);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setSatiety(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);


    }

}
