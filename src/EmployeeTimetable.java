import java.util.HashMap;
import java.util.Map;

public class EmployeeTimetable {
    private Map<String, String> timetable;

    public EmployeeTimetable(){
        timetable = new HashMap<>();
    }

    public Map<String, String> getTimetable() {
        return timetable;
    }

    public void setTimetable(Map<String, String> timetable) {
        this.timetable = timetable;
    }

    public void setShift(String dayOfWeek, String shift){
        timetable.put(dayOfWeek,shift);
    }

    public String getShift(String dayOfWeek){
        return timetable.get(dayOfWeek);
    }
}
