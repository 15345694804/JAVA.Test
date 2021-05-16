package Category3;
/*
    private关键字
 */
public class Student {
    //成员变量
    String name;
    private int age;

    //提供set/get方法
    public void setAge(int a){
//        age = a;
        if (a>0 && a<120){
            age = a;
        }else{
            System.out.println("你给的年龄有误");
        }
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println( name + "," + age);
    }
}
