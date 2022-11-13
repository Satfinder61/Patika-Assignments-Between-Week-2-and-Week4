import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int YearScanner = scanner.nextInt();
        LeapYear leapYear = new LeapYear(YearScanner);
        leapYear.calculateLeapYear();
    }
}
