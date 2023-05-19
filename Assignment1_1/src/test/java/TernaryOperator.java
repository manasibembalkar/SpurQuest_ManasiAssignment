import java.sql.SQLOutput;

public class TernaryOperator {
    public static void main(String[] args) {

        String name = "kiran";
        int age = 28;
        String msg = age < 20 ? "Hello you are an adult" :  "you need to learn so many things";
        System.out.println("Hello  " +name   +msg);
    }
}
