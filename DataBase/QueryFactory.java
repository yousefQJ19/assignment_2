package DataBase;

public class QueryFactory {

        private static getData query;

        public static getData GenarateQuery(String queryType){

            if("Directors".equals(queryType)){
               return new Directors();
            } else if ("Managers".equals(queryType)) {
                return   new Managers();
            } else if ("Staffs".equals(queryType)) {
                return new Staffs();
            }else if("AllUser".equals(queryType)){
                return new AllUser();
            }
            return  query;
        }





}
