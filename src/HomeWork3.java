import java.util.Arrays;

/**
 * Java 1 HW 3
 *
 * @author Mironova Anastasiia
 * @version 16.09.2021
 */


public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        lenInit(6, 2);

    }

    static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr [i][j] = (i == j || j == (4 - i - 1))? 1 : (int)(Math.random()*10);
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
    static void lenInit(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }


}
