import java.util.Scanner;

public class Q10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i = sc.nextInt();
        String str = s.substring(s.length()-i);
        System.out.print(s);
        for(int j=0;j<i;j++)
        {
            System.out.print(str);
        }
    }
}