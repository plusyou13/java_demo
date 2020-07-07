package cn0.day2.demo7;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send (int totalMoney,int count){
        ArrayList<Integer> reList=new ArrayList<>();
        //看群主有多少钱；
        int leftMoney =super.getMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return reList;
        }
        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney-totalMoney);
        //发红包需要平均分成count份
        int avg=totalMoney/count;//平均
        int mod=totalMoney%count;//余数，零头
        //最后一个红包
        for (int i = 0; i < count; i++) {
            reList.add(avg);
        }
        int last=avg+mod;
        reList.add(last);
        return reList;
    }
}
