package weekOne.two;

public class title23 {
    //**第 23 题：数组去重**
    //定义一个有重复元素的数组 `{1, 2, 2, 3, 3, 3, 4, 5, 5}`，去除重复元素后打印。
    public static void main(String[] args) {
        //定义一个有重复元素的数组 `{1, 2, 2, 3, 3, 3, 4, 5, 5}`
        int[] array={1, 2, 2, 3, 3, 3, 4, 5, 5};

        //去除重复元素
        int[] array2=new int[array.length];
        int num=0;
        for (int i = 0; i < array2.length; i++) {
            boolean isRepat=false;
            for (int j = 0; j < num; j++) {
                if (array[i]==array2[j]){
                    isRepat=true;
                    break;
                    }
            }
            if (!isRepat==true){
                array2[num]=array[i];
                num++;
            }
        }

        //把有效元素拷贝到最终结果的数组（去除多余的默认值0）
        int[] result=new int[num];
        for (int i = 0; i < result.length; i++) {
            result[i] = array2[i];
        }

        //打印输出
        for (int i : result) {
            System.out.println(i);
        }
    }
}
