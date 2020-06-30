package cn.demo3;
import cn.demo3.overloadSame;
public class test {
    public static void main(String[] args) {
        overloadSame os=new overloadSame();
        double a=100;
        double b=100;
        System.out.println(os.isSame(a,b));
        System.out.println(os.isSame(1l,1l));
    }
}
