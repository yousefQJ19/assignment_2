package UsersAndManagers;

import java.util.HashSet;

public class Manager extends Users {

    public Manager(int id, int age, String name, float hourlyRate, int completedHours, int type,HashSet<Users>stafflist) {
        super(id, age, name, hourlyRate, completedHours, type,stafflist);
    }


}
