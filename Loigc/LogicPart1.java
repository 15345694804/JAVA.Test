package Loigc;

/*
逻辑与:& 有f则为f              &&为短路与，当第一个条件已经可以判断结果后，则不执行后续判断
逻辑或:| 有t则为t              ||为短路或，当第一个条件已经可以判定结果后，则不执行后续哦按段
逻辑异或:^ 条件相同为f 条件不相同为t
逻辑非：! 运行结果相反的结果
 */
public class LogicPart1 {
    public static void main(String[] args){
        int a=3,b=5,c=9;

        System.out.println(a>b && a>c);//f&&f f
        System.out.println(a>b && a<c);//f&&t f
        System.out.println(a<b && a>c);//t&&f f
        System.out.println(a<b && a<c);//t&&t t
        //必须同时满足条件 才为t &&与运算
        System.out.println(a>b || a>c);//f||f f
        System.out.println(a>b || a<c);//f||t t
        System.out.println(a<b || a>c);//t||f t
        System.out.println(a<b || a<c);//t||t t
        //只需满足一个条件  即为t ||或运算
        System.out.println(a>b ^ a>c);//f^f f
        System.out.println(a>b ^ a<c);//f^t t
        System.out.println(a<b ^ a>c);//t^f t
        System.out.println(a<b ^ a<c);//t^t f
        //条件不相同为t 条件相同为f ^异或运算
        System.out.println(!(a>b));//t
        System.out.println(!(a<b));//f
        //运行与结果相反的结果 !非运算
    }
}
