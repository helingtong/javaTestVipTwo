package MastAPI.APITest1.Practice;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.*;
/*2.通过System这个类的arraycopy方法将已知数组int [] arr ={12,234,45,324};中中间两个元素拷贝到另外一个新数组中;
* arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
* 从指定的源数组复制一个数组，从指定的位置开始到目标数组指定的位置结束
* 参数1：源数组
 * 参数2：源数组的起始索引位置
 * 参数3：目标数组
 * 参数4：目标数组的起始索引位置
 * 参数5：指定接受的元素个数
*1000毫秒 = 1秒
* 3.通过System的currentTimeMillis()方法,计算出 输出一万次我爱你,所用时间;
* 4.通过date对象获取当前时间的毫秒值, 然后计算出明天这个时间的毫秒值,然后将明天的这个时候的毫秒值转成Date对象;
* Date: 表示特定的瞬间，精确到毫秒，它可以通过方法来设定自己所表示的时间，可以表示任意的时间
* */
public class Test2 {
    public static void main(String[] args) {
//        copy();
//        CurTime();
       method2();

    }
//    第二问
    public static void copy(){
        int[] arr = {12,234,45,324};
        int[] newArr = new int[5];
        System.arraycopy(arr,1,newArr,1,2);
//        遍历新数组并输出
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
//    第三问 通过System的currentTimeMillis()方法,计算出 输出一万次我爱你,所用时间;
    public static void CurTime(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("我爱你");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
//    第4问 通过date对象获取当前时间的毫秒值, 然后计算出明天这个时间的毫秒值,然后将明天的这个时候的毫秒值转成Date对象;
    public static void method2(){
//        获取当前时间的毫秒值
        Date now = new Date();
        long nowMillis = now.getTime();
//        计算明天此时的毫秒值
        long tomorrowMillis = nowMillis+24*60*60*1000;
//        将明天此时的毫秒值转化成Date对象
        Date tomorrow = new Date(tomorrowMillis);
        System.out.println("当前的时间的毫秒值为："+ nowMillis +" 明天的时间的毫秒值为"+ tomorrowMillis +" 明天的日期和时间为"+ tomorrow);
    }
}
