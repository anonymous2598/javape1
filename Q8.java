import java.util.Scanner;

public class Q8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        int s,target=25;
        System.out.println("Limit: 1- 50\n");
        while(flag)
        {
            s = sc.nextInt();
            if(s>target && s<50)
            {
                System.out.println("Number guessed is more than original number");
            }
            else if(s<target && s>1)
            {
                System.out.println("Number guessed is less than original number");
            }
            else if(s==target)
            {
                System.out.println("Number guessed matches the original number");
                flag=false;
            }
            else
            {
                System.out.println("out of bounds");
            }
        }
    }
}