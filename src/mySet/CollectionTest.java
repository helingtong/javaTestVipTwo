package mySet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 *	模拟斗地主发牌
 	买牌
 	洗牌
 	发牌
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] arr = {"黑桃","方块","红桃","梅花"};
        String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> box = new ArrayList<String>();
        for (int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                box.add(arr[i]+arr2[j]);
            }
        }
        box.add("大王");
        box.add("小王");
        System.out.println(box.size());
        System.out.println(box);
//        洗牌
        Collections.shuffle(box);
        System.out.println(box);
//        发牌
        ArrayList<String> 林志玲 = new ArrayList<>();
        ArrayList<String> 林心如 = new ArrayList<>();
        ArrayList<String> 舒淇 = new ArrayList<>();
//        留3张底牌给地主
        for (int i = 0; i < box.size()-3; i++) {
            if(i % 3 == 0){
                林志玲.add(box.get(i));
            }else if(i % 3 == 1){
                林心如.add(box.get(i));
            } else if (i%3 == 2) {
                舒淇.add(box.get(i));
            }
        }
        System.out.println("林志玲" + 林志玲);
        System.out.println("林心如" + 林心如);
        System.out.println("舒淇" + 舒淇);
        System.out.println("底牌:");
        for (int i = box.size()-3;i<box.size();i++){
            System.out.println(box.get(i));
        }
    }
}
