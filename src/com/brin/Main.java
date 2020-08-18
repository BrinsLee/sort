package com.brin;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 10, 3, 4, 8, 2, 9, 6, 7};
        insertSort(a);
    }

    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (less(array, j, i)) {
                    min = j;
                    exchange(array, i, min);
                }
            }
        }
        printArray(array);
    }

    /**
     * 插入排序
     * @param array
     */
    public static void insertSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(array, j, j - 1); j--) {
                exchange(array, j - 1, j);
            }
        }
        printArray(array);
    }

    public static boolean less(int[] a, int i, int j) {
        return a[i] < a[j];
    }

    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArray(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}
