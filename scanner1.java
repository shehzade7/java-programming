import java.util.Scanner;

public class scanner1 {

    public static void main(String[]args)
{
    System.out.println("enter a number");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    i++;
    System.out.println("get data: "+ i);
}
   
}
