package sort;

import java.util.Arrays;

public class Utils {

    public static void printArr(int[] arr) {

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArrUsingStrem(int[] arr) {
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

}
