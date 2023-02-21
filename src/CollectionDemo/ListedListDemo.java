package CollectionDemo;

import java.util.LinkedList;

/*
List的常用子类
ArrayList 底层是数组 增删慢，查询快
LinkedList 底层是链表 增删快，查询慢
如何选择使用不同的集合？
	如果查询多，增删少，则使用ArrayList
 	如果查询少，增删多，则使用LinkedList
    如果你不知道使用什么，则使用ArrayList
    LinkedList的特有功能：
		void addFirst(E e)
		void addLast(E e)
 			E getFirst()
 			E getLast()
 			E removeFirst()
 			E removeLast()
*/
public class ListedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hello");
        list.add("ho");
        list.addFirst("h");
        list.addLast("yy");
        System.out.println(list);
//      运行结果  [h, hello, ho, yy]
        System.out.println(list.getFirst());    //h
        System.out.println(list.getLast());     //yy
        System.out.println(list.removeFirst()); // h删除索引为0的元素并返回
        System.out.println(list.removeLast());  //yy
        System.out.println(list);   //[hello, ho]
    }
}
