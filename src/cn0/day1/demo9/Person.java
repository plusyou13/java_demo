package cn0.day1.demo9;
/*
格式：
public class 类名{
static{
//静态代码块的内容；
}
}

用途：用来一次性对静态成员变量赋值；
 */
public class Person {
    public Person() {
        System.out.println("构造方法执行");
    }
    static {
        methodStatic();
        System.out.println("静态代码执行");
    }

    public void method(){
        System.out.println("非静态方法");
    }
    static public void methodStatic(){
        System.out.println("静态方法");
    }
}
