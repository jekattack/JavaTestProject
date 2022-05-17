import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Erste Zahl eingeben:");
        int s1 = scanner.nextInt();
        System.out.println("Zweite Zahl eingeben:");
        int s2 = scanner.nextInt();

        int result = sum(s1, s2);

        System.out.println(returnResult(result));
        System.out.println(isSmallerThan100(result));
    }

    private static int sum(int s1, int s2){
        int result;
        result = s1 + s2;
        return result;
    }

    private static String returnResult(int result){
        return "Summer: " + result;
    };

    private static String isSmallerThan100(int result){
        if (result >= 100){
            return "Die Zahl ist größer als 100.";
        } else {
            return "Die Zahl ist kleiner als 100.";
        }
    };

}
