package CollectionDemo.Test;

import java.util.ArrayList;

/*分析以下需求，并用代码实现
    (1)定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
    (2)定义Student类继承Person，属性与Person类相同
    (3)查看API中ArrayList集合中的以下方法：
        （a）boolean add(E e) 方法
        （b）<T> T[] toArray(T[] a)方法
        （c）boolean addAll(Collection<? extends E> c)方法
    (4)通过查看API对以上方法的学习，完成以下功能
        a. ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]，并遍历打印数组中的元素
        b. 定义一个存储Person对象的ArrayList集合对象list1，并出入2个Person对象，定义一个存储Student对象的ArrayList集合对象list2，并出入2个Student对象，
	   调用addAll方法将list2的全部内容添加到list1中，遍历打印list1中的内容*/
public class Test3 {
    public static void main(String[] args) {
        // a. ArrayList集合中存入5个Student对象，将ArrayList集合转成对应的数组Studentp[]，并遍历打印数组中的元素
        ArrayList<Person.Student> arrayList = new ArrayList<Person.Student>();
        arrayList.add(new Person.Student("小结",16,79));
        arrayList.add(new Person.Student("小结2",13,45));
        //b. 定义一个存储Person对象的ArrayList集合对象list1，并出入2个Person对象，定义一个存储Student对象的ArrayList集合对象
        Person.Student[] stu = arrayList.toArray(new Person.Student[arrayList.size()]);
        for (Person.Student st:stu
             ) {
            System.out.println(st);
        }
    }
}
//(1)定义Person类包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方法、toString方法
class Person{
    String name;
    int age;
    int score;
//    空参构造
    public Person() {

    }
    //    有参构造
    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
//set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String toString(){
        return "Person{"+"name="+name+'\''+",age="+age+
                ",score="+score+"}";
    }
    //    (2)定义Student类继承Person，属性与Person类相同
    static class Student extends Person{

    public Student(String name, int age, int score) {
        super(name, age, score);
    }
}
}