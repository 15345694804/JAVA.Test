package Category6;
/*
    构造方法
        如果没有定义构造方法，系统将给出一个默认的无参数构造方法
        如果定义了构造方法，系统将不再提供默认的构造方法
    构造方法的重载
        如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
    建议
        无论是否使用，都手工书写无参数构造方法
 */
public class Student {
    private String name;
    private int age;

    //如果没有定义构造方法，系统将给出一个默认的无参数构造方法
//    public Student(){
//       System.out.println("无参构造方法");
//    }

    // 如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
    public Student(){
    }

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }

}
