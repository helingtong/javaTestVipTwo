package ExceptionDemo;

import java.io.FileWriter;
import java.io.IOException;

/*手动实现FileWriter的try catch异常处理形式的完整模式*/
public class exceptionTest {
    public static void main(String[] args) throws IOException {
       demo();
    }
    private static void demo(){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("E://a.txt");
            fileWriter.write("小猫");
            fileWriter.write("小狗");
        }catch(Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            }catch(IOException el){
                el.printStackTrace();
            }
        }
    }
    public static int get(){
        try{
            return 520;
        }finally {
            System.out.println("发生异常");
        }
    }
}
