package For;
/*
    输出两个数之间的偶数总和
        求偶：i % 2 == 0
        求奇：i % 2 != 0
 */
import java.util.Scanner;

public class ForPart4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //定义两个变量，用来存储偶数和，奇数和
        int even = 0;
        int add = 0;

        System.out.print("请输入起始值:");
        int number1=sc.nextInt();
        System.out.print("请输入末尾值:");
        int number2=sc.nextInt();

        for(int i = number1; i <= number2; i++){
            if(i % 2 == 0){
                even += i;
            }
        }
        System.out.println("两数之间的偶数总和是：" + even);

/*--------------------------------------------------*/

        for(int i = number1; i <= number2; i++){
            if(i % 2 != 0){
                add += i;
            }
        }
        System.out.println("两数之间的奇数总和是：" + add);
    }
}
