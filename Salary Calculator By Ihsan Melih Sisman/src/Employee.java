//-----------------------------------------------------
// Title: Employee class
// Author: İhsan Melih Şişman
// Assignment: ebebek
// Description: This class is the Employee class that used for locating specific features for employee.
// Note: İhsan Melih Şişman is available to work part-time or long-term internship 3 days a week during the 2022 - 2023 university term
//-----------------------------------------------------
/**
 * by:
 * @author İhsan Melih Şişman
 */
public class Employee {
    public static void main(String[] args) {


        Employee employee = new Employee("Kemal", 2000.00, 45, 1985); //Giving inputs to the program.

        System.out.println(employee.toString()); // It prints the employees' information

    }

    // Defining the attributes which are mentioned in the case.
    String name;
    double salary;
    int workHours;
    int hireYear;
    // Defining the attributes which are mentioned in the case.

    /**
     * This is the constructor,
     * Constructor allows many usage instances by overloading during the definition of method structures,
     * thus making it flexible for us to access the class of our project.
     */
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    /**
     * tax method was created to calculate tax for the employees' salaries.
     */
    double extra = 0;
    double tax(double salary) {

        if (salary > 1000) {
            extra = salary * 3 / 100;
        }
        return extra;
    }


    /**
     * bonus method was created to calculate bonus for the employees who works more than 40 hours.
     */
    double bonus(int workHours) {
        double bonusPay = 0;
        if (workHours > 40) {
            for (int i = 40; i < workHours; i++) {
                bonusPay = bonusPay + 30;

            }
        }

        return bonusPay;
    }

    /**
     * raiseSalary method was created to increase the employees's salaries for the employees for those who work within a certain period of time.
     */
    double raiseSalary(int hireYear) {
        double raise = 0;
        tax(salary);
        bonus(workHours);
        if ((2021 - hireYear) < 10) {
            raise = salary * 5 / 100;
        } else if (((2021 - hireYear) > 9 && (2021 - hireYear) < 20)) {
            raise = salary * 10 / 100;
        } else if (2021 - hireYear > 19) {
            raise = salary * 15 / 100;
        }
        return raise;
    }

    /**
     * taxPlusBonusPlusSalary method was created to sum salary, tax and bonus.
     */
    double taxPlusBonusPlusSalary(double salary) {

        return salary - tax(extra) + bonus(workHours);
    }

    /**
     * taxPlusBonusPlusSalary method was created to sum all of them.
     */
    double totalSalary(double salary) {

        return salary + raiseSalary(hireYear) + bonus(workHours) - tax(salary);
    }

    /**
     * toString method was created to print the employees's information.
     */
    public String toString() {
        return
                "\n Adı : " + name + "" +
                        "\n Maaşı : " + salary +
                        "\n Çalışma Saati : " + workHours +
                        "\n Başlangıç Yılı : " + hireYear +
                        "\n Vergi : " + tax(salary) +
                        "\n Bonus : " + bonus(workHours) +
                        "\n Maaş Artışı : " + raiseSalary(hireYear) +
                        "\n Vergi ve Bonuslar ile birlikte maaş : " + taxPlusBonusPlusSalary(salary) +
                        "\n Toplam Maaş : " + totalSalary(salary) +
                        "";
    }

}
