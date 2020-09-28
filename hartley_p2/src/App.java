import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Boolean moreInput() {
        Scanner addInput = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to add another person's information? (Y/N)");
            String str = addInput.next();
            if (!str.equalsIgnoreCase("Y")) {
                break;
            }
        }
        return true;
    }

    static int getUserHeight() {
        int height = 0;
        while (height <= 0) {
            System.out.println("Please enter your height as a positive number, in inches.");
            Scanner heightInput = new Scanner(System.in);
            height = heightInput.nextInt();
        }
        return height;
    }

    static int getUserWeight() {
        int weight = 0;
        while (weight <= 0) {
            System.out.println("Please enter your weight as a positive number, in pounds.");
            Scanner weightInput = new Scanner(System.in);
            weight = weightInput.nextInt();
        }
        return weight;
    }

        public static void main(String[] args) {
            ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

            while (moreInput()) {
                double height = getUserHeight();
                double weight = getUserWeight();

                BodyMassIndex bmi = new BodyMassIndex(height, weight);
                bmiData.add(bmi);

                displayBmiInfo(bmi);
            }
            
            displayBmiStatistics(bmiData);
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.println("BMI: " + bmi);
    }

}
