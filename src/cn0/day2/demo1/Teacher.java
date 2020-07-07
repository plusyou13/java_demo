package cn0.day2.demo1;
/*
定义一个员工的子类，讲师。
 */
public class Teacher extends Employee{
    int id=200;
    //安全检测作用，看看是不是正确的重写（覆盖重写）
    @Override
    public void method2(){
        System.out.println("子类方法执行");
    }
    public void methodZi(){
        System.out.println(id);
    }
}
