package cn.demo6;

import java.util.Random;

public class demo1Random {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        for(int i=0;i<100;i++){
        int result=r.nextInt(10)+1;
            System.out.println(result);
    }
}

}
