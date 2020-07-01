package cn.day1.demo4;

public class stringAppend {
    public static void main(String[] args) {
        //添加字符串、字符
        StringBuilder sbuilder1 = new StringBuilder("Hello");
        sbuilder1.append(" ").append("World");
        sbuilder1.append('.');
        System.out.println(sbuilder1);
        StringBuilder sbuilder2 = new StringBuilder();
        Object obj = null;
//添加布尔值、转义符和空对象
        sbuilder2.append(false).append('\t').append(obj);
        System.out.println(sbuilder2);
//添加数值
        StringBuilder sbuilder3 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sbuilder3.append(i);
        } System.out.println(sbuilder3);
    }
}
