package com.demo01;
/*
 * final： 修饰符，可以用于修饰类、成员方法和成员变量
 * final所修饰的类：不能被继承，不能有子类
 * final所修饰的方法:不能被重写
 * final所修饰的变量：是不可以修改的，是常量
 *
 * 常量：
 * 		字面值常量：1,2,3
 * 		自定义常量：被final所修饰的成员变量，一旦初始化则不可改变
 *
 * 注意：自定义常量必须初始化，可以选择显式初始化或者构造初始化
 *
 *
 */
public class FinalDemo {
    public static void main(String[] args) {
        //Animal a = new Animal();
        //a.eat();

        //Dog d = new Dog();
        //d.eat();

        //d.num = 20;
        //System.out.println(d.NUM);
        new FinalDemo().new Demo1();
    }

    private class Demo1{

    }
}

final class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

/*class Dog extends Animal {
	public void eat() {
		final int test = 10;
		class demo{
			int b = test;
		}
	}

	final int NUM_SECOND_THIRD;

	public Dog() {
		NUM_SECOND_THIRD = 10;
	}

	public Dog(int a) {
		NUM_SECOND_THIRD = 20;
	}
}*/

