package UsersAndManagers;

import Reports.GenerateReports;

import java.util.HashSet;

public class Director extends Users   {


    public Director(int id, int age, String name, float hourlyRate, int completedHours, int type,HashSet<Users>stafflist) {
        super(id, age, name, hourlyRate, completedHours, type,stafflist);

    }



}
