package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.pawel.CountriesList;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class UserFormController {

    @GetMapping("/new-user")
    public ModelAndView showNewUserForm() {
        Map<String, String> map = CountriesList.getCountries();

        return new ModelAndView("new-user", "countries", map);
    }
}
