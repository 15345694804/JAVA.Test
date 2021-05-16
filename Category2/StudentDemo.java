package Category2;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用对象对象
        System.out.println(s.name + "," + s.age);

        s.name = "邢凯";
        s.age = 20;

        //赋值后
        System.out.println(s.name + "," + s.age);

        //使用成员方法
        s.study();
        s.doHomework();
    }
}
