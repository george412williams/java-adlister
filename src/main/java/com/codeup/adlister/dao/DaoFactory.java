package com.codeup.adlister.dao;

import models.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
    private static Users usersDao;

    //todo: Add functionality to the DaoFactory class to return an instance of the users data access object.
        //refer to mysqlusersdao
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;

    }
}
