package For;
/*
    输出所有"水仙花数"
        水仙花是一个三位数
        水仙花的个位、十位、百位的数字立方和等于该数本身
*/
public class ForPart5 {
    public static void main(String[] args){

        for(int i = 100 ; i < 1000 ; i++){
            //在计算前获取三位数中的个十百位
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;

            //计算该数的个十百位的立方和是否等于该数
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println("这些数符合条件：" + i);
            }
        }
    }
}
