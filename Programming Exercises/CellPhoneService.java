import java.util.*;
public class CellPhoneService
{
    public static void main(String [] args)
    {
        System.out.println("Enter maximum monthly call minutes>>> ");
        Scanner minsInput = new Scanner(System.in);
        int minsMax = minsInput.nextInt();
        System.out.println("Enter maximum monthly text messages>>> ");
        Scanner textInput = new Scanner(System.in);
        int textMax = textInput.nextInt();
        System.out.println("Enter maximum monthly data used>>> ");
        Scanner dataInput = new Scanner(System.in);
        int dataMax = dataInput.nextInt();
        int minutes = getMaxMinutes(minsMax);
        int texts = getMaxText(textMax);
        int data = getMaxData(dataMax);
        String[] dataPlan;
        dataPlan = getDataPlan(minutes, texts, data);
        int planCost = Integer.parseInt(dataPlan[1]);
        System.out.println("Recommended data plan: " + dataPlan[0] + "\nPrice: $" + dataPlan[1]);
    }

    public static int getMaxMinutes(int minutes)
    {
        int minsIndicator = 0;
        if (minutes < 500){
            minsIndicator = 0;

        }else if (minutes >= 500){
            minsIndicator = 1;
        }
        return minsIndicator;
    }

    public static int getMaxText(int texts)
    {
        int textIndicator = 0;
        if (texts == 0){
            textIndicator = 0;
        }else if (texts > 0){
            textIndicator = 1;
        }else if (texts >= 100){
            textIndicator = 2;
        }
        return textIndicator;
    }

    public static int getMaxData(int data)
    {
        int dataIndicator = 0;
        if (data == 0){
            dataIndicator = 0;
        }else if (data > 0 && data < 2){
            dataIndicator = 1;
        }else if (data > 2){
            dataIndicator = 2;
        }
        return dataIndicator;
    }

    public static String[] getDataPlan(int minutes, int texts, int data)
    {
        String plan = null;
        String cost = null;
        if ((minutes == 0) && (texts == 0) && (data == 0)){
            plan = "A";
            cost = "49";
        }else if ((minutes == 0) && (texts == 1) && (data == 0)){
            plan = "B";
            cost = "55";
        }else if ((minutes == 1) && (texts == 1) && (data == 0)){
            plan = "C";
            cost = "61";
        }else if ((minutes == 1) && (texts == 2) && (data == 0)){
            plan = "D";
            cost = "70";
        }else if ((data == 1)){
            plan = "E";
            cost = "79";
        }else if ((data == 2)){
            plan = "F";
            cost = "87";
        }

        return new String[] {plan, cost};
    }

}
