package InnerDemo.test1;
/*成员内部类
* 在类的位置中和成员变量以及成员方法所在的位置是一样的
* 在内部类中可以直接访问外部类的成员包括私有成员*/
public class InnerTest1 {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.function();
    }
}
class Outer{
    private int num = 10;
    class Inner{
        //内部类
        public void function(){
            System.out.println(num);
        }
        public void method(){
            Inner i = new Inner();
            i.function();
        }

    }

}