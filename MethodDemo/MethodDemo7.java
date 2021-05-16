package MethodDemo;
/*
    方法重载练习：
 */
public class MethodDemo7 {
    public static void main(String[] args) {
        //整数默认调用int类型
        System.out.println(compare(10,20));
        //在赋值前加上(类型名)，进行强制转换
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));

        //long类型只需在后面直接加上L即可
        System.out.println(compare(10L,20L));
    }

    public static boolean compare(int a,int b){
        System.out.print("int:");
        return a == b;
    }

    public static boolean compare(long a,long b){
        System.out.print("long:");
        return a == b;
    }

    public static boolean compare(short a,short b){
        System.out.print("short:");
        return a == b;
    }

    public static boolean compart(byte a,byte b){
        System.out.print("byte:");
        return a == b;
    }
}
