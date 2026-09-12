package weekOne.two;

public class title20 {
    //**第 20 题：数组统计**
    //定义一个 int 数组存储 10 个学生的成绩（自己编数据），统计：
    //
    //- 及格人数（>=60）
    //- 优秀人数（>=90）
    //- 不及格人数
    public static void main(String[] args) {
        //定义一个数组并存放10个学生的成绩
        double[] arrayGreads={89.32,45.29,81.39,67.28,99,100,70,65,34,82};

        //计算并输出输出及格人数（>=60）
        int person=0;
        for (double arrayGread : arrayGreads) {
            if (arrayGread>=60){
                person++;
            }
        }
        System.out.println("及格人数（>=60）为："+person);

        //输出优秀人数（>=90）
        person=0;
        for (double arrayGread : arrayGreads) {
            if (arrayGread>=90){
                person++;
            }
        }
        System.out.println("优秀人数（>=90）为："+person);

        //输出不及格人数
        person=0;
        for (double arrayGread : arrayGreads) {
            if (arrayGread<60){
                person++;
            }
        }
        System.out.println("不及格人数为："+person);
    }
}
