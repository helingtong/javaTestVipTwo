package MastAPI.APITest1.Practice;

import java.util.ArrayList;
import java.util.Objects;

//1.自己动手定义一个Star(明星),明星有名字属性,自己手动重写Star的toString 和equals方法
public class Star {
    public static void main(String[] args) {
        NewStar star = new NewStar("小明");
        System.out.println(star.toString());    // 输出 NewStar{name='小明'}
        boolean flag = star.equals(new ArrayList<>());
        System.out.println(flag);   //输出false 两个对象地址不相等
    }
//    String name;
}

class NewStar{
    String name;
public NewStar(String name){
    this.name = name;
}
    @Override   //重写toString方法
    public String toString() {  //返回以文本方式表示此对象的字符串
        return "NewStar{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override   //重写equal方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewStar)) return false;
        NewStar newStar = (NewStar) o;
        return Objects.equals(name, newStar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}