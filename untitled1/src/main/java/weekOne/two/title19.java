package weekOne.two;

public class title19 {
    //**第 19 题：数组反转**
    //定义一个数组 `{1, 2, 3, 4, 5}`，将其反转成 `{5, 4, 3, 2, 1}` 并打印。
    //（提示：交换第 i 个和倒数第 i 个元素）
    public static void main(String[] args) {
        //定义一个数组 `{1, 2, 3, 4, 5}'
        int[] array={1, 2, 3, 4, 5};

        //将其反转成 `{5, 4, 3, 2, 1}
        int num=0;
        for (int i = 0; i < array.length/2; i++) {
                num=array[i];
                array[i]=array[array.length-i-1];
                array[array.length-i-1]=num;
        }

        //打印数组
        for (int i : array) {
            System.out.println(i);
        }
    }
}
