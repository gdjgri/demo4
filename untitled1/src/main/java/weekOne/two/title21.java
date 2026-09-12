package weekOne.two;

public class title21 {
    //**第 21 题：冒泡排序**
    //定义一个无序数组 `{64, 34, 25, 12, 22, 11, 90}`，用冒泡排序算法从小到大排序并打印。
    public static void main(String[] args) {
        //定义一个无序数组 `{64, 34, 25, 12, 22, 11, 90}`
        int[] array={64, 34, 25, 12, 22, 11, 90};

        //用冒泡排序算法从小到大排序
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int k=0;
                if (array[j]>array[j+1]){
                    k=array[j];
                    array[j]=array[j+1];
                    array[j+1]=k;
                }
            }
        }

        //打印数组
        for (int i : array) {
            System.out.println(i);
        }
    }
}
