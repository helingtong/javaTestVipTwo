package ExceptionDemo;

public class MyException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public MyException(){
        super();
    }
    public MyException(String s){
        super(s);
        System.out.println("自定义异常");
    }
}
