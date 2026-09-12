package weekOne.two;

public class title15 {
    //用嵌套 for 循环打印九九乘法表（下三角形式）：
    //1*1=1
    //1*2=2  2*2=4
    //1*3=3  2*3=6  3*3=9
    //...
    public static void main(String[] args) {
        //第一层循环
        for (int i = 1; i <= 9; i++) {

            //第二层循环
            for (int j = 1; j <= i; j++) {

                //打印公式
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }

            //换行
            System.out.println();
        }
    }
}
