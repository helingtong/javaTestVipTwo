package PackageDemo1.demo1;
/*包的特点：
*   包可以有多层
*   包必须是代码的第一行
*   不同包里面可以有名字相同的文件
* *代表的是通配符，代表导入这个包下面的所有类，并没有导入子包下的类
* 类的全名“包名.类名
* */

import PackageDemo.PremissionDemo;

public class PackageDemo1 {
    public static void main(String[] args) {
//        相同包下的类可以直接访问，不需要做其他的操作
        PremissionDemo premissionDemo = new PremissionDemo();
        premissionDemo.publicMethod();

    }
}
