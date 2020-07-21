import java.sql.*;
import java.sql.Driver;


//import com.mysql.cj.jdbc.Driver;


public class JDBCLecture {


    public static void main(String[] args) {
        try {
            //make exception in hndling simpler

            //making....
            //fist thing if want queries;
            //pom has mysql drivers for connecting, nothing needed for JDBC
            //can choose a different server system here
            DriverManager.registerDriver(new Driver());

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
                    //last two are the credentials, typically made specifically for your app
                    //authorizing wo leaking imp
                    //connection object created, methods in DAO do next steps
            );
            //connection object in documentation has the creeateStatement


            //======= CREATING A STATEMENT OBJECT


            Statement statement = statement.executeQuery(query);

            //=========== GETTING A SINGLE AND LIST OFR RESULTS

            String query = "SELECT * FROM albums";

            ResultSet rs = statement.executeQuery("SELECT * FROM employees.employees");

            rs.next();

            System.out.println(rs.getString(1));
            // need to pass in name of column of the number that the column exists in the record, not 0 indexed,
            // and are not the id's
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));

            //result set object has an instance 'next'

//            rs.beforeFirst(); //also rs.previous()...


            while (rs.next()) {
                //first time it runs at least one result so true
                System.out.println(("======="));
                System.out.println(rs.getString("id"));
                //...
            }

            // =============== GETTING METADATA

            // in git

            // =============ALBUM MODEL

            //this ex; pulling results from album table and comparing against a java object we've defined

            //run query


            rs.next();

            //object relational mapping (manually)
//            Album album = new Album(rs.getLong("id"),
//                    rs.getString("artist"),
//                    rs.getString("album")
//            );







        } catch (SQLException e) {

        }
    }
}
