public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String f, String l, String s,
                              double sales, double rate) {
        super(f, l, s);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return super.toString() + " Earnings: " + earnings();
    }
}