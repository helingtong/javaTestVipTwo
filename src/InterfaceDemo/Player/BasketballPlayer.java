package InterfaceDemo.Player;

public class BasketballPlayer extends Player implements SpeackEnglish{
    @Override
    public void study() {
        System.out.println(name+"学扣篮");
    }

    @Override
    public void speck() {
        System.out.println(name+"学英语");
    }
}
