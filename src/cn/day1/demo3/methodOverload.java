package cn.day1.demo3;

public class methodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,90,80));
        System.out.println(sum(10,90));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }
}
