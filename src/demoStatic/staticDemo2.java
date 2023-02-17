package demoStatic;
/* static注意事项
* 静态方法：
* 1.可以调用静态的成员变量和成员方法
* 2.不可以调用非静态的成员变量和成员方法
* 3.静态方法只能调用静态的成员
* 非静态方法：
* 1.可以调用静态的成员变量和成员方法
* 2.可以调用非静态的成员变量和成员方法
* */
public class staticDemo2 {
    public static void main(String[] args) {
       Student s = new Student();
       s.name = "小何";
       s.age = 19;
       Student.graduateFrom = "安徽大学";
       s.eat();
        System.out.println(s.name +" " + s.age);


    }
}
class Student{
    String name;
    int age;
    static String graduateFrom;
    public static void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
        System.out.println(graduateFrom);   //非静态方法调用静态的成员变量
        sleep();    //非静态的方法可以调用静态的方法
    }

}
