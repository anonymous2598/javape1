import java.util.Scanner;

public class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}