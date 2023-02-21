package InnerDemo.test1;
/*成员内部类的修饰符 final abstract
* 如果使用私有来访问成员内部类，那么在其他类中就不能访问
* 用static修饰成员内部类就不要再创建外部类对象了*/
public class InnerTest2 {
    public static void main(String[] args) {
//        外部类.内部类 对象名 = new 外部类.内部类
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        int a = inner2.num;
        inner2.function();
        //外部类.内部类.成员
         Outer2.Inner2.function();
    }
}
class Outer2{
    static int num1 = 2;
   static class Inner2{
        int num = 10;
        public static void function(){
            System.out.println("function");
            int num2 = num1;
        }
    }
}