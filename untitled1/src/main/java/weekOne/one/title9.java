package weekOne.one;

import java.util.Scanner;

public class title9 {
    public static void main(String[] args) {
        //写一个简单的菜单程序，显示：
        //===== 菜单 =====
        //1. 查看余额
        //2. 存款
        //3. 取款
        //4. 退出
        //请选择：
        System.out.println("===== 菜单 =====");
        System.out.println("1. 查看余额");
        System.out.println("2. 存款");
        System.out.println("3. 取款");
        System.out.println("4. 退出");
        System.out.println("请选择：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("进入查看余额中");
                break;
            case 2:
                System.out.println("进入存款中");
                break;
            case 3:
                System.out.println("进入取款中");
                break;
            case 4:
                System.out.println("退出中");
                break;
            default:
                System.out.println("输入错误，请重新输入！");
        }
    }
}
