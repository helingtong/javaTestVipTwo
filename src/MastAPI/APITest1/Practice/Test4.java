package MastAPI.APITest1.Practice;

import java.time.Year;
import java.util.Calendar;

/*通过Calendar对象获取今天是多少年多少月多少日;
 (1)获取今天在一年中是第几周;
 (2)获取单前月份在一年中是第几个月;
  Calendar类是日历类，用于替代Date类的使用。它里面提
供了很多功能来单独获取日历的某个数据。
• Calendar类的使用
–抽象类，但是提供方法用于获取子类对象
• Calendar类的练习：
–获取任意一年的2月有多少天？
–获取昨天的现在这个时刻并输出？
 */
public class Test4 {
    public static void main(String[] args) {
//        创建calendar对象
        Calendar c = Calendar.getInstance();
//        当前日期
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(year+"年"+ month +"月" + day + "日" + hour + "点");
//        计算今天是一年的第几周
        int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);

        int monthOfYear = c.get(Calendar.MONTH)+1;
        System.out.println("今天是" + year + "年" + month + "月" + day + "日");
        System.out.println("今天在一年中是第" + weekOfYear + "周");
        System.out.println("当前月份在一年中是第" + monthOfYear + "个月");
    }
}
