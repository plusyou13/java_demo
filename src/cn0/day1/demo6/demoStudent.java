package cn0.day1.demo6;

public class demoStudent {
    public static void main(String[] args) {
        Student one = new Student();
        one.setAge(18);
        one.setName("bob");
        System.out.println("name:"+one.getName()+",      age:"+one.getAge());
        System.out.println("==============================");
        Student stu=new Student("lily",17);
        System.out.println("name:"+stu.getName()+",      age:"+stu.getAge());
        stu.setAge(22);
        System.out.println("name:"+stu.getName()+",      age:"+stu.getAge());
    }
}
