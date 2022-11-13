import java.util.Scanner;

public class RecursiveSquared {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int input = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int powerInput = scanner.nextInt();
        int result = Power(input,powerInput);
        System.out.println("Sonuç : " + result);



    }

    public static int Power(int input, int powerInput){
        if(powerInput != 0){
        return (input * Power(input, powerInput - 1));
        }
        else
            return 1;

    }




}
