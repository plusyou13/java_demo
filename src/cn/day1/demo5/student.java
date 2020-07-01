package cn.day1.demo5;

public class student {
    private String name;
    private int age;
    private boolean male;
    public void setMale(boolean b){
        male=b;
    }
    //bool用isXxxx（）
    public boolean isMale(){
        return male;
    }
    public void setAge(int num){
        if(num<=100&&num>=0){
            age=num;
        }else System.out.println("not accpect");
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public  void show(){
        System.out.println("name: " +name+",   age: "+age+",   male: "+male);

    }
}
