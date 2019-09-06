import java.util.Scanner;

public class Q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int checkNum=sc.nextInt();
        if(checkNum>20 && checkNum <30)
        {
            if(checkNum%2==0)
            {
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
    }
}