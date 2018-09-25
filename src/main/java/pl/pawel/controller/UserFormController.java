package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.pawel.AddUserModel;
import pl.pawel.CountriesList;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class UserFormController {

    @GetMapping("/new-user")
    public String showNewUserForm(Model model) {
        Map<String, String> map = CountriesList.getCountries();
        model.addAttribute("countries", map);
        model.addAttribute("addUserModel", new AddUserModel());

        return ("new-user");
    }
}
