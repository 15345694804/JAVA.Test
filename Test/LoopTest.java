package Test;
/*
分别使用for循环、while循环、do...while循环，输出1-10的值
 */
public class LoopTest {
    public static void main(String[] agrs){

        /* 第一题:使用for循环输出0-10 */
        for(int i = 0;i <= 10;i++){
            System.out.println(i);
        }

        /* 第二题:使用while循环输出1-10 */
        int j = 0;
        while(j <= 10){
            System.out.println(j);
            j++;
        }

        /* 第三题：使用do...while循环输出1-10 */
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k <= 10);

        /* 第四题：使用for循环输出1-100的总和 */
        int sum1 = 0;

        for(int x = 1;x <= 100;x++){
            sum1 = sum1 + x;
        }System.out.println(sum1);


        /* 第五题：使用while循环输出1-100的总和 */
        int sum2 = 0;
        int y = 1;

        while(y <= 100){
            sum2 = sum2 + y;
            y++;
        }System.out.println(sum2);

        /* 第六题：使用do...while循环输出1-100的总和 */
        int sum3 = 0;
        int z = 1;

        do{
            sum3 = sum3 + z;
            z++;
        }while(z <= 100);
        System.out.println(sum3);
    }
}
