package cn0.day1.demo3;

public class test {
    public static void main(String[] args) {
        overloadSame os=new overloadSame();
        double a=100;
        double b=100;
        System.out.println(os.isSame(a,b));
        System.out.println(os.isSame(1l,1l));
    }
}
