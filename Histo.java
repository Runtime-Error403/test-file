import java.util.Scanner;

public class Histo
{
    public static void main(String args[])
    {
        Scanner cs= new Scanner(System.in);
        System.out.println("enter input to print histogram");
        int i= cs.nextInt();
        display(i);
    }

    public static void display(int j)
    {
        System.out.print(j+" : ");
        for(int i=0; i<j;i++)
        System.out.print("*");
    }

}