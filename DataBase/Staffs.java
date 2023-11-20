package DataBase;

import UsersAndManagers.Users;

import java.util.HashSet;

public class Staffs implements  getData{
    @Override
    public HashSet<Users> Query(FakeDataBase temp) {
        HashSet<Users> Staffs=new HashSet<Users>();
        for(Users in:temp.getUsersList()){
            if(in.getType()==0){
                Staffs.add(in);
            }
        }
        return Staffs;
    }
}

