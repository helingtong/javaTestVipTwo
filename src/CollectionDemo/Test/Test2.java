package CollectionDemo.Test;

import java.util.*;
import java.util.List;
/*分析以下需求，并用代码实现
    (1)定义List集合，存入多个字符串
    (2)删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
    (3)然后利用迭代器遍历集合元素并输出*/
public class Test2 {
    public static void main(String[] args) {
//        定义List集合，存入多个字符串
        List<String> list = new ArrayList<>();
            list.add("abc");
            list.add("efg");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
//      (2)删除集合元素字符串中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
            if (s.matches(".*[0-9].*")){
                iterator.remove();
            }
        }
//        (3)然后利用迭代器遍历集合元素并输出
        for (String s:list
             ) {
            System.out.println(s);
        }
    }
}
