package weekOne.two;

import java.util.Scanner;

public class title22 {
    //**第 22 题：元素查找**
    //定义一个数组，输入一个数字，查找该数字在数组中是否存在。如果存在，输出它的下标；不存在输出 "未找到"。
    public static void main(String[] args) {
        //定义一个数组
        int[] array={1,2,3,4,5};

        //输入需要查找的数字
        System.out.println("请输入需要查找的数字：");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        //查找该数字在数组中是否存在
        boolean exist=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num){
                exist=true;
                num=i;
            }
        }

        //输出结果
        if (exist){
            System.out.println("存在，下标为："+num);
        }else {
            System.out.println("不存在");
        }
    }
}
