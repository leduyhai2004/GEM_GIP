package section1_1;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        String c = "Hello, World!";
        boolean d = true;
        char e = 'A';
        //print types
        System.out.println("The type of a is: " + ((Object)a).getClass().getSimpleName() + " with value: " + a);
        System.out.println("The type of b is: " + ((Object)b).getClass().getSimpleName() + " with value: " + b);
        System.out.println("The type of c is: " + ((Object)c).getClass().getSimpleName() + " with value: " + c);
        System.out.println("The type of d is: " + ((Object)d).getClass().getSimpleName() + " with value: " + d);
        System.out.println("The type of e is: " + ((Object)e).getClass().getSimpleName() + " with value: " + e);

    }
}
