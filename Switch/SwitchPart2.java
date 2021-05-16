package Switch;/*
使用switch语句，键入一个月份值，输出该月份所处的季节
 */
import java.util.Scanner;

public class SwitchPart2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个月份值:");
        int mouth = sc.nextInt();

        switch (mouth){
            case 12,1,2:
                System.out.println("冬季");
                break;
            case 3,4,5:
                System.out.println("春季");
                break;
            case 6,7,8:
                System.out.println("夏季");
                break;
            case 9,10,11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("这他妈是月份的值吗？");
        }
    }
}
