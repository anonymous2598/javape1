import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sorted=0,sum=0;
        String str = Integer.toString(s);
        int temp[]=new int[str.length()];
        for(int i=0;i< str.length();i++)
        {
            temp[i]=str.charAt(i)-'0';
        }
        Arrays.sort(temp);//ascending
        for(int i=temp.length-1;i>=0;i--)
        {
            if(temp[i]%2==0)
            {
                sum+=temp[i];
            }
            sorted=sorted*10+temp[i];//descending
        }
        System.out.println("Sorted number in non-ascending order: "+sorted);
        System.out.println("Sum of even numbers: "+sum);
        if(sum>15)
        {   
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}