package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

/*
 * List:
 * 		有序的（存储和读取的顺序是一致的）
 * 		有整数索引
 * 		允许重复的
 *
 * List的特有功能：
 * 			void add(int index, E element)
 * 			E get(int index)
 * 			E remove(int index)
 *  		E set(int index, E element)
 *
 *   增删改查
 */
public class ListDemo {
    public static void main(String[] args) {
        List list =new ArrayList();
//        //void add(int index, E element)  : 在列表的指定位置插入指定元素
        list.add(0,"hello");
        list.add(0,"c++");
        list.add(1,"java");
        System.out.println(list);
//       E get(int index)  :根据索引返回元素
        /*System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        */
        for (int i= 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//       E remove(int index)  : 删除指定元素并返回
        System.out.println(list.remove(1));
        System.out.println(list);
//    输出    [c++, hello]
//    E set(int index, E element) : 将指定索引位置的元素替换为指定元素，并将原先的元素返回
        System.out.println(list.set(0,"and"));
        System.out.println(list);
//     输出   [and, hello]
    }
}
