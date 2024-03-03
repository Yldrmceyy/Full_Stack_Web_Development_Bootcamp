public class Employee {
    // Variables
    String name;
    double salary;
    int workHouse;
    int hireYear;

    //Constructor method
    public Employee(String name, double salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    // Method to calculate tax
    public static double tax(double salary) {
        double tax;

        if (salary > 1000) {
            tax = 1000 * 0.03;
        } else {
            tax = 0;
        }
        return tax;

    }

    // Method to calculate bonus
    public static double bonus(int workHouse) {
        double bonus = 0;
        if (workHouse > 40) {
            bonus = (workHouse - 40) * 30;
        }
        return bonus;
    }

    // Method to calculate raise in salary
    public static double raiseSalary(double salary, int hireYear) {
        double raiseSalary = 0;
        if ((2021 - hireYear) < 10) {
            raiseSalary = salary * 0.05;
        } else if ((2021 - hireYear) >=10 && (2021 - hireYear) < 20) {
            raiseSalary = salary * 0.1;
        } else {
            raiseSalary = salary * 0.15;
        }

        return raiseSalary;
    }

    // toString method to return employee information and salary details
    public String toString() {
        return  "\n Name: " + name +
                "\n Salary: " + salary +
                "\n Work Hours: " + workHouse +
                "\n Hire Year: " + hireYear +
                "\n Tax: " + tax(salary) +
                "\n Raise Salary: " + raiseSalary(salary, hireYear) +
                "\n Bonus:" + bonus(workHouse) +
                "\n Salary with Tax and Bonus: " + (salary - tax(salary) + bonus(workHouse) +
                "\n Total Salary: " + (salary - tax(salary) + raiseSalary(salary, hireYear) + bonus(workHouse)+
                "\n ======================== "));
    }
}
