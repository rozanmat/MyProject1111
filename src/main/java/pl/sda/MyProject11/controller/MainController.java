package pl.sda.MyProject11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {

  //  @RequestMapping("/index")
    public String index(Model model) {


        return "index";
    }
}
