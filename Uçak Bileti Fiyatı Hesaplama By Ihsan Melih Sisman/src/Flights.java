public class Flights {

    double kilometers;
    int age;
    int flightType;
    double price = 0;

    public Flights() {
        this.kilometers = kilometers;
        this.age = age;
        this.flightType = flightType;
    }

    double calculatePerKmWithRules(double kilometers, int age) {
        price = kilometers * 0.10;
        if (age < 12) {
            price = price / 2;
        } else if (age >= 12 && age <= 24) {
            price = price - (price * 0.10);
        } else if (age > 65) {
            price = price - (price * 0.30);
        }
        return price;
    }

    void check(double kilometers, int age, int flightType) {
        if (kilometers <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        } else if (flightType != 1 && flightType != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;

        }
    }

    double checkFlighTypeDiscount(int flightType) {
        if (flightType == 2) {
            price = price - (price * 0.20);
            price = price * 2;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "kilometers=" + kilometers +
                ", age=" + age +
                ", flightType=" + flightType +
                ", price=" + price +
                '}';
    }
}




