package com.codeup.adlister.dao;

import models.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();

    //todo: Add functionality to the DaoFactory class to return an instance of the users data access object.
        //refer to mysqlusersdao
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
