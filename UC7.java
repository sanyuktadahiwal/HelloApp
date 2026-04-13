import java.util.Scanner;
public class UC7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String names = scanner.nextLine();
        if (args.length>0){
            names = String.join(" ", args);
        }
        System.out.println("Hello " + names);
    }
}