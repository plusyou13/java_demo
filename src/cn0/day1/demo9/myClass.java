package cn0.day1.demo9;
/*
当static 修饰成员方法时，该方法称为类方法 。静态方法在声明中有static ，建议使用类名来调用，而不需要
创建类的对象。调用方式非常简单。
类方法：使用 static关键字修饰的成员方法，习惯称为静态方法。


静态方法调用的注意事项：
静态方法可以直接访问类变量和静态方法。
静态方法不能直接访问普通成员变量或成员方法。反之，成员方法可以直接访问类变量或静态方法。
静态方法中，不能使用this关键字。
小贴士：静态方法只能访问静态成员。

无论成员（静态）变量，还是成员（静态）方法，如果有static ，都推荐使用类名称进行调用

 */
public class myClass {
    int num;
    static int numStatic;

    public void method(){
        System.out.println("这是一个普通的成员方法");
        //成员方法可以访问成员变量和静态变量
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
        //静态不能访问非静态，由于在内存中，先有静态内容，再有非静态内容。
        //System.out.println(num);

    }
}
