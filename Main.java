import DataBase.FakeDataBase;
import Reports.*;
import UsersAndManagers.Users;

public class Main {
    public static void main(String[] args){

        FakeDataBase temp=FakeDataBase.getData();

        System.out.println("Directors staff report   ----------------------------------------");
        ReportContext reports=new ReportContext(new GenerateDirectorStaffReport());
        reports.GenerateReports(temp);
        System.out.println("Directors Budget report  ----------------------------------------");
        ReportContext reports1=new ReportContext(new GenerateDirectorBudgetReport());
        reports1.GenerateReports(temp);
        System.out.println("Managers staff report   ----------------------------------------");
        ReportContext reports2=new ReportContext(new GenerateManagersStaffReport());
       reports2.GenerateReports(temp);
        System.out.println("Managers Budget report   ----------------------------------------");
       ReportContext reports3=new ReportContext(new GenerateManagersBudgetReport());
        reports3.GenerateReports(temp);

    }
}
