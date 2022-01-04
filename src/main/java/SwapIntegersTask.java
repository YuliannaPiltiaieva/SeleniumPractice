public class SwapIntegersTask {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println(a);
        System.out.println(b);
    }
}
