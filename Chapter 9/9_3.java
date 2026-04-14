class CommissionEmployee {
    private String firstName;
    private String lastName;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
                              double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

class BasePlusCommissionEmployee {
    private CommissionEmployee employee;
    private double baseSalary;

    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return employee.earnings() + baseSalary;
    }

    public String toString() {
        return employee.toString() + " Base Salary: " + baseSalary;
    }
}