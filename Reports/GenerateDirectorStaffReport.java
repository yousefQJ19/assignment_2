package Reports;

import DataBase.Directors;
import DataBase.FakeDataBase;
import DataBase.QueryFactory;
import DataBase.getData;
import UsersAndManagers.Users;
import java.util.HashSet;

public class GenerateDirectorStaffReport implements GenerateReports{
    @Override
    public void GenerateReport(FakeDataBase temp) {
        getData query = QueryFactory.GenarateQuery("Directors");
        HashSet<Users>Director=query.Query(temp);
        for(Users director:Director){

            System.out.print("\n"+director.getId()+"\t");
            System.out.print(director.getName()+"\t ");
            System.out.println("Director \n");
            for(Users staff:director.getStaffList()){
                System.out.print(staff.getId()+"\t");
                System.out.print(staff.getName()+"\t");
                if(staff.getType()==1){
                    System.out.print("Manager \t");
                }
                else {
                    System.out.print("Staff \t");
                }
                System.out.print(staff.getHourlyRate()+"\t");
                System.out.println(staff.getCompletedHours()+"\t");


            }
        }
    }
}
