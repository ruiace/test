package com.ruipeng.test;

public class Feibo {
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
    public static void main(String[] args) {
        System.out.println("--------------");

        int feibo = getFeibo(10);
        System.out.println(feibo);
    }

    public static int getFeibo(int num){
        if(num == 1 || num ==2){
            return 1;
        }
        if(num >=3){

            return getFeibo(num -1) + getFeibo(num -2);
        }
        return -1;
    }
}
