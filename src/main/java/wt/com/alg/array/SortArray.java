package wt.com.alg.array;

import java.util.Arrays;
//快排
public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 0, 0, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[]{1, 2, 3, 0, 0, 0};
        quickSort(array2, 0, array2.length - 1);
        System.out.println(Arrays.toString(array2));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left<right){
            int partion = getPartion(arr, left, right);
            quickSort(arr, left, partion - 1);
            quickSort(arr, partion + 1, right);
        }
    }

    public static int getPartion(int arr[], int left, int right) {
        int first = arr[left];
        while (left < right) {
            while (left < right && first <= arr[right]) {
                right--;
            }
            swap(arr, left, right);
            while (left < right && arr[left] <= first) {
                left++;
            }
            swap(arr, left, right);
        }
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
