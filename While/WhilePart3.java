package While;

/*
使用while循环输出1-100的总和
 */
public class WhilePart3 {
    public static void main(String[] args){
        int i = 1;

        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
