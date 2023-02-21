package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

/*
 * 需求：定义一个方法，返回指定列表中指定元素的索引位置
 *
 * 判断元素是否存在
 *
 */
public class ListTestDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        int index = index(list,"hello1");
        System.out.println(index);
        boolean flag = list.contains("hello2");
        System.out.println(flag);
    }
    public static int index(List list, Object other){
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj.equals(other)){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(List list,Object obj){
        int index = index(list,obj);
        if(index>=0){
            return true;
        }else{
            return false;
        }
    }
}
