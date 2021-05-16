package Operator;

/*
有两只老虎，已知体重分别为180kg、200kg
用程序实现判断两只老虎体重是否相等
  */
public class OperatorPart2 {
    public static void main(String []args){
        //定义两个变量用于保存老虎的体重
        int weight1=180;
        int weight2=200;

        //用三元运算符判断体重，体重相同，返回true，否则返回felse
        boolean b = weight1 == weight2 ? true : false;

        //输出结果
        System.out.println("两只老虎的体重是否相等:" + b);
    }
}
