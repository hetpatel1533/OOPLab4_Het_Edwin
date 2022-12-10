package Durhamcollege;

import java.time.LocalDate;

public class HourlyWorker extends Employee
{
    Double Hourly_Rate;
    Double Hours_Per_Week;

    public Double get_Hourly_Rate()
    {
        return Hourly_Rate;
    }

    public void set_Hourly_Rate(Double Hourly_Rate)
    {
        if (Hourly_Rate < 17)
            throw new IllegalArgumentException("Hourly rate must not be less than 17 please try again!!");
        this.Hourly_Rate = Hourly_Rate;
    }

    public Double get_Hours_Per_Week()
    {
        return Hours_Per_Week;
    }

    public void set_Hours_Per_Week(Double Hours_Per_Week)
    {
        if (Hours_Per_Week > 48)
            throw new IllegalArgumentException("Exceed Hourly limit per week.");
        this.Hours_Per_Week = Hours_Per_Week;
    }

    public HourlyWorker(String FullName, LocalDate BirthDate, String ID, double Rate, double Hours)
    {
        super(FullName, BirthDate, ID);
        this.set_Hourly_Rate(Rate);
        this.set_Hours_Per_Week(Hours);
    }

    @Override
    Double calculatePayDay()
    {
        return (double) Math.round(this.get_Hourly_Rate() * this.get_Hours_Per_Week() * 100d) / 100d;
    }
}

