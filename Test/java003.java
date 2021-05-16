package Test;

/*
    1-100之间的数，用for循环实现数据的获取
    使用if语句实现数据的判断：要么个位数是7，要么十位数是7，能被7整除
 */
public class java003 {
    public static void main(String[] args) {
        for(int i = 1;i <= 100;i++){

//            if(i %10 == 7 || i/10 % 10 == 7 || i % 7 == 0){
//                System.out.println(i);
//            }

            if(i % 10 == 7){
                System.out.println("过");
            }else if(i/10 % 10 == 7){
                System.out.println("过");
            }else if(i % 7 == 0){
                System.out.println("过");
            }else{
                System.out.println(i);
            }
        }
    }
}
