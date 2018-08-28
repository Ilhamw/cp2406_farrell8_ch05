import java.util.*;
public class AscendingAndDescending
{
    public static void main(String [] args)
    {
        System.out.println("Enter the first number");
        Scanner inputNum1 = new Scanner(System.in);
        int num1 = inputNum1.nextInt();
        System.out.println("Enter the second number");
        Scanner inputNum2 = new Scanner(System.in);
        int num2 = inputNum1.nextInt();
        System.out.println("Enter the last number");
        Scanner inputNum3 = new Scanner(System.in);
        int num3 = inputNum1.nextInt();
        int highNum = getHighNum(num1, num2, num3);
        int midNum = getMidNum(num1, num2, num3);
        int lowNum = getLowNum(num1, num2, num3);
        System.out.println("Ascending: " + lowNum + ", " + midNum + ", " + highNum);
        System.out.println("Descending: " + highNum + ", " + midNum + ", " + lowNum);
    }

    public static int getHighNum(int num1, int num2, int num3)
    {
        int highNum = 0;
        if (num1 > num2 && num1 > num3){
            highNum = num1;
        }else if (num2 > num1 && num2 > num3){
            highNum = num2;
        }else if (num3 > num1 && num3 > num2){
            highNum = num3;
        }
        return highNum;
    }

    public static int getMidNum(int num1, int num2, int num3) {
        int midNum = 0;
        if ((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2)) {
            midNum = num1;
        } else if ((num2 < num1 && num2 > num3) || (num2 < num3 && num2 > num1)) {
            midNum = num2;
        } else if ((num3 < num1 && num3 > num2) || (num3 < num2 && num3 > num1)) {
            midNum = num3;
        }
        return midNum;
    }

    public static int getLowNum(int num1, int num2, int num3) {
        int lowNum = 0;
        if (num1 < num2 && num1 < num3) {
            lowNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            lowNum = num2;
        } else if (num3 < num1 && num3 < num2) {
            lowNum = num3;
        }
        return lowNum;
    }
}
