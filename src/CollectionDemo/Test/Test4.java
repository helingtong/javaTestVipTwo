package CollectionDemo.Test;
/*现在已知Cloth ,衣物都有颜色,价格,牌子;
  已知裤子是衣物的一种,裤子有裤袋;
  已知袜子也是一种,袜子有个洞;
  已知衬衣也是衣服的一种,衬衣有扣子;
  已知鞋子也是衣物,鞋子有鞋带
  已知人这个类, 人类有姓名,性别, 可以穿衣服;

  要求: 定义一个衣柜(衣柜不用创建对象, 里面放置一套衣服);
        创建人对象,然后实现穿一套衣服的过程;*/
public class Test4 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name="Mary";
        person1.gender = "female";
        Wardrobe wardrobe = new Wardrobe();
        person1.wear(wardrobe.pants);
        person1.wear(wardrobe.socks);
        person1.wear(wardrobe.shirt);
        person1.wear(wardrobe.shoes);
    }
}
class Cloth{
    String color;
    double price;
    String brand;
}
class Pants extends Cloth{
    boolean hasPocket;  //有口袋
}
class Socks extends Cloth{
    boolean hasHole;
}
class Shirt extends Cloth{
    boolean hasButton;
}
class Shoes extends Cloth{
    boolean hasLaces;
}
class Person1 {
    String name;
    String gender;

    void wear(Cloth cloth) {
        System.out.println(name + " is wearing " + cloth.brand + " " + cloth.getClass().getSimpleName() + ".");
    }
}
class Wardrobe{
    Pants pants = new Pants();
    Socks socks = new Socks();
    Shirt shirt =new Shirt();
    Shoes shoes = new Shoes();
    Wardrobe(){
        pants.color="blue";
        pants.price=36.88;
        pants.brand="LOV";
        pants.hasPocket=true;

        socks.color = "white";
        socks.price = 4.99;
        socks.brand = "Hanes";
        socks.hasHole = true;

        shirt.color = "pink";
        shirt.price = 39.99;
        shirt.brand = "Ralph Lauren";
        shirt.hasButton = true;

        shoes.color = "black";
        shoes.price = 79.99;
        shoes.brand = "Nike";
        shoes.hasLaces = true;
    }
}

