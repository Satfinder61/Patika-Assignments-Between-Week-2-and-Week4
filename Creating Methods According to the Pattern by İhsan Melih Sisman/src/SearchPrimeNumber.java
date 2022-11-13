import java.util.Scanner;

public class SearchPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int input = scanner.nextInt();
        if (findPrimes(input, 2)) {
            System.out.println(input + " sayısı ASALDIR !");
        } else {
            System.out.println(input + " sayısı ASAL değildir !");
        }
    }


    static boolean findPrimes(int input, int checker) {
        if (input <= 1) {
            return false;
        }
        else if(checker > input / 2){
            return true;
        }
        else if (input % checker == 0) {
            return false;
        }
        return findPrimes(input, checker + 1);
    }

}
