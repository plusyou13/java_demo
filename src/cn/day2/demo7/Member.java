package cn.day2.demo7;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        int index=new Random().nextInt(list.size());//匿名对象
        //根据集合，从中删除，并得到被删除的红包，给自己。
        int delta=list.remove(index);
        //当前成员自己本来有多少钱
        int money=super.getMoney();
        //加上红包，并重新设置余额；
        super.setMoney(money+delta);
    }
}
