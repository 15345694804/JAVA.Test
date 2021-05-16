package Test;/*
    需求:
        输入一个星期数，输出对应的星期
    思路：
        1.定义一个number变量，让用户输入数据，获取数据
        2.使用switch语句，判断输出的星期数，输出对应的星期
 */
import java.util.Scanner;

public class java001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //获取数据
        System.out.print("请输入今天的星期数:");
        int number = sc.nextInt();

        //
        switch (number){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期日");
                break;
        }
    }
}
