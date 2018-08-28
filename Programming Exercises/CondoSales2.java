import java.util.Scanner;

public class CondoSales2
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
        int spaceCost = 0;
        if (userInput == 1){
            System.out.println("Condo: Park View\n(1) Garage space\n(2) Parking space");
            Scanner garageInput = new Scanner(System.in);
            int garageSelection = garageInput.nextInt();
                if (garageSelection == 1) {
                    spaceCost = 5000;
                }else if (garageSelection == 2){
                    System.out.println("Invalid Input");
                    spaceCost = 0;
                }
            System.out.println("Condo: Park View\nPrice: $" + (parkCost + spaceCost));
        }
        else if (userInput == 2){
            System.out.println("Condo: Golf Course View\n(1) Garage space\n(2) Parking space");
            Scanner garageInput = new Scanner(System.in);
            int garageSelection = garageInput.nextInt();
            if (garageSelection == 1) {
                spaceCost = 5000;
            }else if (garageSelection == 2){
                System.out.println("Invalid Input");
                spaceCost = 0;
            }
            System.out.println("Condo: Park View\nPrice: $" + (golfCost + spaceCost));
        }
        else if (userInput == 3){
            System.out.println("Condo: Park View\n(1) Garage space\n(2) Parking space");
            Scanner garageInput = new Scanner(System.in);
            int garageSelection = garageInput.nextInt();
            if (garageSelection == 1) {
                spaceCost = 5000;
            }else if (garageSelection == 2){
                System.out.println("Invalid Input");
                spaceCost = 0;
            }
            System.out.println("Condo: Lake View\nPrice: $" + (lakeCost + spaceCost));
        }
        else{
            System.out.println("Price: $0");
        }
    }
}
