import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Text eingeben, der gecheckt werden soll:");
        String testString = scanner.nextLine();

        if (check(testString)){
            System.out.println("Der Text erfüllt beide Anforderungen.");
        } else {
            System.out.println("Der Text erfüllt nur eine oder keine der beiden Anforderungen.");
        };
    };

    private static boolean check(String testString){
        boolean result;

        if((testString.length() > 20) && (testString.contains("fancy"))){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
