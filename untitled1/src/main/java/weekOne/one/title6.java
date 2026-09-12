package weekOne.one;

import java.util.Scanner;

public class title6 {
    public static void main(String[] args) {
        //**第 6 题：比较与逻辑运算符**
        //输入一个整数，判断并打印：
        //
        //- 是否大于 10
        //- 是否小于 100
        //- 是否在 10 到 100 之间（包含边界）
        //- 是否是偶数
        System.out.println("请输入一个整数：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>10) System.out.println("大于10");
        else System.out.println("小于等于10");
        if (num<100) System.out.println("小于100");
        else System.out.println("大于等于100");
        if (num>=10&&num<=100) System.out.println("在10到100之间（包含边界）");
        else System.out.println("不在10到100之间（包含边界）");
        if (num%2==0) System.out.println("是偶数");
        else System.out.println("不是偶数");
    }
}
