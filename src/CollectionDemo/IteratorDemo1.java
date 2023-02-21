package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
* 集合的遍历方式
*   1.toArray() 可以将集合转化成数组，然后遍历数组即可
*   2.iterator() 可以返回一个迭代器对象，我们可以通过迭代器对象来迭代集合
* Iterator:可用于遍历集合
* E next（）返回下一个元素
* boolean hasNext()：判断元素是否可以获取
* 注意：Exception in thread "main" java.util.NoSuchElementException
* 使用next方法获取下一个元素，如果没有元素可以获取，则出现NoSuchElementException
* */
public class IteratorDemo1 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
//        添加元素
        c.add("hello1");
        c.add("hello2");
//        获取数组
        Object[] objs = c.toArray();
//        遍历数组
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }
}
/*运行结果
hello1
hello2
*/