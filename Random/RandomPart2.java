package Random;/*
系统给出一个随机数，猜一猜这个数字
 */
import java.util.Scanner;
import java.util.Random;

public class RandomPart2 {
    public static void main(String[] args) {
        //让系统给出一个随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            //输入你要猜的数
            Scanner sc = new Scanner(System.in);
            System.out.print("请猜一猜该数的值，将其输入：");
            int guessNumber = sc.nextInt();

            //使用if分支结构对你输入的数进行判断
            if (guessNumber > number) {
                System.out.println("您猜到的数比该数大");
            } else if (guessNumber < number) {
                System.out.println("您猜到到的数比该数小");
            } else {
                System.out.println("您猜对了!");
                break;
            }
        }
    }
}