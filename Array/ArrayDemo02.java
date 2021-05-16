package Array;
/*
    数组：是一种用于存储多个相同类型数据的存储模型

    定义格式：
        数据类型[] 数组名;
        例子：int[] arr;
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*
            int[] arr：
                int:说明数组中的元素类型是int类型
                [ ]:说明这是一个数组
                arr:则会使数组的名称

             new int[3]：
                 new:为数组申请内存空间
                 int:说明数组中的元素类型是int类型
                 [ ]:说明这是一个数组
                 3:数组长度，其实就是数组中的元素个数
         */

        //输出数组名
       System.out.println(arr);//[I@16b98e56

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //给数组中的元素赋值
        arr[0]=100;
        arr[2]=200;

        //再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
