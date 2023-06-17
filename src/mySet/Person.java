package mySet;

import java.util.Objects;

/*
		  我们发现当hashCode方法永远返回整数1时，所有对象的hash值都是一样的，
		  有一些对象的成员变量完全不同，但是它们还需要进行hash和equals方法的比较，
		  如果我们可以让成员变量不同的对象，它们的hash值也不同，这就可以减少一部分equals方法的比较
		  从而可以提高我们程序的效率
		  可以尝试着==让hashCode方法的返回值和对象的成员变量有关==
		  可以让hashCode方法返回所有成员变量之和，
		  让基本数据类型直接相加，然后引用数据类型获取hashCode方法返回值后再相加（boolean不可以参与运算）
		*/
public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {  //变量输出为字符串
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
