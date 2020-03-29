package com.design.cn;

public class TestMain {

    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException {


        int [] arr = {1,5,10,66,55,88,99,131,153,159};
        int i = find(99, arr);
        if (i>0){
            System.out.println(arr[i]);
        }else {
            System.out.println("为找到");
        }

    }

    public static int find(int key , int [] arr){
        int lo=0;
        int lin=arr.length-1;
        int mid=0;
        while (lo<=lin){
            mid=lo+(lin-lo)/2;
            if (key > arr[mid]) lo=mid+1;
            else if (key<arr[mid]) lin=mid-1;
            else return mid;
        }
        return -1;
    }




}