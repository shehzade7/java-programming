import java.util.Scanner;

public class artimethic {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 1st number:");
        int a = scan.nextInt();
        System.out.println("enter a 2nd number:");
        int b = scan.nextInt();
        System.out.println("added two number:"+(a+b) );
        System.out.println("sub two number:"+(a-b) );
        System.out.println("multi two number:"+(a*b) );
        System.out.println("division two number:"+(a/b) );
        System.out.println("remainder two number:"+(a%b) );

    }
    
}
