package cn.demo3;
import cn.demo4.mergeArray;
public class overloadSame {
    public static void main(String[] args) {
        //mergeArray ma=new mergeArray();
        //System.out.println(ma);

        double a=100;
        double b=100;
        System.out.println(isSame(a,b));
        System.out.println(isSame(1l,1l));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("short");
        return a==b;
    }
    public static boolean isSame(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("long");
        return a==b;
    }
    public static boolean isSame(double a,double b){
        System.out.println("double");
        return a==b;
    }
}
