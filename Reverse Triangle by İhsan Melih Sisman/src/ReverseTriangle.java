import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 10; i>=1;i--)
        {
            for(int z = i; z<10;z++)
            {
                System.out.print(" ");
            }
            for(int m =1;m<=(2*i-1);m++)
            {
            System.out.print("*");
              }
            System.out.println("");
        }

    }
}
