import java.util.Scanner;

public class SortElemansInTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;
        System.out.print("Dizinin boyutu n : ");
        int input = scanner.nextInt();
        int[] arrayList = new int[input];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < input; i++) {
            System.out.print(i + 1 + ". Elemanı : ");
            arrayList[i] = scanner.nextInt();
        }
        for (int i = 0; i < input; i++)
            for (int j = i + 1; j < input; j++) {
                if (arrayList[i] > arrayList[j]) {

                    temp = arrayList[i];
                    arrayList[i] = arrayList[j];
                    arrayList[j] = temp;

                }
            }

        System.out.print("Sıralama : ");
        for (int i = 0; i < input - 1; i++) {
            System.out.print(arrayList[i] + " ");
        }
        System.out.print(arrayList[input - 1]);
    }
}
