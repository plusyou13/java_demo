package cn.demo4;

public class array {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA = new int[200];
        double[] arrayB = new double[10];
        String[] arrayC = new String[100];

        //静态数组初始化,自动推算长度
        int[] arrayD=new int[]{1,2,3,4,5};
        int[] arrayE={1,2,3,4,5};
        //静态初始化拆分为2步，但是省略格式不支持。
        int[] arrayF;
        arrayF=new int[]{1,2,3};



    }
}
