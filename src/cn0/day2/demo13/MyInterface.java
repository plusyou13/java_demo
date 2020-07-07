package cn0.day2.demo13;

public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
