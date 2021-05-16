package Category1;
/*
    创建对象
        格式：类名 对象名 = new 类名（）；
        范例：Phone p = new Phone（）；

    适用对象
        1.使用成员变量
            格式：对象名.变量名
            范例：p.brand
        2.使用成员方法
            格式：对象名.方法名（）
            范例：p.call（）
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //使用成员变量 赋值前
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 1999;

        //赋值后
        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
