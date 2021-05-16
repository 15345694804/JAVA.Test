package MethodDemo;
/*
    设计一个方法用于数组遍历，要求结果:
        [11,22,33,44,55]
 */
public class MethodDemo8{
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr={11,22,33,44,55};
        //调用方法
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");

         for(int x = 0;x < arr.length;x++) {

             //进行判断，判断是否为末尾一个数 如果是直接输出这个数 如果不是在后面加","
             if (x == arr.length - 1) {
                 System.out.print(arr[x]);
             } else {
                 System.out.print(arr[x] + ",");
             }
         }
        System.out.println("]");
    }
}
