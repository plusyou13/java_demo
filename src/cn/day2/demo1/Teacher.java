package cn.day2.demo1;
/*
定义一个员工的子类，讲师。
 */
public class Teacher extends Employee{
    int id=200;

    public void method2(){
        System.out.println("子类方法执行");
    }
    public void methodZi(){
        System.out.println(id);
    }
}
