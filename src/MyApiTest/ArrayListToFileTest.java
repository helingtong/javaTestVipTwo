package MyApiTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


/*键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合。
然后遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行数据，
自己定义分割标记)
* 分析：
 * 		A:定义学生类 见student文件
 * 		B:创建集合对象
 * 		C:写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
 * 		D:创建输出缓冲流对象
 * 		E:遍历集合,得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
 * 			举例：heima001,向问天,30,北京
 * 		F:释放资源*/
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
//     	B:创建集合对象
        ArrayList<student> array = new ArrayList<student>();
//      C：写方法实现键盘录入学生信息，并将学生对象作为元素添加到集合
        addStudent(array);
        addStudent(array);
        addStudent(array);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\programText\\javaCode\\Vip\\array.txt"));
//      遍历集合得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(s.getNum()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    // 添加学生
    public static void addStudent(ArrayList<student> array) {
//    创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        String num; //为了让num能够被访问到，我们就把num定义在了循环的外面
//        为了让代码回到这里，用while循环
        while (true) {
            System.out.println("输入学生的学号");
            num = sc.nextLine();
//            判断学号有没有被占用
//            定义标记
            boolean flag = false;
//            遍历集合得到每一个学生
            for (int i = 0; i < array.size(); i++) {
                student s = array.get(i);
                if (s.getNum()==num) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("学号被占用，请出行输入“");
            } else {
                break;
            }
        }
        System.out.println("输入学生的姓名");
        String name = sc.nextLine();
        System.out.println("输入学生的年龄");
        String age = sc.nextLine();
        System.out.println("输入学生的居住地");
        String address = sc.nextLine();

//        创建学生对象
        student s = new student();
        s.setNum(num);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加成功");
    }
}
