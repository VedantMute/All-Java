public class p9_recursion {

    static int fact(int n) {
        if (n==0 || n == 1)
            return 1;
         else 
            return n* fact(n - 1);
        
    }
    static void star(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        star(5);
    }
}
