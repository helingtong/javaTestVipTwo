package InterfaceDemo.Player;

public class InterfaceTest {
    public static void main(String[] args) {
//        创建篮球对象
        BasketballPlayer bbp = new BasketballPlayer();
        bbp.name = "小明";
        bbp.age = 18;
        bbp.gender = "男";
        bbp.study();
        bbp.speck();

//        创建乒乓球对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.name = "小红";
        ppp.age = 17;
        ppp.gender = "女";
        ppp.study();
    }
}
