package cn.day2.demo7;
/*
群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
2. 成员领取红包后，保存到成员余额中。
请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作。

 */
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //展示一下当前用户有多少钱。
    public void show(){
        System.out.println("我叫："+name+"，  我有多少钱："+money);
    }
}
