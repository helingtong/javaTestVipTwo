package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*泛型概述
使用集合可以存储任意类型的对象，由于存储了不同类型的对象，有可能在转换的时候
出现类型转换异常。所以java为了解决这个问题，提供了一种机制generic泛型
泛型：是一种广泛的类型，把明确数据类型的工作提前到了编译时期，借鉴了数组的特点
泛型的好处：
    避免类型转换的问题
    可以减少黄色警告线
    简化代码书写 不用强制类型转换
什么时候用泛型？
    问API，当我们看到<E>就可以使用泛型
    List ArrayList Collection等都可以用泛型
 */
public class GenericDemo {
    public static void main(String[] args) {
/*
//        不知道集合里面的类型是什么，所以用泛型解决这个问题
//        Iterator 是一个接口，用于遍历集合（如 List、Set、Map 等）中的元素
        Collection c = new ArrayList();
        c.add("hello");
        Iterator iterator = c.iterator();
        int i = (int) iterator.next();
        System.out.println(i);
//出现异常 java.lang.String cannot be cast to java.lang.Integer
*/

//        创建集合对象
        Collection<Student> c = new ArrayList<Student>();
//        创建元素对象
        Student s1 = new Student("zhangsan1",13);
        Student s2 = new Student("zhangsan2",16);
//         添加元素对象
        c.add(s1);
        c.add(s2);
//        遍历元素对象
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu.name);
        }
    }
    static class Student{
        String name;
        int age;
        public Student(String name,int age){
            this.name = name;
            this.age = age;
        }
    }
}
