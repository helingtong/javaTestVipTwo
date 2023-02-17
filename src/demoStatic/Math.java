package demoStatic;
/*
* static double abs(double a)  :返回绝对值
  static double ceil(double a) 天花板   向上取整
  static double floor(double a)  地板  向下取整
  static long round(double a)  ：四舍五入
  static double pow(double a, double b) :返回第一个参数的第二个参数次幂
  static double random() :返回一个随机数，大于零且小于一
* */

import static java.lang.Math.*; //导入Math包

public class Math {

    public static void main(String[] args) {
        System.out.println(PI); //结果：3.141592653589793
        System.out.println(ceil(3.2));  //向上取整
        System.out.println(floor(3.2));//向下取整
        System.out.println(round(3.2));//四舍五入
        System.out.println(pow(3, 2));//返回第一个参数的第二个参数次幂
        System.out.println((int) (random() * 100 + 1));  //获取1-100以内的随机整数 （int)强制类型转换
    }

}
