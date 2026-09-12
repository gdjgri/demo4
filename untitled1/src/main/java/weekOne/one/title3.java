package weekOne.one;

public class title3 {
    public static void main(String[] args) {
        //**第 3 题：字符与字符串区别**
        //
        //- 定义 `char c = 'A'`，打印 c 和 c+1（思考为什么 c+1 是数字）
        //- 定义 `String s = "Hello"`，打印 s 和 s + "World"
        char c='A';
        char a=(char)(c+1);
        System.out.println(c);
        System.out.println(c+1);
        System.out.println(a);
        String s="Hello";
        System.out.println(s);
        System.out.println(s+"World");
    }
}
