package weekOne.two;

import javax.xml.transform.Source;
import java.util.Scanner;

public class title25 {
    //**第 25 题：综合练习 — 一周工时管理系统**
    //用数组实现一个简单的工时管理：
    //
    //- 定义数组存储周一到周日的工时
    //- 功能 1：打印每天工时
    //- 功能 2：计算总工时和平均工时
    //- 功能 3：找出工时最长和最短的一天
    //- 功能 4：如果某天工时超过 8 小时，标注 "加班"
    public static void main(String[] args) {
        //系统启用循环
        boolean controller = true;
        while (controller) {

            //实现一周工时管理系统界面
            System.out.println("******工时管理系统******");
            System.out.println("功能1.打印每天工时");
            System.out.println("功能2.计算总工时和平均工时");
            System.out.println("功能3.找出工时最长和最短的一天");
            System.out.println("功能4.打印每天工时,如果某天工时超过 8 小时，标注 “加班”");
            System.out.println("功能5.退出系统");

            //用户选择功能
            System.out.println("请选择功能：");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            //定义数组存储周一到周日的工时
            double[] workingHours = {8, 8, 9, 10, 11.5, 9.5, 0};
            //定义星期
            String[] week = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};

            switch (num) {
                //功能 1：打印每天工时
                case 1: {
                    System.out.println("=======一周工时表======");
                    for (int i = 0; i < week.length; i++) {
                        System.out.println(week[i] + ":" + workingHours[i] + "小时");
                    }
                    System.out.println("\n");
                    break;
                }

                //功能 2：计算总工时和平均工时
                case 2: {
                    double sumHours = 0;//总工时
                    double averageHours = 0;//平均工时
                    for (double workingHour : workingHours) {
                        sumHours += workingHour;
                    }
                    System.out.println("总工时为：" + sumHours + "小时");
                    System.out.println("平均工时为：" + averageHours + "小时");
                    System.out.println("\n");
                    break;
                }

                //功能 3：找出工时最长和最短的一天
                case 3: {
                    int maxHours = 0;//最长的一天工时下标
                    int minHours = 0;//最短的一天工时下标
                    for (int i = 0; i < workingHours.length; i++) {
                        if (workingHours[maxHours] < workingHours[i]) {
                            maxHours = i;
                        }
                    }
                    System.out.println("工时最长的一天是：" + week[maxHours] + "(" + workingHours[maxHours] + "小时)");
                    for (int i = 0; i < workingHours.length; i++) {
                        if (workingHours[minHours] > workingHours[i]) {
                            minHours = i;
                        }
                    }
                    System.out.println("工时最短的一天是：" + week[minHours] + "(" + workingHours[minHours] + "小时)");
                    System.out.println("\n");
                    break;
                }

                //功能 4：如果某天工时超过 8 小时，标注 "加班"
                case 4: {
                    System.out.println("=======一周工时表======");
                    for (int i = 0; i < week.length; i++) {
                        if (workingHours[i] > 8) {
                            System.out.println(week[i] + ":" + workingHours[i] + "小时,<-加班");
                        } else {
                            System.out.println(week[i] + ":" + workingHours[i] + "小时");
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 5: {
                    controller=false;
                    System.out.println("已退出系统");
                    System.out.println("\n");
                }
            }
        }
    }
}
