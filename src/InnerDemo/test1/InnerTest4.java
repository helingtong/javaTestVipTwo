package InnerDemo.test1;
/*匿名内部类 没有名字的局部内部类
* 格式：
* new 类/接口{
*   如果创建的是继承了这个类的子类对象，我们可以重写这个父类的方法
* 如果是创建实现这个接口的子类对象，必须实现这个接口的所有方法
* }*/
public class InnerTest4 {
    public static void main(String[] args) {
        Outer4 outer = new Outer4();
        outer.mehod();
    }
}
interface Inner{
    public abstract void function();
}
class Outer4{
    public void mehod(){
        new Inner(){

            @Override
            public void function() {
                System.out.println("function");
            }
        }.function();
    }
}