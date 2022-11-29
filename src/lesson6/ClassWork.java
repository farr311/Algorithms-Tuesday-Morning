package lesson6;

import java.util.Arrays;

public class ClassWork {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        // В условие одного из циклов вычисляется значение size, которое определяет размер рассматриваемого подмассива
        // В условии другого цикла нужно прописать вычисление значения left

        for (...) {         // Написать условие цикла
            for (...) {     // Написать условие цикла
                // Вычислить значение right
                // Вычислить значение middle

                merge(arr, left, middle, right);
            }
        }
    }

    static void merge(int arr[], int left, int middle, int right) {
        int index1 = middle - left + 1;
        int index2 = right - middle;

        int[] arrL = new int[index1];
        int[] arrR = new int[index2];

        for (int i = 0; i < index1; i++) {
            arrL[i] = arr[i + left];
        }

        for (int i = 0; i < index2; i++) {
            arrR[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < index1 && j < index2) {
            if (arrL[i] <= arrR[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrR[j];
                j++;
            }

            k++;
        }

        while (i < index1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        while (j < index2) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }
}
