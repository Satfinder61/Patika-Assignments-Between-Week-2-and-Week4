public class LeapYear {
    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    void calculateLeapYear(){
        if(year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " bir artık yıldır !");
        }
        else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }


}
