package weekOne.two;

public class title13 {
    //**第 13 题：do-while 循环**
    //用 do-while 循环打印 10 到 1 的倒序数字。
    //（思考：do-while 和 while 的区别是什么？）
    public static void main(String[] args) {
        //定义循环次数
        int i=10;

        //打印10到1的倒序数字
        do {
            System.out.println(i);
            i--;
        }while (i>0);
    }
}
