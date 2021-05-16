package Category2;
/*
    多个对象指向相同
        当两个对象地址值相同，其中一个对象修改堆内存内容，另一个对象也跟着修改
 */
public class StudentDemo3 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();
        s1.name = "剑姬";
        s1.age = 40;

        System.out.println(s1.name + "," + s1.age);

        //把第一个对象的地址赋值给第二个对象
        Student s2 = s1;

        s2.name = "潘森";
        s2.age = 45;

        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);
    }
}
