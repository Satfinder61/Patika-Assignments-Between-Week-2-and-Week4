import java.util.Arrays;

public class FrequencyOfNumberInTheList {


    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int [] frequency = new int [array.length];
        int counted = -1;
        System.out.print("Dizi : " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            int count = 1;
            for(int j = i+1; j<array.length;j++){

                if(array[i] == array[j]){
                    count++;
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted){
                frequency[i] = count;
            }

        }
        System.out.println(" ");
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted){
                System.out.println(array[i] + " sayısı " + frequency[i] + " tekrar edildi.");
            }
        }




    }


}
