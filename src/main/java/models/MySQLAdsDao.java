package models;


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
            DriverManager.registerDriver(new Driver() {
                @Override
                public Connection connect(String url, Properties info) throws SQLException {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) throws SQLException {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });
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
        try {
            Statement stmnt = connection.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * from users");
            while (rs.next()) {
                ads.add(new Ad(
                     rs.getLong("id"),
                     rs.getLong("userId"),
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
        String insertQuery = String.format("INSERT INTO ads (ad.getId(), ad.getUserId(), ad.getTitle(), ad.getDescription()) VALUE ()");
        try {
            Statement stmnt = connection.createStatement();
            stmnt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = stmnt.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println("Inserted a new record! New id: " + generatedKeys.getLong(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
