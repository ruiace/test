package com.ruipeng.test;

import java.util.Arrays;
//bubble
public class BubbleSort {

    public static void main(String[] args) {
        int[] arrays = {1,4,6,3,7,8};

        System.out.print("原数据信息:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        System.out.println("--------");
        for(int i = 0; i< arrays.length-1; i ++){

            for(int k = 0; k< arrays.length -i -1;k++){
                if(arrays[k+1] < arrays[k]){
                    int temp = arrays[k];
                    arrays[k] = arrays[k+1];
                    arrays[k+1] = temp;
                }
            }
        }

        System.out.print("冒泡后的数据信息:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }
}
