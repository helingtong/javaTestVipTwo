package MyApiTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把上一题的文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出
 *
 * 分析：
 * 		A:定义学生类
 * 		B:创建输入缓冲流对象
 * 		C:创建集合对象
 * 		D:读取文件数据，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
 * 			heima001,向問天,30,北京
 * 		E:释放资源
 * 		F:遍历集合
 */
public class FileToArrayListTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\programText\\javaCode\\Vip\\array.txt"));
        ArrayList<student> array = new ArrayList<>();
        String line;
        while((line= br.readLine())!=null){
//      分割字符串
        String[] strArray = line .split(",");
//        创建学生对象并赋值
            student s= new student();
            s.setNum(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(strArray[2]);
            s.setAddress(strArray[3]);
            array.add(s);   //把学生对象作为元素存储到集合中
        }
        br.close();
//        遍历集合
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getAge()+"\t"
            +s.getAddress());
        }
    }
}
