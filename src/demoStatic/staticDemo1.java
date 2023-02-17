package demoStatic;
/**
 * static 是一个关键字，用于修饰成员变量（方法外部）和成员方法
 * 随着类的加载而加载
 * 可以用类名调用
 * 静态的加载优先于对象
 * 被所有的对象共享
 * */
public class staticDemo1 {
    public static void main(String[] args) {
        Person.graduateFrom = "安徽大学";
        Person p = new Person();
        p.age = 19;
        p.name = "小曼";
        p.speak();
        Person.think();//只能类名调用不能对象名调用
//        p.think();错误
    }
}
    class Person{
        String name;
        int age;
        static String graduateFrom; //毕业学校
        public void speak(){
            System.out.println(name + "---" + graduateFrom);
        }
        public static void think(){
            System.out.println("学会思考");
        }
    }

