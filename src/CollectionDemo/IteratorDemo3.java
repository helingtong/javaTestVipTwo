package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*需求：判断集合中是否包含元素java，如果有则添加元素android
Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
迭代器是依赖集合的，相当于集合的一个副本，当迭代器在操作的时候如果发现和迭代器不一样就抛出异常
解决方案：
    别使用迭代器
    在使用迭代器进行遍历的时候使用迭代器来进行修改
* */
public class IteratorDemo3 {
    public static void main(String[] args) {
//        创建集合对象
        List c = new ArrayList();
//        添加元素
        c.add("hello1");
        c.add("hello2");
        c.add("java");
        System.out.println(c);
//        通过遍历集合中的每一个元素来比较判断是否包含java
       /* Iterator it = c.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            if(s.equals("java")){
                c.add("android");
            }
        }
        System.out.println(c);
        Exception in thread "main" java.util.ConcurrentModificationException:并发修改异常
迭代器是依赖集合的，相当于集合的一个副本，当迭代器在操作的时候如果发现和迭代器不一样就抛出异常
        */
        ListIterator lit = c.listIterator();
        while (lit.hasNext()){
            String s =(String)lit.next();
            if(s.equals("java")){
                lit.add("android"); //  在使用迭代器进行遍历的时候使用迭代器来进行修改
            }
        }
        System.out.println(c);

    }
}
