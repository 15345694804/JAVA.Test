package If;
/*
    键盘录入一个成绩，根据不同的得分得到不同的奖励
 */
import java.util.Scanner;

public class IfPart2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入您的分数:");
        int score = sc.nextInt();

        if(score >= 95 && score <= 100) {
            System.out.println("山地自行车一辆");
        }else if(score >= 90 && score <= 94){
            System.out.println("游乐场玩一次");
        }else if(score >= 80 && score <= 89){
            System.out.println("变形金刚玩具一个");
        }else if(score >= 0 && score <= 79){
            System.out.println("胖揍一顿");
        }else{
            System.out.println("给我老实一点！昏睡红茶警告");
        }
    }
}
