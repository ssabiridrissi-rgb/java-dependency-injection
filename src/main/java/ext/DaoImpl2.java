package ext;
import Dao.Idao;

public class DaoImpl2 implements Idao {

@Override
    public double getData() {
    System.out.println("Version Web service");
    double data = 55;
    return data;
    }
}
