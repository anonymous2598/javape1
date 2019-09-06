import java.util.Scanner;

public class Q3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='o'||arr[i]=='i'||arr[i]=='u')
            {
                System.out.println(arr[i]+" vowel");
            }
            else if( arr[i]>'a' && arr[i]<='z')
            {
                System.out.println(arr[i]+" consonant");
            }
            else
            {
                System.out.println(arr[i]+" Not an alphabet!");
            }
        }

    }
}