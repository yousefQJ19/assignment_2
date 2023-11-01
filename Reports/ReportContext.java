package Reports;

import DataBase.FakeDataBase;

    public class ReportContext {
    GenerateReports Report;
     public ReportContext(GenerateReports temp){
        this.Report=temp;
    }
    public void GenerateReports( FakeDataBase temp){
        Report.GenerateReport(temp);
    }

}
