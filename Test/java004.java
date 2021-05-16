package Test;

public class java004 {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始值，长度为20
        int[] arr = new int[20];

        //以为第1个月，第2个月兔子的对数是已知的。都是1，所以数组的第1个元素，第2个元素也都是1
        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x < arr.length;x++){
            arr[x] = arr[x-2] + arr[x-1];
            /*
                arr[2] = arr[0] + arr[1];
                arr[3] = arr[1] + arr[2];
                arr[4] = arr[2] + arr[3];
                ...
             */
        }

        //输出数组中最后一个元素的值。就是第20个月的兔子对数
        System.out.println("第二十个月的兔子的对数是:" + arr[19]);
    }
}
