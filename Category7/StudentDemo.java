package Category7;
/*
    创建对象并为其成员变量赋值的两种方式
        无参构造方法创建对象后使用setXxx()赋值
        使用带参构造方法直接创建带有属性值的对象
 */
public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        Student s1 = new Student();
        s1.setName("邢凯");
        s1.setAge(30);
        s1.show();

        //使用带参构造方法直接创建带有属性值的对象
        Student s2 = new Student("邢凯", 20);
        s2.show();
    }
}

