package Dao;

public class DaoImpl implements Idao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return 34;
    }
}
