/**
 * Java 1 HW 6
 *
 * @author Mironova Anastasiia
 * @version 28.09.2021
 */


public class HomeWork6 {

    public static void main(String[] args) {
        Cat cat = new Cat(0, 150);
        Dog dog = new Dog(8, 400);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(130));
            System.out.println(animal.run(450));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(10));

        }

    }

    static class Dog extends Animal {
        Dog(int swim, int run) {
            super(swim, run);
        }
    }

    static class Cat extends Animal {
        Cat(int swim, int run) {
            super(swim, run);
        }


        @Override
        public String swim(int distance) {
            return getClassName() + " can`t swim";
        }
    }

    static abstract class Animal implements IAnimal {
        private int swim;
        private int run;
        private String className;

        Animal(int swim, int run) {
            this.swim = swim;
            this.run = run;
            className = getClass().getSimpleName();
        }

        public String getClassName() {
            return className;
        }

        @Override
        public String run(int distance) {
            if (distance > run) {
                return className + " can`t run " + distance;
            } else {
                return className + " can run " + distance;
            }
        }

        @Override
        public String swim(int distance) {
            if (distance > swim) {
                return className + "can`t swim " + distance;
            } else {
                return className + " can swim " + distance;
            }
        }

        @Override
        public String toString() {
            return className + ". run : " + run + ". swim : " + swim;
        }
    }

}

interface IAnimal {
    String run(int distance);

    String swim(int distance);
}



