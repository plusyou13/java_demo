package cn.day1.demo9;
/*
关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属
于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。

当 static 修饰成员变量时，该变量称为类变量。该类的每个对象都共享同一个类变量的值。任何对象都可以更改
该类变量的值，但也可以在不创建该类的对象的情况下对类变量进行操作。
多个对象共享同一个值

 */

public class Student {
    private String name;
    private int age;
    private int id;
    //计数，每当人数加一，numOfStudent++
    public static int numOfStudent = 2016171100;
    //教室
    static String room;

    public Student() {
        numOfStudent++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++numOfStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
