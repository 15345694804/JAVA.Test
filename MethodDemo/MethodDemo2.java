package MethodDemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        //调用方法
        getMax();
    }

    public static void getMax(){
        //定义两个变量
        int a = 10;
        int b = 20;

        //判断a和b的大小
        if(a>b){
            System.out.println(a);
        }
        else if (a == b){
            System.out.println("两数相等");
        }else{
            System.out.println(b);
        }
    }
}
