package PackageDemo;

public class PremissionDemo2 {
    public static void main(String[] args) {
        PremissionDemo pd = new PremissionDemo();
        pd.publicMethod();  //通一个包下的不同子类public protected、default都可以访问
        pd.protectedMehod();
        pd.defaultMethod();

    }
}
