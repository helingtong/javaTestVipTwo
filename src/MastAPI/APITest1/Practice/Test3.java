package MastAPI.APITest1.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
/*
 * SimpleDateFormat:
 * 		格式化：
 * 			Date --- String
 * 			2049-8-26 2049年8月26日
 * 			String format(Date date)
 * 		解析：
 * 			String --- Date
 * 			"2049-8-26"
 * 			Date parse(String source)
 *
 * 构造方法：
 * 		SimpleDateFormat() ：使用默认的模式进行对象的构建
 * 		SimpleDateFormat(String pattern) ：使用的指定的模式进行对象的构建
 *
 * 注意：Exception in thread "main" java.text.ParseException: Unparseable date: "49年9月26日  下午1:29"
 * 	    解析的字符串，模式必须和构建对象的模式一样
 *

(1)将当前的时间解析成 xxxx年xx月xx日 xx:xx:xx 这种格式显示;	(2)已知一个字符串时间String  date = "2000_02_29#####23-23-23";
	(1)将当前的时间解析成 xxxx年xx月xx日 xx:xx:xx 这种格式显示;
  	(2)已知一个字符串时间String  date = "2000_02_29#####23-23-23";
   		a. 请将字符串时间转成一个date对象
		b.然后通过对象获取出以上date对象明天这个时候的毫秒值
		c.然后通过获取通过刚才获取的毫秒值获取出明天的date对象;
		d.然后将获取出新的date对象的时间以xxxx年xx月xx日 xx:xx:xx 这种格式显示出来;*/
public class Test3 {
    public static void main(String[] args) throws ParseException {
        method3();

    }
    public static void method3() throws ParseException{
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat("2023年1月22日 HH:mm:ss");
        Date date = new Date();
        String s = sdf1.format(date);    //格式化 把日期对象转换成字符串
        System.out.println(s);
//        字符串转换成日期对象
        Date d = sdf1.parse("23年3月7日 下午1:20");

        System.out.println(d.toLocaleString());
    }
}
