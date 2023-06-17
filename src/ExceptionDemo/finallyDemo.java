package ExceptionDemo;

import java.io.FileWriter;
import java.io.IOException;

public class finallyDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("a.txt");
            fileWriter.write("你好");
            System.out.println(2/0);
            fileWriter.write("我在学java");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
