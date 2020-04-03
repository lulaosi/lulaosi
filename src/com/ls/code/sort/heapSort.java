package com.ls.code.sort;

public class heapSort {
    public static void main(String[] args) {
        int [] arr = new int[]{2,1,2,2,5,2,4,7};
        for (int i : arr) {
            System.out.printf(i+",");
        }
        System.out.println();
//        swap(arr,0,1);
        Sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.printf(i+",");
        }

    }
    /*
    * 核心思想:分为3段,小于,等于,大于 所以有4个点 l lt gt r 当前节点为e
    * 每次排玩序之后,再将小于和大于的部分进行递归即可
    * arr[l+1....lt]<v  arr[lt+1...i) ==v         arr[gt.....r]>v
    * 时间复杂度:nlogn
    * */
    static  void Sort(int[] arr,int l,int r){

    }
   static void swap(int[] arr,int a,int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
