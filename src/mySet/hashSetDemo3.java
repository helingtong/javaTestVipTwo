package mySet;

import java.util.HashSet;

public class hashSetDemo3 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<Person>();
        Person p = new Person("小明",12);
        Person p1 = new Person("小明",13);
        Person p2 = new Person("小明",14);
        hashSet.add(p);
        hashSet.add(p1);
        hashSet.add(p2);
        for (Person pr:hashSet
             ) {
            System.out.println(pr);
        }

    }
}
