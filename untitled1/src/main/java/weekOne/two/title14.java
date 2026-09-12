package weekOne.two;

public class title14 {
    //**第 14 题：break 和 continue**
    //打印 1-20 的数字，但：
    //
    //- 遇到 7 的倍数跳过（continue）
    //- 遇到 15 停止（break）
    //观察输出结果。
    public static void main(String[] args) {
        //用for循环输出,
        for (int i = 1; i < 21; i++) {
            if(i%7==0) {
                //遇到 7 的倍数跳过（continue）
                continue;
            }
                //遇到 15 停止（break）
            else if (i==15){
                System.out.println(i);
                break;
            }
            //打印输出
            System.out.println(i);
        }

    }
}
