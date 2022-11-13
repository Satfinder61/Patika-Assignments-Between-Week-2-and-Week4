import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int min = 0;
        int maks = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int numberScanner = scanner.nextInt();
            if (i == 1)
            {
                maks = numberScanner;
                min = numberScanner;
            }
            else {
                if (maks < numberScanner)
                {
                    maks = numberScanner;
                }
                else if (min > numberScanner)
                {
                    min = numberScanner;
                }
            }
        }
        System.out.println("En büyük sayı: " + maks);
        System.out.println("En küçük sayı: " + min);
    }
}
