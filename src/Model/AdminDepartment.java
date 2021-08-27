package Model;

public class AdminDepartment extends SuperDepartment {

     public AdminDepartment() {
         System.out.println(" Welcome to" + departmentName() + "\n" + getTodaysWork() + "\n" + getWorkDeadline() + "\n" + super.isTodayAHoliday() + "\n");
     }

     public String departmentName() { return " Admin Department "; }

     public String getTodaysWork() {
         return "Complete your documents submission";
     }

     public String getWorkDeadline() {
         return "Complete by EOD ";
     }
}