public class Main {
    public static void main(String[] args) {

        // Creating an Employee object and providing the information as parameters
        Employee employee1 = new Employee("Ceylan Yıldırım", 1200.0, 50, 2020);
        Employee employee2 = new Employee("John Micheal", 1550.0, 68, 2008);

        /// Printing employee information and salary details using toString method
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }

}



