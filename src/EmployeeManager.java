import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private List<Employee> employees;
    private Scanner scanner;

    public EmployeeManager(){
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addEmployee(){
        System.out.println("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter employee name: ");
        String name  =  scanner.nextLine();

        System.out.println("Enter employee Department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(id, name, department);
        employees.add(employee);
    }

    public void displayEmployee(){
        System.out.println("Employee List: ");
        for (Employee employee: employees){
            System.out.println("ID: " + employee.getId()
                    + ", Name: " + employee.getName()
                    + ", Department: " + employee.getDepartment());
        }
    }
}
