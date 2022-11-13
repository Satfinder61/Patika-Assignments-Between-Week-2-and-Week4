public class ChineseZodiac {

    int birthYear;

    public ChineseZodiac(int birthYear) {
        this.birthYear = birthYear;
    }


    public void chineseZodiacCalculator() {
        if (birthYear % 12 == 0) {
            System.out.print("Maymun");
        } else if (birthYear % 12 == 1) {
            System.out.print("Horoz");
        } else if (birthYear % 12 == 2) {
            System.out.print("Köpek");
        } else if (birthYear % 12 == 3) {
            System.out.print("Domuz");
        } else if (birthYear % 12 == 4) {
            System.out.print("Fare");
        } else if (birthYear % 12 == 5) {
            System.out.print("Öküz");
        } else if (birthYear % 12 == 6) {
            System.out.print("Kaplan");
        } else if (birthYear % 12 == 7) {
            System.out.print("Tavşan");
        } else if (birthYear % 12 == 8) {
            System.out.print("Ejderha");
        } else if (birthYear % 12 == 9) {
            System.out.print("Yılan");
        } else if (birthYear % 12 == 10) {
            System.out.print("At");
        } else if (birthYear % 12 == 11) {
            System.out.print("Koyun");
        }

    }

}

