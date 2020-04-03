package com.ls.code.sort;

public class QuickSort3Ways {
    public static void main(String[] args) {
        int [] arr = new int[]{2,1,2,2,5,2,4,7};
        for (int i : arr) {
            System.out.printf(i+",");
        }
        System.out.println();
//        swap(arr,0,1);
        qucikSort(arr,0,arr.length-1);
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
    static  void qucikSort(int[] arr,int l,int r){
        if (l>=r){
            return;
        }

        int lt = l,gt = r+1;
        int e = arr[l];
        for (int i = l+1; i <=r&&i<gt; i++) {
            if(arr[i]<e){
                //小于 将lt+1的位置(等于v)交换
                swap(arr,i,lt+1);
                lt++;
            }else{
                if(arr[i]==e){
                    //continue
                }else {
                    //大于 将gt-1位置交换
                    swap(arr,gt-1,i);
                    i--;
                    gt--;
                }
            }
        }
        //完成之后,基点元素l要到中间
        swap(arr,l,lt);
        //将大于和小于的进行递归
        qucikSort(arr,l,lt-1);
        qucikSort(arr,gt,r);
    }
   static void swap(int[] arr,int a,int b){
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
