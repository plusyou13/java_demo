package cn0.day1.demo9;

public class demoStaticField {
    public static void main(String[] args) {
        Student one =new Student("bob",18);
        Student one2 =new Student("tim",10);
        one.room="1号教室";
        System.out.println("name:"+one.getName()+",  age:"+one.getAge()+",   学号："+one.getId()+"，   教室: "+one.room);
        System.out.println("name:"+one2.getName()+",  age:"+one2.getAge()+",   学号："+one2.getId()+"，   教室: "+one2.room);

    }
}
