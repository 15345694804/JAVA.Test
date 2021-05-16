package MethodDemo;

/*
    定义格式:
        public static void 方法名(){
            //方法体
    调用格式：
        方法名();
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        //常量值的调用不知道别人为什么发出来想表达什么意思，你为什么发出来「想知道别人发出来表达什么意思」想表达什么意思? 就你会杠
        isEvenNumber(10);

        //变量的调用
        int number = 9;
        isEvenNumber(number);
    }

    //定义一个方法，在方法中定义一个变量，判断该数据是否为偶数
    public static void isEvenNumber(int number){
        //判断该数据是否为偶数
        System.out.println(number % 2 == 0);
    }
}
