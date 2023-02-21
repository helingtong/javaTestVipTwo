package MastAPI.APITest1;
/*包含一些有用的类的方法，它不能被实例化*/
public class SystemDemo {
    public static void main(String[] args) {
        mehod();
    }

public static void mehod(){
    for (int i = 0;i<1000;i++){
        if(i==100){
            System.out.println();
            System.exit(0);
        }
    }
}
}
class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我被回收了");
    }
}