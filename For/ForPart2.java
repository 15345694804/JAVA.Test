package For;
/*
    使用for循环输出1-5 5-1
 */
public class ForPart2 {
    public static void main(String[] args){
        System.out.println("输出1-5：");

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

/*--------------------------------------------------*/

        System.out.println("输出5-1：");

        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
}
