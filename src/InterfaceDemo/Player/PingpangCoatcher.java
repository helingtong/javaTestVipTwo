package InterfaceDemo.Player;

public class PingpangCoatcher extends Coatcher implements SpeackEnglish{
    @Override
    public void teach() {
        System.out.println("教抽球");
    }

    @Override
    public void speck() {
        System.out.println("说英语");
    }
}
