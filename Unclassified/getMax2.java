package Unclassified;

public class getMax2 {
    public static void main(String[] args) {
        //定义变量flag，将结果赋值给flag
        int result = getMax(20,10);
        System.out.println(result);

        //也可以采用这种写法
        System.out.println(getMax (20,40));
    }

    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
