package weekOne.two;

public class title17 {
    //**第 17 题：数组求和与平均值**
    //定义一个 double 数组存储一周 7 天的工时（自己编数据），计算：
    //
    //- 总工时
    //- 平均工时
    //- 工时最长的一天是第几天
    public static void main(String[] args) {
        //定义一个 double 数组存储一周 7 天的工时（自己编数据）
        double[] hour={8,10.5,9.5,8.5,9,8,10};

        //计算并输出总工时
        double sumHour=0;
        for (double v : hour) {
            sumHour+=v;
        }
        System.out.println("总工时为："+sumHour);

        //计算并输出平均工时
        System.out.println("平均工时为："+(sumHour/hour.length));

        //计算并输出工时最长的一天是第几天
        double max=hour[0];
        int days=0;
        for (int i = 0; i < hour.length; i++) {
            if (max<hour[i]){
                max=hour[i];
                days=i+1;
            }
        }
        System.out.println("工时最长的一天是第"+days+"天");
    }
}
