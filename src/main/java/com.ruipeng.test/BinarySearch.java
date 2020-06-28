package com.ruipeng.test;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,9};
        int result = 7;

        int search = search(arr, result);
        System.out.println("--->" + search);

    }

    /**
     * 查询到返回下标,查询不到返回 -1
     * @param arr
     * @param result
     * @return
     */
    public static int search(int[] arr,int result){
        int low = 0;
        int hight = arr.length - 1;
        int middle = 0;

        if(result < arr[low] || result > arr[hight] || arr[low] > arr[hight]){
            System.out.println("-----没有数据信息---");
            return -1;
        }

        while (arr[low] <= arr[hight]){

            middle = (low + hight) /2;

            if(result > arr[middle]){
                low = middle + 1;
            }else if(result < arr[middle]){
                hight = middle -1;
            }else{
                return middle;
            }

        }
        return -1;
    }
}
