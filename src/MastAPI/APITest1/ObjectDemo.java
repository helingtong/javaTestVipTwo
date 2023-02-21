package MastAPI.APITest1;
/* String to String :
hasCode:返回对象的哈希码值（内部地址）
getClass:返回一个字节码对象
Integer.toHexString:返回指定参数的十六进制
包.文件名.类@哈希码
* */
public class ObjectDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "小明";
        student.age = 18;
        System.out.println(student.toString()); //返回该对象的字符串表示
        System.out.println(student);    //说明我们输出一个对象就是默认输出一个对象的toString 方法

    }
}

class Student{
    String name;
    int age;
//选中类右击Gener生成toString()
   /* @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
//   加了return输出的
//   Student{name='小明', age=18}
//Student{name='小明', age=18}

}
