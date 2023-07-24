public class Employee {
    private int id;
    private String name;
    private String department;
    private EmployeeTimetable timetable;


    public Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
        this.timetable = new EmployeeTimetable();
    }

    public EmployeeTimetable getTimetable() {
        return timetable;
    }

    public void setTimetable(EmployeeTimetable timetable) {
        this.timetable = timetable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
