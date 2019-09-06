import java.util.Scanner;

public class Q9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[]= s.toCharArray(),temp;
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        s= new String(arr);
        System.out.println(s);

    }
}