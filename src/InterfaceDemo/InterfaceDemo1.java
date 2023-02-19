package InterfaceDemo;
/*接口和类的关系是实现关系 implements
java的继承是单继承，一个子类只能有一个父类（一个儿子一个亲爹）
但是java给提供了一种机制，用于处理继承单一的局限性，接口
接口是一个比抽象类还抽象的类，里面的方法都是抽象方法

* */
public interface InterfaceDemo1 {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.code();
    }
}
interface Boss{
    public void manage();
}
interface Programmer{
    public void code();

}
class Bill implements Boss,Programmer{

    @Override
    public void manage() {

    }

    @Override
    public void code() {

    }
}