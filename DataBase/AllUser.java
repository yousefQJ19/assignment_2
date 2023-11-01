package DataBase;

import UsersAndManagers.Users;

import java.util.HashSet;

public class AllUser implements getData{
    @Override
    public HashSet<Users> Query(FakeDataBase temp) {

        return temp.getUsersList();

    }
}
