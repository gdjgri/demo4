package weekOne.one;

import java.util.Scanner;

public class title7 {
    public static void main(String[] args) {
        //**第 7 题：三元运算符**
        //输入两个整数，用三元运算符找出较大的那个数并打印。
        //再输入三个整数，用嵌套三元运算符找出最大的那个。
        System.out.println("输入两个整数，用三元运算符找出较大的那个数并打印。");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2=sc.nextInt();
        System.out.println("两个数比较，最大的数为"+(num1>num2?num1:num2));

        System.out.println("输入三个整数，用三元运算符找出较大的那个数并打印：");
        System.out.println("请输入第一个整数：");
        int number1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2=sc.nextInt();
        System.out.println("请输入第三个整数：");
        int number3=sc.nextInt();
        System.out.println("三个数比较，最大的数为"+(number1>number2&&number1>number3?number1:(number2>number1&&number2>number3?number2:number3)));
    }
}
