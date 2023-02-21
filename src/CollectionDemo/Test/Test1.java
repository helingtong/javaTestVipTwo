package CollectionDemo.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static jdk.nashorn.internal.objects.NativeMath.random;

/*分析以下需求，并用代码实现
    (1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合
    (2)然后利用迭代器和增强for循环分别遍历集合元素并输出
    (3)如：15 18 20 40 46 60 65 70 75 91*/
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        // 生成10个1至100之间的不重复整数
        while (numbers.size() < 10) {
            int n = rand.nextInt(100) + 1;
            if (!numbers.contains(n)) {
                numbers.add(n);
            }
        }

        // 使用迭代器遍历集合并输出
        System.out.print("使用迭代器遍历集合：");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            System.out.print(n + " ");
        }
        System.out.println();

        // 使用增强for循环遍历集合并输出
        System.out.print("使用增强for循环遍历集合：");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
