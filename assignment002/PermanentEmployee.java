package assignment002;

public class PermanentEmployee extends Employee{
    private double basicPay;
    private  double hra;
    private float experience;


    public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.hra = hra * basicPay;
        this.experience = experience;
    }

    public void calculateMonthlySalary(){
        double salary = basicPay + hra  + getVariableComponent(experience);
        super.setSalary(salary);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

}
