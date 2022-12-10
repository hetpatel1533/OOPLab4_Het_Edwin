package Durhamcollege;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{

    double Yearlysalary;

    public SalariedEmployee(String FullName, LocalDate BirthDate, String ID, double Salary)
    {
        super(FullName, BirthDate, ID);
        this.set_Yearly_Salary(Salary);
    }

    public Double get_Yearly_Salary()
    {
        return Yearlysalary;
    }

    public void set_Yearly_Salary(Double Yearlysalary)
    {
        if (Yearlysalary > 0) this.Yearlysalary = Yearlysalary;
        else throw new IllegalArgumentException("Negative salary is not allowed.");
    }

    @Override
    Double calculatePayDay()
    {
        double Weeklypay = this.get_Yearly_Salary() / 52;
        return (double) Math.round(Weeklypay * 100d) / 100d;
    }
}

