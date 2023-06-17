package Recurrence;
/*
 * 需求：求5的阶乘
 * 5! = 5 * 4 * 3 * 2 * 1;  //120
 * 5! = 5 * 4!;					//120
 * 		4! = 4 * 3!;			//24
 * 			3! = 3 * 2!;		//6
 * 				2! = 2 * 1!;	//2
 * 					1! = 1;     //1
	n! = n * (n - 1)!
 */
public class recurrenceDemo1 {
    public static void main(String[] args) {
        int n = method(5);
        System.out.println(n);
    }
    public static int method(int n){
        if(n == 0){
            return 1;
        }else{
            return n * method(n-1);
        }
    }
}
