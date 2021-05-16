package Test;

import java.util.Scanner;

public class java008 {
    public static void main(String[] args) {
        //定义一个数组。用静态初始化完成数组元素的初始化
        int[] arr={14,23,47,23,43};

        //键盘录入要查找的数据，用一个变量接受
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入要查找的数据:");
        int number = sc.nextInt();

        //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for(int x = 0;x < arr.length;x++){
            //拿键盘录入的数据和数组中的每一个元素就行比较，如果相同，九八该值对应的索引赋值给遍索引变量，并结束循环
            if(arr[x] == number){
                index = x;
                break;
            }
        }
        //输出索引变量
        System.out.println("index:" + index);
    }

}
