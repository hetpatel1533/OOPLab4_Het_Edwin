package Durhamcollege;

import java.time.LocalDate;

public abstract class Employee extends Person
{
    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     * character or when fullName contains something other than letters, spaces,
     * hyphens, or apostrophes.
     */
    final String ID;

    public Employee(String FullName, LocalDate BirthDate, String ID)
    {
        super(FullName, BirthDate);
        if (ID.length() > 8)
        {
            throw new IllegalArgumentException("Id at least must be 8 numbers Please try again!!");
        }
        this.ID = ID;
    }

    public String get_Employee_Id()
    {
        return this.ID;
    }

    abstract Double calculatePayDay();
}
