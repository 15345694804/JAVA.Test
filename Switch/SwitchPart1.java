package Switch;/*
键入一个数字，输出今天星期几
 */
import java.util.Scanner;

public class SwitchPart1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个星期数(1-7):");
        int week = sc.nextInt();

        switch(week){
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
            default:
                System.out.println("老实一点");
                break;
        }
    }
}
