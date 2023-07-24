import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Exit ");
            System.out.println("4. Enter your choice");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    em.addEmployee();
                    break;

                case 2:
                    em.displayEmployee();
                    break;

                case 3:
                    System.out.println("Exixting Application..Goodbye");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice try again.");

            }
        }

    }
}