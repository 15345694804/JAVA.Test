package Category4;
/*
    private关键字
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    /*    分割线    */

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    /*    分割线    */

    public void show(){
        System.out.println(name + "," + age);
    }
}
