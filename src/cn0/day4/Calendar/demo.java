package cn0.day4.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws ParseException {
        // 键盘录入你的姓名:
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name = sc.next();

        // 键盘录入出生日期
        System.out.println("请输入你的出生日期 格式: yyyy-MM-dd");
        String beginTime = sc.next();

        // 定义一个SimpleDateFormate("自定义格式");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(beginTime);  // 将输入的出生日期(字符串形式) 转换为Date .

        // 当前系统时间.
        Date nowTime = new Date();

        // 将Date对象转换为对应的毫秒值 ,
        long time = nowTime.getTime();
        long time1 = date.getTime();
        long birthday = time - time1;  // 得到相差的毫秒值

        // 将毫秒值转换为天数 .
        if (birthday < 0) {
            System.out.println("你还未出生");
        } else {
            // 1天 = 24时, 1时 = 60分, 1分 = 60秒, 1秒 = 1000 毫秒.
            double day = birthday / (1000 * 60 * 60 * 24);
            double hour = birthday / (1000 * 60 * 60) - (day * 24);
            double min = birthday / (1000 * 60) - day * 24 * 60 - hour * 60;
            double second = birthday / 1000 - day * 60 * 60 * 24 - hour * 60 * 60 - min * 60;
            System.out.println(name + ",你已经活了:" + day + "天" + hour + "时" + min + "分" + second + "秒!");

            System.out.println(name + ",你今年:" + birthday / 1000 / 60 / 60 / 24 / 365 + "岁了!");
        }

    }
    }