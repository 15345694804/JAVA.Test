package If;/*
判断奇偶数
 */
import java.util.Scanner;

public class IfPart3 {
    public static void main(String[] args){
        //创建对象，采用键盘录入数据
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.print("请输入一个整数:");
        int number = sc.nextInt();

        //判断整数是否为奇数还是偶数
        if(number%2 == 0){
            System.out.println(number + "是偶数");
        }else {
            System.out.println(number + "是奇数");
        }
    }
}
