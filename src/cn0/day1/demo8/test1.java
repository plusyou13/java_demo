package cn0.day1.demo8;
/*
定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。
格式参照如下：[word1#word2#word3]。
 */
public class test1 {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String s=fromArraryToString(array);
        System.out.println(s);
    }
    public static String fromArraryToString(int[] a){
        String str="[";
        String temp="word";
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1){
                str=str.concat(temp+a[i]+"]");

            }else {
                str=str.concat(temp+a[i]+"#");
            }
        }
        return str;
    }
}
