package method;

public abstract class Calculator {

    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);

    public void multiply(int a, int b){
        System.out.println("RESULT : "+ (a*b));
    }

}
