package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("hello1");
        al.add("hello2");
        al.add("hello3");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

}
