package weekOne.one;

import java.util.Scanner;

public class title8 {
    public static void main(String[] args) {
        //输入一个考试分数（0-100），根据分数输出等级：
        //
        //- 90-100：优秀
        //- 80-89：良好
        //- 70-79：中等
        //- 60-69：及格
        //- 0-59：不及格
        //- 其他：输入有误
        System.out.println("请输入开始分数：");
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        int number=(int)(num/10);
            switch (number){
                case 9,10:
                    System.out.println("等级为：优秀");
                    break;
                case 8:
                    System.out.println("等级为：良好");
                    break;
                case 7:
                    System.out.println("等级为：中等");
                    break;
                case 6:
                    System.out.println("等级为：及格");
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
    }
}
