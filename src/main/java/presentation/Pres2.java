package presentation;

import Dao.DaoImpl;
import Dao.Idao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao) cDao.getConstructor().newInstance();

        //MetierImpl metier =  new MetierImpl();
        String metierClassname=scanner.nextLine();
        Class cMetier=Class.forName(metierClassname);
        IMetier metier=(MetierImpl) cMetier.getConstructor().newInstance();

      //  metier.setDao(dao);
        Method setDao=cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,dao);
        System.out.println("RES="+metier.calcul());
    }
}
