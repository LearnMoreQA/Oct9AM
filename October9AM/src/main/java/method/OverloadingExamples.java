package method;

public class OverloadingExamples {

    // Mobile Call --> Based on name / Phone No

    public void search(String name){
        System.out.println("Search By Name : "+ name);
    }

    public void search(String name,String keyword){
        System.out.println("Search By Name/Keyword : "+ name + " " + keyword);
    }

    public void search(long phoneNumber){
        System.out.println("Search By Name : "+ phoneNumber);
    }

    public static void main(String[] args) {
        OverloadingExamples obj = new OverloadingExamples();
        obj.search("Mahesh");
    }
}
