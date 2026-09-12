package weekOne.two;

public class title12 {
    //  **第 12 题：while 循环偶数和**
    //用 while 循环计算 1-100 之间所有偶数的和。
    public static void main(String[] args) {
        //定义变量sum用来存储1-100之间所有偶数的和
        int sum=0;

        //定义自增变量
        int i=0;

        //循环1-100的数
        while(i<101){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }

        //输出1-100之间的偶数和
        System.out.println("1-100之间的偶数和为："+sum);
    }
}
