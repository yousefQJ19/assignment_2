package UsersAndManagers;

import DataBase.*;

import java.util.HashSet;

public class UsersFactory {

    private static Users user;

    public static Users GenarateUser(String queryType, int id, int age, String name, float hourlyRate, int completedHours , int type, HashSet<Users> staffList){

        if("Director".equals(queryType)){
            return new Director( id, age,  name,  hourlyRate, completedHours , type,staffList);
        } else if ("Manager".equals(queryType)) {
            return   new Manager(id, age,  name,  hourlyRate, completedHours , type,staffList);
        } else if ("Staff".equals(queryType)) {
            return new Staff(id, age,  name,  hourlyRate, completedHours , type,null);
        }
        return  user;
    }



}
