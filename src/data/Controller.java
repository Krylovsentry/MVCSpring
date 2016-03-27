package data;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Антон on 27.03.2016.
 */

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String test(@RequestParam("shopid") String param, Model model){
        model.addAttribute("shopid",param);
        return "addConfirm";
    }
}
