package MethodDemo;

/*
    带返回值方法的定义和调用

    定义格式：
        public static 数据类型 方法名(参数){
            return数据；
         }

         调用格式：
            1：方法名(参数)；
            2：数据类型 变量名 = 方法名(参数)；
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        boolean flag = isEvenNumber(10);
        System.out.println(flag);

    }

    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
