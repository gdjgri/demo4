package weekOne.one;

public class title2 {
    public static void main(String[] args) {
        //**第 2 题：类型转换练习**
        //
        //- 定义一个 `double` 类型变量 `price = 9.99`
        //- 强制转换为 `int` 类型并打印
        //- 定义一个 `int` 类型变量 `num = 100`
        //- 自动转换为 `double` 类型并打印
        //- 思考：为什么强制转换后 9.99 变成了 9？
        double price=9.99;
        int price2=(int)price;
        System.out.println(price2);
        int num=100;
        double num2=num;
        System.out.println(num2);
    }
}
