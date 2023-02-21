package PoymorphicDemo;
/*多态中的向上转型和向下转型
引用类型之间的转换
向上转型 由小到大 子类向父类转型
向下转型 由大到小
基本数据类型转换
自动类型转换
由小到大
byte short char -- int -- long -- float --double
强制类型转换 由大到小
int a = 2;
char b = (char)a;
* */
public class PoymorphicDemo3 {
    public static void main(String[] args) {
        Animal2 a = new Dog();  //向上转型
        a.eat();
//        a.swim(); 不可以
        Dog d = (Dog) a;    //向上转型
        d.swim();

        /*Animal2 animal2 = new Animal2();
        Dog dog = (Dog) animal2;    //向下转型
        dog.eat();*/
    }
}
class Animal2{
    public void eat(){
        System.out.println("吃东西");
    }

}
class Dog extends Animal2{
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void swim(){
        System.out.println("狗刨");
    }
}