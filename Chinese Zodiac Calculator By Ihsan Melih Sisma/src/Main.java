import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.print("Doğum Yılınızı Giriniz : ");
        int birthYearScanner = scanner.nextInt();
        ChineseZodiac chineseZodiac = new ChineseZodiac(birthYearScanner);
        System.out.print("Çin Zodyağı Burcunuz : ");
        chineseZodiac.chineseZodiacCalculator();
        System.out.println();


    }
}
