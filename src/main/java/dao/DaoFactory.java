package dao;

public class DaoFactory {
    // always reference the interface
    private static Ahoy ahoyDao;

    public static Ahoy getAhoyDao() {
        if(ahoyDao == null) ahoyDao = new Ahoy();

        return ahoyDao;
    }


}
