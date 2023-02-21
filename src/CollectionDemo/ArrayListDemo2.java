package CollectionDemo;

import java.util.ArrayList;
import java.util.Objects;

/*
 * 	Collection接口的实现
 * 			boolean add(E e) 确保此 collection 包含指定的元素（可选操作）。
 * 			void clear() 移除此 collection 中的所有元素（可选操作）。
 * 			boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true。
 * 			boolean isEmpty() 如果此 collection 不包含元素，则返回 true。
 * 			boolean remove(Object o) 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
 * 			int size() 返回此 collection 中的元素数。
 * 			Object[] toArray()  返回包含此 collection 中所有元素的数组。
 * 		如果此 collection 包含指定的元素，则返回 true。更确切地讲，当且仅当此 collection 至少包含一个满足 (o==null ? e==null : o.equals(e)) 的元素 e 时，返回 true。
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
//        1.boolean add(E e)
        a.add("hello1");    //add的时候运行没有东西，必须打印出来才有
        a.add("hello2");
//        2.void clear()
//        a.clear();
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
//      3.boolean contains(Object o)
        boolean flag = a.contains("hello1");    //包含就返回true
        System.out.println(flag);
        System.out.println(a);
//        boolean isEmpty()
        boolean flag1 = false;
        if(a!=null&&a.isEmpty()){
            flag1 = true;
            System.out.println(flag);
        }
//        boolean remove(Object o)
        boolean f = a.remove("hello1");
        System.out.println(f);
        System.out.println(a);
        int size = a.size();
        System.out.println(size);
//        Object[] toArray()
        Object[] objects = a.toArray();
        for(int i = 0;i< objects.length;i++){
            System.out.println(objects[i]);
        }
    }
}
