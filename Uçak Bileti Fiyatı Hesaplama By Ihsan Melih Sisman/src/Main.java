import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Flights flights = new Flights();

        System.out.print("Mesafeyi km türünden giriniz : ");
        double kilometerScanner = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        int ageScanner = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int flightTypeScanner = scanner.nextInt();


        flights.check(kilometerScanner, ageScanner, flightTypeScanner);
        flights.calculatePerKmWithRules(kilometerScanner, ageScanner);
        if(flights.checkFlighTypeDiscount(flightTypeScanner) > 0){
            System.out.println("Toplam Tutar = " + flights.price + " TL");
        }

    }
}
