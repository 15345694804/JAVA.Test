package Test;

import java.util.Scanner;

/*
    需求：
        6个评委打分，分数为0-100的整数
        选手最后的得分为：去掉最高分和最低分后的4个评委平均值
    思路：
        1.定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2.键盘录入评委分数
        3.由于是多个评委打分，所以，接受评委分数的操作，用for循环改进
        4.定义一个方法，用于获取数组中的最高分
        5.定义一个方法，用于获取数组中的最低分
        6.定义一个方法获取数组中的所有元素的和
        7.
 */
public class java010 {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr=new int[6];

        //键盘录入评委分数
        Scanner sc=new Scanner(System.in);

//        System.out.println("请输入第1个评委的打分：");
//        arr[0]=sc.nextInt();
//        System.out.println("请输入第2个评委的打分：");
//        arr[1]=sc.nextInt();

        //由于是多个评委打分，所以，接受评委分数的操作，用for循环改进
        for(int x = 0;x < arr.length;x++){
            System.out.print("请输入第" + (x + 1) + "个评委的打分：");
            arr[x]=sc.nextInt();
        }

        //调用(获取最大值)的方法
        int max=getMax(arr);

        //调用(获取最小值)的方法
        int min=getMin(arr);

        //调用(获取元素和)的方法
        int sum=getSum(arr);

        //按照计算规则进行计算，取得平均分
        int avg = (sum - max - min)/(arr.length-2);

        //输出平均分
        System.out.println("选手的最终得分是:" + avg);
    }

    //定义一个方法获取数组中所有元素的和
    public static int getSum(int[] arr){
        int sum = 0;

        for(int x = 0;x < arr.length;x++){
            sum += arr[x];
        }

        return sum;
    }

    //调取最大值的方法
    public static int getMin(int[] arr){
        int min =arr[0];

        for (int x = 1;x < arr.length;x++){
            if(arr[x] < min){
                min = arr[x];
            }
        }

        return min;
    }

    //调取最小值的方法
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int x = 1;x < arr.length;x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }

        return max;

    }
}
