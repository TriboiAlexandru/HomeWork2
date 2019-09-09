package methods.reverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Reversed: " + reverse(number));

    }


        public static int reverse(int number) {
            int reverse = 0;
            while (number != 0) {
                reverse = (reverse * 10) + number % 10;
                number = number / 10;
            }
            return (reverse);
        }
}
