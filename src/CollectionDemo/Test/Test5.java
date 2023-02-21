package CollectionDemo.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*键盘录入若干个字符串,将字符串存入泛型为String的集合当中, 直到输入quit的时候不用输入;
 1.集合中含有字符a的元素有多少个
 2.将集合中第三个元素中"a"全部替换成"b";
 3.删掉长度为3的元素;
 4.遍历集合;*/
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>(); // 创建泛型为String的ArrayList
        System.out.println("请输入字符串（输入quit结束输入）：");
        // 用循环读取用户输入的字符串并存入ArrayList，直到输入"quit"为止
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                stringList.add(input);
            }
        }

        // 打印集合中含有字符a的元素数量
        int count = 0;
        for (String str : stringList) {
            if (str.contains("a")) {
                count++;
            }
        }
        System.out.println("集合中含有字符a的元素数量为：" + count);

        // 将集合中第三个元素中"a"全部替换成"b"
        if (stringList.size() >= 3) { // 确保集合中至少有3个元素
            String thirdElement = stringList.get(2);
            stringList.set(2, thirdElement.replace("a", "b"));
        }

        // 删除长度为3的元素
        stringList.removeIf(str -> str.length() == 3);

        // 遍历集合并打印每个元素
        System.out.println("遍历集合：");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
