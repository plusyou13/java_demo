package cn0.day1.demo5;

public class person {
    private int age;//保护类型
    String name;
    public void show(){
        System.out.println("i am :"+name+"     age:"+age);
    }
    //阻止不合理数据，提高安全性
    public void setAge(int num){
        if(num<=100&&num>=0){
            age=num;
        }else System.out.println("not accpect");

    }
    public int getAge(){
        return age;
    }
}
