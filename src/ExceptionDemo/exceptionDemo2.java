package ExceptionDemo;

public class exceptionDemo2 {
    public static void main(String[] args) {
        try{
            System.out.println(2 / 0);
        }catch (ArithmeticException e){
//            String getMessage():原因
            System.out.println(e.getMessage());
//          String toString()类型和原因
            System.out.println(e.toString());
//            void printStackTrace():类型原因和位置
            e.printStackTrace();
        }
    }
}
