package StringBuilder;
/*
    StringBuilder 转换为 String
        public String toString():通过 toString() 就可以实现把 StringBuilder 转换为 String
    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以是先把 String 转换为 StringBuilder
 */
public class StringBuilderDemo04 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        // public String toString():通过 toString() 就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);

        /*------------------------------------------------------------*/

        //String 转换为 StringBuilder
        String s2 = "world";

        //public StringBuilder(String s)：通过构造方法就可以是先把 String 转换为 StringBuilder
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(s2);
    }
}
