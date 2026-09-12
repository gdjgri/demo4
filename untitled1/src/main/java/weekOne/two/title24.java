package weekOne.two;

public class title24 {
    //**第 24 题：二维数组 — 工时统计表**
    //定义一个二维数组，3 个员工 × 5 天的工时表（自己编数据）：
    //
    //- 计算每个员工的周总工时
    //- 找出周工时最长的员工
    //- 计算全公司的日均工时
    public static void main(String[] args) {
        //定义一个二维数组，3 个员工 × 5 天的工时表
        double[][] employee={
                {8.5,8,9,12,10.5},
                {8,8,8,8,8},
                {9,9.5,10,13,11.5}
        };

        //定义一个数组，存储每个员工一周的工时
        double[] array=new double[employee.length];

        //记录第几个员工
        int person=1;

        //计算每个员工的周总工时并输出
        for (int i = 0; i < employee.length; i++) {
            //定义一个一周的工时的和
            double sum=0;
            for (double v : employee[i]) {
                sum += v;
            }
            System.out.println("第"+person+"个员工,这周的总工时为:"+sum+"小时");
            person++;
            //将每个员工的每周总工时，存储到数组里
            array[i]=sum;
        }

        //找出周工时最长的员工并输出
        double hourMax=array[0];
        for (int i = 1; i < array.length; i++) {
            if (hourMax<array[i]){
                hourMax=array[i];
            }
        }
        System.out.println("员工周工时最长的是："+hourMax+"小时");

        //存储总工时
        double hourSum=0;

        //计算全公司的日均工时并输出
        for (double[] v : employee) {
            for (double v1 : v) {
                hourSum+=v1;
            }
        }
        System.out.println("全公司日均工时为："+(hourSum/(employee.length*5)));


    }
}
