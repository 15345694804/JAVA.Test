package Unclassified;

/*
MathDemo
 */
public class MathDemo {
    public static  void main(String[] args){
        int a = 10;
        int b = 3;

        System.out.println(a+b);//13
        System.out.println(a-b);//7
        System.out.println(a*b);//30
        System.out.println(a*1.0/b);//3.33333333333
        System.out.println(a%b);//取除法余数

        System.out.println(5.3-4.2);//1.1
        System.out.println(0.08f+0.01f);//0.09
        System.out.println(6.9*7);//48.3
        System.out.println(7.6%2.0);//1.6

        System.out.println("Hello"+34);//Hello34
        System.out.println(34+34);//68
        System.out.println("34"+34);//3434
        System.out.println(34+""+34);//3434
        System.out.println(""+34+34);//3434
        System.out.println(34+34+"");//68
        System.out.println(""+(34+34));//68
        System.out.println('a'+34);//97+34=131
    }
}
