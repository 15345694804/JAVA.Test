package String;

import java.util.Scanner;

/*
    需求：
        定义一个方法，实现字符串反转
 */
public class StringDemo07 {
    public static void main(String[] args) {
        //定义一个字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();

        //调用方法，用一个变量接受结果
        String s = reverse(line);

        //输出结果
        System.out.println("s" + s);
    }

    //定义一个方法，实现字符反转
    public static String reverse(String s){
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        String ss = "";

        for(int i = s.length()-1;i >= 0;i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
