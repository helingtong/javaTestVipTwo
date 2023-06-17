package ExceptionDemo;

public class exceptionDemo3 {
    public static void main(String[] args) {
    checkScore(110);
    }
    public static void checkScore(int score) throws MyException{
        if(score < 0 || score > 0){
            throw new MyException("考试不符合要求");
        }
        System.out.println("符合要求");
    }
}
