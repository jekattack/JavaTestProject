import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("Hello Test!");

        int s1;
        int s2;
        String operator;
        int result = 0;
        String resultText = "Ergebnis: ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erste Zahl eingeben:");
        s1 = scanner.nextInt();
        System.out.println("Zweite Zahl eingeben:");
        s2 = scanner.nextInt();

        System.out.println("Operator eingeben");
        operator = scanner.next();

        operator.replaceAll(" ", "");

        if (operator.equals("+")){
            result = s1 + s2;
        } else if (operator.equals("-")) {
            result = s1 - s2;
        } else if (operator.equals("*")) {
            result = s1 * s2;
        } else if (operator.equals("/")) {
            result = s1 / s2;
        } else if (operator.equals("%")) {
            result = s1 % s2;
        } else {
            System.out.println("Der eingegebene Operator funktioniert nicht.");
        }

        System.out.println(s1 + operator + s2 + "=");
        System.out.println(resultText + "\n" + result);
    }
}
