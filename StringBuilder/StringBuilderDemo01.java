package StringBuilder;
/*
    StringBuilder是一个可变的字符串类，我么可以把它看成是一个容器
    这里的可变指的是StringBuilder对象中的内容是可变的
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String s = "Hello";
        s += "World"; // s = s + world
        System.out.println(s);
    }
}
