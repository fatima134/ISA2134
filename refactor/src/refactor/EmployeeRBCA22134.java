package refactor;

public class EmployeeRBCA22134 {
    private String name;
    private String jobTitle;
    private double basicSalary;
    private double da;
    private final double hra = 5000; // HRA is constant
    private double totalSalary;

    public EmployeeRBCA22134(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
        this.da = 0.1 * basicSalary; // DA is 10% of basic salary
        calculateTotalSalary();
    }

    public void calculateTotalSalary() {
        totalSalary = basicSalary + da + hra;
    }

    public void updateBasicSalary(double newBasicSalary) {
        this.basicSalary = newBasicSalary;
        this.da = 0.1 * newBasicSalary; // Update DA based on new basic salary
        calculateTotalSalary();
    }

    public double getDa() {
        return da;
    }

    public double getTotalSalary() {
        return totalSalary;



}
}
