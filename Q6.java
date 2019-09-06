import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c <= 'Z' && c >= 'A')
            System.out.println("Capital Letter");
            
        else if (c <= 'z' && c >= 'a')
            System.out.println("Small Letter");
        
        else if (c <= '9' && c >= '0')
            System.out.println("A digit");
        else
            System.out.println("Special Character");

    }
}