package demoStatic;

/*Coder静态代码执行--Coder构造代码块执行——Coder无参构造代码块执行
 * BlockTest静态代码块执行——> BlockTest主函数代码块执行
 * ——> BlockTest静态代码块执行——> Coder静态代码块执行
 * ——> Coder构造代码块执行——>Coder无参空构造执行
 * ——>Coder构造代码块执行——>Coder无参空构造执行
 * */
public class blockTest {
    static {
        System.out.println("BlockTest静态代码块执行");
    }

    {
        System.out.println("BlockTest构造代码块执行");
    }

    public void BlockTest(){
        System.out.println("BlockTest无参构造执行了");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest主函数执行了");
        Coder c = new Coder();
        Coder c2 = new Coder();
    }
}

class Coder {
    static {    //静态代码块随着类的加载而加载，只执行一次
        System.out.println("Coder静态代码块执行了");
    }

    {
        System.out.println("Coder构造代码块执行了");
    }

    public Coder() {
        System.out.println("Coder无参构造执行");
    }

}

