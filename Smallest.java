import java.util.Scanner;

public class Smallest
{
    public static void main(String args[])
    {
        Scanner cs= new Scanner(System.in);
        System.out.println("enter three integer");
        int i= cs.nextInt();
        int j= cs.nextInt();
        int k= cs.nextInt();
        int no = find(i,j,k);
        System.out.println(no +" is the smallest");

    }

    public static int find(int a, int b, int c)
    {
        if(a<b || a<c)
        return a;

        if(b<a || b<c)
        return b;

        if(c<b || c<a)
        return c;
        return 0;
    }

}