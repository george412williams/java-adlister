package models;

import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import javax.management.Query;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
                );
    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        //needed to bring in the ads:
        String selectAds = "SELECT * FROM ads";
        try {
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * from users");
            while (rs.next()) {
                ads.add(new Ad(
                     rs.getLong("id"),
                     rs.getLong("user_id"),
                     rs.getString("title"),
                     rs.getString("description")
                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0;
        String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());
        try {
            Statement stmnt = connection.createStatement();
            stmnt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = stmnt.getGeneratedKeys();
            if (generatedKeys.next()) {
                //System.out.println("Inserted a new record! New id: " + generatedKeys.getLong(1));
                lastInsertedId = generatedKeys.getLong(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lastInsertedId;
    }

    public static void main(String[] args) {
        //simulates the full stack app use:
        MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
        //System.out.println(adsDao.all());
        Ad testAd = new Ad(1,"Test ad title", "Test ad desctiption");
        System.out.println(adsDao.insert(testAd));


    }
}
