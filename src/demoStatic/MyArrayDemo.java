package demoStatic;
//调用MyArray中的方法
public class MyArrayDemo {
    public static void main(String[] args) {
        int[] arr={1,3,2,6,5};
        int max = MyArrays.getMax(arr);
        System.out.println(max);
        int index = MyArrays.getIndex(arr,2);
        System.out.println(index);
    }
}
