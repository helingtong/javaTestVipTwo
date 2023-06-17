package ExceptionDemo;

import java.io.FileWriter;
import java.io.IOException;

public class exceptionClassification {
    public static void main(String[] args) throws IOException {
       /* System.out.println(2 / 0);
        String s = null;
        System.out.println(s.length());
        运行时异常 输出 ArithmeticException
        */
        FileWriter fw = new FileWriter("a.txt");
        //编译异常，在编译的时候必须处理，处理方式就是抛出异常
    }
}
