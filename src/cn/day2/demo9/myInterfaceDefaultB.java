package cn.day2.demo9;

public class myInterfaceDefaultB implements myInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBBBB");
    }
    @Override
    public void methodAbs2() {
        System.out.println("B重写了接口的默认方法");
    }
}
