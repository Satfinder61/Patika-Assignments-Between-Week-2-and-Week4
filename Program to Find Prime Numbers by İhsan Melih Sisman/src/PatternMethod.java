import java.util.Scanner;

public class PatternMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int input = scanner.nextInt();
        System.out.print("Çıktısı : ");
        int result =  Pattern(input);
    }

    static int Pattern(int input) {
        int lastValue = 0;
        lastValue = input;
        if (input > 0) {
            System.out.print(input + " ");
            input = Pattern(input - 5);
            System.out.print(input + " ");

        } else {
            System.out.print(input + " ");
            input = input + 5;
        }
        if (input   > lastValue){
            input = input - 5;
            }
        return input + 5;
    }

}
