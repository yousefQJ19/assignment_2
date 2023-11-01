# assignment_2

## A fully functional program writen in java that shows how to make DataBase and make reports from it using the solid princaple singlton and stratege Design patterns

this program was built in java   that shows how to make DataBase and make reports from it using the solid princaple singlton and stratege Design patterns
i separated the program for three section every section has a deffrant cause the database section the reports swction and the users section and i will demonstrate each on in this readme and for what the code its writen and the project does the following

* creates a database and fill it with data 
* create a report section thats makes reports about users 
* creats a users section that handels the users objects and the template of them 
* the program is built depinding on solid design prinsaples
* the program is built using tow desiggn princaples staratige design pattern and singlton design pattern

  

## the following class diagram explains how the code is structured and how its connected
![ClassMoudule](https://github.com/yousefQJ19/assignment_2/assets/92521652/b55dac6f-22c8-48df-b506-97173d79a2e4)

## Here i will explain the program speacificly

### The DataBase section :
*  FakeData class  using the singlton Design pattern to enhance the performance of the project and reduse the number of the data base objec made
*  getData interface to achive  the following 
   * First the single responsability to make sure that every query object i make does 1 type of data operations
   * Secound the  open close princaple to ensure that the adding of new query is possible with the menemome amount of change in code
*  QueryFactory class to to improve the instansiation of the objects and make the code more dynamic modular and reusable
*  Managers class to get the managers from the database
*  Directors class to get all the directors from the database
*  Staff class to get all the staff from the data base
*  AllUsers class to get all users from database

### The report section
*ReportContext class built on stratige design pattern 
*GenerateReports interface to acheve the following has one function and given the database as parameter
    * First the single responsability to make sure that every report object i make does 1 type of reports
    * Secound the  open close princaple to ensure that the adding of new report is possible with the menemome amount of change in code
* GenerateDirectorStaffReport to generate a report that shows the staff and managers under each Director  and implements GenerateReport interface
* GenerateDirectorBudgetReport to genrate a report that shows the budget for every Director and implements GenerateReport interface
* GeneratManagerStaffReport to generate a report that shows the staff for each manager and implements GenerateReport interface
* GeneratManagerbudgetReport to generate a report that showe the budget for every manager and implements GenerateReport interface

### the Users section
* UserFactory class to to improve the instansiation of the objects and make the code moredynamic modular and reusable
* User abstact class that has a shered properties (id ,age,name ,hourlypaid,Completedhours,type ,StaffList)
  *the type is to determine the type of the user when i create it in the UserFactore class 
* Staff class extends the Users class and implement the Staff type of user and has the type (0)
* Manager class extends the Users class and implements the manager type of user has the type (1)
* Director class extends the Users class and implements the director type of user has the type (2)
* 

  
    

