import java.util.Scanner;

public class p4_Strings {
    public static void main(String[] args) {
        
        String name= new String("hi");
        System.out.println(name);
        
        String name2="hello!";
        System.out.println(name2);
        
        // Using printf
        int a=1;
        float b= 0.11f;
        System.out.printf("value of a is %d and b is %f\n", a,b);
        
        // Taking string as input
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        System.out.println(str);
        sc.close();

        // String methods
        String name4="Hello";

        int len=name4.length();
        System.out.println(len);

        String lname4 = name4.toLowerCase();
        System.out.println(lname4);

        switch (name4) {
            case "Hello":
                System.out.println("hi");
                break;
        
            default:
                break;
        }

    }
}
