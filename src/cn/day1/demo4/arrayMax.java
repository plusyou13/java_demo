package cn.day1.demo4;

public class arrayMax {
    public static void main(String[] args) {
        int[ ]a={1,3,5,7,8,2,3};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){max=a[i];}
        }
        System.out.println("最大值为："+max);
    }
}
