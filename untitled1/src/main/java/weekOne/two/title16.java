package weekOne.two;

import java.util.Iterator;

public class title16 {
    //定义一个 int 数组 `{5, 2, 9, 1, 5, 6}`，用 for 循环遍历打印每个元素。
    //再用增强 for 循环（for-each）打印一遍。
    public static void main(String[] args) {
        //定义一个 int 数组 `{5, 2, 9, 1, 5, 6}
        int[] sum={5,2,9,1,5,6};

        //用 for 循环遍历打印每个元素
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }

        //分割线
        System.out.println("-----分割线-----");
        
        //用增强 for 循环（for-each）打印一遍。
        for (int j : sum) {
            System.out.println(j);
        }
    }
}
