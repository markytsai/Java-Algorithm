package sort;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 2, 4, 4};

        insertSort(arr);

        Utils.printArr(arr);


    }

    /**
     * 算法复杂度分析 * 
     * 时间复杂度（平均）   O(n^2) 外循环n次，内循环m次 m*n *
     * 时间复杂度（最坏）   O(n^2) 外循环n次，内循环m次 m*n * 
     * 时间复杂度（最好）   O(n) ，数组已经排好序的情况，即当所有a[i] > a[i-1] 时不需要再执行内循环 * 
     * 空间复杂度          O(1) * 
     * 稳定性             稳定
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
