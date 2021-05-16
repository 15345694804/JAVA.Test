package Operator;

/*
有三个和尚，已知身高分别为150cm、210cm、164cm，
请求出三个和尚的最高身高
 */
public class OperatorPart3 {
    public static void main(String []args){
        //定义三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 164;

        //使用三元运算符判断三个和尚的身高排名,先使用临时身高变量保存起来
        int tempHeight = (height1 > height2) ? height1 : height2;

        //比较身高临时变量和第三个和尚身高的值，用最大身高变量保存起来
        int maxHeight  = tempHeight > height3 ? height2 : height3;

        //输出结果
        System.out.println("最高的和尚身高是" + maxHeight);
    }
}
