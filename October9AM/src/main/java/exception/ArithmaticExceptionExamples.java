package exception;

public class ArithmaticExceptionExamples {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        try{
            int result = num1/num2;
        }catch (ArithmeticException e){
            System.out.println("Exception Catched");
        }
    }
}
