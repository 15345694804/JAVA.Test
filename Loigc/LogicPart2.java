package Loigc;/*
输入年龄，判断该年龄属于成年人、中年人、还是老年人
 */
import java.util.Scanner;

public class LogicPart2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("当您的年龄符合该判断时，将显示true");
        System.out.print("请输入您的年龄:");
        int age = sc.nextInt();

        boolean isCheng=age > 18 && age <= 25;
        boolean isZhong=age > 25 && age<=60;
        boolean isLao=age > 60 && age<=120;
        boolean isBug=age>120;

        System.out.println("您的年龄属于成年人吗？:" + isCheng);
        System.out.println("您的年龄属于中年人吗？:" + isZhong);
        System.out.println("您的年龄属于老年人吗？:" + isLao);
        System.out.println("您的年龄属于外星人吗？：" + isBug);
    }
}
