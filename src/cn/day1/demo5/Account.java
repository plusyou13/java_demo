package cn.day1.demo5;

public class Account {
    // 实例变量账户金额
    double amount = 0.0;
    // 实例变量账户名
    String owner;
    // 静态变量利率
    static double interestRate = 0.0668;
    // 静态方法
    public static double interestBy(double amt) {
//静态方法可以访问静态变量和其他静态方法
        return interestRate * amt;
    }
    // 实例方法
    public String messageWith(double amt) {
//实例方法可以访问实例变量、实例方法、静态变量和静态方法
        double interest = Account.interestBy(amt);
        StringBuilder sb = new StringBuilder();
// 拼接字符串
        sb.append(owner).append("的利息是").append(interest);
// 返回字符串
        return sb.toString();
    }
}
