public class p8_varargs {

    static int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
    }
}
