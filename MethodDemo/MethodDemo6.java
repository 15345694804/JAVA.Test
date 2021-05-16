package MethodDemo;

import jdk.swing.interop.SwingInterOpUtils;

/*
    方法重载:
        多个方法在同一个类中
        多个方法具有相同的方法名
        多个方法的参数不相同，类型不同或者数量不同
 */
public class MethodDemo6 {
    public static void main(String[] args) {

        int result = sum(10,20);
            System.out.println(result);

        double result2 = sum(10.5,20.6);
            System.out.println(result2);


        int result3 = sum(5,10,15);
            System.out.println(result3);

    }

    //求两个int类型数据和的方法
    public static int sum(int a,int b){
        return a + b;
    }

    //求两个double类型数据和的方法
    public static double sum(double a,double b){
        return a + b;
    }

    //求三个int类型数据和的方法
    public static int sum(int a,int b,int c){
        return a + b + b;
    }
}
