package sort;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

        shellSort(arr);

        Utils.printArr(arr);


    }

    public static void shellSort(int[] arr) {
        int step = arr.length;

        while (true) {
            step /= 2;

            for (int i = 0; i < step; i++) {
                for (int j = i + step; j < arr.length; j += step) {
                    int temp = arr[j];
                    int k;
                    for (k = j - step; k >= 0; k -= step) {
                        if (arr[k] > temp) {
                            arr[k + step] = arr[k];
                        } else {
                            break;
                        }
                    }
                    arr[k + step] = temp;
                }
                System.out.println("step: " + step);
                Utils.printArr(arr);
            }
            if (step == 1) {
                break;
            }
        }

    }

    private static int[] shellsort1(int[] array) {

        // first part uses the Knuth's interval sequence
        int h = 1;
        while (h <= array.length / 3) {
            h = 3 * h + 1;

        }

        // next part
        while (h > 0) {

            // This step is similar to insertion sort below
            for (int i = 0; i < array.length; i++) {

                int temp = array[i];
                int j;

                for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
                    array[j] = array[j - h];
                }
                array[j] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }

}
