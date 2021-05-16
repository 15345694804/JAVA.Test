package Test;

/*
    需求:
        有a和b两个数：1000和495
        使用for循环求出两数的最大公约数
    思路：
        1.定义a和b的值
        2.定义一个min变量，使用三元运算符求出两个数的最小值
        3.使用for循环，判断两数%min==0，输出该数
 */
public class java002 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 495;

        //求出两个数字之间的小值
        int min = a < b ? a : b;

        for (int i = min;i >= 1;i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("最大公约数是：" + i);
                break;
            }
        }
    }
}
