public class KarastsubaMulti {
    public static void main(String[] args) {
        System.out.println(karastsubaMulti(12345, 56789, 5));

    }

    public static long karastsubaMulti(int num1, int num2, int n) {
        // int n = 0;
        // while (a / 10 > 0) {
        // a/=10;
        // n++;
        // }
        // n++;
        // System.out.println(n);
        if (n < 2) {
            return num1 * num2;
        } else {
            int mid = n / 2;
            int a = num1 / (int) Math.pow(10, mid);
            int b = num1 % (int) Math.pow(10, mid);

            int c = num2 / (int) Math.pow(10, mid);
            int d = num2 % (int) Math.pow(10, mid);

            return (long) Math.pow(10, n) * a * c + (long) Math.pow(10, mid) * (a * d + b * c) + b * d;

        }
    }
}