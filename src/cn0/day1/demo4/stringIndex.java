package cn0.day1.demo4;

public class stringIndex {
    public static void main(String[] args) {
        String sourceStr = "There is a string accessing example.";
//获得字符串长度
        int len = sourceStr.length();
//获得索引位置16的字符
        char ch = sourceStr.charAt(16);
//查找字符和子字符串
        int firstChar1 = sourceStr.indexOf('r');
        int lastChar1 = sourceStr.lastIndexOf('r');
        int firstStr1 = sourceStr.indexOf("ing");
        int lastStr1 = sourceStr.lastIndexOf("ing");
        int firstChar2 = sourceStr.indexOf('e', 15);
        int lastChar2 = sourceStr.lastIndexOf('e', 15);
        int firstStr2 = sourceStr.indexOf("ing", 5);
        int lastStr2 = sourceStr.lastIndexOf("ing", 5);
        System.out.println("原始字符串:" + sourceStr);
        System.out.println("字符串长度:" + len);
        System.out.println("索引16的字符:" + ch);
        System.out.println("从前往后搜索r字符，第一次找到它所在索引:" + firstChar1);
        System.out.println("从后往前搜索r字符，第一次找到它所在索引:" + lastChar1);
        System.out.println("从前往后搜索ing字符串，第一次找到它所在索引:" + firstStr1);
        System.out.println("从后往前搜索ing字符串，第一次找到它所在索引:" + lastStr1);
        System.out.println("从索引为15位置开始，从前往后搜索e字符，第一次找到它所在索引:" + firstChar2);
        System.out.println("从索引为15位置开始，从后往前搜索e字符，第一次找到它所在索引:" + lastChar2);
        System.out.println("从索引为5位置开始，从前往后搜索ing字符串，第一次找到它所在索引:" + firstStr2);
        System.out.println("从索引为5位置开始，从后往前搜索ing字符串，第一次找到它所在索引:" + lastStr2);
    }
}
