package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pawel.AddUserModel;
import pl.pawel.CountriesList;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class UserFormController {

    @GetMapping("/new-user")
    public String showNewUserForm(Model model) {
        Map<String, String> map = CountriesList.getCountries();
        model.addAttribute("countries", map);
        model.addAttribute("addUserModel", new AddUserModel());

        return ("new-user");
    }

    @PostMapping("/saveUser")
    public String saveUser(@Valid AddUserModel addUserModel, BindingResult bindingResult) {

        return "user-added";
    }
}
