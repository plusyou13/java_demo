package cn0.day1.demo7;

import java.util.ArrayList;
//泛型,是引用类型，不能是基本类型
public class demoArrayLIst {
    public static void main(String[] args) {
        //右边<>可以不写，jdk1.7开始；
        ArrayList<String> list =new ArrayList<>();
        //如果内容为空，得到空的中括号[],
        System.out.println(list);

        list.add("bob");
        list.add("bob1");
        list.add("bob2");
        list.add("bob3");
        list.add("bob4");
        list.add("bob5");
        list.add("bob6");
        list.add("bob7");
        System.out.println(list);
        //索引
        String name=list.get(2);
        System.out.println(name);
        //删除
        String whoRemoved=list.remove(3);
        System.out.println("whoRemoved name:"+whoRemoved);
        //获取长度
        int size=list.size();
        System.out.println("list size:"+size);
        //遍历
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
