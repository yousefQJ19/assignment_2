package DataBase;

import UsersAndManagers.Users;

import java.util.HashSet;

public class Directors implements getData{
    @Override
    public HashSet<Users> Query(FakeDataBase temp) {
        HashSet<Users> Managers=new HashSet<Users>();
        for(Users in:temp.getUsersList()){
            if(in.getType()==2){
                Managers.add(in);
            }
        }

        return Managers;
    }
}
