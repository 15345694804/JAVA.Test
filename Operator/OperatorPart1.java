package Operator;/*
输入三个数，输出最大值
 */
import java.util.Scanner;

public class OperatorPart1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //分别键入a、b、c的值
        System.out.print("请输入a的值:");
        int a = sc.nextInt();
        System.out.print("其输入b的值:");
        int b = sc.nextInt();
        System.out.print("其输入c的值:");
        int c = sc.nextInt();

        //定义变量max，保存最大值
        int max=a > b ? a : b;
            max=max > c ? max : c;
            System.out.println("最大的值是:" + max);
    }
}
