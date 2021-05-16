package Category5;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("邢凯");
        s.age = 20;

        s.show();
    }
}
