package Model;

public class HrDepartment extends SuperDepartment {

    public HrDepartment() {
        System.out.println(" Welcome to" + departmentName() + "\n" + doActivity() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + super.isTodayAHoliday() + "\n\n");
    }

    public String departmentName() { return " HR Department "; }

    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance ";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() { return "team Lunch"; }
}