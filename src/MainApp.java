

/**
 * Java 1. HW2
 *
 * @author Mironova Anastasiia
 * @version 12.09.2021
 */


public class MainApp {
    public static void main(String[] args) {
        methodA(10, 2);
        methodB(8);
        methodC(-7);
        methodD("homework", 2);
    }

    static boolean methodA(int x1, int x2) {
        if (x1 + x2 < 10 || x1 + x2 > 20) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    static void methodB(int x) {
        if (x < 0) {
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }
    }

    static boolean methodC(int x) {
        if (x < 0) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    static void methodD(String word, int count) {
        for (int i = count; i > 0; i--) {
            System.out.println(word);
        }
    }


}







