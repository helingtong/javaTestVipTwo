package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add("hello1");
        c.add("hello2");
//        获取迭代器对象
        Iterator it = c.iterator();
//        Object next():返回下一个元素
       /* System.out.println(it.next());
        System.out.println(it.next());
//        输出hello1,hello2
        */

//        boolean hasNext()：判断是否有元素可以获取
       /* if(it.hasNext()){
            System.out.println(it.next());
        }   //输出hello1*/
        while (it.hasNext()){
            System.out.println(it.next());
        }   //输出 hello1 hello2
    }
}
