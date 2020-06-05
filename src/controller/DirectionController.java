package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DirectionController {
    @GetMapping("/home")
    public String index(){
        return "index";
    }

//    @RequestMapping("/greeting")
//    public String greeting(){
//        return "index";
//    }
}
