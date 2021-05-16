package String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共三次机会，登录之后，给出相应的提示
 */
public class StringDemo03 {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String username = "xingkai";
        String password = "1964";

        //用循环实现多次机会，这里的次数明确，采用for循环实现
        for (int i = 0; i < 3; i++) {
            //键盘录入要登录的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);

            System.out.print("请输入用户名:");
            String name = sc.nextLine();

            System.out.print("请输入密码:");
            String pwd = sc.nextLine();

            //比较键盘录入的用户名、密码和已知的用户名和密码
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登陆失败，你还有" + (2 - i) +"次机会");
            }
        }
    }
}