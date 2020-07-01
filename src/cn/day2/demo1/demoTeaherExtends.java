package cn.day2.demo1;
/*
达到了代码复用的效果

如果子类父类中出现重名的成员方法，这时的访问是一种特殊情况，叫做方法重写 (Override)。
方法重写 ：子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。

重写（override）【覆盖，覆写】：方法的名称一样。参数列表也一样。在继承关系中。
重载（overload）：方法的名称一样，参数列表不一样。

方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。

方法覆盖重写的注意事项：
1.方法的名称一样。参数列表也一样。用@override来检测是不是有效的覆盖重写。
2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
java.lang.object类是所有类的公共最高父类。

3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
public>protected>(default)>private


 */
public class demoTeaherExtends {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.method();
        //优先用子类
        System.out.println(teacher.id);
        Assistant assistant=new Assistant();
        assistant.method();
        System.out.println(assistant.id);

        System.out.println("=========================");

        teacher.methodZi();
        teacher.methodFu();
        assistant.methodFu();

        System.out.println("=========================");

        teacher.method2();
        //super.method();

    }
}
