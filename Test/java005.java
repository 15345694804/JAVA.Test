package Test;

/*
    有100元钱，需要去市场买鸡，
        公鸡5元一只，母鸡3元一只，小鸡1元三只；
        使用for循环嵌套计算出一共有几种购买方案
 */
public class java005 {
    public static void main(String[] args) {
        //第一层循环，表示公鸡的范围
        for(int x = 0;x <= 20;x++){
            //第二层循环，表示母鸡的范围
            for(int y = 0;y <= 33;y++){
                //定义小鸡，表示小鸡的变量:z = 100 - x - y
                int z = 100 - x - y;

                //判断表达式 z%3 == 0 和表达式 5*x + 3*y + z/3 = 100是否同时成立
                if(z%3 == 0 && 5*x + 3*y + z/3 == 100){
                    System.out.println(x + "只公鸡，" + y + "只母鸡，" + z + "只小鸡");
                }
            }
        }
    }
}
