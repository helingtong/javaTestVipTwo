package PoymorphicDemo;
/*多态的优缺点：
* 优点：提高代码的可拓展性和可维护性
* 缺点：父类调用的时候只能调用父类的方法，不能调用子类的方法，因为不清楚将来会有什么子类去继承
* 多态三个必要条件：
父类引用指向子类对象
要有覆盖操作，也就是重写
需要存在继承或者实现关系*/
public class PoymorphicDemo4 {
    public static void main(String[] args) {
        MiFactory miFactory = new MiFactory();
        miFactory.make(new NoteMi());//条件1 父类的引用指向子类对象
        miFactory.make(new RedMi());
        miFactory.make(new HeiMi());
    }
}
class MiFactory{
    /*	public void make(NoteMi p) {
			p.call();
		}

		public void make(RedMi p) {
			p.call();
		}

		public void make(HeiMi p) {
			p.call();
		}*/
    public void make(Phone p){
        p.call();
    }
}
interface Phone{
    public void call();
}
class NoteMi implements Phone{
    @Override   //条件2要有覆盖操作，也就是重写
    public void call() {
        System.out.println("NoteMi打电话");
    }
}
class RedMi implements Phone{
    @Override
    public void call() {
        System.out.println("RedMi打电话");
    }
}
class HeiMi implements Phone{
    @Override
    public void call() {    //需要存在继承或者实现关系
        System.out.println("HeiMi打电话");
    }
}