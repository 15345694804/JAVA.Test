package Scanner;
/*
有三个和尚，分别输入他们的身高，进行判断，输出最高的身高值
 */
import java.util.Scanner;

public class ScannerPart2 {
    public static void main(String[] agrs){
        //采用键盘输入身高，首先导包，然后创建对象
        Scanner sc = new Scanner(System.in);

        //键盘输入三个身高分别赋值给三个变量
        System.out.print("请输入第一个和尚的身高:");
        int height1 = sc.nextInt();
        System.out.print("请输入第二个和尚的身高:");
        int height2 = sc.nextInt();
        System.out.print("请输入第三个和尚的身高:");
        int height3 = sc.nextInt();

        //用三元运算符获取前两个身高比较值，用临时变量保存起来
        int tempHeight = height1 > height2 ? height1 : height2;

        //用三元运算符获取临时变量和第三个身高的值，用最大变量保存
        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        //输出最高的身高
        System.out.println("三个和尚中身高最高的是:" + maxHeight +"cm");
    }
}
