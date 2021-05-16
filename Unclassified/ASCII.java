package Unclassified;/*
输入一个字符，输出其ASCII值
 */
import java.util.Scanner;

public class ASCII{
    public static void main(String[] args) {
        //使用char定义三个字符型变量
        char str,nextStr,preStr;

        String tempNext,tempPre,temp = "";
        int countNext = 0,countPre = 0;
        System.out.print("请输入一个字符：");

        str = new Scanner(System.in).next().charAt(0);
        nextStr = (char)((int)str+1);
        preStr = (char)((int)str-1);
        tempNext = ""+nextStr+"";
        tempPre = ""+preStr+"";
        for (int i = 0; i < tempNext.length(); i++) {
            temp+=tempNext.substring(i,i+1);
            countNext++;
        }
        temp = "";
        for (int i = 0; i < tempPre.length(); i++) {
            temp+=tempPre.substring(i,i+1);
            countPre++;
        }

        System.out.println(" ");
        System.out.println("字符："+str+",对应的ASCII码为："+((int)str));
        System.out.println("上一个字符是:"+preStr+",有"+countNext+"个字符,下一个字符是："+nextStr+",有"+countPre+"个字符。");
    }
}