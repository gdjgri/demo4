package weekOne.two;

public class title11 {
    //**第 11 题：for 循环求和**
    //用 for 循环计算 1+2+3+...+100 的和并打印。
    public static void main(String[] args) {
        //定义和的变量，用来存储值
        int sum=0;

        //计算 1+2+3+...+100 的和
        for (int i = 0; i < 101; i++) {
            sum+=i;
        }

        //打印1+2+3+...+100 和的值
        System.out.println("1+2+3+...+100 的和为："+sum);
    }
}
