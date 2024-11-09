import java.util.Scanner;

public class Relational {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 1st number:");
        int a = scan.nextInt();
        System.out.println("enter a 2nd number:");
        int b = scan.nextInt();
        System.out.println("true/flase "+ (a<b) );
        System.out.println("true/flase "+ (a>b) );
        System.out.println("true/flase "+ (a<=b) );
        System.out.println("true/flase "+ (a>=b) );
        System.out.println("true/flase "+ (a!=b) );

    }
}
