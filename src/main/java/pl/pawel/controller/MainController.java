package pl.pawel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView homePage() {
        Map<String, Object> model = new HashMap<>();
        model.put("username", "Yondu Udonta");
        model.put("id", 173);

        return new ModelAndView("homepage", "model", model);
    }

    @RequestMapping("/profile")
    public ModelAndView viewProfile() {
        Map<String, Object> model = new HashMap<>();
        model.put("title", "Mr");
        model.put("firstName", "Pawel");
        model.put("lastName", "Debinski");
        model.put("dateOfBirth", new GregorianCalendar(1981,6,8).getTime());
        model.put("description", "a <strong>fantastic</strong> Java Programmer");

        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("French");
        languages.add("Spanish");
        languages.add("Danish");

        model.put("languages", languages);

        model.put("color", "#ccc");

        return new ModelAndView("profile", "model", model);
    }
}
