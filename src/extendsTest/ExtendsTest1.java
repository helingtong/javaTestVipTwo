package extendsTest;
public class ExtendsTest1 {
    public static void main(String[] args) {
        LOL l = new LOL();
        l.update();
        l.start();
    }
}

class Game {
    public void start() {
        System.out.println("游戏启动了");
    }
}

class PCGame extends Game {
    public void update() {
        System.out.println("PCGame更新了");
    }
}

class MobileGame extends Game {
    public void update() {
        System.out.println("MobileGame更新了");
    }
}

class LOL extends PCGame {

}