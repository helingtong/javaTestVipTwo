package InterfaceDemo;
/*类与类 继承关系 单继承
类与接口 实现 类实现接口 多实现
接口与接口 继承关系 多继承
* */
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
interface InterA extends InterB{
    public abstract void method();
}

interface InterB{
    public abstract void function();

}
interface InterC extends InterA{

}
class Demo implements InterB,InterC,InterA{

    @Override
    public void method() {

    }

    @Override
    public void function() {

    }
}