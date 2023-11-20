package Reports;

import DataBase.*;
import UsersAndManagers.Users;

import java.util.HashSet;

public class GenerateDirectorBudgetReport implements GenerateReports {

    @Override
    public void GenerateReport(FakeDataBase temp) {

        getData query = QueryFactory.GenarateQuery("Directors");

        HashSet<Users>directors=query.Query(temp);
        for(Users manager:directors){
            System.out.print(manager.getName()+"\t");
            System.out.println(manager.getHourlyRate()*manager.getCompletedHours());
        }
    }
}
