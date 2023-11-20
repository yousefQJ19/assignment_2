package Reports;

import java.util.HashSet;
import DataBase.*;
import kotlin.HashCodeKt;
import kotlin.UShort;
import UsersAndManagers.*;
public class GenerateManagersBudgetReport implements GenerateReports {
    @Override
    public void GenerateReport(FakeDataBase temp) {
        getData query = QueryFactory.GenarateQuery("Managers");
        HashSet<Users> Managers=query.Query(temp);
        for(Users manager:Managers){
            System.out.print(manager.getId());
            System.out.print(manager.getName());
            System.out.println(manager.getHourlyRate()*manager.getCompletedHours());
        }
    }
}
