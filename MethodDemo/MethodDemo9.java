package MethodDemo;
/*
    使用数组取得最大值
 */
public class MethodDemo9 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {51, 34, 121, 7, 25};
        //调用获取最大值方法。用变量接受返回结果
        int number = getMax(arr);
        //把结果打在公屏上
        System.out.println("最大值是:" + number);
    }
    //定义一个方法，用来获取数组中的最大数
    public static int getMax(int[] arr){
        int max = arr[0];

        for(int x = 1;x < arr.length;x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }
}