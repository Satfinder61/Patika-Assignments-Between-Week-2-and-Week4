import java.util.Scanner;

public class PN_Main {
    public static void main(String[] args) {

        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int enteredNumber = scanner.nextInt();

        for (int i = 1; i < enteredNumber; i++) {
            if (enteredNumber % i == 0) {
                total = total + i;

            }
        }
        if (total == enteredNumber) {
            System.out.println(enteredNumber + " Mükemmel sayıdır");
        } else {
            System.out.println(enteredNumber + " Mükemmel sayı değildir.");

        }
    }
}
