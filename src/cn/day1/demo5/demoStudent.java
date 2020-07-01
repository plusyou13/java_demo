package cn.day1.demo5;

public class demoStudent {
    public static void main(String[] args) {
        student one =new student();
        one.setAge(18);
        one.setName("bob");
        one.setMale(true);
        one.show();
        System.out.println("name:"+one.getName());
        System.out.println("age:"+one.getAge());;
        System.out.println("male:"+one.isMale());
    }
}
