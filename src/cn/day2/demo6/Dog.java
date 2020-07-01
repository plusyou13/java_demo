package cn.day2.demo6;
/*
子类也是抽象类
 */
public abstract class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
