package com.fptu.maintenancemanagersystem.controller;

import com.fptu.maintenancemanagersystem.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private static List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("Bill","Gates"));
        people.add(new Person("Steve","Jobs"));
    }

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        String message = "Hello Spring Boot";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping(value = {"/peopleList"},method = RequestMethod.GET)
    public String viewPeopleList(Model model){
        model.addAttribute("people",people);
        return "peopleList";
    }
}
