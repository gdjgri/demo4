package weekOne.one;

import java.util.Scanner;

public class title5 {
    public static void main(String[] args) {
        //**第 5 题：算术运算符**
        //输入两个整数，计算并输出它们的：和、差、积、商、余数。
        //（提示：用 Scanner 接收输入，注意整数除法和浮点数除法的区别）
        System.out.println("请输入两个整数");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入以一个整数：");
        int num1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2=sc.nextInt();
        System.out.println("和为："+(num1+num2));
        System.out.println("差为："+(num1-num2));
        System.out.println("积为："+(num1*num2));
        System.out.println("商为："+(num1/num2));
        System.out.println("余数为："+(num1%num2));
    }
}
