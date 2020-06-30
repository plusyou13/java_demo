package cn.demo4;

public class mulArray {
    public static void main(String[] args) {
        int[][] intArray = {
                {1, 2, 3},
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}};

// 动态初始化二维数组
        double[][] doubleArray = new double[4][3];

// 计算数组intArray元素的平方根，结果保存到doubleArray
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
// 计算平方根
                doubleArray[i][j] = Math.sqrt(intArray[i][j]);
            }
        }

// 打印数组doubleArray
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.printf("[%d][%d] = %f", i, j, doubleArray[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
