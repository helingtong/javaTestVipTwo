package ExceptionDemo;

public class AgeOutOfBoundException extends RuntimeException{
    public AgeOutOfBoundException(){
        super();
    }
    public AgeOutOfBoundException(String s) {
        super(s);
        System.out.println("年龄异常");
    }
}
