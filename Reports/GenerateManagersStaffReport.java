package Reports;

import DataBase.FakeDataBase;
import DataBase.Managers;
import DataBase.QueryFactory;
import DataBase.getData;
import UsersAndManagers.Users;

import java.util.HashSet;

public class GenerateManagersStaffReport implements GenerateReports{
    @Override
    public void GenerateReport(FakeDataBase temp) {
        getData query = QueryFactory.GenarateQuery("Managers");
        HashSet<Users> Managers=query.Query(temp);
        for(Users manager:Managers){
            System.out.print("\n"+manager.getId()+"\t");
            System.out.print(manager.getName()+"\t");
            System.out.println("Manager \n");
            for(Users staff:manager.getStaffList()){
                System.out.print(staff.getId()+"\t");
                System.out.print(staff.getName()+"\t");
                System.out.print(staff.getHourlyRate()+"\t");
                System.out.println(staff.getCompletedHours());



            }
        }
    }
}
