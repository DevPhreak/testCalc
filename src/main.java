import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
    public static int position;
    public static String[] findModifier = {"*", "/", "+", "-"};

    public static void main(String[] args) {
        System.out.println("Java calculator test" + '\n');
        String deOptelsom = getInput();

        while (!isValid(deOptelsom)) {
            System.out.println("Please enter a valid equation...");
            deOptelsom = getInput();
        }

        System.out.println(calculate(deOptelsom));
    }

    public static String getInput() {
        String input;
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Enter your query now...");
        input = textScanner.nextLine();
        input = input.replaceAll(" ", "");
        return input;
    }

    public static boolean isValid(String string) {

        for (int i = 0; i < findModifier.length; i++) {
            if (string.contains(findModifier[i])) {
                position = i;
                return true;
            }
        }
        return false;
    }
    public static double calculate(String input) {
        String[] input2 = input.split("[*/+-]");
        String modifier = findModifier[position];

        //waarom kan dit niet mooier
        if(modifier == "*") {
            return (Double.parseDouble(input2[0]) * Double.parseDouble(input2[1]));
        }
        else if(modifier == "/"){
            return (Double.parseDouble(input2[0]) / Double.parseDouble(input2[1]));
        }
        else if(modifier == "+"){
            return (Double.parseDouble(input2[0]) + Double.parseDouble(input2[1]));
        }
        else {
            return (Double.parseDouble(input2[0]) - Double.parseDouble(input2[1]));
        }
    }
}
