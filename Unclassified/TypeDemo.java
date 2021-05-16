package Unclassified;

public class TypeDemo {
    public static void main(String []args){

        byte a=100;
        short b=a;
        int c=b;
        c=a;
        long d=c;
        float e=d;
        double f=e;
        float res=a+e;
        double h='a';

        System.out.println(a);;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(res);
        System.out.println(h);
    }
}
