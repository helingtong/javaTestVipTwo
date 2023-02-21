package MastAPI.APITest1;

import java.util.ArrayList;
import java.util.Objects;

/* boolean equals(Object object)
使用== 贩毒案两个对象是否相等就是判断2个地址是否相等
* */
public class ObjectDemo2 {
    public static void main(String[] args) {
        Person person = new Person("小何",23);
        boolean flag = person.equals(new ArrayList());
        System.out.println(flag);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //右击generate-equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //地址相同直接返回true
        if (o == null) return false;
        if (getClass() != o.getClass()) return false; //健壮性
//        向下转型
        Person other = (Person) o;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}