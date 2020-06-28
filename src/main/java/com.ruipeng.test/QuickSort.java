package com.ruipeng.test;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 2, 6, 9, 6, 4, 32, 1};
        System.out.println(Arrays.toString(arr));
        int[] sort = sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] arr, int leftPost, int rightPos) {
        if (rightPos < leftPost) {
            return arr;
        } else {
            //(1)将数组的左右作为基数
            int initLeftPos = leftPost;
            int initRightPos = rightPos;
            int baseNum = arr[leftPost];

            while (rightPos > leftPost) {
                while (arr[rightPos] >= baseNum & rightPos > leftPost) {
                    rightPos--;
                }
                while (arr[leftPost] <= baseNum & rightPos > leftPost) {
                    leftPost++;
                }
                if (rightPos > leftPost) {
                    changePosition(arr, leftPost, rightPos);
                }
            }

            changePosition(arr, leftPost, initLeftPos);

            sort(arr, initLeftPos, leftPost - 1);
            sort(arr, rightPos + 1, initRightPos);
            return arr;
        }


    }

    private static void changePosition(int[] arr, int leftPost, int rightPos) {
        int temp = arr[leftPost];
        arr[leftPost] = arr[rightPos];
        arr[rightPos] = temp;
    }
}
