package cn0.day1.demo7;

import java.util.ArrayList;

public class demoArrayListStudent {
    /*
    自定义4个学生对象，添加集合，遍历

     */

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student stu1=new Student("a",11);
        Student stu2=new Student("b",22);
        Student stu3=new Student("c",23);
        Student stu4=new Student("d",34);
        Student stu5=new Student("e",32);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("name:"+stu.getName()+"  ,age:"+stu.getAge());
        }
    }
}
