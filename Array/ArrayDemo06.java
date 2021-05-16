package Array;
/*
    使用for循环获取数组中的最大值和最小值
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {51,15,24,66,32};

        //定义一个变量，用于保存最大值,取数组中的第一个数据作为变量的初始值
        int max = arr[0];

        //与数组中剩余的数据逐个对比，每次将最大值保存到变量中
        for(int x = 1;x < arr.length;x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }

        //输出最大值
            System.out.println("max:" + max);

        /*--------------------------------------------------*/

        //定义一个变量，用于保存最小值,取数组中的第一个数据作为变量的初始值
        int min = arr[0];

        //与数组中剩余的数据逐个对比，每次将最小值保存到变量中
        for(int y = 1;y < arr.length;y++){
            if(arr[y] < min){
                min = arr[y];
            }
        }

        //输出最小值
            System.out.println("min:" + min);
    }
}
