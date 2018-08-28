import java.util.*;
public class CondoSales
{
    public static void main(String [] args)
    {
        System.out.println("Welcome to Summerdale Condo Sales\nPlease enter a number and choose an option:");
        System.out.println("(1) Park View\n(2) Golf Course View\n(3) Lake View\n");
        Scanner optionInput = new Scanner(System.in);
        int options = optionInput.nextInt();
        getCondoPrice(options);
    }

    public static void getCondoPrice(int userInput)
    {
        final int parkCost = 150000;
        final int golfCost = 170000;
        final int lakeCost = 210000;
        if (userInput == 1){
            System.out.println("Condo: Park View\nPrice: $" + parkCost);
        }
        else if (userInput == 2){
            System.out.println("Condo: Golf Course View\nPrice: $" + golfCost);
        }
        else if (userInput == 3){
            System.out.println("Condo: Lake View\nPrice: $" + lakeCost);
        }
        else{
            System.out.println("Price: $0");
        }
    }
}
