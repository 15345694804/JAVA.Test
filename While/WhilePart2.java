package While;

/*
珠穆朗玛峰的高度是8844430，纸张的厚度是0.1
使用while循环计算纸张需要对折多少次达到珠峰的高度
 */
public class WhilePart2 {
    public static void main(String[] args){
        int i = 8844430;
        double paper = 0.1;
        int count = 0;

        while(paper <= i){
            paper *= 2;
            count++;
        }
        System.out.println("折叠了" + count + "次");
    }
}
