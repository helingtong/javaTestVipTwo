package InnerDemo.test2;
/*
 * 匿名内部类的应用场景:
 * 		作为参数进行传递
 *通常在使用方法是接口类型参数、并且该接口中的方法不超过三个时，可以将匿名内部类作为参数传递。
 *
 */
public class InnerDemo {
    public static void main(String[] args) {
        class Cat implements Animal{

            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        }
        method2(new Cat());
    }

    public static void method2(Animal animal){
        animal.eat();
    }
}
