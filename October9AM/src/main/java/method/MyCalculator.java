package method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCalculator extends Calculator implements InterfaceExamples,multiple {

    @Override
    public void add(int a, int b) {
        System.out.println("SUM = "+ (a+b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("SUB = "+ (b-a));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("DIV : "+ (a/b));
    }

    public static void main(String[] args) {
       Calculator cal = new MyCalculator();
       cal.add(10,20);
       cal.sub(15,25);
       cal.multiply(2,2);

       InterfaceExamples val = new MyCalculator();
       val.div(2,2);

        WebDriver driver = new ChromeDriver();

    }


}
