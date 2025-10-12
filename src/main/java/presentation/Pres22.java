package presentation;

import Dao.Idao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres22  {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl();
        Scanner scanner=new Scanner (System.in);
        System.out.println("Donner la classe de la couche DAO:");
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao) cDao.getConstructor().newInstance();

        //MetierImpl metier =  new MetierImpl();

        String metierClassname=scanner.nextLine();
        System.out.println("Donner la classe de la couche Metier:");
        Class cMetier=Class.forName(metierClassname);
        IMetier metier=(MetierImpl) cMetier.getConstructor().newInstance();

        //  metier.setDao(dao);
        Method setDao=cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,dao);
        System.out.println("RES="+metier.calcul());
    }
}
