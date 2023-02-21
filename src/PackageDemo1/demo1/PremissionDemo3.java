package PackageDemo1.demo1;
import PackageDemo.PremissionDemo;  //导入PremissionDemo这个包里面的PremissionDemo
//不同包中的子类只能public和protected访问
// public protected修饰的子类可以访问的方法 在另外一个包中写一个子类继承这个父类
public class PremissionDemo3 extends PremissionDemo{
    public void function(){
        super.publicMethod();
        super.protectedMehod();
    }

    public static void main(String[] args) {
        PremissionDemo3 premissionDemo3 = new PremissionDemo3();
        premissionDemo3.function();
    }
}
