package UsersAndManagers;

import java.util.HashSet;

public class Staff  extends Users{
    public Staff(int id, int age, String name, float hourlyRate, int completedHours, int type, HashSet<Users>stffList) {
        super(id, age, name, hourlyRate, completedHours, type,stffList);
    }

}
