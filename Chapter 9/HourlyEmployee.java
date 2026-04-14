public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String f, String l, String s,
                          double wage, double hours) {
        super(f, l, s);
        this.wage = wage;
        this.hours = hours;
    }

    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return 40 * wage + (hours - 40) * wage * 1.5;
    }

    public String toString() {
        return super.toString() + " Earnings: " + earnings();
    }
}