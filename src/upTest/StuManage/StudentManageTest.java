package upTest.StuManage;

import java.util.ArrayList;
import java.util.Scanner;

/*思路：
1.定义学生类
2.学生管理系统主界面编写
3.查看所有学生
4.增加学生
5.删除
6.修改
待办：根据学号来查找学生的信息

* **/
public class StudentManageTest {
    public static void main(String[] args) {
        //创建集合对象来存储数据
        ArrayList<student> s = new ArrayList<student>();
        while (true){
//           2.主界面编写
            System.out.println("---欢迎来到学生管理系统---");
            System.out.println("输入1查看所有学生信息");
            System.out.println("输入2增加学生信息");
            System.out.println("输入3删除学生信息");
            System.out.println("输入4修改学生信息");
            System.out.println("输入5退出");
            System.out.println("输入你的选择");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                default:
                    System.out.println("感谢使用");
                    System.exit(0);
                    break;
            }
        }
    }
    //2.查看学生信息
    public static void findAllStudent(ArrayList<student> array){
        //判断集合中是否有元素
        if(array.size()==0){
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);   //获取每一个学生对象
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
        System.out.println("查找学生全部信息成功");
    }

//增加学生信息
    public static void addStudent(ArrayList<student> array){
        String id;  //为了让id可以访问到
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入要添加的学生的学号");
            id = sc.nextLine();
//            判断学号是否被占用
//            定义标记
            boolean flag = true;
            for (int i = 0; i < array.size(); i++) {
                student s = array.get(i);   //获取每一个学生对象
                if(s.getId().equals(id)){
                    flag = false;
                    System.out.println("学号被占用");
                    break;
                }
            }
            /*
            * if(flag==false){
            *   System.out.println("学号被占用,重新输入");
            * }else{
            *   break;
            * }
            * */

            if(flag){
                System.out.println("输入学生姓名");
                String name = sc.nextLine();
                System.out.println("输入学生年龄");
                String age = sc.nextLine();
                System.out.println("输入学生地址");
                String address = sc.nextLine();
                //创建学生对象并赋值
                student s = new student();
                s.setAddress(address);
                array.add(s);   //将学生对象作为元素加入集合中
                System.out.println("添加成功");
            }
        }
    }
//删除学生信息
    public static void delStudent(ArrayList<student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除的学生学号");
        String id =sc.nextLine();
//        判断学号是否存在
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            if(s.getId().equals(id)){
                index = i;
                break;
            }

        }
        if(index==-1){
            System.out.println("学号不存在");
        }else{
            array.remove(index);
            System.out.println("删除成功");
        }
    }
//修改学生信息
    public static void updateStudent(ArrayList<student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要修改的学号");
        String id = sc.nextLine();
//        判断是否存在
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            if(s.getId().equals(id)){
                index = i;
            }
            break;
        }
        if(index==-1){
            System.out.println("学号不存在");
        }else{
            System.out.println("输入学生姓名");
            String name = sc.nextLine();
            System.out.println("输入学生年龄");
            String age = sc.nextLine();
            System.out.println("输入学生地址");
            String address = sc.nextLine();
            student s = new student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index,s);
            System.out.println("修改成功");
        }
    }

}


