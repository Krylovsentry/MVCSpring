import data.DAO;
import data.Purchase;
import data.PurchaseDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Антон on 27.03.2016.
 */
public class Main {


    public static void main(String[] args) {


        ApplicationContext context = new GenericXmlApplicationContext("spring-config.xml");

        DAO purchaseDAO = (PurchaseDAO)context.getBean("purchaseDAO");

        List<Purchase> purchaseList = purchaseDAO.findAll();


        for (Purchase purchase : purchaseList){

            System.out.println(purchase);

        }



    }
}
