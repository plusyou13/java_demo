package cn.demo7;

public class demoPerson {
    public static void main(String[] args) {
        //一旦创建，长度变不了
        Person[] array=new Person[3];
        Person one =new Person("jiayan",22);
        Person two =new Person("wangx",25);
        Person three =new Person("xiongl",23);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        //地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //
        System.out.println(array[0].getName());
        System.out.println(array[2].getName());
        System.out.println(array[1].getName());
    }
}
