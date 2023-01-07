package method;

class ShoppingAppV1 { // Parent Class

    public void payment() // Method Declartion
    {
        System.out.println("COD Payment"); // Method Definition
    }

}

class ShoppingAppV2 extends ShoppingAppV1 { // Child

    public void payment()
    {
        System.out.println("COD & Card Payment");
    }

}


public class OverridingExamples {

    public static void main(String[] args) {

       /* ShoppingAppV1 v1 = new ShoppingAppV1();
        v1.payment();

        ShoppingAppV2 v2 = new ShoppingAppV2();
        v2.payment();*/

        ShoppingAppV1 obj = new ShoppingAppV2();
        obj.payment();

    }




}




