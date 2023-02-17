package MyApiTest;

/*键盘录入3个学生信息(学号,姓名,年龄,居住城市)存入集合。
然后遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行，自己定义分割标记)
把上一题的文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出

* */
public class student {
    private String num;
    private String name;
    private String age;
    private String address;
    public student(){   //无参构造
    }
    public student(String num,String name,String age,String address){  //有参构造
        this.num = num;
        this.name = name;
        this.age = age;
        this.address = address;
    }
//    get set方法给成员变量赋值
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
