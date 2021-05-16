package Scanner;
/*
一个导包键入的Demo教程
 */
import java.util.Scanner;

public class ScannerPart1 {
    public static void main(String[] agrs){
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.print("请输入一个整数:");
        int x = sc.nextInt();

        //输出数据
        System.out.println("x:" + x);
    }
}
