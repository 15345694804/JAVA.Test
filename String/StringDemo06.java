package String;
/*
    需求：
        定义一个方法，把int数组中的数据按照指定好的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
 */
public class StringDemo06 {
    public static void main(String[] args) {
        //定义一个int类型的数组，用动态初始化完成数组元素的初始化
        int[] arr = {1,2,3};

        //调用方法，用一个变量接受结果
        String s = arrayToString(arr);

        //输出结果
        System.out.println("s:" + s);
    }

    //定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回
    public static String arrayToString(int[] arr){
        //在方法中遍历数组，按照要求进行拼接
        String s = "";

        s += "[";

        for(int i = 0;i < arr.length;i++){
            if(i == arr.length-1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ",";
            }
        }

        s += "]";

        return s;
    }
}
