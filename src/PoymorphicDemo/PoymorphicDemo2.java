package PoymorphicDemo;

/*
 * 多态的特点
 * 成员变量 编译看左边 运行看左边
 * 成员方法 编译看左边 运行看右边
 * 静态方法 编译看左边 运行看左边
 * */
public class PoymorphicDemo2 {
    public static void main(String[] args) {
        Dad dad = new Kid();
        System.out.println(dad.num);
//        dad.mehod();
        ((Kid) dad).function(); //使用变量去调用静态方法，其实相当于用变量类型的类名去调用
    }
}

class Dad {
    int num = 20;   //成员变量

    public void mehod() {
        System.out.println("父类成员方法");
    }

    public static void method() {
        System.out.println("父类静态方法");
    }
}

class Kid extends Dad {
    int num = 10;

    @Override
    public void mehod() {
        System.out.println("子类成员方法");
    }

    public static void function() {
        System.out.println("子类静态成员方法");
    }

}