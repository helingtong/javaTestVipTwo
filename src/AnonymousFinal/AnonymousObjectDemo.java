package AnonymousFinal;
/*匿名对象 对象的简化形式，没有名字的对象
应用场景：当方法只被调用一次的时候可以用匿名对象
可以当做参数传递，但是无法在传参之前做其他事情
注意：匿名对象可以调用成员变量并赋值，但是赋值没有意义
* */
public class AnonymousObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        new Student();  //匿名对象，没有变量引用的对象
        new Student().study();
        new Student().age = 18;
        System.out.println("学生年龄" + new Student().age); //因为new了一个新的对象，上面一个18和这个年纪无关
        /*
		Student s = new Student();
		s.age = 18;
		s.name = "张三";
		method(s);同下方**/
        method(new Student());

    }
    public static void method(Student s){

}
}


class Student{
    String name;
    int age;
    public void study(){
        System.out.println("好好学习");
    }
}