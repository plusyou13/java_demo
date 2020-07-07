package cn0.day1.demo8;
/*
char[] toCharArray()  将此字符串转换为一个新的字符数组。

byte[] getBytes(Charset charset) 使用给定的 charset 将此 String 编码到 byte 序列，
并将结果存储到新的 byte 数组。

String replace(char oldChar, char newChar) 返回一个新的字符串，
它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。

String replace(CharSequence target, CharSequence replacement)
使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 */
public class demoStringConvert {
    public static void main(String[] args) {
        char[] chars="hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换为字节数组
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=====================");
        String str1="How do you do?";
        String str2=str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
