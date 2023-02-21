package PoymorphicDemo;
/*多态定义：定义某一事物的多种存在形态
动态绑定:是指“在执行期间”（非编译期间）判断所引用的对象的实际类型，根据实际的类型调用相应的方法。
多态的前提：
子父类继承关系
方法重写
父类引用指向子类的对象
* */
public class PoymorphicDemo1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        //父类引用 Animal a
        //指向	 =
        //子类对象 new Cat()
        Maoke a = new Cat();
        a.eat();
    }
}

interface Animal{
    public void eat();
}
abstract class Maoke{
    public void eat(){

    };
}
class Cat extends Maoke{

}
