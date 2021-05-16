package For;

/*
使用循环嵌套输出一天的小时和分钟
 */
public class ForForPart1 {
    public static void main(String[] args){
//        //一代
//        System.out.println("0时0分");
//        System.out.println("0时1分");
//        System.out.println("0时2分");
//        System.out.println("0时3分");

//        System.out.println("-------");

//        System.out.println("1时0分");
//        System.out.println("1时1分");
//        System.out.println("1时2分");
//        System.out.println("1时3分");

//        System.out.println("-------");
//        System.out.println("2时0分");
//        System.out.println("2时1分");
//        System.out.println("2时2分");
//        System.out.println("2时3分");
//
//        //二代
//        for(int minute = 0;minute < 4;minute++){
//            System.out.println("0时" + minute + "分");
//        }System.out.println("-------");

//        for(int minute = 0;minute < 4;minute++){
//            System.out.println("1时" + minute + "分");
//        }System.out.println("-------");

//        for(int minute = 0;minute < 4;minute++){
//            System.out.println("2时" + minute + "分");
//        }System.out.println("-------");

        //套中套
        for(int hours = 0;hours < 24;hours++){
            for(int minute = 0;minute < 60;minute++){
                System.out.println(hours + "时" + minute + "分");
            }System.out.println("-------");
        }
    }
}
