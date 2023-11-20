package UsersAndManagers;

import java.util.HashSet;

public abstract class  Users {
    protected int id;
    protected  int age;
    protected StringBuilder name;
    protected float hourlyRate;
    protected int completedHours;
    protected int type;
    private HashSet<Users> staffList=null;
    public Users(int id, int age, String name, float hourlyRate, int completedHours ,int type,HashSet<Users>staffList) {
        this.name=new StringBuilder(name);
        this.id = id;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;
        this.type=type;
        if(staffList != null){
            this.staffList= new HashSet<Users>(staffList);
        }
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public StringBuilder getName() {
        return name;
    }
    public float getHourlyRate() {
        return hourlyRate;
    }
    public int getCompletedHours() {
        return completedHours;
    }
    public int getType() {
        return type;
    }
    public HashSet<Users> getStaffList() {
        return staffList;
    }

}
