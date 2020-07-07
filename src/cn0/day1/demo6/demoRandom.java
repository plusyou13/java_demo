package cn0.day1.demo6;

import java.util.Random;

public class demoRandom {
    public static void main(String[] args) {
        Random r=new Random();
        double [] a=new double[10000000];
        for(int i=0;i<10000000;i++){
            a[i]=r.nextDouble()*10000;
        System.out.println(a[i]);
    }

    }
}
