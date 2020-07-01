package cn.day1.demo9;

/*
静态（方法）不能直接调用非静态（变量）
静态方法不能用this，this是当前对象，静态没有对象。
 */
public class demoStaticMethod {
    public static void main(String[] args) {
        myClass obj=new myClass();
        obj.method();
        //用类名调用  other类静态方法
        myClass.methodStatic();

        //对于本类中的静态方法，可以省略类名称
        myMethod();
        demoStaticMethod.myMethod();

    }

    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}