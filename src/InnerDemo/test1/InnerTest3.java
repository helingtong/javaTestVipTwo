package InnerDemo.test1;
/*局部内部类
*   在方法内，出现方法之后就无法再次使用*/
public class InnerTest3 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.method();
    }
}
class Outer3 {
    static int num2 =1;
    public static void method() {
        final int num = 10;

        abstract class Inner {
            public void function() {
                int num1 = num2;
                System.out.println("function");
            }
        }

        class Inner1 extends Inner{

        }
        Inner i = new Inner1();
        i.function();

    }

    public void test() {
        //Inner i = new Inner();
        //System.out.println(num);
    }
}