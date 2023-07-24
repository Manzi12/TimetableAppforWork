import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Update Employee timetable ");
            System.out.println("4. View Employee timetable");
            System.out.println("5. Exit");
            System.out.println("6. Enter your choice");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    em.addEmployee();
                    break;

                case 2:
                    em.displayEmployee();
                    break;

                case 3:
                    em.updateTimetabele();
                    break;

                case 4:
                    em.viewTimetable();
                    break;

                case 5:
                    System.out.println("Exixting Application..Goodbye");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice try again.");

            }
        }

    }
}