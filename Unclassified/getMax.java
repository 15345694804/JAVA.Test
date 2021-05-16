package Unclassified;

public class getMax {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        getMax(10,20);
        //调用方法的时候，需要几个，就给几个；要什么类型的，就给什么类型的

        //在main()方法中调用定义好的方法（使用变量）
        int a = 20;
        int b = 40;
        getMax(a,b);
    }

    public static void getMax(int a,int b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
