package data;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Антон on 27.03.2016.
 */

@org.springframework.stereotype.Controller
public class Controller {

    ApplicationContext context = new GenericXmlApplicationContext("spring-config.xml");
    DAO purchaseDAO = (PurchaseDAO)context.getBean("purchaseDAO");


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        return "add";
    }

    //date=&shopid=&clientid=&book=&count=&cost=
    @RequestMapping(value = "/addConfirm",method = RequestMethod.GET)
    public String addConfirm(@RequestParam(value = "date",required = true)String date,
                             @RequestParam(value = "shopid",required = true)int shopid,
                             @RequestParam(value = "clientid",required = true)int clientid,
                             @RequestParam(value = "book",required = true)String book,
                             @RequestParam(value = "count",required = true)int count,
                             @RequestParam(value = "cost",required = true)int cost,
                             Model model){

        purchaseDAO.addPurchase(date,shopid,clientid,book,count,cost);
        model.addAttribute("date",date);
        model.addAttribute("shopid",shopid);
        model.addAttribute("clientid",clientid);
        model.addAttribute("book",book);
        model.addAttribute("count",count);
        model.addAttribute("cost",cost);
        return "addConfirm";
    }


    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Model model){

        return "delete";
    }

    @RequestMapping(value = "/deleteConfirm",method = RequestMethod.GET)
    public String deleteConfirm(@RequestParam(value = "id",required = true) int id, Model model){

        purchaseDAO.deletePurchase(id);
        model.addAttribute("id",id);
        return "deleteConfirm";
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model){
        return "search";
    }

    @RequestMapping(value = "/searchResult",method = RequestMethod.GET)
    public String searchResult(@RequestParam(value = "shopid",required = false)int shopid,
                               @RequestParam(value = "clientid",required = false)int clientid,
                               @RequestParam(value = "book",required = false)String book,
                               Model model){




        model.addAttribute("purchases",purchaseDAO.findData(shopid,clientid,book));

        return "searchResult";
    }

}
