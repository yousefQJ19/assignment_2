package DataBase;

import UsersAndManagers.*;

import java.util.HashSet;

public class FakeDataBase {
    private  HashSet<Users> usersList;

    private static int counter=0;
    private static FakeDataBase fakeDataBase;
        private  FakeDataBase(){
            usersList=new HashSet<Users>();
            HashSet<Users> staffList=new HashSet<Users>();


            for(int i=0;i<5;i++){
                Users temp= UsersFactory.GenarateUser("Staff",100+i,20,"staff",5,30,0,null);
                usersList.add(temp);
                staffList.add(temp);
            }
            Users Manager=UsersFactory.GenarateUser("Manager",15,20,"yousef",5,50,1,staffList);
            Users Manager1=UsersFactory.GenarateUser("Manager",16,20,"yousef",5,50,1,staffList);
            Users Manager2=UsersFactory.GenarateUser("Manager",17,20,"yousef",5,50,1,staffList);


            staffList.add(Manager);
            staffList.add(Manager1);
            staffList.add(Manager2);

            Users Director=UsersFactory.GenarateUser("Director",20,20,"noor",5,50,2,staffList);
            Users Director1=UsersFactory.GenarateUser("Director",25,20,"noor",5,50,2,staffList);
            Users Director2=UsersFactory.GenarateUser("Director",30,20,"noor",5,50,2,staffList);


            usersList.add(Manager);
            usersList.add(Manager1);
            usersList.add(Manager2);

            usersList.add(Director);
            usersList.add(Director1);
            usersList.add(Director2);

        }

    public static FakeDataBase getData(){

            if(counter==0){
                counter++;
                fakeDataBase=new FakeDataBase();
            }
            return  fakeDataBase;
    }


    public HashSet<Users> getUsersList() {
        return usersList;
    }
}
