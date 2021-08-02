package com.example.array;

/**
 * 排序算法：冒泡排序
 *
 * @author tianwenyuan
 * Date: 2021/7/28
 * Time: 8:59 上午
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -2, 3, 9, 10, 6, 5, 2};
        // 从小到大排序
        sortToMax(arr);
        System.out.println("从小到大排序：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        // 从大到小排序
        sortToMin(arr);
        System.out.println("从大到小排序：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    private static void sortToMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void sortToMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
