import java.util.Scanner;

public class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String var;
        while(sc.hasNext())
        {
            var=sc.next();
            if(var.equals("exit"))
            {
                break;
            }
            sum=sum+Integer.parseInt(var);

        }
        System.out.println(sum);
    }
}