import java.util.Scanner;

public class p7_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[7];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number " + (i + 1));
            num[i] = sc.nextInt();
        }

        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Maximum number is " + max);
        sc.close();
    }
}
