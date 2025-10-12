package metier;

import Dao.Idao;

public class MetierImpl implements IMetier {
    private Idao dao;
    @Override
    public double calcul() {
        double d=dao.getData();
        double res=d*11.4;
        return res;
    }
    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
