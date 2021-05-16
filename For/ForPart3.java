package For;
/*
    输出两个数之间所有数相加的总和
 */
import java.util.Scanner;

public class ForPart3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //定义一个变量sum
        int sum = 0;

        System.out.print("请输入起始值:");
        int number1=sc.nextInt();
        System.out.print("请输入末尾值:");
        int number2=sc.nextInt();

        for(int i = number1; i <= number2; i++){
            /*
            sum += i; sum = sum + i;
            sum = sum + i = 0 + 1 = 1;
            sum = sum + i = 1 + 2 = 3;
            sum = sum + i = 3 + 3 = 6;
            sum = sum + i = 6 + 4 = 10;
            sum = sum + i = 10 + 5 = 15;
             */
            sum += i;
        }
        System.out.println("两数之间的总和是：" + sum);
    }
}
