package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

        sort(arr, 0, arr.length-1);

        Utils.printArr(arr);


    }

    public static void sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int pivot;
        if (low < high) {
            pivot = quickSort(arr, low, high);
            sort(arr, 0, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static int quickSort(int[] arr, int low, int high) {

        int i = low;
        int j = high;

        int pivot = arr[low];

        while (low < high) {
            while (low < high && pivot <= arr[high]) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && pivot >= arr[low]) {
                low++;
            }
            arr[high] = arr[low];
        }

        arr[low] = pivot;
        return low;

    }
}
