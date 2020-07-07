package cn0.day1.demo2;

public class demo2 {
    public static void getInt(){

    }
    public static int sum(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        int s=sum(10,20);
        System.out.println(s);
        System.out.println(sum(1,1));
        System.out.println(sum100());
        sum1(10,1);
        System.out.println(isSame(1,2));
        printCount(1000);
    }
    public static int sum100(){
        int s=0;
        for (int i=0;i<=100;i++)
            s+=i;
        return s;
    }
    public static void sum1(int a,int b){
        int s=a+b;
        System.out.println(s);
    }
    public static boolean isSame(int a,int b){
//        boolean same;
//        if(a==b)same=true;
//        else same=false;
        boolean same=a==b;
        return same;
    }
    public static void printCount(int num){
        for (int i=0;i<num;i++){
            System.out.println("hello"+(i+1));
        }
    }
}
