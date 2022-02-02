package work24;

public class task24 {
    public static void main(String[] args) {
            int number = 123;
            int num = number;
            int third = (number % 10)*100;
            number /= 10;
            int second = (number % 10) * 10;
            number /= 10;
            int reverse = third + second + number;

            System.out.println(num);
            System.out.println(reverse);
            System.out.println(num - reverse);

    }
}
