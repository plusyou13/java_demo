package cn.day1.demo4;

public class sortMP {
    public static void main(String[] args) {
        int[] a={1,4,6,3,88,3,0,12,3};
        System.out.println("排序前：");
        for(int n:a){
            System.out.print(n+"   ");

        }
        System.out.println();
        int temp;
        for (int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("排序后：");
        for(int n:a){
            System.out.print(n+"   ");

        }
    }

}
