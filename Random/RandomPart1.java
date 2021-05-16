package Random;/*
Random:产生一个随机数
 */
import java.util.Random;

public class RandomPart1 {
    public static void main(String[] args){
        //创建对象
        Random r=new Random();

        //用循环获取1-10个随机数
        for(int i = 0;i < 10;i++) {
            //获取随机数
            int number = r.nextInt(10);
            System.out.println("number:" + number);
        }

        //练习：获取一个1-100之间的随机数
        int x = r.nextInt(100) + 1; //一般只取0-99，+1使其可以输出0-100
        System.out.println("number:" + x);
    }
}
