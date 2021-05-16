package Test;

/*
    需求：
        定义两个数组，判断两个数组内容是否相同，相同输出ture
    思路：
        1.定义两个数组
        2.定义一个方法用于比较两个数组内容是否相同
        3.先比较数组长度，如果长度不相同，返回false
        4.接着比较数组元素中的每一个元素，只要有一个不相同，则返回false
        5.调用方法，输出结果
 */
public class java007 {
    public static void main(String[] args) {
        //1.定义两个数组
        int[] arr={11,22,33,44,55};
        int[] arr2={11,22,33,44,55};

        //6.调用方法
        boolean flag = compare(arr,arr2);
        //7.输出结果
        System.out.println(flag);
    }
    /*
        2.定义一个方法用于比较两个数组内容是否相同
    */
    public static boolean compare(int[] arr,int[] arr2){
        //3.首先比较数组长度，如果长度不相同，返回false
        if(arr.length != arr2.length){
            return false;
        }

        //4.遍历，比较两个数组中的每个元素，只要铀元素不相同，返回false
        for(int x = 0;x < arr.length;x++){
            if(arr[x] != arr2[x]){
                return false;
            }
        }
        //5.最后循环遍历结束，输出true
        return true;
    }
}
