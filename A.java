public class A {

    static int b=20; //static varible
    int c=30; // instanc varible
    public static void main(String[] args) {
        int a=10; // local varible
        System.out.println(a);
        System.out.println(A.b);
        A ref = new A();
        System.out.println(ref);
    }
    
}
