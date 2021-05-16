package DoWhile;
/*
输出1-100的总和
 */
public class DoWhilePart2 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        do{
            sum += i++;
        }while(i <= 100);
            System.out.println("1-100的总和为:" + sum);
    }
}
