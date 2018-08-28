import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String indication = getIndicator(num);
        System.out.println("The number is " + indication);

    }

    public static String getIndicator(int number) {
        String indication = null;
        if (number % 2 == 0) {
            indication = "even";
        } else if (number % 2 == 1)
        {
            indication = "odd";
        } else{
            System.err.println("Input Error");
        }
        return indication;
    }
}
