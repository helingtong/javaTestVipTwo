package Recurrence;
/*
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 		     小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 *  	     问第二十个月的兔子对数为多少？
 *  1
 *  1
 *  2
 *  3
 *  5
 *  8
 *  13

 *  规律：除了第一个月和第二月以外，其余每个月都是前两个月之和
 *  斐波那契列数
 *
 */
public class recurrentDemo2 {
    public static void main(String[] args) {
        int m = method(20);
        System.out.println(m);
    }
    public static int method(int n){
        if(n == 1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return method(n-1)+method(n-2);
        }
    }
}
