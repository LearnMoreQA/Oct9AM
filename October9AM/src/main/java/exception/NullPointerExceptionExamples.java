package exception;

import org.junit.Assert;

public class NullPointerExceptionExamples {

    public static void main(String[] args) {
        String name = null;
        int num1 = 2;
        int num2 = 0;
        int result;
        try {
            name.length();
            result= num1/num2;
        }catch (NullPointerException e){
            name = "Learn More";
            System.out.println(name.length());
        }catch (Exception e){
           Assert.fail("Invalid Method");
        }finally {
            System.out.println("Finally Block");
        }

    }
}
