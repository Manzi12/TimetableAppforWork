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

    public void updateTimetabele(){
        System.out.println("Enter Employee Id to update timetable");
        int employeeId = Integer.parseInt(scanner.nextLine());

        Employee employeeToUpdate = null;
        for (Employee employee : employees){
            if (employee.getId() == employeeId){
                employeeToUpdate = employee;
                break;
            }
        }

        if (employeeToUpdate == null) {
            System.out.println("Employee with ID " + employeeId + "not found");
            return;
        }

        System.out.println("Enter day of the week eg monday etc");
        String dayOfweek  = scanner.nextLine();

        System.out.println("Enter shift for " + dayOfweek + ":");
        String shift = scanner.nextLine();

        employeeToUpdate.getTimetable().setShift(dayOfweek,shift);
        System.out.println("Timetable updated for employee with ID " + employeeId);

        }

    public void viewTimetable(){
        System.out.println("Enter employee ID to view Timetable: ");
        int employeeID = Integer.parseInt(scanner.nextLine());

        Employee employeeToView = null;
        for (Employee employee : employees){
            if (employee.getId() == employeeID){
                employeeToView = employee;
                break;
            }
        }

        if (employeeToView == null){
            System.out.println("Employee with ID " + employeeID + " not found");
            return;
        }

        EmployeeTimetable timetable = employeeToView.getTimetable();
        System.out.println("Timetable for Employee with ID " + employeeID + ":");
        for (String dayOfWeek : timetable.getTimetable().keySet()){
            System.out.println(dayOfWeek + ": " + timetable.getShift(dayOfWeek));
        }
    }


}
