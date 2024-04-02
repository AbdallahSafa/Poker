package org.example.igogym.welcomePage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

}
