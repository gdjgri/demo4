package weekOne.one;

import java.util.Scanner;

public class title10 {
    //**第 10 题：综合练习 — 工时计算工资**
    //输入：
    //
    //- 每小时工资（double）
    //- 本周工作天数（int）
    //- 每天工作小时数（double）
    //
    //计算并输出：
    //
    //- 本周总工时
    //- 本周总工资
    //- 如果总工时超过 40 小时，超出部分按 1.5 倍工资计算（加班工资）
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入每小时工资
        System.out.println("请输入每小时工资：");
        double salary=sc.nextDouble();

        //输入本周工作天数
        System.out.println("请输入本周工作天数：");
        int days=sc.nextInt();

        //输入每天工作小时数
        System.out.println("请输入每天工作小时数");
        double hour=sc.nextDouble();

        //本周工时计算并输出
        System.out.println("本周工作工时为："+(days*hour));

        //本周工资计算过并输出
        if ((days*hour)>40){
            System.out.println("本周工资为"+(40*salary+(days*hour-40)*salary*1.5));
        }
        else System.out.println("本周工资为"+(days*hour*salary));
    }
}
