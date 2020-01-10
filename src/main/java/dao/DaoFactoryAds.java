package dao;

public class DaoFactoryAds {
    private static Ads adsDao;

    public static Ads getAhoyDao() {
        if(adsDao == null) adsDao = new Ads();

        return adsDao;
    }
}
