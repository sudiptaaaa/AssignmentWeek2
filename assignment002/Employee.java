package assignment002;

public class Employee {
    private  int employeeId;
    private  String employeeName;
    private double salary;

   public Employee(int employeeId, String employeeName) {
       this.employeeId = employeeId;
       this.employeeName = employeeName;
   }

   public int getEmployeeId() {
       return employeeId;
   }

   public void setEmployeeId(int employeeId) {
       this.employeeId = employeeId;
   }

   public String getEmployeeName() {
       return employeeName;
   }

   public void setEmployeeName(String employeeName) {
       this.employeeName = employeeName;
   }

   public double getSalary() {
       return salary;
   }

   public void setSalary(double salary) {
       this.salary = Math.round(salary);
   }

   public double getVariableComponent(float experience){
       if(experience < 3)
           return 0;
       else if(experience >= 3 && experience < 5)
           return 5;
       else if(experience >= 5 && experience < 10)
           return 7;
       else if (experience >= 10)
           return 12;

       return 0;
   }

   @Override
   public String toString() {
       return "Employee { " + "\n\ttype= " + this.getClass().getSimpleName() +
               ",\n\temployeeId=" + employeeId +
               ",\n\temployeeName='" + employeeName + '\'' +
               ",\n\tsalary=" + salary;
   }
}
