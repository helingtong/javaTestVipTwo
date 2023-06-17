package mySet;

import java.util.HashSet;
import java.util.Set;

/*使用HashSet存储字符串并遍历
 *
 *	Set的特点：
 *			 无序（存储和读取的顺序可能不一样）
 *			不允许重复
 *			没有整数索引*/
public class hashSetDemo1 {
    public static void main(String[] args) {
//        创建集合
      Set<String> set = new HashSet<>();    //必须要是泛型的
//        添加元素
      set.add("hello");
      set.add("world");
      set.add(null);
        System.out.println(set.add("java"));
        System.out.println(set.add("java"));    //不允许有重复的元素，所以值输出一个java
//        遍历元素
        for(String s : set){
            System.out.println(s);
        }
    }
}
