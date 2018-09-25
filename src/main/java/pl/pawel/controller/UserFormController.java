package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserFormController {

    @GetMapping("/new-user")
    public ModelAndView showNewUserForm() {


        return new ModelAndView("new-user");
    }
}
