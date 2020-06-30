package cn.demo5;

public class helloAccount {
    public static void main(String[] args) {
// 访问静态变量
        System.out.println(Account.interestRate);
// 访问静态方法
        System.out.println(Account.interestBy(1000));
        Account myAccount = new Account();
// 访问实例变量
        myAccount.amount = 1000000;
        myAccount.owner = "Tony";
// 访问实例方法
        System.out.println(myAccount.messageWith(1000));
// 通过实例访问静态变量
        System.out.println(myAccount.interestRate);
    }
}
