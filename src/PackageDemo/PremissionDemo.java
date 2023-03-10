package PackageDemo;
/*权限修饰符：
public 当前类，相同包下不同的类,不同包下的类
default 当前类，相同包下不同的类
private 当前类
protected 当前类，相同包下不同的类

default:当前包下使用
protected:让子类对象使用*/
public class PremissionDemo {
    public void publicMethod(){
        System.out.println("publicMethod");
    }
    void defaultMethod(){
        System.out.println("defaultMethod");
    }
    private void privateMehod(){
        System.out.println("privateMehod");
    }
    protected void protectedMehod(){
        System.out.println("protectedMehod");
    }
    public static void main(String[] args){
        PremissionDemo premissionDemo = new PremissionDemo();
        premissionDemo.publicMethod();
        premissionDemo.protectedMehod();
        premissionDemo.defaultMethod();
        premissionDemo.privateMehod();
    }
}
