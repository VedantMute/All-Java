import java.util.Scanner;

public class p3_add_function {



    public static int addNumbers(int a, int b) {
      return a+b;
    }
    public static int subNumbers(int a, int b) {
      return a-b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int x= sc.nextInt();

        System.out.println("Enter second number");
        int y= sc.nextInt();
        
        
        System.out.println("Addition is");
        System.out.println(addNumbers(x, y));
        System.out.println("Substraction is");
        System.out.println(subNumbers(x, y));
        sc.close();
      }
  }
        
        
        
    
