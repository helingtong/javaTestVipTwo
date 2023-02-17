package demoStatic;

/*static自定义工具类
数组工具类
**/
public class MyArrays {
    /*返回数组中最大的元素*/
 /*   private MyArrays() {
    }//不允许外界调用*/

    public static int getMax(int[] arr) {
        int max = arr[0];
        if (arr.length == 0 || arr == null) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * 返回数组中指定参数的索引
     */
    public static int getIndex(int[] arr, int a) {
//        遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;  //查不到就返回-1
    }
}
