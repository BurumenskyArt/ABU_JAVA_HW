package work24;

public class task24 {
    public static void main(String[] args) {
            int number = 123;
            int num = number;
            int a = (number % 10) * 100;
            number /= 10;
            int b = (number % 10) * 10;
            number /= 10;
            int reverse = a + b + number;

            System.out.println(num);
            System.out.println(reverse);
            System.out.println(num - reverse);

    }
}
