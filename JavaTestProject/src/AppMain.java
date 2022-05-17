import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("Taschenrechner \nAufgabe 1:");

        int s1;
        int s2;
        String operator;

        String resultText = "Ergebnis: ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erste Zahl eingeben:");
        s1 = scanner.nextInt();
        System.out.println("Zweite Zahl eingeben:");
        s2 = scanner.nextInt();

        System.out.println("Operator eingeben:");
        operator = scanner.next();
        operator.replaceAll(" ", "");

        System.out.println(s1 + operator + s2 + "=");
        System.out.println(resultText + "\n" + operate(operator, s1, s2));

        System.out.println("Zahlen vergleichen \nAufgabe 2:");

        System.out.println("Erste Zahl eingeben:");
        s1 = scanner.nextInt();
        System.out.println("Zweite Zahl eingeben:");
        s2 = scanner.nextInt();

        if(s1!=s2){
            if(s1<s2){
                System.out.println(s1 + " ist kleiner als " + s2);
            } else {
                System.out.println(s1 + " ist größer als " + s2);
            }
        } else {
            System.out.println(s1 + " und " + s2 + " sind gleich.");
        }

    }

    private static int operate(String operator, int s1, int s2){
        int result = 0;
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
            result = 0;
        }
        return result;
    }


}
