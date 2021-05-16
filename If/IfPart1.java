package If;
/*
    键盘录入一个数，判断今天是星期几
 */
import java.util.Scanner;

public class IfPart1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //键盘录入一个数字
        System.out.print("请输入一个0-7之间的整数:");
        int week = sc.nextInt();

        //判断该数字对应的星期数
        if(week == 1){
            System.out.println("今天是星期一");
        }else if(week == 2){
            System.out.println("今天是星期二");
        }else if(week == 3){
            System.out.println("今天是星期三");
        }else if(week == 4){
            System.out.println("今天是星期四");
        }else if(week == 5){
            System.out.println("今天是星期五");
        }else if(week == 6){
            System.out.println("今天是星期六");
        }else{
            System.out.println("今天是星期日");
        }
    }
}
