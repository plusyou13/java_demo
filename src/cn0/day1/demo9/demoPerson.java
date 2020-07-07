package cn0.day1.demo9;
/*
特点：第一次用到本类时候，静态代码会执行唯一的一次；
静态内容优先于非静态，所以静态代码比构造方法先执行；
 */
public class demoPerson {
    public static void main(String[] args) {
        Person a1=new Person();
        Person a2=new Person();
    }
}
