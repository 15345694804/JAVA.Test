package Category6;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("邢凯");
        s2.show();

        Student s3 = new Student(20);
        s3.show();

        Student s4 = new Student("邢凯",20);
        s4.show();
    }
}
