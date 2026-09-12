package weekOne.two;

public class title18 {
    //**第 18 题：找最大值和最小值**
    //定义一个 int 数组 `{34, 7, 23, 98, 12, 56, 78}`，找出最大值和最小值并打印。
    public static void main(String[] args) {
        //定义一个 int 数组 `{34, 7, 23, 98, 12, 56, 78}`
        int[] array={34, 7, 23, 98, 12, 56, 78};

        //定义最小值
        int min=array[0];

        //定义最大值
        int max=array[0];

        //找出最小值并输出
        for (int i : array) {
            if (min>i){
                min=i;
            }
        }
        System.out.println("最小值为："+min);

        //找出最大值并输出
        for (int j : array) {
            if (max<j){
                max=j;
            }
        }
        System.out.println("最大值为："+max);
    }
}
