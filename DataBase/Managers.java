package DataBase;

import UsersAndManagers.Manager;
import UsersAndManagers.Users;

import java.util.HashSet;

public class Managers implements getData{
    @Override
    public HashSet<Users> Query(FakeDataBase temp) {
            HashSet<Users> Managers=new HashSet<Users>();
            for(Users in:temp.getUsersList()){
                if(in.getType()==1){
                    Managers.add(in);
                }
            }
        return Managers;
    }
}
