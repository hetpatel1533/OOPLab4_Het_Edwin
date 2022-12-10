/*
* Name: Het Patel | Edwin Abraham
* Student ID: 100849572 | 100852671
* Course: OOP3200 - 07
*       Lab 4
* */


package Durhamcollege;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        SalariedEmployee s1 = new SalariedEmployee("Het patel", LocalDate.of(2022, 03, 06), "47893689", 80000d);
        System.out.println(s1.calculatePayDay());

        HourlyWorker hw1 = new HourlyWorker("Het patel", LocalDate.of(2022, 03, 06), "47893689", 18d, 40d);
        System.out.println(hw1.calculatePayDay());

        try
        {
            Employee[] employees = new Employee[5];
            employees[0] = new SalariedEmployee("Het patel", LocalDate.of(2022, 03, 06), "47893689", 80000d);
            employees[1] = new SalariedEmployee("Het patel", LocalDate.of(2022, 03, 06), "47893689", 80000d);
            employees[2] = new HourlyWorker("Het patel", LocalDate.of(2022, 03, 06), "47893689", 18d, 40d);
            employees[3] = new HourlyWorker("Het patel", LocalDate.of(2022, 03, 06), "47893689", 18d, 40d);
            employees[4] = new HourlyWorker("Het patel", LocalDate.of(2022, 03, 06), "47893689", 18d, 40d);

            System.out.println("ID\t\t\tName\t\t\tPay");
            for (Employee e : employees)
            {
                String pay = NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("en").setRegion("US").build()).format(e.calculatePayDay());
                System.out.println(e.get_Employee_Id() + "\t" + e.getName() + "\t" + pay);

            }
        }
        catch (Exception e)
        {
            System.out.println("exception: " + e);
        }
    }

}
