import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
       Scanner  scanner=new Scanner(System.in);
       System.out.println("What is your age?");
       int age=scanner.nextInt();
       System.out.println("Your age is "+age);;
       scanner.close();
    }
    
}
