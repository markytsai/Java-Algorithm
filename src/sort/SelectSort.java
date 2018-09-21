package sort;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 0, 2, 4, 4};

        selectSort(arr);

        Utils.printArr(arr);


    }


    /**
     * 算法复杂度分析 
     * 比较次数 n(n-1)/2 次 
     * 时间复杂度（平均）   O(n^2) 外循环n次，内循环m次 m*n 
     * 时间复杂度（最坏）   O(n^2) 外循环n次，内循环m次 m*n 
     * 时间复杂度（最好）   O(n^2) 即不用元素交换，但仍要进行比较 
     * 空间复杂度          O(1) 
     * 稳定性             不稳定
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
