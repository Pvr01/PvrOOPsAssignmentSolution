package Model;

public class TechDepartment extends SuperDepartment {

    public TechDepartment() {
        System.out.println(" Welcome to" + departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + getTechStackInformation() + "\n" + super.isTodayAHoliday());
    }

    public String departmentName() { return " Tech Department"; }

    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return " Core Java";
    }
}