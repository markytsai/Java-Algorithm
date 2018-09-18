package sort;

public class BubbleSort<E> {


    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 2, 4, 4};

        bubbleSort(arr);

        Utils.printArr(arr);

        Utils.printArrUsingStrem(arr);
    }

    private static void bubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
